// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.data.appconfiguration.implementation;

import com.azure.v2.data.appconfiguration.models.ConfigurationSetting;
import com.azure.v2.data.appconfiguration.models.FeatureFlagConfigurationSetting;
import com.azure.v2.data.appconfiguration.models.FeatureFlagFilter;
import com.azure.v2.data.appconfiguration.implementation.models.KeyValue;
import com.azure.v2.data.appconfiguration.models.SecretReferenceConfigurationSetting;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.http.paging.PagedResponse;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.models.CoreException;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonToken;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.azure.v2.data.appconfiguration.implementation.Utility.CLIENT_FILTERS;
import static com.azure.v2.data.appconfiguration.implementation.Utility.CONDITIONS;
import static com.azure.v2.data.appconfiguration.implementation.Utility.DESCRIPTION;
import static com.azure.v2.data.appconfiguration.implementation.Utility.DISPLAY_NAME;
import static com.azure.v2.data.appconfiguration.implementation.Utility.ENABLED;
import static com.azure.v2.data.appconfiguration.implementation.Utility.ID;
import static com.azure.v2.data.appconfiguration.implementation.Utility.NAME;
import static com.azure.v2.data.appconfiguration.implementation.Utility.PARAMETERS;
import static com.azure.v2.data.appconfiguration.implementation.Utility.URI;

/**
 * Configuration Setting Deserialization
 */
public final class ConfigurationSettingDeserializationHelper {
    private static final ClientLogger LOGGER = new ClientLogger(Utility.class);

    static final String FEATURE_FLAG_CONTENT_TYPE = "application/vnd.microsoft.appconfig.ff+json;charset=utf-8";
    static final String SECRET_REFERENCE_CONTENT_TYPE
        = "application/vnd.microsoft.appconfig.keyvaultref+json;charset=utf-8";

    /*
     * Utility method for translating KeyValue to ConfigurationSetting with PagedResponse.
     */
    public static PagedResponse<ConfigurationSetting>
        toConfigurationSettingWithPagedResponse(PagedResponse<KeyValue> pagedResponse) {
        List<ConfigurationSetting> settings = new ArrayList<>(pagedResponse.getValue().size());
        pagedResponse.getValue().forEach(keyValue -> settings.add(toConfigurationSetting(keyValue)));
        return new PagedResponse<>(pagedResponse.getRequest(), pagedResponse.getStatusCode(),
            pagedResponse.getHeaders(), settings, pagedResponse.getContinuationToken(), null, null, null, null);
    }

    /*
     *  Utility method for translating KeyValue to ConfigurationSetting with response.
     */
    public static Response<ConfigurationSetting> toConfigurationSettingWithResponse(Response<KeyValue> response) {
        return new Response<>(response.getRequest(), response.getStatusCode(), response.getHeaders(),
            toConfigurationSetting(response.getValue()));
    }

    /*
     * Translate generated class KeyValue to public-explored ConfigurationSetting.
     */
    public static ConfigurationSetting toConfigurationSetting(KeyValue keyValue) {
        if (keyValue == null) {
            return null;
        }
        final String contentType = keyValue.getContentType();
        final String key = keyValue.getKey();
        final String value = keyValue.getValue();
        final String label = keyValue.getLabel();
        final String etag = keyValue.getEtag();
        final Map<String, String> tags = keyValue.getTags();
        final ConfigurationSetting setting = new ConfigurationSetting().setKey(key)
            .setValue(value)
            .setLabel(label)
            .setContentType(contentType)
            .setETag(etag)
            .setTags(tags);
        ConfigurationSettingHelper.setLastModified(setting, keyValue.getLastModified());
        ConfigurationSettingHelper.setReadOnly(setting, keyValue.isLocked() != null && keyValue.isLocked());
        try {
            if (FEATURE_FLAG_CONTENT_TYPE.equals(contentType)) {
                return subclassConfigurationSettingReflection(setting, parseFeatureFlagValue(setting.getValue()))
                    .setKey(setting.getKey())
                    .setValue(setting.getValue())
                    .setLabel(setting.getLabel())
                    .setETag(setting.getETag())
                    .setContentType(setting.getContentType())
                    .setTags(setting.getTags());
            } else if (SECRET_REFERENCE_CONTENT_TYPE.equals(contentType)) {
                return subclassConfigurationSettingReflection(setting,
                    parseSecretReferenceFieldValue(setting.getKey(), setting.getValue())).setValue(value)
                        .setLabel(label)
                        .setETag(etag)
                        .setContentType(contentType)
                        .setTags(tags);
            } else {
                // Configuration Setting
                return setting;
            }
        } catch (RuntimeException exception) {
            throw LOGGER.throwableAtError()
                .log(
                    "The setting is neither a 'FeatureFlagConfigurationSetting' nor "
                        + "'SecretReferenceConfigurationSetting', return the setting as 'ConfigurationSetting'. ",
                    exception, CoreException::from);
        }
    }

    private static <T extends ConfigurationSetting> ConfigurationSetting
        subclassConfigurationSettingReflection(ConfigurationSetting setting, T derivedClassSetting) {
        ConfigurationSettingHelper.setReadOnly(derivedClassSetting, setting.isReadOnly());
        ConfigurationSettingHelper.setLastModified(derivedClassSetting, setting.getLastModified());
        return derivedClassSetting;
    }

    /*
       Parse the ConfigurationSetting's value into Feature Flag setting's properties.
     */
    public static FeatureFlagConfigurationSetting parseFeatureFlagValue(String valueInJson) {
        try (JsonReader jsonReader = JsonReader.fromString(valueInJson)) {
            return getFeatureFlagPropertyValue(jsonReader);
        } catch (IOException e) {
            throw LOGGER.throwableAtError().log(e, IllegalStateException::new);
        }
    }

    // Secret reference configuration setting: parsing values
    public static SecretReferenceConfigurationSetting parseSecretReferenceFieldValue(String key, String value) {
        try (JsonReader jsonReader = JsonReader.fromString(value)) {
            return jsonReader.readObject(reader -> {
                String secretId = null;

                while (reader.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = reader.getFieldName();
                    reader.nextToken();

                    if (URI.equals(fieldName)) {
                        secretId = reader.getString();
                    } else {
                        reader.skipChildren();
                    }
                }

                return new SecretReferenceConfigurationSetting(key, secretId);
            });
        } catch (IOException e) {
            throw LOGGER.throwableAtError().log(e, IllegalStateException::new);
        }
    }

    // Feature flag configuration setting: parsing feature flag values
    private static FeatureFlagConfigurationSetting getFeatureFlagPropertyValue(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            String featureId = null;
            boolean isEnabled = false;
            String description = null;
            String displayName = null;
            List<FeatureFlagFilter> clientFilters = null;

            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if (ID.equals(fieldName)) {
                    featureId = reader.getString();
                } else if (DESCRIPTION.equals(fieldName)) {
                    description = reader.getString();
                } else if (DISPLAY_NAME.equals(fieldName)) {
                    displayName = reader.getString();
                } else if (ENABLED.equals(fieldName)) {
                    isEnabled = reader.getBoolean();
                } else if (CONDITIONS.equals(fieldName)) {
                    clientFilters = readConditions(reader).getFeatureFlagFilters();
                } else {
                    reader.skipChildren();
                }
            }

            return new FeatureFlagConfigurationSetting(featureId, isEnabled).setDescription(description)
                .setDisplayName(displayName)
                .setClientFilters(clientFilters);
        });
    }

    // Feature flag configuration setting: conditions
    public static Conditions readConditions(JsonReader jsonReader) throws IOException {
        Conditions conditions = new Conditions();
        Map<String, Object> unknownConditions = conditions.getUnknownConditions();
        return jsonReader.readObject(reader -> {
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if (CLIENT_FILTERS.equals(fieldName)) {
                    conditions.setFeatureFlagFilters(
                        reader.readArray(ConfigurationSettingDeserializationHelper::readClientFilter));
                } else {
                    unknownConditions.put(fieldName, reader.readUntyped());
                }
            }
            conditions.setUnknownConditions(unknownConditions);

            return conditions;
        });
    }

    public static FeatureFlagFilter readClientFilter(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            Map<String, Object> parameters = null;

            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if (NAME.equals(fieldName)) {
                    name = reader.getString();
                } else if (PARAMETERS.equals(fieldName)) {
                    parameters = reader.readMap(JsonReader::readUntyped);
                } else {
                    reader.skipChildren();
                }
            }

            return new FeatureFlagFilter(name).setParameters(parameters);
        });
    }
}

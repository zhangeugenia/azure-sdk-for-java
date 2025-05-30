// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.portalservicescopilot.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The type used for update operations of the CopilotSettingsResource.
 */
@Fluent
public final class CopilotSettingsResourceUpdate implements JsonSerializable<CopilotSettingsResourceUpdate> {
    /*
     * The resource-specific properties for this resource.
     */
    private CopilotSettingsResourceUpdateProperties properties;

    /**
     * Creates an instance of CopilotSettingsResourceUpdate class.
     */
    public CopilotSettingsResourceUpdate() {
    }

    /**
     * Get the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    public CopilotSettingsResourceUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The resource-specific properties for this resource.
     * 
     * @param properties the properties value to set.
     * @return the CopilotSettingsResourceUpdate object itself.
     */
    public CopilotSettingsResourceUpdate withProperties(CopilotSettingsResourceUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CopilotSettingsResourceUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CopilotSettingsResourceUpdate if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CopilotSettingsResourceUpdate.
     */
    public static CopilotSettingsResourceUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CopilotSettingsResourceUpdate deserializedCopilotSettingsResourceUpdate
                = new CopilotSettingsResourceUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedCopilotSettingsResourceUpdate.properties
                        = CopilotSettingsResourceUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCopilotSettingsResourceUpdate;
        });
    }
}

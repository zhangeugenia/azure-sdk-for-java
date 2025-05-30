// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Dynatrace Environment Information.
 */
@Fluent
public final class EnvironmentInfo implements JsonSerializable<EnvironmentInfo> {
    /*
     * Id of the environment created
     */
    private String environmentId;

    /*
     * Ingestion key of the environment
     */
    private String ingestionKey;

    /*
     * Ingestion endpoint used for sending logs
     */
    private String logsIngestionEndpoint;

    /*
     * Landing URL for Dynatrace environment
     */
    private String landingUrl;

    /**
     * Creates an instance of EnvironmentInfo class.
     */
    public EnvironmentInfo() {
    }

    /**
     * Get the environmentId property: Id of the environment created.
     * 
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the environmentId property: Id of the environment created.
     * 
     * @param environmentId the environmentId value to set.
     * @return the EnvironmentInfo object itself.
     */
    public EnvironmentInfo withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Get the ingestionKey property: Ingestion key of the environment.
     * 
     * @return the ingestionKey value.
     */
    public String ingestionKey() {
        return this.ingestionKey;
    }

    /**
     * Set the ingestionKey property: Ingestion key of the environment.
     * 
     * @param ingestionKey the ingestionKey value to set.
     * @return the EnvironmentInfo object itself.
     */
    public EnvironmentInfo withIngestionKey(String ingestionKey) {
        this.ingestionKey = ingestionKey;
        return this;
    }

    /**
     * Get the logsIngestionEndpoint property: Ingestion endpoint used for sending logs.
     * 
     * @return the logsIngestionEndpoint value.
     */
    public String logsIngestionEndpoint() {
        return this.logsIngestionEndpoint;
    }

    /**
     * Set the logsIngestionEndpoint property: Ingestion endpoint used for sending logs.
     * 
     * @param logsIngestionEndpoint the logsIngestionEndpoint value to set.
     * @return the EnvironmentInfo object itself.
     */
    public EnvironmentInfo withLogsIngestionEndpoint(String logsIngestionEndpoint) {
        this.logsIngestionEndpoint = logsIngestionEndpoint;
        return this;
    }

    /**
     * Get the landingUrl property: Landing URL for Dynatrace environment.
     * 
     * @return the landingUrl value.
     */
    public String landingUrl() {
        return this.landingUrl;
    }

    /**
     * Set the landingUrl property: Landing URL for Dynatrace environment.
     * 
     * @param landingUrl the landingUrl value to set.
     * @return the EnvironmentInfo object itself.
     */
    public EnvironmentInfo withLandingUrl(String landingUrl) {
        this.landingUrl = landingUrl;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("environmentId", this.environmentId);
        jsonWriter.writeStringField("ingestionKey", this.ingestionKey);
        jsonWriter.writeStringField("logsIngestionEndpoint", this.logsIngestionEndpoint);
        jsonWriter.writeStringField("landingURL", this.landingUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of EnvironmentInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of EnvironmentInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the EnvironmentInfo.
     */
    public static EnvironmentInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            EnvironmentInfo deserializedEnvironmentInfo = new EnvironmentInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("environmentId".equals(fieldName)) {
                    deserializedEnvironmentInfo.environmentId = reader.getString();
                } else if ("ingestionKey".equals(fieldName)) {
                    deserializedEnvironmentInfo.ingestionKey = reader.getString();
                } else if ("logsIngestionEndpoint".equals(fieldName)) {
                    deserializedEnvironmentInfo.logsIngestionEndpoint = reader.getString();
                } else if ("landingURL".equals(fieldName)) {
                    deserializedEnvironmentInfo.landingUrl = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedEnvironmentInfo;
        });
    }
}

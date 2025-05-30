// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Map of data location to service location.
 */
@Immutable
public final class DataLocationToServiceLocationMap implements JsonSerializable<DataLocationToServiceLocationMap> {
    /*
     * Location of the data.
     */
    private String dataLocation;

    /*
     * Location of the service.
     */
    private String serviceLocation;

    /**
     * Creates an instance of DataLocationToServiceLocationMap class.
     */
    public DataLocationToServiceLocationMap() {
    }

    /**
     * Get the dataLocation property: Location of the data.
     * 
     * @return the dataLocation value.
     */
    public String dataLocation() {
        return this.dataLocation;
    }

    /**
     * Get the serviceLocation property: Location of the service.
     * 
     * @return the serviceLocation value.
     */
    public String serviceLocation() {
        return this.serviceLocation;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataLocationToServiceLocationMap from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataLocationToServiceLocationMap if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataLocationToServiceLocationMap.
     */
    public static DataLocationToServiceLocationMap fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataLocationToServiceLocationMap deserializedDataLocationToServiceLocationMap
                = new DataLocationToServiceLocationMap();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataLocation".equals(fieldName)) {
                    deserializedDataLocationToServiceLocationMap.dataLocation = reader.getString();
                } else if ("serviceLocation".equals(fieldName)) {
                    deserializedDataLocationToServiceLocationMap.serviceLocation = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataLocationToServiceLocationMap;
        });
    }
}

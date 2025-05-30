// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Usage properties.
 */
@Immutable
public final class UsageProperties implements JsonSerializable<UsageProperties> {
    /*
     * The current usage value for the subscription.
     */
    private Integer currentValue;

    /*
     * The limit of the usage.
     */
    private Integer limit;

    /*
     * The unit of the usage.
     */
    private String unit;

    /**
     * Creates an instance of UsageProperties class.
     */
    public UsageProperties() {
    }

    /**
     * Get the currentValue property: The current usage value for the subscription.
     * 
     * @return the currentValue value.
     */
    public Integer currentValue() {
        return this.currentValue;
    }

    /**
     * Get the limit property: The limit of the usage.
     * 
     * @return the limit value.
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the unit property: The unit of the usage.
     * 
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
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
     * Reads an instance of UsageProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UsageProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the UsageProperties.
     */
    public static UsageProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UsageProperties deserializedUsageProperties = new UsageProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("currentValue".equals(fieldName)) {
                    deserializedUsageProperties.currentValue = reader.getNullable(JsonReader::getInt);
                } else if ("limit".equals(fieldName)) {
                    deserializedUsageProperties.limit = reader.getNullable(JsonReader::getInt);
                } else if ("unit".equals(fieldName)) {
                    deserializedUsageProperties.unit = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUsageProperties;
        });
    }
}

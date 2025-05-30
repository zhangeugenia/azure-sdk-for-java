// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The export dataset configuration. Allows columns to be selected for the export. If not provided then the export will
 * include all available columns.
 */
@Fluent
public final class ExportDatasetConfiguration implements JsonSerializable<ExportDatasetConfiguration> {
    /*
     * Array of column names to be included in the export. If not provided then the export will include all available
     * columns. The available columns can vary by customer channel (see examples).
     */
    private List<String> columns;

    /**
     * Creates an instance of ExportDatasetConfiguration class.
     */
    public ExportDatasetConfiguration() {
    }

    /**
     * Get the columns property: Array of column names to be included in the export. If not provided then the export
     * will include all available columns. The available columns can vary by customer channel (see examples).
     * 
     * @return the columns value.
     */
    public List<String> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: Array of column names to be included in the export. If not provided then the export
     * will include all available columns. The available columns can vary by customer channel (see examples).
     * 
     * @param columns the columns value to set.
     * @return the ExportDatasetConfiguration object itself.
     */
    public ExportDatasetConfiguration withColumns(List<String> columns) {
        this.columns = columns;
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
        jsonWriter.writeArrayField("columns", this.columns, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExportDatasetConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExportDatasetConfiguration if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExportDatasetConfiguration.
     */
    public static ExportDatasetConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExportDatasetConfiguration deserializedExportDatasetConfiguration = new ExportDatasetConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("columns".equals(fieldName)) {
                    List<String> columns = reader.readArray(reader1 -> reader1.getString());
                    deserializedExportDatasetConfiguration.columns = columns;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExportDatasetConfiguration;
        });
    }
}

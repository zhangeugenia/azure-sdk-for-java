// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models.events;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/**
 * The TranscriptionFailed model.
 */
@Fluent
public final class TranscriptionFailed extends CallAutomationEventBase {

    /*
     * Defines the result for TranscriptionUpdate with the current status and the details about the status
     */
    private TranscriptionUpdate transcriptionUpdateResult;

    /**
     * Creates an instance of TranscriptionFailed class.
     */
    public TranscriptionFailed() {
        this.transcriptionUpdateResult = null;
    }

    /**
     * Get the transcriptionUpdateResult property: Defines the result for TranscriptionUpdate with the current status
     * and the details about the status.
     *
     * @return the transcriptionUpdateResult value.
     */
    public TranscriptionUpdate getTranscriptionUpdateResult() {
        return this.transcriptionUpdateResult;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("transcriptionUpdate", transcriptionUpdateResult);
        super.writeFields(jsonWriter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TranscriptionFailed from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TranscriptionFailed if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TranscriptionFailed.
     */
    public static TranscriptionFailed fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            final TranscriptionFailed event = new TranscriptionFailed();
            while (jsonReader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("transcriptionUpdate".equals(fieldName)) {
                    event.transcriptionUpdateResult = TranscriptionUpdate.fromJson(reader);
                } else {
                    if (!event.readField(fieldName, reader)) {
                        reader.skipChildren();
                    }
                }
            }
            return event;
        });
    }
}

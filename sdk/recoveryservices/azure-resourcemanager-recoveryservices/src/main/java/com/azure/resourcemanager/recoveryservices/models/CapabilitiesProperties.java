// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Capabilities information.
 */
@Fluent
public final class CapabilitiesProperties implements JsonSerializable<CapabilitiesProperties> {
    /*
     * The dnsZones property.
     */
    private List<DnsZone> dnsZones;

    /**
     * Creates an instance of CapabilitiesProperties class.
     */
    public CapabilitiesProperties() {
    }

    /**
     * Get the dnsZones property: The dnsZones property.
     * 
     * @return the dnsZones value.
     */
    public List<DnsZone> dnsZones() {
        return this.dnsZones;
    }

    /**
     * Set the dnsZones property: The dnsZones property.
     * 
     * @param dnsZones the dnsZones value to set.
     * @return the CapabilitiesProperties object itself.
     */
    public CapabilitiesProperties withDnsZones(List<DnsZone> dnsZones) {
        this.dnsZones = dnsZones;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsZones() != null) {
            dnsZones().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("dnsZones", this.dnsZones, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CapabilitiesProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CapabilitiesProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CapabilitiesProperties.
     */
    public static CapabilitiesProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CapabilitiesProperties deserializedCapabilitiesProperties = new CapabilitiesProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dnsZones".equals(fieldName)) {
                    List<DnsZone> dnsZones = reader.readArray(reader1 -> DnsZone.fromJson(reader1));
                    deserializedCapabilitiesProperties.dnsZones = dnsZones;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCapabilitiesProperties;
        });
    }
}

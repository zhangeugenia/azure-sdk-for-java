// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.v2.security.keyvault.certificates.implementation.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;

/**
 * The certificate issuer item containing certificate issuer metadata.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class CertificateIssuerItem implements JsonSerializable<CertificateIssuerItem> {
    /*
     * Certificate Identifier.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String id;

    /*
     * The issuer provider.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String provider;

    /**
     * Creates an instance of CertificateIssuerItem class.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public CertificateIssuerItem() {
    }

    /**
     * Get the id property: Certificate Identifier.
     * 
     * @return the id value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Certificate Identifier.
     * 
     * @param id the id value to set.
     * @return the CertificateIssuerItem object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public CertificateIssuerItem setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the provider property: The issuer provider.
     * 
     * @return the provider value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getProvider() {
        return this.provider;
    }

    /**
     * Set the provider property: The issuer provider.
     * 
     * @param provider the provider value to set.
     * @return the CertificateIssuerItem object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public CertificateIssuerItem setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("provider", this.provider);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateIssuerItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateIssuerItem if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificateIssuerItem.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public static CertificateIssuerItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CertificateIssuerItem deserializedCertificateIssuerItem = new CertificateIssuerItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedCertificateIssuerItem.id = reader.getString();
                } else if ("provider".equals(fieldName)) {
                    deserializedCertificateIssuerItem.provider = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCertificateIssuerItem;
        });
    }
}

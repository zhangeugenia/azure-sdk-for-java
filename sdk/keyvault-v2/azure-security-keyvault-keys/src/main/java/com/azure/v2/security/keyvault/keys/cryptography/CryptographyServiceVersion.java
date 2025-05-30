// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.security.keyvault.keys.cryptography;

import io.clientcore.core.http.models.ServiceVersion;

/**
 * The versions of Azure Key Vault supported by this client library.
 */
public enum CryptographyServiceVersion implements ServiceVersion {
    /**
     * Enum value 7.5.
     */
    V7_5("7.5");

    private final String version;

    CryptographyServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library
     *
     * @return the latest {@link CryptographyServiceVersion}
     */
    public static CryptographyServiceVersion getLatest() {
        return V7_5;
    }
}

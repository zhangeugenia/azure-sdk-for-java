// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.fluent.models.GetKeyVaultStatusResponseInner;
import com.azure.resourcemanager.netapp.models.GetKeyVaultStatusResponse;
import com.azure.resourcemanager.netapp.models.KeyVaultPrivateEndpoint;
import java.util.Collections;
import java.util.List;

public final class GetKeyVaultStatusResponseImpl implements GetKeyVaultStatusResponse {
    private GetKeyVaultStatusResponseInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    GetKeyVaultStatusResponseImpl(GetKeyVaultStatusResponseInner innerObject,
        com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String keyVaultUri() {
        return this.innerModel().keyVaultUri();
    }

    public String keyName() {
        return this.innerModel().keyName();
    }

    public String keyVaultResourceId() {
        return this.innerModel().keyVaultResourceId();
    }

    public List<KeyVaultPrivateEndpoint> keyVaultPrivateEndpoints() {
        List<KeyVaultPrivateEndpoint> inner = this.innerModel().keyVaultPrivateEndpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public GetKeyVaultStatusResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}

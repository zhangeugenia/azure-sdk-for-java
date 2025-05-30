// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.SchemaContractInner;
import com.azure.resourcemanager.apimanagement.models.SchemaContract;

public final class SchemaContractImpl implements SchemaContract, SchemaContract.Definition, SchemaContract.Update {
    private SchemaContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String contentType() {
        return this.innerModel().contentType();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String value() {
        return this.innerModel().value();
    }

    public Object definitions() {
        return this.innerModel().definitions();
    }

    public Object components() {
        return this.innerModel().components();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SchemaContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String apiId;

    private String schemaId;

    private String createIfMatch;

    private String updateIfMatch;

    public SchemaContractImpl withExistingApi(String resourceGroupName, String serviceName, String apiId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.apiId = apiId;
        return this;
    }

    public SchemaContract create() {
        this.innerObject = serviceManager.serviceClient()
            .getApiSchemas()
            .createOrUpdate(resourceGroupName, serviceName, apiId, schemaId, this.innerModel(), createIfMatch,
                Context.NONE);
        return this;
    }

    public SchemaContract create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApiSchemas()
            .createOrUpdate(resourceGroupName, serviceName, apiId, schemaId, this.innerModel(), createIfMatch, context);
        return this;
    }

    SchemaContractImpl(String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new SchemaContractInner();
        this.serviceManager = serviceManager;
        this.schemaId = name;
        this.createIfMatch = null;
    }

    public SchemaContractImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public SchemaContract apply() {
        this.innerObject = serviceManager.serviceClient()
            .getApiSchemas()
            .createOrUpdate(resourceGroupName, serviceName, apiId, schemaId, this.innerModel(), updateIfMatch,
                Context.NONE);
        return this;
    }

    public SchemaContract apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApiSchemas()
            .createOrUpdate(resourceGroupName, serviceName, apiId, schemaId, this.innerModel(), updateIfMatch, context);
        return this;
    }

    SchemaContractImpl(SchemaContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "service");
        this.apiId = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "apis");
        this.schemaId = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "schemas");
    }

    public SchemaContract refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getApiSchemas()
            .getWithResponse(resourceGroupName, serviceName, apiId, schemaId, Context.NONE)
            .getValue();
        return this;
    }

    public SchemaContract refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApiSchemas()
            .getWithResponse(resourceGroupName, serviceName, apiId, schemaId, context)
            .getValue();
        return this;
    }

    public SchemaContractImpl withContentType(String contentType) {
        this.innerModel().withContentType(contentType);
        return this;
    }

    public SchemaContractImpl withValue(String value) {
        this.innerModel().withValue(value);
        return this;
    }

    public SchemaContractImpl withDefinitions(Object definitions) {
        this.innerModel().withDefinitions(definitions);
        return this;
    }

    public SchemaContractImpl withComponents(Object components) {
        this.innerModel().withComponents(components);
        return this;
    }

    public SchemaContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

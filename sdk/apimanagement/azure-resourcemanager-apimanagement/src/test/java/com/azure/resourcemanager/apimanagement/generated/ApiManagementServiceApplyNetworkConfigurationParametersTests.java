// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceApplyNetworkConfigurationParameters;
import org.junit.jupiter.api.Assertions;

public final class ApiManagementServiceApplyNetworkConfigurationParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiManagementServiceApplyNetworkConfigurationParameters model = BinaryData.fromString("{\"location\":\"qqw\"}")
            .toObject(ApiManagementServiceApplyNetworkConfigurationParameters.class);
        Assertions.assertEquals("qqw", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiManagementServiceApplyNetworkConfigurationParameters model
            = new ApiManagementServiceApplyNetworkConfigurationParameters().withLocation("qqw");
        model = BinaryData.fromObject(model).toObject(ApiManagementServiceApplyNetworkConfigurationParameters.class);
        Assertions.assertEquals("qqw", model.location());
    }
}

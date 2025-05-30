// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainTopicProperties;

public final class DomainTopicPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DomainTopicProperties model
            = BinaryData.fromString("{\"provisioningState\":\"Creating\"}").toObject(DomainTopicProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DomainTopicProperties model = new DomainTopicProperties();
        model = BinaryData.fromObject(model).toObject(DomainTopicProperties.class);
    }
}

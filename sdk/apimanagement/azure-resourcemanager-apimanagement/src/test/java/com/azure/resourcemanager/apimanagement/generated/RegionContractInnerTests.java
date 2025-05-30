// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.RegionContractInner;
import org.junit.jupiter.api.Assertions;

public final class RegionContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionContractInner model
            = BinaryData.fromString("{\"name\":\"fdyldhgyed\",\"isMasterRegion\":true,\"isDeleted\":false}")
                .toObject(RegionContractInner.class);
        Assertions.assertTrue(model.isMasterRegion());
        Assertions.assertFalse(model.isDeleted());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionContractInner model = new RegionContractInner().withIsMasterRegion(true).withIsDeleted(false);
        model = BinaryData.fromObject(model).toObject(RegionContractInner.class);
        Assertions.assertTrue(model.isMasterRegion());
        Assertions.assertFalse(model.isDeleted());
    }
}

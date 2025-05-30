// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.IpAddressRange;
import org.junit.jupiter.api.Assertions;

public final class IpAddressRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpAddressRange model = BinaryData.fromString("{\"addressRange\":\"crnwbmeh\"}").toObject(IpAddressRange.class);
        Assertions.assertEquals("crnwbmeh", model.addressRange());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpAddressRange model = new IpAddressRange().withAddressRange("crnwbmeh");
        model = BinaryData.fromObject(model).toObject(IpAddressRange.class);
        Assertions.assertEquals("crnwbmeh", model.addressRange());
    }
}

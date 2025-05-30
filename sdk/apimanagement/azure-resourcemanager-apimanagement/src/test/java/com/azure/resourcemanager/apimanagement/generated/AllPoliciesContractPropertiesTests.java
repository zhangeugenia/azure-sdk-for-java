// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.AllPoliciesContractProperties;
import com.azure.resourcemanager.apimanagement.models.PolicyComplianceState;
import org.junit.jupiter.api.Assertions;

public final class AllPoliciesContractPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AllPoliciesContractProperties model
            = BinaryData.fromString("{\"referencePolicyId\":\"klj\",\"complianceState\":\"NonCompliant\"}")
                .toObject(AllPoliciesContractProperties.class);
        Assertions.assertEquals("klj", model.referencePolicyId());
        Assertions.assertEquals(PolicyComplianceState.NON_COMPLIANT, model.complianceState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AllPoliciesContractProperties model = new AllPoliciesContractProperties().withReferencePolicyId("klj")
            .withComplianceState(PolicyComplianceState.NON_COMPLIANT);
        model = BinaryData.fromObject(model).toObject(AllPoliciesContractProperties.class);
        Assertions.assertEquals("klj", model.referencePolicyId());
        Assertions.assertEquals(PolicyComplianceState.NON_COMPLIANT, model.complianceState());
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/**
 * Samples for CertificateObjectLocalRulestack Delete.
 */
public final class CertificateObjectLocalRulestackDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * CertificateObjectLocalRulestack_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectLocalRulestack_Delete_MaximumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void certificateObjectLocalRulestackDeleteMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.certificateObjectLocalRulestacks()
            .delete("rgopenapi", "lrs1", "armid1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * CertificateObjectLocalRulestack_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: CertificateObjectLocalRulestack_Delete_MinimumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void certificateObjectLocalRulestackDeleteMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.certificateObjectLocalRulestacks()
            .delete("rgopenapi", "lrs1", "armid1", com.azure.core.util.Context.NONE);
    }
}

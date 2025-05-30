// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.generated;

/**
 * Samples for SapDatabaseInstances List.
 */
public final class SapDatabaseInstancesListSamples {
    /*
     * x-ms-original-file: 2024-09-01/SapDatabaseInstances_List.json
     */
    /**
     * Sample code: SAPDatabaseInstances list by SAP virtual instance.
     * 
     * @param manager Entry point to WorkloadsSapVirtualInstanceManager.
     */
    public static void sAPDatabaseInstancesListBySAPVirtualInstance(
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager manager) {
        manager.sapDatabaseInstances().list("test-rg", "X00", com.azure.core.util.Context.NONE);
    }
}

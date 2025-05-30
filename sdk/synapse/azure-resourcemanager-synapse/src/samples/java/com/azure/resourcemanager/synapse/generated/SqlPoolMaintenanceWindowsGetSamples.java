// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/**
 * Samples for SqlPoolMaintenanceWindows Get.
 */
public final class SqlPoolMaintenanceWindowsGetSamples {
    /*
     * x-ms-original-file:
     * specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/GetMaintenanceWindows.json
     */
    /**
     * Sample code: Gets maintenance window settings for a selected SQL Analytics pool.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void getsMaintenanceWindowSettingsForASelectedSQLAnalyticsPool(
        com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.sqlPoolMaintenanceWindows()
            .getWithResponse("samplerg", "testworkspace", "testsp", "current", com.azure.core.util.Context.NONE);
    }
}

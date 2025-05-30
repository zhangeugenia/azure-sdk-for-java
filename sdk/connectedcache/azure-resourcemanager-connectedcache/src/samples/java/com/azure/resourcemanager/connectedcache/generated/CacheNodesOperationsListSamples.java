// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.connectedcache.generated;

/**
 * Samples for CacheNodesOperations List.
 */
public final class CacheNodesOperationsListSamples {
    /*
     * x-ms-original-file: 2023-05-01-preview/CacheNodesOperations_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: CacheNodes Private Preview(Legacy) resource List by Subscription - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to ConnectedCacheManager.
     */
    public static void cacheNodesPrivatePreviewLegacyResourceListBySubscriptionGeneratedByMaximumSetRule(
        com.azure.resourcemanager.connectedcache.ConnectedCacheManager manager) {
        manager.cacheNodesOperations().list(com.azure.core.util.Context.NONE);
    }
}

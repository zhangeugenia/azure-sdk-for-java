// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.fluent.models.StorageTaskReportInstanceInner;

/**
 * An instance of this class provides access to all the operations defined in
 * StorageTaskAssignmentsInstancesReportsClient.
 */
public interface StorageTaskAssignmentsInstancesReportsClient {
    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, specifies the maximum number of storage task assignment instances to be included in
     * the list response.
     * @param filter Optional. When specified, it can be used to query using reporting properties. See [Constructing
     * Filter
     * Strings](https://learn.microsoft.com/rest/api/storageservices/querying-tables-and-entities#constructing-filter-strings)
     * for details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<StorageTaskReportInstanceInner> listAsync(String resourceGroupName, String accountName,
        Integer maxpagesize, String filter);

    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<StorageTaskReportInstanceInner> listAsync(String resourceGroupName, String accountName);

    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageTaskReportInstanceInner> list(String resourceGroupName, String accountName);

    /**
     * Fetch the report summary of all the storage task assignments and instances in an account.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names
     * must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param maxpagesize Optional, specifies the maximum number of storage task assignment instances to be included in
     * the list response.
     * @param filter Optional. When specified, it can be used to query using reporting properties. See [Constructing
     * Filter
     * Strings](https://learn.microsoft.com/rest/api/storageservices/querying-tables-and-entities#constructing-filter-strings)
     * for details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return fetch Storage Tasks Run Summary as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StorageTaskReportInstanceInner> list(String resourceGroupName, String accountName,
        Integer maxpagesize, String filter, Context context);
}

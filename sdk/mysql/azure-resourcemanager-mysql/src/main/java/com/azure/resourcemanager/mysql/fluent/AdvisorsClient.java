// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.fluent.models.AdvisorInner;

/** An instance of this class provides access to all the operations defined in AdvisorsClient. */
public interface AdvisorsClient {
    /**
     * Get a recommendation action advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recommendation action advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AdvisorInner get(String resourceGroupName, String serverName, String advisorName);

    /**
     * Get a recommendation action advisor.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param advisorName The advisor name for recommendation action.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a recommendation action advisor along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AdvisorInner> getWithResponse(String resourceGroupName, String serverName, String advisorName,
        Context context);

    /**
     * List recommendation action advisors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of query statistics.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AdvisorInner> listByServer(String resourceGroupName, String serverName);

    /**
     * List recommendation action advisors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of query statistics.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AdvisorInner> listByServer(String resourceGroupName, String serverName, Context context);
}

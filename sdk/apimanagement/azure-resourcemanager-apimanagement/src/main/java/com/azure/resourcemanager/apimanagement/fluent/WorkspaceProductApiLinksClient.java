// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.ProductApiLinkContractInner;
import com.azure.resourcemanager.apimanagement.models.WorkspaceProductApiLinksGetResponse;

/**
 * An instance of this class provides access to all the operations defined in WorkspaceProductApiLinksClient.
 */
public interface WorkspaceProductApiLinksClient {
    /**
     * Lists a collection of the API links associated with a product.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Product-API link list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProductApiLinkContractInner> listByProduct(String resourceGroupName, String serviceName,
        String workspaceId, String productId);

    /**
     * Lists a collection of the API links associated with a product.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param filter | Field | Usage | Supported operators | Supported functions
     * |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| apiId | filter | ge, le, eq,
     * ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Product-API link list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProductApiLinkContractInner> listByProduct(String resourceGroupName, String serviceName,
        String workspaceId, String productId, String filter, Integer top, Integer skip, Context context);

    /**
     * Gets the API link for the product.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Product-API link identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API link for the product.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkspaceProductApiLinksGetResponse getWithResponse(String resourceGroupName, String serviceName,
        String workspaceId, String productId, String apiLinkId, Context context);

    /**
     * Gets the API link for the product.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Product-API link identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the API link for the product.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductApiLinkContractInner get(String resourceGroupName, String serviceName, String workspaceId, String productId,
        String apiLinkId);

    /**
     * Adds an API to the specified product via link.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Product-API link identifier. Must be unique in the current API Management service instance.
     * @param parameters Create or update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product-API link details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ProductApiLinkContractInner> createOrUpdateWithResponse(String resourceGroupName, String serviceName,
        String workspaceId, String productId, String apiLinkId, ProductApiLinkContractInner parameters,
        Context context);

    /**
     * Adds an API to the specified product via link.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Product-API link identifier. Must be unique in the current API Management service instance.
     * @param parameters Create or update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return product-API link details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductApiLinkContractInner createOrUpdate(String resourceGroupName, String serviceName, String workspaceId,
        String productId, String apiLinkId, ProductApiLinkContractInner parameters);

    /**
     * Deletes the specified API from the specified product.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Product-API link identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String workspaceId,
        String productId, String apiLinkId, Context context);

    /**
     * Deletes the specified API from the specified product.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param workspaceId Workspace identifier. Must be unique in the current API Management service instance.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param apiLinkId Product-API link identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String workspaceId, String productId, String apiLinkId);
}

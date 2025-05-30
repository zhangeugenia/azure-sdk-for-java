// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.dell.storage.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of FileSystems.
 */
public interface FileSystems {
    /**
     * Get a FileSystemResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filesystemName Name of the filesystem resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FileSystemResource along with {@link Response}.
     */
    Response<FileSystemResource> getByResourceGroupWithResponse(String resourceGroupName, String filesystemName,
        Context context);

    /**
     * Get a FileSystemResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filesystemName Name of the filesystem resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FileSystemResource.
     */
    FileSystemResource getByResourceGroup(String resourceGroupName, String filesystemName);

    /**
     * Delete a FileSystemResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filesystemName Name of the filesystem resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String filesystemName);

    /**
     * Delete a FileSystemResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filesystemName Name of the filesystem resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String filesystemName, Context context);

    /**
     * List FileSystemResource resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FileSystemResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FileSystemResource> listByResourceGroup(String resourceGroupName);

    /**
     * List FileSystemResource resources by resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FileSystemResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FileSystemResource> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List FileSystemResource resources by subscription ID.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FileSystemResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FileSystemResource> list();

    /**
     * List FileSystemResource resources by subscription ID.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FileSystemResource list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<FileSystemResource> list(Context context);

    /**
     * Get a FileSystemResource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FileSystemResource along with {@link Response}.
     */
    FileSystemResource getById(String id);

    /**
     * Get a FileSystemResource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FileSystemResource along with {@link Response}.
     */
    Response<FileSystemResource> getByIdWithResponse(String id, Context context);

    /**
     * Delete a FileSystemResource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a FileSystemResource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new FileSystemResource resource.
     * 
     * @param name resource name.
     * @return the first stage of the new FileSystemResource definition.
     */
    FileSystemResource.DefinitionStages.Blank define(String name);
}

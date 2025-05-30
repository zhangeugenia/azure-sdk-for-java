// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.JobInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of Job.
 */
public interface Job {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the created property: The UTC date and time when the customer has created the Job, in 'YYYY-MM-DDThh:mm:ssZ'
     * format.
     * 
     * @return the created value.
     */
    OffsetDateTime created();

    /**
     * Gets the state property: The current state of the job.
     * 
     * @return the state value.
     */
    JobState state();

    /**
     * Gets the description property: Optional customer supplied description of the Job.
     * 
     * @return the description value.
     */
    String description();

    /**
     * Gets the input property: The inputs for the Job.
     * 
     * @return the input value.
     */
    JobInput input();

    /**
     * Gets the lastModified property: The UTC date and time when the customer has last updated the Job, in
     * 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     * @return the lastModified value.
     */
    OffsetDateTime lastModified();

    /**
     * Gets the outputs property: The outputs for the Job.
     * 
     * @return the outputs value.
     */
    List<JobOutput> outputs();

    /**
     * Gets the priority property: Priority with which the job should be processed. Higher priority jobs are processed
     * before lower priority jobs. If not set, the default is normal.
     * 
     * @return the priority value.
     */
    Priority priority();

    /**
     * Gets the correlationData property: Customer provided key, value pairs that will be returned in Job and JobOutput
     * state events.
     * 
     * @return the correlationData value.
     */
    Map<String, String> correlationData();

    /**
     * Gets the startTime property: The UTC date and time at which this Job began processing.
     * 
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: The UTC date and time at which this Job finished processing.
     * 
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.fluent.models.JobInner object.
     * 
     * @return the inner object.
     */
    JobInner innerModel();

    /**
     * The entirety of the Job definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Job definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Job definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Job definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName, transformName.
             * 
             * @param resourceGroupName The name of the resource group within the Azure subscription.
             * @param accountName The Media Services account name.
             * @param transformName The Transform name.
             * @return the next definition stage.
             */
            WithCreate withExistingTransform(String resourceGroupName, String accountName, String transformName);
        }

        /**
         * The stage of the Job definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDescription, DefinitionStages.WithInput,
            DefinitionStages.WithOutputs, DefinitionStages.WithPriority, DefinitionStages.WithCorrelationData {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Job create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Job create(Context context);
        }

        /**
         * The stage of the Job definition allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: Optional customer supplied description of the Job..
             * 
             * @param description Optional customer supplied description of the Job.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the Job definition allowing to specify input.
         */
        interface WithInput {
            /**
             * Specifies the input property: The inputs for the Job..
             * 
             * @param input The inputs for the Job.
             * @return the next definition stage.
             */
            WithCreate withInput(JobInput input);
        }

        /**
         * The stage of the Job definition allowing to specify outputs.
         */
        interface WithOutputs {
            /**
             * Specifies the outputs property: The outputs for the Job..
             * 
             * @param outputs The outputs for the Job.
             * @return the next definition stage.
             */
            WithCreate withOutputs(List<JobOutput> outputs);
        }

        /**
         * The stage of the Job definition allowing to specify priority.
         */
        interface WithPriority {
            /**
             * Specifies the priority property: Priority with which the job should be processed. Higher priority jobs
             * are processed before lower priority jobs. If not set, the default is normal..
             * 
             * @param priority Priority with which the job should be processed. Higher priority jobs are processed
             * before lower priority jobs. If not set, the default is normal.
             * @return the next definition stage.
             */
            WithCreate withPriority(Priority priority);
        }

        /**
         * The stage of the Job definition allowing to specify correlationData.
         */
        interface WithCorrelationData {
            /**
             * Specifies the correlationData property: Customer provided key, value pairs that will be returned in Job
             * and JobOutput state events..
             * 
             * @param correlationData Customer provided key, value pairs that will be returned in Job and JobOutput
             * state events.
             * @return the next definition stage.
             */
            WithCreate withCorrelationData(Map<String, String> correlationData);
        }
    }

    /**
     * Begins update for the Job resource.
     * 
     * @return the stage of resource update.
     */
    Job.Update update();

    /**
     * The template for Job update.
     */
    interface Update extends UpdateStages.WithDescription, UpdateStages.WithInput, UpdateStages.WithOutputs,
        UpdateStages.WithPriority, UpdateStages.WithCorrelationData {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        Job apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Job apply(Context context);
    }

    /**
     * The Job update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the Job update allowing to specify description.
         */
        interface WithDescription {
            /**
             * Specifies the description property: Optional customer supplied description of the Job..
             * 
             * @param description Optional customer supplied description of the Job.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the Job update allowing to specify input.
         */
        interface WithInput {
            /**
             * Specifies the input property: The inputs for the Job..
             * 
             * @param input The inputs for the Job.
             * @return the next definition stage.
             */
            Update withInput(JobInput input);
        }

        /**
         * The stage of the Job update allowing to specify outputs.
         */
        interface WithOutputs {
            /**
             * Specifies the outputs property: The outputs for the Job..
             * 
             * @param outputs The outputs for the Job.
             * @return the next definition stage.
             */
            Update withOutputs(List<JobOutput> outputs);
        }

        /**
         * The stage of the Job update allowing to specify priority.
         */
        interface WithPriority {
            /**
             * Specifies the priority property: Priority with which the job should be processed. Higher priority jobs
             * are processed before lower priority jobs. If not set, the default is normal..
             * 
             * @param priority Priority with which the job should be processed. Higher priority jobs are processed
             * before lower priority jobs. If not set, the default is normal.
             * @return the next definition stage.
             */
            Update withPriority(Priority priority);
        }

        /**
         * The stage of the Job update allowing to specify correlationData.
         */
        interface WithCorrelationData {
            /**
             * Specifies the correlationData property: Customer provided key, value pairs that will be returned in Job
             * and JobOutput state events..
             * 
             * @param correlationData Customer provided key, value pairs that will be returned in Job and JobOutput
             * state events.
             * @return the next definition stage.
             */
            Update withCorrelationData(Map<String, String> correlationData);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Job refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Job refresh(Context context);

    /**
     * Cancel Job
     * 
     * Cancel a Job.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> cancelJobWithResponse(Context context);

    /**
     * Cancel Job
     * 
     * Cancel a Job.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancelJob();
}

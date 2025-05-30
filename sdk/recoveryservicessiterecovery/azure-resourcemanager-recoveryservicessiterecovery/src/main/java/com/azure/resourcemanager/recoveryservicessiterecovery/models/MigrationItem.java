// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.MigrationItemInner;

/**
 * An immutable client-side representation of MigrationItem.
 */
public interface MigrationItem {
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
     * Gets the properties property: The migration item properties.
     * 
     * @return the properties value.
     */
    MigrationItemProperties properties();

    /**
     * Gets the location property: Resource Location.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.MigrationItemInner object.
     * 
     * @return the inner object.
     */
    MigrationItemInner innerModel();

    /**
     * The entirety of the MigrationItem definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithParentResource,
        DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * The MigrationItem definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the MigrationItem definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the MigrationItem definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName, fabricName, protectionContainerName.
             * 
             * @param resourceGroupName The name of the resource group where the recovery services vault is present.
             * @param resourceName The name of the recovery services vault.
             * @param fabricName Fabric name.
             * @param protectionContainerName Protection container name.
             * @return the next definition stage.
             */
            WithProperties withExistingReplicationProtectionContainer(String resourceGroupName, String resourceName,
                String fabricName, String protectionContainerName);
        }

        /**
         * The stage of the MigrationItem definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Enable migration input properties..
             * 
             * @param properties Enable migration input properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(EnableMigrationInputProperties properties);
        }

        /**
         * The stage of the MigrationItem definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            MigrationItem create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MigrationItem create(Context context);
        }
    }

    /**
     * Begins update for the MigrationItem resource.
     * 
     * @return the stage of resource update.
     */
    MigrationItem.Update update();

    /**
     * The template for MigrationItem update.
     */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        MigrationItem apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MigrationItem apply(Context context);
    }

    /**
     * The MigrationItem update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the MigrationItem update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Update migration item input properties..
             * 
             * @param properties Update migration item input properties.
             * @return the next definition stage.
             */
            Update withProperties(UpdateMigrationItemInputProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    MigrationItem refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MigrationItem refresh(Context context);

    /**
     * Migrate item.
     * 
     * The operation to initiate migration of the item.
     * 
     * @param migrateInput Migrate input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem migrate(MigrateInput migrateInput);

    /**
     * Migrate item.
     * 
     * The operation to initiate migration of the item.
     * 
     * @param migrateInput Migrate input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem migrate(MigrateInput migrateInput, Context context);

    /**
     * Pause replication.
     * 
     * The operation to initiate pause replication of the item.
     * 
     * @param pauseReplicationInput Pause replication input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem pauseReplication(PauseReplicationInput pauseReplicationInput);

    /**
     * Pause replication.
     * 
     * The operation to initiate pause replication of the item.
     * 
     * @param pauseReplicationInput Pause replication input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem pauseReplication(PauseReplicationInput pauseReplicationInput, Context context);

    /**
     * Resume replication.
     * 
     * The operation to initiate resume replication of the item.
     * 
     * @param resumeReplicationInput Resume replication input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem resumeReplication(ResumeReplicationInput resumeReplicationInput);

    /**
     * Resume replication.
     * 
     * The operation to initiate resume replication of the item.
     * 
     * @param resumeReplicationInput Resume replication input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem resumeReplication(ResumeReplicationInput resumeReplicationInput, Context context);

    /**
     * Resynchronizes replication.
     * 
     * The operation to resynchronize replication of an ASR migration item.
     * 
     * @param input Resync input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem resync(ResyncInput input);

    /**
     * Resynchronizes replication.
     * 
     * The operation to resynchronize replication of an ASR migration item.
     * 
     * @param input Resync input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem resync(ResyncInput input, Context context);

    /**
     * Test migrate item.
     * 
     * The operation to initiate test migration of the item.
     * 
     * @param testMigrateInput Test migrate input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem testMigrate(TestMigrateInput testMigrateInput);

    /**
     * Test migrate item.
     * 
     * The operation to initiate test migration of the item.
     * 
     * @param testMigrateInput Test migrate input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem testMigrate(TestMigrateInput testMigrateInput, Context context);

    /**
     * Test migrate cleanup.
     * 
     * The operation to initiate test migrate cleanup.
     * 
     * @param testMigrateCleanupInput Test migrate cleanup input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem testMigrateCleanup(TestMigrateCleanupInput testMigrateCleanupInput);

    /**
     * Test migrate cleanup.
     * 
     * The operation to initiate test migrate cleanup.
     * 
     * @param testMigrateCleanupInput Test migrate cleanup input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return migration item.
     */
    MigrationItem testMigrateCleanup(TestMigrateCleanupInput testMigrateCleanupInput, Context context);
}

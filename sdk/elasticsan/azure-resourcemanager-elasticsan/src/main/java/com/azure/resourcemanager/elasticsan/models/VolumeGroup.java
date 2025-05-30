// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeGroupInner;
import java.util.List;

/**
 * An immutable client-side representation of VolumeGroup.
 */
public interface VolumeGroup {
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
     * Gets the identity property: The identity of the resource.
     * 
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: State of the operation on the resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningStates provisioningState();

    /**
     * Gets the protocolType property: Type of storage target.
     * 
     * @return the protocolType value.
     */
    StorageTargetType protocolType();

    /**
     * Gets the encryption property: Type of encryption.
     * 
     * @return the encryption value.
     */
    EncryptionType encryption();

    /**
     * Gets the encryptionProperties property: Encryption Properties describing Key Vault and Identity information.
     * 
     * @return the encryptionProperties value.
     */
    EncryptionProperties encryptionProperties();

    /**
     * Gets the networkAcls property: A collection of rules governing the accessibility from specific network locations.
     * 
     * @return the networkAcls value.
     */
    NetworkRuleSet networkAcls();

    /**
     * Gets the privateEndpointConnections property: The list of Private Endpoint Connections.
     * 
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the enforceDataIntegrityCheckForIscsi property: A boolean indicating whether or not Data Integrity Check is
     * enabled.
     * 
     * @return the enforceDataIntegrityCheckForIscsi value.
     */
    Boolean enforceDataIntegrityCheckForIscsi();

    /**
     * Gets the deleteRetentionPolicy property: The retention policy for the soft deleted volume group and its
     * associated resources.
     * 
     * @return the deleteRetentionPolicy value.
     */
    DeleteRetentionPolicy deleteRetentionPolicy();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.elasticsan.fluent.models.VolumeGroupInner object.
     * 
     * @return the inner object.
     */
    VolumeGroupInner innerModel();

    /**
     * The entirety of the VolumeGroup definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The VolumeGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the VolumeGroup definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the VolumeGroup definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, elasticSanName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param elasticSanName The name of the ElasticSan.
             * @return the next definition stage.
             */
            WithCreate withExistingElasticSan(String resourceGroupName, String elasticSanName);
        }

        /**
         * The stage of the VolumeGroup definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithIdentity, DefinitionStages.WithProtocolType, DefinitionStages.WithEncryption,
            DefinitionStages.WithEncryptionProperties, DefinitionStages.WithNetworkAcls,
            DefinitionStages.WithEnforceDataIntegrityCheckForIscsi, DefinitionStages.WithDeleteRetentionPolicy {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            VolumeGroup create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VolumeGroup create(Context context);
        }

        /**
         * The stage of the VolumeGroup definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             * 
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the VolumeGroup definition allowing to specify protocolType.
         */
        interface WithProtocolType {
            /**
             * Specifies the protocolType property: Type of storage target.
             * 
             * @param protocolType Type of storage target.
             * @return the next definition stage.
             */
            WithCreate withProtocolType(StorageTargetType protocolType);
        }

        /**
         * The stage of the VolumeGroup definition allowing to specify encryption.
         */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Type of encryption.
             * 
             * @param encryption Type of encryption.
             * @return the next definition stage.
             */
            WithCreate withEncryption(EncryptionType encryption);
        }

        /**
         * The stage of the VolumeGroup definition allowing to specify encryptionProperties.
         */
        interface WithEncryptionProperties {
            /**
             * Specifies the encryptionProperties property: Encryption Properties describing Key Vault and Identity
             * information.
             * 
             * @param encryptionProperties Encryption Properties describing Key Vault and Identity information.
             * @return the next definition stage.
             */
            WithCreate withEncryptionProperties(EncryptionProperties encryptionProperties);
        }

        /**
         * The stage of the VolumeGroup definition allowing to specify networkAcls.
         */
        interface WithNetworkAcls {
            /**
             * Specifies the networkAcls property: A collection of rules governing the accessibility from specific
             * network locations..
             * 
             * @param networkAcls A collection of rules governing the accessibility from specific network locations.
             * @return the next definition stage.
             */
            WithCreate withNetworkAcls(NetworkRuleSet networkAcls);
        }

        /**
         * The stage of the VolumeGroup definition allowing to specify enforceDataIntegrityCheckForIscsi.
         */
        interface WithEnforceDataIntegrityCheckForIscsi {
            /**
             * Specifies the enforceDataIntegrityCheckForIscsi property: A boolean indicating whether or not Data
             * Integrity Check is enabled.
             * 
             * @param enforceDataIntegrityCheckForIscsi A boolean indicating whether or not Data Integrity Check is
             * enabled.
             * @return the next definition stage.
             */
            WithCreate withEnforceDataIntegrityCheckForIscsi(Boolean enforceDataIntegrityCheckForIscsi);
        }

        /**
         * The stage of the VolumeGroup definition allowing to specify deleteRetentionPolicy.
         */
        interface WithDeleteRetentionPolicy {
            /**
             * Specifies the deleteRetentionPolicy property: The retention policy for the soft deleted volume group and
             * its associated resources..
             * 
             * @param deleteRetentionPolicy The retention policy for the soft deleted volume group and its associated
             * resources.
             * @return the next definition stage.
             */
            WithCreate withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy);
        }
    }

    /**
     * Begins update for the VolumeGroup resource.
     * 
     * @return the stage of resource update.
     */
    VolumeGroup.Update update();

    /**
     * The template for VolumeGroup update.
     */
    interface Update extends UpdateStages.WithIdentity, UpdateStages.WithProtocolType, UpdateStages.WithEncryption,
        UpdateStages.WithEncryptionProperties, UpdateStages.WithNetworkAcls,
        UpdateStages.WithEnforceDataIntegrityCheckForIscsi, UpdateStages.WithDeleteRetentionPolicy {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        VolumeGroup apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VolumeGroup apply(Context context);
    }

    /**
     * The VolumeGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the VolumeGroup update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the resource..
             * 
             * @param identity The identity of the resource.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }

        /**
         * The stage of the VolumeGroup update allowing to specify protocolType.
         */
        interface WithProtocolType {
            /**
             * Specifies the protocolType property: Type of storage target.
             * 
             * @param protocolType Type of storage target.
             * @return the next definition stage.
             */
            Update withProtocolType(StorageTargetType protocolType);
        }

        /**
         * The stage of the VolumeGroup update allowing to specify encryption.
         */
        interface WithEncryption {
            /**
             * Specifies the encryption property: Type of encryption.
             * 
             * @param encryption Type of encryption.
             * @return the next definition stage.
             */
            Update withEncryption(EncryptionType encryption);
        }

        /**
         * The stage of the VolumeGroup update allowing to specify encryptionProperties.
         */
        interface WithEncryptionProperties {
            /**
             * Specifies the encryptionProperties property: Encryption Properties describing Key Vault and Identity
             * information.
             * 
             * @param encryptionProperties Encryption Properties describing Key Vault and Identity information.
             * @return the next definition stage.
             */
            Update withEncryptionProperties(EncryptionProperties encryptionProperties);
        }

        /**
         * The stage of the VolumeGroup update allowing to specify networkAcls.
         */
        interface WithNetworkAcls {
            /**
             * Specifies the networkAcls property: A collection of rules governing the accessibility from specific
             * network locations..
             * 
             * @param networkAcls A collection of rules governing the accessibility from specific network locations.
             * @return the next definition stage.
             */
            Update withNetworkAcls(NetworkRuleSet networkAcls);
        }

        /**
         * The stage of the VolumeGroup update allowing to specify enforceDataIntegrityCheckForIscsi.
         */
        interface WithEnforceDataIntegrityCheckForIscsi {
            /**
             * Specifies the enforceDataIntegrityCheckForIscsi property: A boolean indicating whether or not Data
             * Integrity Check is enabled.
             * 
             * @param enforceDataIntegrityCheckForIscsi A boolean indicating whether or not Data Integrity Check is
             * enabled.
             * @return the next definition stage.
             */
            Update withEnforceDataIntegrityCheckForIscsi(Boolean enforceDataIntegrityCheckForIscsi);
        }

        /**
         * The stage of the VolumeGroup update allowing to specify deleteRetentionPolicy.
         */
        interface WithDeleteRetentionPolicy {
            /**
             * Specifies the deleteRetentionPolicy property: The retention policy for the soft deleted volume group and
             * its associated resources.
             * 
             * @param deleteRetentionPolicy The retention policy for the soft deleted volume group and its associated
             * resources.
             * @return the next definition stage.
             */
            Update withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    VolumeGroup refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VolumeGroup refresh(Context context);
}

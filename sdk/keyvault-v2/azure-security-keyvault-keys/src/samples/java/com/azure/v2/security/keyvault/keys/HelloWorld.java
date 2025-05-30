// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.security.keyvault.keys;

import com.azure.v2.core.http.polling.PollResponse;
import com.azure.v2.core.http.polling.Poller;
import com.azure.v2.identity.DefaultAzureCredentialBuilder;
import com.azure.v2.security.keyvault.keys.models.CreateRsaKeyOptions;
import com.azure.v2.security.keyvault.keys.models.DeletedKey;
import com.azure.v2.security.keyvault.keys.models.KeyOperation;
import com.azure.v2.security.keyvault.keys.models.KeyVaultKey;
import io.clientcore.core.http.models.RequestContext;
import io.clientcore.core.http.models.Response;

import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Sample demonstrates how to set, get, update and delete a key.
 */
public class HelloWorld {
    /**
     * Authenticates with the key vault and shows how to set, get, update and delete a key in the key vault.
     *
     * @param args Unused. Arguments to the program.
     *
     * @throws IllegalArgumentException when invalid key vault endpoint is passed.
     * @throws InterruptedException when the thread is interrupted in sleep mode.
     */
    public static void main(String[] args) throws InterruptedException, IllegalArgumentException {
        /* Instantiate a KeyClient that will be used to call the service. Notice that the client is using default Azure
        credentials. For more information on this and other types of credentials, see this document:
        https://docs.microsoft.com/java/api/overview/azure/identity-readme?view=azure-java-stable.

        To get started, you'll need a URL to an Azure Key Vault. See the README
        (https://github.com/vcolin7/azure-sdk-for-java/blob/feature/vicolina/keyvault/v2/sdk/keyvault-v2/azure-security-keyvault-keys/README.md)
        for links and instructions. */
        KeyClient keyClient = new KeyClientBuilder()
            .endpoint("<your-key-vault-url>")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();

        // Let's create an RSA key valid for 1 year. If the key already exists in the key vault, then a new version of
        // the key is created.
        RequestContext requestContext = RequestContext.builder()
            .putMetadata("someKey", "someValue")
            .build();

        Response<KeyVaultKey> createKeyResponse =
            keyClient.createRsaKeyWithResponse(new CreateRsaKeyOptions("CloudRsaKey")
                .setExpiresOn(OffsetDateTime.now().plusYears(1))
                .setKeySize(2048), requestContext);

        // Let's validate the create key operation succeeded using the status code information in the response.
        System.out.printf("Create Key operation succeeded with status code %s \n", createKeyResponse.getStatusCode());

        // Let's get the RSA key from the key vault.
        KeyVaultKey cloudRsaKey = keyClient.getKey("CloudRsaKey");

        System.out.printf("Key is returned with name %s and type %s \n", cloudRsaKey.getName(),
            cloudRsaKey.getKeyType());

        // After one year, the RSA key is still required, we need to update the expiry time of the key.
        // The update method can be used to update the expiry attribute of the key.
        cloudRsaKey.getProperties().setExpiresOn(cloudRsaKey.getProperties().getExpiresOn().plusYears(1));

        KeyVaultKey updatedKey = keyClient.updateKeyProperties(cloudRsaKey.getProperties(), Arrays.asList(
            KeyOperation.ENCRYPT, KeyOperation.DECRYPT));

        System.out.printf("Key's updated expiry time %s \n", updatedKey.getProperties().getExpiresOn());

        // We need the RSA key with bigger key size, so you want to update the key in key vault to ensure it has the
        // required size. Calling createRsaKey() on an existing key creates a new version of the key in the key vault
        // with the new specified size.
        keyClient.createRsaKey(new CreateRsaKeyOptions("CloudRsaKey")
            .setExpiresOn(OffsetDateTime.now().plusYears(1))
            .setKeySize(4096));

        // The RSA key is no longer needed, need to delete it from the key vault.
        Poller<DeletedKey, Void> rsaDeletedKeyPoller = keyClient.beginDeleteKey("CloudRsaKey");
        PollResponse<DeletedKey> pollResponse = rsaDeletedKeyPoller.poll();
        DeletedKey rsaDeletedKey = pollResponse.getValue();

        System.out.println("Deleted Date  %s" + rsaDeletedKey.getDeletedOn().toString());
        System.out.printf("Deleted Key's Recovery Id %s", rsaDeletedKey.getRecoveryId());

        // The key is being deleted on the server.
        rsaDeletedKeyPoller.waitForCompletion();

        // To ensure the key is deleted server-side.
        Thread.sleep(30000);

        // If the keyvault is soft-delete enabled, then deleted keys need to be purged for permanent deletion.
        keyClient.purgeDeletedKey("CloudRsaKey");
    }
}

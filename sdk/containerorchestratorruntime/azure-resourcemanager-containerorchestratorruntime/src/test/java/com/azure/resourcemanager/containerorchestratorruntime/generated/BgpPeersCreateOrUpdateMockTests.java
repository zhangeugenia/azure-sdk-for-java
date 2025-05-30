// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerorchestratorruntime.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.containerorchestratorruntime.ContainerOrchestratorRuntimeManager;
import com.azure.resourcemanager.containerorchestratorruntime.models.BgpPeer;
import com.azure.resourcemanager.containerorchestratorruntime.models.BgpPeerProperties;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BgpPeersCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"myAsn\":1462188439,\"peerAsn\":538990219,\"peerAddress\":\"jzkdeslpvlopwi\",\"provisioningState\":\"Succeeded\"},\"id\":\"xpkd\",\"name\":\"zb\",\"type\":\"iuebbaumny\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerOrchestratorRuntimeManager manager = ContainerOrchestratorRuntimeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        BgpPeer response = manager.bgpPeers()
            .define("lcuhxwtctyqiklb")
            .withExistingResourceUri("xbzpfzab")
            .withProperties(
                new BgpPeerProperties().withMyAsn(2077643232).withPeerAsn(946920071).withPeerAddress("lwzbhvgyugu"))
            .create();

        Assertions.assertEquals(1462188439, response.properties().myAsn());
        Assertions.assertEquals(538990219, response.properties().peerAsn());
        Assertions.assertEquals("jzkdeslpvlopwi", response.properties().peerAddress());
    }
}

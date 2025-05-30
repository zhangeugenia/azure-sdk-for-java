// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.neonpostgres.NeonPostgresManager;
import com.azure.resourcemanager.neonpostgres.models.Compute;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ComputesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"entityId\":\"atlzmg\",\"entityName\":\"hnzrsbkkzovlzdm\",\"createdAt\":\"mfwsxafofu\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"movzwde\",\"value\":\"kkmvhzfovanyrva\"},{\"name\":\"rtgelg\",\"value\":\"ewikfyaqandmym\"}],\"region\":\"oqjum\",\"cpuCores\":238006618,\"memory\":544073075,\"status\":\"bvzo\"},\"id\":\"x\",\"name\":\"fmvsmcwoxfaxdt\",\"type\":\"qi\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NeonPostgresManager manager = NeonPostgresManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<Compute> response
            = manager.computes().list("ecuyr", "wimbzayspzvr", "etv", "phmdzxplgtp", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hnzrsbkkzovlzdm", response.iterator().next().properties().entityName());
        Assertions.assertEquals("movzwde", response.iterator().next().properties().attributes().get(0).name());
        Assertions.assertEquals("kkmvhzfovanyrva", response.iterator().next().properties().attributes().get(0).value());
        Assertions.assertEquals("oqjum", response.iterator().next().properties().region());
        Assertions.assertEquals(238006618, response.iterator().next().properties().cpuCores());
        Assertions.assertEquals(544073075, response.iterator().next().properties().memory());
        Assertions.assertEquals("bvzo", response.iterator().next().properties().status());
    }
}

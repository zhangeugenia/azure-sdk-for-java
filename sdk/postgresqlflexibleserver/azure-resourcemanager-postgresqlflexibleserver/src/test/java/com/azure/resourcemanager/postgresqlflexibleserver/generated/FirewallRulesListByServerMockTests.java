// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FirewallRule;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FirewallRulesListByServerMockTests {
    @Test
    public void testListByServer() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"startIpAddress\":\"uahokq\",\"endIpAddress\":\"obkauxofsh\"},\"id\":\"hwpnulaiywzejywh\",\"name\":\"lwkojpllndnpdw\",\"type\":\"pqafgfugsnnfhy\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PostgreSqlManager manager = PostgreSqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<FirewallRule> response
            = manager.firewallRules().listByServer("herngb", "c", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("uahokq", response.iterator().next().startIpAddress());
        Assertions.assertEquals("obkauxofsh", response.iterator().next().endIpAddress());
    }
}

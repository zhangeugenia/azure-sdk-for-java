// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.ListRecoveryPointsRecommendedForMoveRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RecoveryPointsRecommendedForMovesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"objectType\":\"RecoveryPoint\"},\"eTag\":\"ubz\",\"location\":\"vpvdylytcovqse\",\"tags\":{\"xzfxn\":\"fjb\"},\"id\":\"mlbmuoswkjm\",\"name\":\"ihdcyyyzlw\",\"type\":\"bwzjnufzrf\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        RecoveryServicesBackupManager manager = RecoveryServicesBackupManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<RecoveryPointResource> response = manager.recoveryPointsRecommendedForMoves()
            .list("iuomzczfkiceevs", "axwspcaxikhfjqeb", "lcxkxgzzromv", "g", "sem",
                new ListRecoveryPointsRecommendedForMoveRequest().withObjectType("esrfsvpinkzpatq")
                    .withExcludedRPList(Arrays.asList("swxspvckojaz", "bgspf")),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vpvdylytcovqse", response.iterator().next().location());
        Assertions.assertEquals("fjb", response.iterator().next().tags().get("xzfxn"));
        Assertions.assertEquals("ubz", response.iterator().next().etag());
    }
}

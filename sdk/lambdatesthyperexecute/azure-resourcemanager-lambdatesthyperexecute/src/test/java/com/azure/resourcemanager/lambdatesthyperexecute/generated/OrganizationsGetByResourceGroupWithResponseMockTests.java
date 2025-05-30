// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.lambdatesthyperexecute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.lambdatesthyperexecute.LambdaTestHyperExecuteManager;
import com.azure.resourcemanager.lambdatesthyperexecute.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.lambdatesthyperexecute.models.OrganizationResource;
import com.azure.resourcemanager.lambdatesthyperexecute.models.SingleSignOnStates;
import com.azure.resourcemanager.lambdatesthyperexecute.models.SingleSignOnType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OrganizationsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"marketplace\":{\"subscriptionId\":\"xlzevgbmqjqabcy\",\"subscriptionStatus\":\"Unsubscribed\",\"offerDetails\":{\"publisherId\":\"vkwlzuvccfwnf\",\"offerId\":\"bacfionlebxetq\",\"planId\":\"tzxdpnqbqqwx\",\"planName\":\"feallnwsu\",\"termUnit\":\"snjampmng\",\"termId\":\"scxaq\"}},\"user\":{\"firstName\":\"ochcbonqvpkvl\",\"lastName\":\"njeaseipheofloke\",\"emailAddress\":\"ienjbdlwtgr\",\"upn\":\"djpjumasxazjpq\",\"phoneNumber\":\"gual\"},\"provisioningState\":\"Succeeded\",\"partnerProperties\":{\"licensesSubscribed\":703719662},\"singleSignOnProperties\":{\"type\":\"Saml\",\"state\":\"Initial\",\"enterpriseAppId\":\"zvdudgwdslfhotwm\",\"url\":\"npwlbjnpg\",\"aadDomains\":[\"tadehxnltyfsopp\",\"suesnzw\",\"ej\",\"avo\"]}},\"identity\":{\"principalId\":\"dmoh\",\"tenantId\":\"bqvudwxdndn\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{\"kuofqweykhme\":{\"principalId\":\"jjugwdkcglhslaz\",\"clientId\":\"yggdtjixh\"},\"amdecte\":{\"principalId\":\"vfyexfw\",\"clientId\":\"bcibvyvdcsitynn\"},\"kqsleyyvxy\":{\"principalId\":\"iqscjeypv\",\"clientId\":\"zrkgqhcjrefovg\"},\"mdajv\":{\"principalId\":\"pkc\",\"clientId\":\"tpngjcrcczsqpjh\"}}},\"location\":\"sounqecanoaeu\",\"tags\":{\"tuo\":\"yhltrpmopjmcm\"},\"id\":\"thfuiuaodsfcpkvx\",\"name\":\"dpuozmyz\",\"type\":\"dagfuaxbezyiuok\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LambdaTestHyperExecuteManager manager = LambdaTestHyperExecuteManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        OrganizationResource response = manager.organizations()
            .getByResourceGroupWithResponse("gpphrcgyn", "ocpecfvmmco", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("sounqecanoaeu", response.location());
        Assertions.assertEquals("yhltrpmopjmcm", response.tags().get("tuo"));
        Assertions.assertEquals("xlzevgbmqjqabcy", response.properties().marketplace().subscriptionId());
        Assertions.assertEquals("vkwlzuvccfwnf", response.properties().marketplace().offerDetails().publisherId());
        Assertions.assertEquals("bacfionlebxetq", response.properties().marketplace().offerDetails().offerId());
        Assertions.assertEquals("tzxdpnqbqqwx", response.properties().marketplace().offerDetails().planId());
        Assertions.assertEquals("feallnwsu", response.properties().marketplace().offerDetails().planName());
        Assertions.assertEquals("snjampmng", response.properties().marketplace().offerDetails().termUnit());
        Assertions.assertEquals("scxaq", response.properties().marketplace().offerDetails().termId());
        Assertions.assertEquals("ochcbonqvpkvl", response.properties().user().firstName());
        Assertions.assertEquals("njeaseipheofloke", response.properties().user().lastName());
        Assertions.assertEquals("ienjbdlwtgr", response.properties().user().emailAddress());
        Assertions.assertEquals("djpjumasxazjpq", response.properties().user().upn());
        Assertions.assertEquals("gual", response.properties().user().phoneNumber());
        Assertions.assertEquals(703719662, response.properties().partnerProperties().licensesSubscribed());
        Assertions.assertEquals(SingleSignOnType.SAML, response.properties().singleSignOnProperties().type());
        Assertions.assertEquals(SingleSignOnStates.INITIAL, response.properties().singleSignOnProperties().state());
        Assertions.assertEquals("zvdudgwdslfhotwm", response.properties().singleSignOnProperties().enterpriseAppId());
        Assertions.assertEquals("npwlbjnpg", response.properties().singleSignOnProperties().url());
        Assertions.assertEquals("tadehxnltyfsopp", response.properties().singleSignOnProperties().aadDomains().get(0));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, response.identity().type());
    }
}

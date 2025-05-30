// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.RevisionInner;
import com.azure.resourcemanager.appcontainers.models.RevisionCollection;
import java.util.Arrays;

public final class RevisionCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RevisionCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"createdTime\":\"2021-02-22T10:12:12Z\",\"lastActiveTime\":\"2021-10-17T14:02:40Z\",\"fqdn\":\"vxwc\",\"template\":{\"revisionSuffix\":\"pcirelsfeaen\",\"terminationGracePeriodSeconds\":6089881890484118319,\"initContainers\":[{}],\"containers\":[{},{},{}],\"scale\":{\"minReplicas\":1993086714,\"maxReplicas\":863801878,\"cooldownPeriod\":1654989663,\"pollingInterval\":1879278925,\"rules\":[{}]},\"volumes\":[{},{}],\"serviceBinds\":[{},{}]},\"active\":false,\"replicas\":1082355314,\"trafficWeight\":1172987793,\"provisioningError\":\"pjrvxagl\",\"healthState\":\"None\",\"provisioningState\":\"Provisioning\",\"runningState\":\"Failed\"},\"id\":\"ytxitcsk\",\"name\":\"cktqumiekkezzi\",\"type\":\"hlyfjhdgqgg\"},{\"properties\":{\"createdTime\":\"2021-11-21T10:43:47Z\",\"lastActiveTime\":\"2021-04-09T06:20:49Z\",\"fqdn\":\"aeqidbqfatpxll\",\"template\":{\"revisionSuffix\":\"yjmoadsu\",\"terminationGracePeriodSeconds\":1027634010219173638,\"initContainers\":[{},{},{},{}],\"containers\":[{},{}],\"scale\":{\"minReplicas\":1651100345,\"maxReplicas\":1483853053,\"cooldownPeriod\":1756269391,\"pollingInterval\":1027618115,\"rules\":[{},{}]},\"volumes\":[{},{},{},{}],\"serviceBinds\":[{}]},\"active\":false,\"replicas\":803302222,\"trafficWeight\":141819927,\"provisioningError\":\"xkgymareqnajxqu\",\"healthState\":\"Healthy\",\"provisioningState\":\"Failed\",\"runningState\":\"Running\"},\"id\":\"eddgssofw\",\"name\":\"mzqa\",\"type\":\"krmnjijpxacqqud\"}],\"nextLink\":\"byxbaaabjy\"}")
            .toObject(RevisionCollection.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RevisionCollection model
            = new RevisionCollection().withValue(Arrays.asList(new RevisionInner(), new RevisionInner()));
        model = BinaryData.fromObject(model).toObject(RevisionCollection.class);
    }
}

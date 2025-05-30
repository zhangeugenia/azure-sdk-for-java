// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.fluent.models.InstanceInner;
import com.azure.resourcemanager.deviceupdate.models.AuthenticationType;
import com.azure.resourcemanager.deviceupdate.models.DiagnosticStorageProperties;
import com.azure.resourcemanager.deviceupdate.models.IotHubSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class InstanceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InstanceInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Canceled\",\"accountName\":\"wrlyxwjkcprb\",\"iotHubs\":[{\"resourceId\":\"xgjvtbv\"}],\"enableDiagnostics\":false,\"diagnosticStorageProperties\":{\"authenticationType\":\"KeyBased\",\"connectionString\":\"nruj\",\"resourceId\":\"guhmuouqfpr\"}},\"location\":\"wbnguitnwui\",\"tags\":{\"ckyfih\":\"zxufiz\"},\"id\":\"fidfvzw\",\"name\":\"zuhtymwisdkfthwx\",\"type\":\"nteiwaopv\"}")
            .toObject(InstanceInner.class);
        Assertions.assertEquals("wbnguitnwui", model.location());
        Assertions.assertEquals("zxufiz", model.tags().get("ckyfih"));
        Assertions.assertEquals("xgjvtbv", model.iotHubs().get(0).resourceId());
        Assertions.assertEquals(false, model.enableDiagnostics());
        Assertions.assertEquals(AuthenticationType.KEY_BASED, model.diagnosticStorageProperties().authenticationType());
        Assertions.assertEquals("nruj", model.diagnosticStorageProperties().connectionString());
        Assertions.assertEquals("guhmuouqfpr", model.diagnosticStorageProperties().resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InstanceInner model = new InstanceInner().withLocation("wbnguitnwui")
            .withTags(mapOf("ckyfih", "zxufiz"))
            .withIotHubs(Arrays.asList(new IotHubSettings().withResourceId("xgjvtbv")))
            .withEnableDiagnostics(false)
            .withDiagnosticStorageProperties(
                new DiagnosticStorageProperties().withAuthenticationType(AuthenticationType.KEY_BASED)
                    .withConnectionString("nruj")
                    .withResourceId("guhmuouqfpr"));
        model = BinaryData.fromObject(model).toObject(InstanceInner.class);
        Assertions.assertEquals("wbnguitnwui", model.location());
        Assertions.assertEquals("zxufiz", model.tags().get("ckyfih"));
        Assertions.assertEquals("xgjvtbv", model.iotHubs().get(0).resourceId());
        Assertions.assertEquals(false, model.enableDiagnostics());
        Assertions.assertEquals(AuthenticationType.KEY_BASED, model.diagnosticStorageProperties().authenticationType());
        Assertions.assertEquals("nruj", model.diagnosticStorageProperties().connectionString());
        Assertions.assertEquals("guhmuouqfpr", model.diagnosticStorageProperties().resourceId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.VolumeInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.VolumeList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VolumeListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeList model = BinaryData.fromString(
            "{\"nextLink\":\"brxkjzwr\",\"value\":[{\"extendedLocation\":{\"name\":\"fmsh\",\"type\":\"wfbkgozxwo\"},\"properties\":{\"attachedTo\":[\"yd\",\"izqaclnapxbiyg\",\"ugjknf\",\"mfcttux\"],\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"lflqoiqu\",\"provisioningState\":\"Accepted\",\"serialNumber\":\"mrnjh\",\"sizeMiB\":4607580078285985289},\"location\":\"ztczytq\",\"tags\":{\"uunfprnjletlxsm\":\"h\"},\"id\":\"pddouifamowaziyn\",\"name\":\"nlqwzdvpiwhx\",\"type\":\"szdtmaajquh\"}]}")
            .toObject(VolumeList.class);
        Assertions.assertEquals("brxkjzwr", model.nextLink());
        Assertions.assertEquals("ztczytq", model.value().get(0).location());
        Assertions.assertEquals("h", model.value().get(0).tags().get("uunfprnjletlxsm"));
        Assertions.assertEquals("fmsh", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("wfbkgozxwo", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals(4607580078285985289L, model.value().get(0).sizeMiB());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeList model = new VolumeList().withNextLink("brxkjzwr")
            .withValue(Arrays.asList(new VolumeInner().withLocation("ztczytq")
                .withTags(mapOf("uunfprnjletlxsm", "h"))
                .withExtendedLocation(new ExtendedLocation().withName("fmsh").withType("wfbkgozxwo"))
                .withSizeMiB(4607580078285985289L)));
        model = BinaryData.fromObject(model).toObject(VolumeList.class);
        Assertions.assertEquals("brxkjzwr", model.nextLink());
        Assertions.assertEquals("ztczytq", model.value().get(0).location());
        Assertions.assertEquals("h", model.value().get(0).tags().get("uunfprnjletlxsm"));
        Assertions.assertEquals("fmsh", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("wfbkgozxwo", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals(4607580078285985289L, model.value().get(0).sizeMiB());
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

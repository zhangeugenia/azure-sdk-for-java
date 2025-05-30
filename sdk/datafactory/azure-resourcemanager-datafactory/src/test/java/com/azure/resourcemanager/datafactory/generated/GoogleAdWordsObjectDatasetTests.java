// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.GoogleAdWordsObjectDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GoogleAdWordsObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GoogleAdWordsObjectDataset model = BinaryData.fromString(
            "{\"type\":\"GoogleAdWordsObject\",\"typeProperties\":{\"tableName\":\"datainrkj\"},\"description\":\"gzfsu\",\"structure\":\"dataybhozlsbufnhb\",\"schema\":\"datantpoe\",\"linkedServiceName\":{\"referenceName\":\"ytrsljzmzui\",\"parameters\":{\"p\":\"datagsxzn\",\"ma\":\"datamkqbylbbnjldicq\"}},\"parameters\":{\"fzoidy\":{\"type\":\"Int\",\"defaultValue\":\"dataenitvkyahfo\"}},\"annotations\":[\"datarev\"],\"folder\":{\"name\":\"kfalw\"},\"\":{\"ucnusnylfhicrj\":\"datachcayvqbeq\"}}")
            .toObject(GoogleAdWordsObjectDataset.class);
        Assertions.assertEquals("gzfsu", model.description());
        Assertions.assertEquals("ytrsljzmzui", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("fzoidy").type());
        Assertions.assertEquals("kfalw", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GoogleAdWordsObjectDataset model = new GoogleAdWordsObjectDataset().withDescription("gzfsu")
            .withStructure("dataybhozlsbufnhb")
            .withSchema("datantpoe")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ytrsljzmzui")
                .withParameters(mapOf("p", "datagsxzn", "ma", "datamkqbylbbnjldicq")))
            .withParameters(mapOf("fzoidy",
                new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("dataenitvkyahfo")))
            .withAnnotations(Arrays.asList("datarev"))
            .withFolder(new DatasetFolder().withName("kfalw"))
            .withTableName("datainrkj");
        model = BinaryData.fromObject(model).toObject(GoogleAdWordsObjectDataset.class);
        Assertions.assertEquals("gzfsu", model.description());
        Assertions.assertEquals("ytrsljzmzui", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("fzoidy").type());
        Assertions.assertEquals("kfalw", model.folder().name());
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

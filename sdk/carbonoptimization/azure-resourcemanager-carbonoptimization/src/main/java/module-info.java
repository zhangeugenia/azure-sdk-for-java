// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.azure.resourcemanager.carbonoptimization {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.carbonoptimization;
    exports com.azure.resourcemanager.carbonoptimization.fluent;
    exports com.azure.resourcemanager.carbonoptimization.fluent.models;
    exports com.azure.resourcemanager.carbonoptimization.models;

    opens com.azure.resourcemanager.carbonoptimization.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.carbonoptimization.models to com.azure.core;
    opens com.azure.resourcemanager.carbonoptimization.implementation.models to com.azure.core;
}

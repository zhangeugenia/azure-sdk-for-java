// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.migration.assessment.fluent.models.AssessmentOptionsInner;
import com.azure.resourcemanager.migration.assessment.models.AssessmentOptions;
import com.azure.resourcemanager.migration.assessment.models.AssessmentOptionsProperties;

public final class AssessmentOptionsImpl implements AssessmentOptions {
    private AssessmentOptionsInner innerObject;

    private final com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager;

    AssessmentOptionsImpl(AssessmentOptionsInner innerObject,
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public AssessmentOptionsProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public AssessmentOptionsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager() {
        return this.serviceManager;
    }
}

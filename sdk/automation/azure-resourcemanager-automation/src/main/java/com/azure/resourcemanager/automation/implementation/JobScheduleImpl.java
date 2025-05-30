// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.JobScheduleInner;
import com.azure.resourcemanager.automation.models.JobSchedule;
import com.azure.resourcemanager.automation.models.JobScheduleCreateParameters;
import com.azure.resourcemanager.automation.models.RunbookAssociationProperty;
import com.azure.resourcemanager.automation.models.ScheduleAssociationProperty;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public final class JobScheduleImpl implements JobSchedule, JobSchedule.Definition {
    private JobScheduleInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    JobScheduleImpl(JobScheduleInner innerObject,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
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

    public String jobScheduleId() {
        return this.innerModel().jobScheduleId();
    }

    public ScheduleAssociationProperty schedule() {
        return this.innerModel().schedule();
    }

    public RunbookAssociationProperty runbook() {
        return this.innerModel().runbook();
    }

    public String runOn() {
        return this.innerModel().runOn();
    }

    public Map<String, String> parameters() {
        Map<String, String> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public JobScheduleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String automationAccountName;

    private UUID jobScheduleId;

    private JobScheduleCreateParameters createParameters;

    public JobScheduleImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    public JobSchedule create() {
        this.innerObject = serviceManager.serviceClient()
            .getJobSchedules()
            .createWithResponse(resourceGroupName, automationAccountName, jobScheduleId, createParameters, Context.NONE)
            .getValue();
        return this;
    }

    public JobSchedule create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getJobSchedules()
            .createWithResponse(resourceGroupName, automationAccountName, jobScheduleId, createParameters, context)
            .getValue();
        return this;
    }

    JobScheduleImpl(UUID name, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = new JobScheduleInner();
        this.serviceManager = serviceManager;
        this.jobScheduleId = name;
        this.createParameters = new JobScheduleCreateParameters();
    }

    public JobSchedule refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getJobSchedules()
            .getWithResponse(resourceGroupName, automationAccountName, jobScheduleId, Context.NONE)
            .getValue();
        return this;
    }

    public JobSchedule refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getJobSchedules()
            .getWithResponse(resourceGroupName, automationAccountName, jobScheduleId, context)
            .getValue();
        return this;
    }

    public JobScheduleImpl withSchedule(ScheduleAssociationProperty schedule) {
        this.createParameters.withSchedule(schedule);
        return this;
    }

    public JobScheduleImpl withRunbook(RunbookAssociationProperty runbook) {
        this.createParameters.withRunbook(runbook);
        return this;
    }

    public JobScheduleImpl withRunOn(String runOn) {
        this.createParameters.withRunOn(runOn);
        return this;
    }

    public JobScheduleImpl withParameters(Map<String, String> parameters) {
        this.createParameters.withParameters(parameters);
        return this;
    }
}

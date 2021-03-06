// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.containerservice;

import com.azure.core.http.HttpPipeline;
import com.azure.management.containerservice.implementation.ContainerServiceManager;
import com.azure.management.resources.core.TestBase;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.profile.AzureProfile;
import com.azure.management.resources.implementation.ResourceManager;

public class ContainerServiceManagementTest extends TestBase {
    protected ResourceManager resourceManager;
    protected ContainerServiceManager containerServiceManager;
    protected String rgName = "";

    @Override
    protected void initializeClients(HttpPipeline httpPipeline, AzureProfile profile) {
        rgName = generateRandomResourceName("javaacsrg", 15);

        resourceManager = ResourceManager.authenticate(httpPipeline, profile).withDefaultSubscription();

        containerServiceManager = ContainerServiceManager.authenticate(httpPipeline, profile);

        resourceManager.resourceGroups().define(rgName).withRegion(Region.US_EAST).create();
    }

    @Override
    protected void cleanUpResources() {
        resourceManager.resourceGroups().beginDeleteByName(rgName);
    }
}

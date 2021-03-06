// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OpenShiftManagedClusterIdentityProvider model. */
@Fluent
public final class OpenShiftManagedClusterIdentityProvider {
    /*
     * Name of the provider.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Configuration of the provider.
     */
    @JsonProperty(value = "provider")
    private OpenShiftManagedClusterBaseIdentityProvider provider;

    /**
     * Get the name property: Name of the provider.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the provider.
     *
     * @param name the name value to set.
     * @return the OpenShiftManagedClusterIdentityProvider object itself.
     */
    public OpenShiftManagedClusterIdentityProvider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the provider property: Configuration of the provider.
     *
     * @return the provider value.
     */
    public OpenShiftManagedClusterBaseIdentityProvider provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Configuration of the provider.
     *
     * @param provider the provider value to set.
     * @return the OpenShiftManagedClusterIdentityProvider object itself.
     */
    public OpenShiftManagedClusterIdentityProvider withProvider(OpenShiftManagedClusterBaseIdentityProvider provider) {
        this.provider = provider;
        return this;
    }
}

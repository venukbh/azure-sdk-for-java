// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RouteTableListResult model. */
@Fluent
public final class RouteTableListResultInner {
    /*
     * Gets a list of route tables in a resource group.
     */
    @JsonProperty(value = "value")
    private List<RouteTableInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets a list of route tables in a resource group.
     *
     * @return the value value.
     */
    public List<RouteTableInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a list of route tables in a resource group.
     *
     * @param value the value value to set.
     * @return the RouteTableListResultInner object itself.
     */
    public RouteTableListResultInner withValue(List<RouteTableInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RouteTableListResultInner object itself.
     */
    public RouteTableListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}

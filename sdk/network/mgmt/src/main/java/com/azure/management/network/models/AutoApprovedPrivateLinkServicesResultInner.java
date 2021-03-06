// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AutoApprovedPrivateLinkServicesResult model. */
@Fluent
public final class AutoApprovedPrivateLinkServicesResultInner {
    /*
     * An array of auto approved private link service.
     */
    @JsonProperty(value = "value")
    private List<AutoApprovedPrivateLinkServiceInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: An array of auto approved private link service.
     *
     * @return the value value.
     */
    public List<AutoApprovedPrivateLinkServiceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of auto approved private link service.
     *
     * @param value the value value to set.
     * @return the AutoApprovedPrivateLinkServicesResultInner object itself.
     */
    public AutoApprovedPrivateLinkServicesResultInner withValue(List<AutoApprovedPrivateLinkServiceInner> value) {
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
}

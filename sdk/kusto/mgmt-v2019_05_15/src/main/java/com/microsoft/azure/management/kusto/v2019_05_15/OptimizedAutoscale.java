/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A class that contains the optimized auto scale definition.
 */
public class OptimizedAutoscale {
    /**
     * The version of the template defined, for instance 1.
     */
    @JsonProperty(value = "version", required = true)
    private int version;

    /**
     * A boolean value that indicate if the optimized autoscale feature is
     * enabled or not.
     */
    @JsonProperty(value = "isEnabled", required = true)
    private boolean isEnabled;

    /**
     * Minimum allowed instances count.
     */
    @JsonProperty(value = "minimum", required = true)
    private int minimum;

    /**
     * Maximum allowed instances count.
     */
    @JsonProperty(value = "maximum", required = true)
    private int maximum;

    /**
     * Get the version of the template defined, for instance 1.
     *
     * @return the version value
     */
    public int version() {
        return this.version;
    }

    /**
     * Set the version of the template defined, for instance 1.
     *
     * @param version the version value to set
     * @return the OptimizedAutoscale object itself.
     */
    public OptimizedAutoscale withVersion(int version) {
        this.version = version;
        return this;
    }

    /**
     * Get a boolean value that indicate if the optimized autoscale feature is enabled or not.
     *
     * @return the isEnabled value
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set a boolean value that indicate if the optimized autoscale feature is enabled or not.
     *
     * @param isEnabled the isEnabled value to set
     * @return the OptimizedAutoscale object itself.
     */
    public OptimizedAutoscale withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get minimum allowed instances count.
     *
     * @return the minimum value
     */
    public int minimum() {
        return this.minimum;
    }

    /**
     * Set minimum allowed instances count.
     *
     * @param minimum the minimum value to set
     * @return the OptimizedAutoscale object itself.
     */
    public OptimizedAutoscale withMinimum(int minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get maximum allowed instances count.
     *
     * @return the maximum value
     */
    public int maximum() {
        return this.maximum;
    }

    /**
     * Set maximum allowed instances count.
     *
     * @param maximum the maximum value to set
     * @return the OptimizedAutoscale object itself.
     */
    public OptimizedAutoscale withMaximum(int maximum) {
        this.maximum = maximum;
        return this;
    }

}

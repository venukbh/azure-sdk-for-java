/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network.models;

import com.microsoft.rest.BaseResource;

/**
 * ExpressRouteResourceProvider object
 */
public class ExpressRouteServiceProvider {
    /**
     * Gets or sets the ID of the resource.
     */
    private String id;

    /**
     * Gets or sets the name of the resource.
     */
    private String name;

    /**
     * Gets or sets the type of the resource.
     */
    private String type;

    /**
     * The properties property.
     */
    private ExpressRouteServiceProviderPropertiesFormat properties;

    /**
     * Get the id value.
     *
     * @return the id value
     */ 
    public String getId() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */ 
    public String getName() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */ 
    public String getType() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */ 
    public ExpressRouteServiceProviderPropertiesFormat getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(ExpressRouteServiceProviderPropertiesFormat properties) {
        this.properties = properties;
    }

}

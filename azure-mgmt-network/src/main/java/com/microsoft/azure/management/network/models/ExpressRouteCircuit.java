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

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.microsoft.rest.BaseResource;

/**
 * ExpressRouteCircuit resource
 */
public class ExpressRouteCircuit extends Resource {
    /**
     * Gets or sets sku
     */
    private ExpressRouteCircuitSku sku;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated
     */
    private String etag;

    /**
     * Gets or sets CircuitProvisioningState state of the resource
     */
    @JsonProperty(value = "properties.circuitProvisioningState")
    private String circuitProvisioningState;

    /**
     * Gets or sets ServiceProviderProvisioningState state of the resource .
     * Possible values for this property include: 'NotProvisioned',
     * 'Provisioning', 'Provisioned', 'Deprovisioning'.
     */
    @JsonProperty(value = "properties.serviceProviderProvisioningState")
    private String serviceProviderProvisioningState;

    /**
     * Gets or sets list of authorizations
     */
    @JsonProperty(value = "properties.authorizations")
    private List<ExpressRouteCircuitAuthorization> authorizations;

    /**
     * Gets or sets list of peerings
     */
    @JsonProperty(value = "properties.peerings")
    private List<ExpressRouteCircuitPeering> peerings;

    /**
     * Gets or sets ServiceKey
     */
    @JsonProperty(value = "properties.serviceKey")
    private String serviceKey;

    /**
     * Gets or sets ServiceProviderNotes
     */
    @JsonProperty(value = "properties.serviceProviderNotes")
    private String serviceProviderNotes;

    /**
     * Gets or sets ServiceProviderProperties
     */
    @JsonProperty(value = "properties.serviceProviderProperties")
    private ExpressRouteCircuitServiceProviderProperties serviceProviderProperties;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the sku value.
     *
     * @return the sku value
     */ 
    public ExpressRouteCircuitSku getSku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     */
    public void setSku(ExpressRouteCircuitSku sku) {
        this.sku = sku;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */ 
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * Get the circuitProvisioningState value.
     *
     * @return the circuitProvisioningState value
     */ 
    public String getCircuitProvisioningState() {
        return this.circuitProvisioningState;
    }

    /**
     * Set the circuitProvisioningState value.
     *
     * @param circuitProvisioningState the circuitProvisioningState value to set
     */
    public void setCircuitProvisioningState(String circuitProvisioningState) {
        this.circuitProvisioningState = circuitProvisioningState;
    }

    /**
     * Get the serviceProviderProvisioningState value.
     *
     * @return the serviceProviderProvisioningState value
     */ 
    public String getServiceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }

    /**
     * Set the serviceProviderProvisioningState value.
     *
     * @param serviceProviderProvisioningState the serviceProviderProvisioningState value to set
     */
    public void setServiceProviderProvisioningState(String serviceProviderProvisioningState) {
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
    }

    /**
     * Get the authorizations value.
     *
     * @return the authorizations value
     */ 
    public List<ExpressRouteCircuitAuthorization> getAuthorizations() {
        return this.authorizations;
    }

    /**
     * Set the authorizations value.
     *
     * @param authorizations the authorizations value to set
     */
    public void setAuthorizations(List<ExpressRouteCircuitAuthorization> authorizations) {
        this.authorizations = authorizations;
    }

    /**
     * Get the peerings value.
     *
     * @return the peerings value
     */ 
    public List<ExpressRouteCircuitPeering> getPeerings() {
        return this.peerings;
    }

    /**
     * Set the peerings value.
     *
     * @param peerings the peerings value to set
     */
    public void setPeerings(List<ExpressRouteCircuitPeering> peerings) {
        this.peerings = peerings;
    }

    /**
     * Get the serviceKey value.
     *
     * @return the serviceKey value
     */ 
    public String getServiceKey() {
        return this.serviceKey;
    }

    /**
     * Set the serviceKey value.
     *
     * @param serviceKey the serviceKey value to set
     */
    public void setServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
    }

    /**
     * Get the serviceProviderNotes value.
     *
     * @return the serviceProviderNotes value
     */ 
    public String getServiceProviderNotes() {
        return this.serviceProviderNotes;
    }

    /**
     * Set the serviceProviderNotes value.
     *
     * @param serviceProviderNotes the serviceProviderNotes value to set
     */
    public void setServiceProviderNotes(String serviceProviderNotes) {
        this.serviceProviderNotes = serviceProviderNotes;
    }

    /**
     * Get the serviceProviderProperties value.
     *
     * @return the serviceProviderProperties value
     */ 
    public ExpressRouteCircuitServiceProviderProperties getServiceProviderProperties() {
        return this.serviceProviderProperties;
    }

    /**
     * Set the serviceProviderProperties value.
     *
     * @param serviceProviderProperties the serviceProviderProperties value to set
     */
    public void setServiceProviderProperties(ExpressRouteCircuitServiceProviderProperties serviceProviderProperties) {
        this.serviceProviderProperties = serviceProviderProperties;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */ 
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

}

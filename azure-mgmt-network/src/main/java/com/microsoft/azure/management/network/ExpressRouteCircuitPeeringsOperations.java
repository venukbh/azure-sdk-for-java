/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.management.network.models.ExpressRouteCircuitPeering;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.InterruptedException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in ExpressRouteCircuitPeeringsOperations.
 */
public interface ExpressRouteCircuitPeeringsOperations {
    /**
     * The interface defining all the services for ExpressRouteCircuitPeeringsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExpressRouteCircuitPeeringsService {
        @HTTP(path = "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("peeringName") String peeringName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("peeringName") String peeringName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings/{peeringName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("peeringName") String peeringName, @Path("subscriptionId") String subscriptionId, @Body ExpressRouteCircuitPeering peeringParameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/expressRouteCircuits/{circuitName}/peerings")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("circuitName") String circuitName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String circuitName, String peeringName) throws ServiceException, IOException, InterruptedException;

    /**
     * The delete peering operation deletes the specified peering from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String circuitName, String peeringName, final ServiceCallback<Void> serviceCallback);

    /**
     * The GET peering operation retrieves the specified authorization from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws ServiceException exception thrown from REST call
     * @return the ExpressRouteCircuitPeering object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ExpressRouteCircuitPeering> get(String resourceGroupName, String circuitName, String peeringName) throws ServiceException;

    /**
     * The GET peering operation retrieves the specified authorization from the ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String circuitName, String peeringName, final ServiceCallback<ExpressRouteCircuitPeering> serviceCallback);

    /**
     * The Put Pering operation creates/updates an peering in the specified ExpressRouteCircuits
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ExpressRouteCircuitPeering object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ExpressRouteCircuitPeering> createOrUpdate(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeering peeringParameters) throws ServiceException, IOException, InterruptedException;

    /**
     * The Put Pering operation creates/updates an peering in the specified ExpressRouteCircuits
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create/update ExpressRouteCircuit Peering operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String circuitName, String peeringName, ExpressRouteCircuitPeering peeringParameters, final ServiceCallback<ExpressRouteCircuitPeering> serviceCallback);

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the curcuit.
     * @throws ServiceException exception thrown from REST call
     * @return the PageImpl&lt;ExpressRouteCircuitPeering&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuitPeering>> list(String resourceGroupName, String circuitName) throws ServiceException;

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the curcuit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceGroupName, String circuitName, final ServiceCallback<PageImpl<ExpressRouteCircuitPeering>> serviceCallback);

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @return the PageImpl&lt;ExpressRouteCircuitPeering&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ExpressRouteCircuitPeering>> listNext(String nextPageLink) throws ServiceException;

    /**
     * The List peering operation retrieves all the peerings in an ExpressRouteCircuit.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<ExpressRouteCircuitPeering>> serviceCallback);

}

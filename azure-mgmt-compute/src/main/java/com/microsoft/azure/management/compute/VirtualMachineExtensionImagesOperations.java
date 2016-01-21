/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.compute.models.VirtualMachineExtensionImage;
import com.microsoft.azure.management.compute.models.VirtualMachineImageResource;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.List;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineExtensionImagesOperations.
 */
public interface VirtualMachineExtensionImagesOperations {
    /**
     * The interface defining all the services for VirtualMachineExtensionImagesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineExtensionImagesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types/{type}/versions/{version}")
        Call<ResponseBody> get(@Path("location") String location, @Path("publisherName") String publisherName, @Path("type") String type, @Path("version") String version, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types")
        Call<ResponseBody> listTypes(@Path("location") String location, @Path("publisherName") String publisherName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmextension/types/{type}/versions")
        Call<ResponseBody> listVersions(@Path("location") String location, @Path("publisherName") String publisherName, @Path("type") String type, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("$orderBy") String orderBy, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Gets a virtual machine extension image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineExtensionImage object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineExtensionImage> get(String location, String publisherName, String type, String version) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a virtual machine extension image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String location, String publisherName, String type, String version, final ServiceCallback<VirtualMachineExtensionImage> serviceCallback);

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location the String value
     * @param publisherName the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listTypes(String location, String publisherName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine extension image types.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listTypesAsync(String location, String publisherName, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback);

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderBy the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listVersions(String location, String publisherName, String type, VirtualMachineImageResource filter, Integer top, String orderBy) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine extension image versions.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param type the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderBy the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listVersionsAsync(String location, String publisherName, String type, VirtualMachineImageResource filter, Integer top, String orderBy, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback);

}

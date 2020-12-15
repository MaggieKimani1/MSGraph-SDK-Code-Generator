// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.Option;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Option Request.
 */
public class OptionRequest extends BaseRequest<Option> {
	
    /**
     * The request for the Option
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OptionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Option.class);
    }

    /**
     * Gets the Option from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Option> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Option from the service
     *
     * @return the Option from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Option get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Option> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Option with a source
     *
     * @param sourceOption the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final Option sourceOption, @Nonnull final ICallback<? super Option> callback) {
        send(HttpMethod.PATCH, callback, sourceOption);
    }

    /**
     * Patches this Option with a source
     *
     * @param sourceOption the source object with updates
     * @return the updated Option
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Option patch(@Nonnull final Option sourceOption) throws ClientException {
        return send(HttpMethod.PATCH, sourceOption);
    }

    /**
     * Creates a Option with a new object
     *
     * @param newOption the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Option newOption, @Nonnull final ICallback<? super Option> callback) {
        send(HttpMethod.POST, callback, newOption);
    }

    /**
     * Creates a Option with a new object
     *
     * @param newOption the new object to create
     * @return the created Option
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Option post(@Nonnull final Option newOption) throws ClientException {
        return send(HttpMethod.POST, newOption);
    }

    /**
     * Creates a Option with a new object
     *
     * @param newOption the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Option newOption, @Nonnull final ICallback<? super Option> callback) {
        send(HttpMethod.PUT, callback, newOption);
    }

    /**
     * Creates a Option with a new object
     *
     * @param newOption the object to create/update
     * @return the created Option
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Option put(@Nonnull final Option newOption) throws ClientException {
        return send(HttpMethod.PUT, newOption);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OptionRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public OptionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


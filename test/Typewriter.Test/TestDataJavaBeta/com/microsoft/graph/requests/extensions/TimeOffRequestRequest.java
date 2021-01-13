// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.extensions.TimeOffRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Off Request Request.
 */
public class TimeOffRequestRequest extends BaseRequest<TimeOffRequest> {
	
    /**
     * The request for the TimeOffRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TimeOffRequestRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TimeOffRequest.class);
    }

    /**
     * Gets the TimeOffRequest from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffRequest> futureGet() {
        return futureSend(HttpMethod.GET, null);
    }

    /**
     * Gets the TimeOffRequest from the service
     *
     * @return the TimeOffRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeOffRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffRequest> futureDelete() {
        return futureSend(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TimeOffRequest delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TimeOffRequest with a source
     *
     * @param sourceTimeOffRequest the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffRequest> futurePatch(@Nonnull final TimeOffRequest sourceTimeOffRequest) {
        return futureSend(HttpMethod.PATCH, sourceTimeOffRequest);
    }

    /**
     * Patches this TimeOffRequest with a source
     *
     * @param sourceTimeOffRequest the source object with updates
     * @return the updated TimeOffRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeOffRequest patch(@Nonnull final TimeOffRequest sourceTimeOffRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceTimeOffRequest);
    }

    /**
     * Creates a TimeOffRequest with a new object
     *
     * @param newTimeOffRequest the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffRequest> futurePost(@Nonnull final TimeOffRequest newTimeOffRequest) {
        return futureSend(HttpMethod.POST, newTimeOffRequest);
    }

    /**
     * Creates a TimeOffRequest with a new object
     *
     * @param newTimeOffRequest the new object to create
     * @return the created TimeOffRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeOffRequest post(@Nonnull final TimeOffRequest newTimeOffRequest) throws ClientException {
        return send(HttpMethod.POST, newTimeOffRequest);
    }

    /**
     * Creates a TimeOffRequest with a new object
     *
     * @param newTimeOffRequest the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TimeOffRequest> futurePut(@Nonnull final TimeOffRequest newTimeOffRequest) {
        return futureSend(HttpMethod.PUT, newTimeOffRequest);
    }

    /**
     * Creates a TimeOffRequest with a new object
     *
     * @param newTimeOffRequest the object to create/update
     * @return the created TimeOffRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TimeOffRequest put(@Nonnull final TimeOffRequest newTimeOffRequest) throws ClientException {
        return send(HttpMethod.PUT, newTimeOffRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TimeOffRequestRequest select(@Nonnull final String value) {
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
     public TimeOffRequestRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;
import com.microsoft.graph2.callrecords.models.extensions.CallRecord;
import com.microsoft.graph2.callrecords.requests.extensions.CallRecordItemRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Item Request.
 */
public class CallRecordItemRequest extends BaseRequest<CallRecord> {

    /**
     * The request for this CallRecordItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRecordItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CallRecord.class);
    }

    /**
     * Patches the CallRecordItem
     * @param srcCallRecord the CallRecord with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull CallRecord srcCallRecord, @Nonnull final ICallback<? super CallRecord> callback) {
        send(HttpMethod.PATCH, callback, srcCallRecord);
    }

    /**
     * Patches the CallRecordItem
     *
     * @param srcCallRecord the CallRecord with which to PATCH
     * @return the CallRecord
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public CallRecord patch(@Nonnull final CallRecord srcCallRecord) throws ClientException {
        return this.send(HttpMethod.PATCH, srcCallRecord);
    }

    /**
     * Puts the CallRecordItem
     *
     * @param srcCallRecord the CallRecord to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final CallRecord srcCallRecord, @Nonnull final ICallback<? super CallRecord> callback) {
        send(HttpMethod.PUT, callback, srcCallRecord);
    }

    /**
     * Puts the CallRecordItem
     *
     * @param srcCallRecord the CallRecord to PUT
     * @return the CallRecord
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public CallRecord put(@Nonnull final CallRecord srcCallRecord) throws ClientException {
        return this.send(HttpMethod.PUT, srcCallRecord);
    }
    /**
     * Gets the CallRecord
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super CallRecord> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CallRecord
     *
     * @return the CallRecord
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public CallRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public CallRecordItemRequest select(@Nonnull final String value) {
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
    public CallRecordItemRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public CallRecordItemRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public CallRecordItemRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public CallRecordItemRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public CallRecordItemRequest count() {
        addCountOption(true);
        return this;
    }
}

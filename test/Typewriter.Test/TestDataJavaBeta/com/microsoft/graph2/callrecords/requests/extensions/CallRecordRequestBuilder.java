// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.CallRecord;
import com.microsoft.graph2.callrecords.requests.extensions.SessionCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.SessionRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType2CollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType2RequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Request Builder.
 */
public class CallRecordRequestBuilder extends BaseRequestBuilder<CallRecord> {

    /**
     * The request builder for the CallRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRecordRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CallRecordRequest instance
     */
    @Nonnull
    public CallRecordRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CallRecordRequest instance
     */
    @Nonnull
    public CallRecordRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph2.callrecords.requests.extensions.CallRecordRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Session collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SessionCollectionRequestBuilder sessions() {
        return new SessionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Session item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SessionRequestBuilder sessions(@Nonnull final String id) {
        return new SessionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EntityType2 collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EntityType2CollectionRequestBuilder recipients() {
        return new EntityType2CollectionRequestBuilder(getRequestUrlWithAdditionalSegment("recipients"), getClient(), null);
    }

    /**
     * Gets a request builder for the EntityType2 item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EntityType2RequestBuilder recipients(@Nonnull final String id) {
        return new EntityType2RequestBuilder(getRequestUrlWithAdditionalSegment("recipients") + "/" + id, getClient(), null);
    }
}

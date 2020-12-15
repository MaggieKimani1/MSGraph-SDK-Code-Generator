// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph2.callrecords.models.extensions.Segment;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph2.callrecords.models.extensions.Session;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.requests.extensions.EntityType3CollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType3RequestBuilder;
import com.microsoft.graph.requests.extensions.CallRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.SessionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.PhotoRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Segment Request Builder.
 */
public class SegmentRequestBuilder extends BaseRequestBuilder<Segment> {

    /**
     * The request builder for the Segment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SegmentRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SegmentRequest instance
     */
    @Nonnull
    public SegmentRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SegmentRequest instance
     */
    @Nonnull
    public SegmentRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph2.callrecords.requests.extensions.SegmentRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the EntityType3 collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EntityType3CollectionWithReferencesRequestBuilder refTypes() {
        return new EntityType3CollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("refTypes"), getClient(), null);
    }

    /**
     * Gets a request builder for the EntityType3 item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EntityType3WithReferenceRequestBuilder refTypes(@Nonnull final String id) {
        return new EntityType3WithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("refTypes") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Call
     *
     * @return the CallWithReferenceRequestBuilder instance
     */
    @Nonnull
    public CallWithReferenceRequestBuilder refType() {
        return new CallWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("refType"), getClient(), null);
    }

    /**
     * Gets the request builder for Session
     *
     * @return the SessionWithReferenceRequestBuilder instance
     */
    @Nonnull
    public SessionWithReferenceRequestBuilder sessionRef() {
        return new SessionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("sessionRef"), getClient(), null);
    }

    /**
     * Gets the request builder for Photo
     *
     * @return the PhotoRequestBuilder instance
     */
    @Nonnull
    public PhotoRequestBuilder photo() {
        return new PhotoRequestBuilder(getRequestUrlWithAdditionalSegment("photo"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param toRecipients the toRecipients
     * @param singleRecipient the singleRecipient
     * @param multipleSessions the multipleSessions
     * @param singleSession the singleSession
     * @param comment the comment
     */
    @Nonnull
    public SegmentForwardRequestBuilder forward(@Nullable final java.util.List<Recipient> toRecipients, @Nullable final Recipient singleRecipient, @Nullable final java.util.List<Session> multipleSessions, @Nullable final Session singleSession, @Nullable final String comment) {
        return new SegmentForwardRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph2.callRecords.forward"), getClient(), null, toRecipients, singleRecipient, multipleSessions, singleSession, comment);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param value the value
     */
    @Nonnull
    public SegmentTestActionCollectionRequestBuilder testAction(@Nullable final IdentitySet value) {
        return new SegmentTestActionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph2.callRecords.testAction"), getClient(), null, value);
    }
}

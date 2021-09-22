// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph2.callrecords.models.Session;
import com.microsoft.graph2.callrecords.models.Segment;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.IdentitySet;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph2.callrecords.requests.SegmentCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.SegmentRequestBuilder;
import com.microsoft.graph2.callrecords.requests.SegmentCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph2.callrecords.models.SegmentForwardParameterSet;
import com.microsoft.graph2.callrecords.models.SegmentTestActionParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Segment Collection Request Builder.
 */
public class SegmentCollectionRequestBuilder extends BaseCollectionRequestBuilder<Segment, SegmentRequestBuilder, SegmentCollectionResponse, SegmentCollectionPage, SegmentCollectionRequest> {

    /**
     * The request builder for this collection of Session
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SegmentCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SegmentRequestBuilder.class, SegmentCollectionRequest.class);
    }



    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}

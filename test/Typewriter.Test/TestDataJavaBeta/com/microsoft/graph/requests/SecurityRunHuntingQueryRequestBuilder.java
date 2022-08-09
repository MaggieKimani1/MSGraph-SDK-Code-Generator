// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.SecurityRunHuntingQueryRequest;
import com.microsoft.graph.models.Security;
import com.microsoft.graph.security.models.HuntingQueryResults;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.SecurityRunHuntingQueryParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Run Hunting Query Request Builder.
 */
public class SecurityRunHuntingQueryRequestBuilder extends BaseActionRequestBuilder<HuntingQueryResults> {

    /**
     * The request builder for this SecurityRunHuntingQuery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityRunHuntingQueryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private SecurityRunHuntingQueryParameterSet body;
    /**
     * The request builder for this SecurityRunHuntingQuery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public SecurityRunHuntingQueryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final SecurityRunHuntingQueryParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the SecurityRunHuntingQueryRequest
     *
     * @param requestOptions the options for the request
     * @return the SecurityRunHuntingQueryRequest instance
     */
    @Nonnull
    public SecurityRunHuntingQueryRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SecurityRunHuntingQueryRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SecurityRunHuntingQueryRequest instance
     */
    @Nonnull
    public SecurityRunHuntingQueryRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SecurityRunHuntingQueryRequest request = new SecurityRunHuntingQueryRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}

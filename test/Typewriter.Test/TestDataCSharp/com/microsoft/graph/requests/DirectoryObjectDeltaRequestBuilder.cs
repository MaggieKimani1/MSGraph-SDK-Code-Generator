// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: MethodRequestBuilder.cs.tt

namespace Microsoft.Graph
{
    using System;
    using System.Collections.Generic;
    using System.IO;

    /// <summary>
    /// The type DirectoryObjectDeltaRequestBuilder.
    /// </summary>
    public partial class DirectoryObjectDeltaRequestBuilder : BaseFunctionMethodRequestBuilder<IDirectoryObjectDeltaRequest>, IDirectoryObjectDeltaRequestBuilder
    {
        /// <summary>
        /// Constructs a new <see cref="DirectoryObjectDeltaRequestBuilder"/>.
        /// </summary>
        /// <param name="requestUrl">The URL for the request.</param>
        /// <param name="client">The <see cref="IBaseClient"/> for handling requests.</param>
        /// <param name="token">A token parameter for the OData method call.</param>
        /// <param name="secondToken">A secondToken parameter for the OData method call.</param>
        public DirectoryObjectDeltaRequestBuilder(
            string requestUrl,
            IBaseClient client,
            string token,
            string secondToken)
            : base(requestUrl, client)
        {
            this.SetParameter("token", token, true);
            this.SetParameter("secondToken", secondToken, true);
            this.SetFunctionParameters();
        }

        /// <summary>
        /// Constructs a new <see cref="DirectoryObjectDeltaRequestBuilder"/>.
        /// </summary>
        /// <param name="requestUrl">The URL for the request.</param>
        /// <param name="client">The <see cref="IBaseClient"/> for handling requests.</param>
        /// <param name="token">A token parameter for the OData method call.</param>
        public DirectoryObjectDeltaRequestBuilder(
            string requestUrl,
            IBaseClient client,
            string token)
            : base(requestUrl, client)
        {
            this.SetParameter("token", token, true);
            this.SetFunctionParameters();
        }

        /// <summary>
        /// A method used by the base class to construct a request class instance.
        /// </summary>
        /// <param name="functionUrl">The request URL to </param>
        /// <param name="options">The query and header options for the request.</param>
        /// <returns>An instance of a specific request class.</returns>
        protected override IDirectoryObjectDeltaRequest CreateRequest(string functionUrl, IEnumerable<Option> options)
        {
            var request = new DirectoryObjectDeltaRequest(functionUrl, this.Client, options);

            return request;
        }
    }
}

﻿// ------------------------------------------------------------------------------
//  Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
// <auto-generated/>

// Template Source: Templates\CSharp\Requests\EntityReferenceRequest.cs.tt

namespace Microsoft.Graph
{
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading;

    /// <summary>
    /// The type EntityType2ReferenceRequest.
    /// </summary>
    public partial class EntityType2ReferenceRequest : BaseRequest, IEntityType2ReferenceRequest
    {
        /// <summary>
        /// Constructs a new EntityType2ReferenceRequest.
        /// </summary>
        /// <param name="requestUrl">The URL for the built request.</param>
        /// <param name="client">The <see cref="IBaseClient"/> for handling requests.</param>
        /// <param name="options">Query and header option name value pairs for the request.</param>
        public EntityType2ReferenceRequest(
            string requestUrl,
            IBaseClient client,
            IEnumerable<Option> options)
            : base(requestUrl, client, options)
        {
        }

        /// <summary>
        /// Deletes the specified EntityType2 reference.
        /// </summary>
        /// <returns>The task to await.</returns>
        public System.Threading.Tasks.Task DeleteAsync()
        {
            return this.DeleteAsync(CancellationToken.None);
        }

        /// <summary>
        /// Deletes the specified EntityType2 reference.
        /// </summary>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The task to await.</returns>
        public async System.Threading.Tasks.Task DeleteAsync(CancellationToken cancellationToken)
        {
            this.Method = "DELETE";
            await this.SendAsync<EntityType2>(null, cancellationToken).ConfigureAwait(false);
        }

        /// <summary>
        /// Puts the specified EntityType2 reference.
        /// </summary>
        /// <param name="id">The EntityType2 reference to update.</param>
        /// <returns>The task to await.</returns>
        public System.Threading.Tasks.Task PutAsync(string id)
        {
            return this.PutAsync(id, CancellationToken.None);
        }

        /// <summary>
        /// Puts the specified EntityType2 reference.
        /// </summary>
        /// <param name="id">The EntityType2 reference to update.</param>
        /// <param name="cancellationToken">The <see cref="CancellationToken"/> for the request.</param>
        /// <returns>The task to await.</returns>
        public async System.Threading.Tasks.Task PutAsync(string id, CancellationToken cancellationToken)
        {
            var baseUrl = this.Client.BaseUrl;
            var objectUri = string.Format(@"{0}/users/{1}", baseUrl, id);
            var stream = new System.IO.MemoryStream();
            using (var writer = new System.Text.Json.Utf8JsonWriter(stream))
            {
                writer.WriteStartObject();
                writer.WriteString("@odata.id", objectUri);
                writer.WriteEndObject();
                await writer.FlushAsync();
                await stream.FlushAsync();
            }
            var payload = System.Text.Encoding.UTF8.GetString(stream.ToArray());
            this.Method = "PUT";
            this.ContentType = "application/json";
            await this.SendAsync(payload, cancellationToken).ConfigureAwait(false);
        }
    }
}

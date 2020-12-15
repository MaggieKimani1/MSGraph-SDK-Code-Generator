// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph2.callrecords.models.generated.MediaStreamDirection;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Media Stream.
 */
public class MediaStream implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Stream Id.
     * 
     */
    @SerializedName(value = "streamId", alternate = {"StreamId"})
    @Expose
	@Nullable
    public String streamId;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar startDateTime;

    /**
     * The Stream Direction.
     * 
     */
    @SerializedName(value = "streamDirection", alternate = {"StreamDirection"})
    @Expose
	@Nullable
    public MediaStreamDirection streamDirection;

    /**
     * The Packet Utilization.
     * 
     */
    @SerializedName(value = "packetUtilization", alternate = {"PacketUtilization"})
    @Expose
	@Nullable
    public Long packetUtilization;

    /**
     * The Was Media Bypassed.
     * 
     */
    @SerializedName(value = "wasMediaBypassed", alternate = {"WasMediaBypassed"})
    @Expose
	@Nullable
    public Boolean wasMediaBypassed;

    /**
     * The Low Video Processing Capability Ratio.
     * 
     */
    @SerializedName(value = "lowVideoProcessingCapabilityRatio", alternate = {"LowVideoProcessingCapabilityRatio"})
    @Expose
	@Nullable
    public Float lowVideoProcessingCapabilityRatio;

    /**
     * The Average Audio Network Jitter.
     * 
     */
    @SerializedName(value = "averageAudioNetworkJitter", alternate = {"AverageAudioNetworkJitter"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration averageAudioNetworkJitter;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}

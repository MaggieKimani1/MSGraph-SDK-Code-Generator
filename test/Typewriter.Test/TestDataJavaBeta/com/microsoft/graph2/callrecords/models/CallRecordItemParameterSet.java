// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.models;

import com.microsoft.graph2.callrecords.models.CallRecord;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Item Parameter Set.
 */
public class CallRecordItemParameterSet {
    /**
     * The name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;


    /**
     * Instiaciates a new CallRecordItemParameterSet
     */
    public CallRecordItemParameterSet() {}
    /**
     * Instiaciates a new CallRecordItemParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected CallRecordItemParameterSet(@Nonnull final CallRecordItemParameterSetBuilder builder) {
        this.name = builder.name;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CallRecordItemParameterSetBuilder newBuilder() {
        return new CallRecordItemParameterSetBuilder();
    }
    /**
     * Fluent builder for the CallRecordItemParameterSet
     */
    public static final class CallRecordItemParameterSetBuilder {
        /**
         * The name parameter value
         */
        @Nullable
        protected String name;
        /**
         * Sets the Name
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRecordItemParameterSetBuilder withName(@Nullable final String val) {
            this.name = val;
            return this;
        }
        /**
         * Instanciates a new CallRecordItemParameterSetBuilder
         */
        @Nullable
        protected CallRecordItemParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CallRecordItemParameterSet build() {
            return new CallRecordItemParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.name != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("name", name));
        }
        return result;
    }
}

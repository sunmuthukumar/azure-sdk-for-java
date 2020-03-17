/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object that describes the operation.
 */
public class OperationDisplay {
    /**
     * The description of the operation.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * The action that users can perform, based on their permission level.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * Service provider: Microsoft Support.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /**
     * Resource on which the operation is performed.
     */
    @JsonProperty(value = "resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /**
     * Get the description of the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the action that users can perform, based on their permission level.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get service provider: Microsoft Support.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get resource on which the operation is performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

}

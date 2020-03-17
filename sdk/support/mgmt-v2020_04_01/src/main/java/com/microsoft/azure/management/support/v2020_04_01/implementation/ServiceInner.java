/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Object that represents a Service resource.
 */
@JsonFlatten
public class ServiceInner {
    /**
     * Id of the resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Name of the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Type of the resource 'Microsoft.Support/services'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Localized name of Azure service.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * ARM Resource types.
     */
    @JsonProperty(value = "properties.resourceTypes")
    private List<String> resourceTypes;

    /**
     * Get id of the resource.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get name of the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get type of the resource 'Microsoft.Support/services'.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get localized name of Azure service.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set localized name of Azure service.
     *
     * @param displayName the displayName value to set
     * @return the ServiceInner object itself.
     */
    public ServiceInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get aRM Resource types.
     *
     * @return the resourceTypes value
     */
    public List<String> resourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set aRM Resource types.
     *
     * @param resourceTypes the resourceTypes value to set
     * @return the ServiceInner object itself.
     */
    public ServiceInner withResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

}

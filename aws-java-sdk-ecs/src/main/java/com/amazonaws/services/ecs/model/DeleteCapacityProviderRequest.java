/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DeleteCapacityProvider" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCapacityProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity provider to delete.
     * </p>
     */
    private String capacityProvider;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity provider to delete.
     * </p>
     * 
     * @param capacityProvider
     *        The short name or full Amazon Resource Name (ARN) of the capacity provider to delete.
     */

    public void setCapacityProvider(String capacityProvider) {
        this.capacityProvider = capacityProvider;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity provider to delete.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the capacity provider to delete.
     */

    public String getCapacityProvider() {
        return this.capacityProvider;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity provider to delete.
     * </p>
     * 
     * @param capacityProvider
     *        The short name or full Amazon Resource Name (ARN) of the capacity provider to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCapacityProviderRequest withCapacityProvider(String capacityProvider) {
        setCapacityProvider(capacityProvider);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCapacityProvider() != null)
            sb.append("CapacityProvider: ").append(getCapacityProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCapacityProviderRequest == false)
            return false;
        DeleteCapacityProviderRequest other = (DeleteCapacityProviderRequest) obj;
        if (other.getCapacityProvider() == null ^ this.getCapacityProvider() == null)
            return false;
        if (other.getCapacityProvider() != null && other.getCapacityProvider().equals(this.getCapacityProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityProvider() == null) ? 0 : getCapacityProvider().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCapacityProviderRequest clone() {
        return (DeleteCapacityProviderRequest) super.clone();
    }

}

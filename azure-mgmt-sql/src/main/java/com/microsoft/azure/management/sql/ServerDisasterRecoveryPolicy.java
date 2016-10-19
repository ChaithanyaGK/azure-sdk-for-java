/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ServerDisasterRecoveryPolicy.
 */
public final class ServerDisasterRecoveryPolicy {
    /** Static value Manual for ServerDisasterRecoveryPolicy. */
    public static final ServerDisasterRecoveryPolicy MANUAL = new ServerDisasterRecoveryPolicy("Manual");

    /** Static value Automatic for ServerDisasterRecoveryPolicy. */
    public static final ServerDisasterRecoveryPolicy AUTOMATIC = new ServerDisasterRecoveryPolicy("Automatic");

    /** Static value Off for ServerDisasterRecoveryPolicy. */
    public static final ServerDisasterRecoveryPolicy OFF = new ServerDisasterRecoveryPolicy("Off");

    private String value;

    /**
     * Creates a custom value for ServerDisasterRecoveryPolicy.
     * @param value the custom value
     */
    public ServerDisasterRecoveryPolicy(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ServerDisasterRecoveryPolicy)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ServerDisasterRecoveryPolicy rhs = (ServerDisasterRecoveryPolicy) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}

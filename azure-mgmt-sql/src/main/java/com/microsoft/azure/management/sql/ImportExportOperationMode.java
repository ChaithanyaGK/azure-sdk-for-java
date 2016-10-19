/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ImportExportOperationMode.
 */
public enum ImportExportOperationMode {
    /** Enum value Import. */
    IMPORT("Import"),

    /** Enum value Export. */
    EXPORT("Export");

    /** The actual serialized value for a ImportExportOperationMode instance. */
    private String value;

    ImportExportOperationMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ImportExportOperationMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ImportExportOperationMode object, or null if unable to parse.
     */
    @JsonCreator
    public static ImportExportOperationMode fromString(String value) {
        ImportExportOperationMode[] items = ImportExportOperationMode.values();
        for (ImportExportOperationMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}

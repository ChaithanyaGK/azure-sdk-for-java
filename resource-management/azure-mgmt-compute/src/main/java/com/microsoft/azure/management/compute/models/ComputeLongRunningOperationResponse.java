/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.compute.models;

import com.microsoft.windowsazure.core.OperationResponse;

import java.util.Calendar;

/**
* The Compute service response for long-running operations.
*/
public class ComputeLongRunningOperationResponse extends OperationResponse {
    private Calendar endTime;
    
    /**
    * Optional. Gets the operation end time
    * @return The EndTime value.
    */
    public Calendar getEndTime() {
        return this.endTime;
    }
    
    /**
    * Optional. Gets the operation end time
    * @param endTimeValue The EndTime value.
    */
    public void setEndTime(final Calendar endTimeValue) {
        this.endTime = endTimeValue;
    }
    
    private ApiError error;
    
    /**
    * Optional. Gets the operation error, if any occurred.
    * @return The Error value.
    */
    public ApiError getError() {
        return this.error;
    }
    
    /**
    * Optional. Gets the operation error, if any occurred.
    * @param errorValue The Error value.
    */
    public void setError(final ApiError errorValue) {
        this.error = errorValue;
    }
    
    private String output;
    
    /**
    * Optional. Operation output data (raw JSON)
    * @return The Output value.
    */
    public String getOutput() {
        return this.output;
    }
    
    /**
    * Optional. Operation output data (raw JSON)
    * @param outputValue The Output value.
    */
    public void setOutput(final String outputValue) {
        this.output = outputValue;
    }
    
    private Calendar startTime;
    
    /**
    * Optional. Gets the operation start time
    * @return The StartTime value.
    */
    public Calendar getStartTime() {
        return this.startTime;
    }
    
    /**
    * Optional. Gets the operation start time
    * @param startTimeValue The StartTime value.
    */
    public void setStartTime(final Calendar startTimeValue) {
        this.startTime = startTimeValue;
    }
    
    private ComputeOperationStatus status;
    
    /**
    * Optional. Gets the operation status.
    * @return The Status value.
    */
    public ComputeOperationStatus getStatus() {
        return this.status;
    }
    
    /**
    * Optional. Gets the operation status.
    * @param statusValue The Status value.
    */
    public void setStatus(final ComputeOperationStatus statusValue) {
        this.status = statusValue;
    }
    
    private String trackingOperationId;
    
    /**
    * Optional. Gets the operation identifier.
    * @return The TrackingOperationId value.
    */
    public String getTrackingOperationId() {
        return this.trackingOperationId;
    }
    
    /**
    * Optional. Gets the operation identifier.
    * @param trackingOperationIdValue The TrackingOperationId value.
    */
    public void setTrackingOperationId(final String trackingOperationIdValue) {
        this.trackingOperationId = trackingOperationIdValue;
    }
}
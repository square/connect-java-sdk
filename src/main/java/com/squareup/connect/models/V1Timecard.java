/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a timecard for an employee.
 */
@ApiModel(description = "Represents a timecard for an employee.")

public class V1Timecard {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("employee_id")
  private String employeeId = null;

  @JsonProperty("deleted")
  private Boolean deleted = null;

  @JsonProperty("clockin_time")
  private String clockinTime = null;

  @JsonProperty("clockout_time")
  private String clockoutTime = null;

  @JsonProperty("clockin_location_id")
  private String clockinLocationId = null;

  @JsonProperty("clockout_location_id")
  private String clockoutLocationId = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

   /**
   * The timecard's unique ID.
   * @return id
  **/
  @ApiModelProperty(value = "The timecard's unique ID.")
  public String getId() {
    return id;
  }

  public V1Timecard employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The ID of the employee the timecard is associated with.
   * @return employeeId
  **/
  @ApiModelProperty(required = true, value = "The ID of the employee the timecard is associated with.")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

   /**
   * If true, the timecard was deleted by the merchant, and it is no longer valid.
   * @return deleted
  **/
  @ApiModelProperty(value = "If true, the timecard was deleted by the merchant, and it is no longer valid.")
  public Boolean getDeleted() {
    return deleted;
  }

  public V1Timecard clockinTime(String clockinTime) {
    this.clockinTime = clockinTime;
    return this;
  }

   /**
   * The clock-in time for the timecard, in ISO 8601 format.
   * @return clockinTime
  **/
  @ApiModelProperty(value = "The clock-in time for the timecard, in ISO 8601 format.")
  public String getClockinTime() {
    return clockinTime;
  }

  public void setClockinTime(String clockinTime) {
    this.clockinTime = clockinTime;
  }

  public V1Timecard clockoutTime(String clockoutTime) {
    this.clockoutTime = clockoutTime;
    return this;
  }

   /**
   * The clock-out time for the timecard, in ISO 8601 format. Provide this value only if importing timecard information from another system.
   * @return clockoutTime
  **/
  @ApiModelProperty(value = "The clock-out time for the timecard, in ISO 8601 format. Provide this value only if importing timecard information from another system.")
  public String getClockoutTime() {
    return clockoutTime;
  }

  public void setClockoutTime(String clockoutTime) {
    this.clockoutTime = clockoutTime;
  }

  public V1Timecard clockinLocationId(String clockinLocationId) {
    this.clockinLocationId = clockinLocationId;
    return this;
  }

   /**
   * The ID of the location the employee clocked in from, if any.
   * @return clockinLocationId
  **/
  @ApiModelProperty(value = "The ID of the location the employee clocked in from, if any.")
  public String getClockinLocationId() {
    return clockinLocationId;
  }

  public void setClockinLocationId(String clockinLocationId) {
    this.clockinLocationId = clockinLocationId;
  }

  public V1Timecard clockoutLocationId(String clockoutLocationId) {
    this.clockoutLocationId = clockoutLocationId;
    return this;
  }

   /**
   * The ID of the location the employee clocked out from. Provide this value only if importing timecard information from another system.
   * @return clockoutLocationId
  **/
  @ApiModelProperty(value = "The ID of the location the employee clocked out from. Provide this value only if importing timecard information from another system.")
  public String getClockoutLocationId() {
    return clockoutLocationId;
  }

  public void setClockoutLocationId(String clockoutLocationId) {
    this.clockoutLocationId = clockoutLocationId;
  }

   /**
   * The time when the timecard was created, in ISO 8601 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the timecard was created, in ISO 8601 format.")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * The time when the timecard was most recently updated, in ISO 8601 format.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The time when the timecard was most recently updated, in ISO 8601 format.")
  public String getUpdatedAt() {
    return updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Timecard v1Timecard = (V1Timecard) o;
    return Objects.equals(this.id, v1Timecard.id) &&
        Objects.equals(this.employeeId, v1Timecard.employeeId) &&
        Objects.equals(this.deleted, v1Timecard.deleted) &&
        Objects.equals(this.clockinTime, v1Timecard.clockinTime) &&
        Objects.equals(this.clockoutTime, v1Timecard.clockoutTime) &&
        Objects.equals(this.clockinLocationId, v1Timecard.clockinLocationId) &&
        Objects.equals(this.clockoutLocationId, v1Timecard.clockoutLocationId) &&
        Objects.equals(this.createdAt, v1Timecard.createdAt) &&
        Objects.equals(this.updatedAt, v1Timecard.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, employeeId, deleted, clockinTime, clockoutTime, clockinLocationId, clockoutLocationId, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Timecard {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    clockinTime: ").append(toIndentedString(clockinTime)).append("\n");
    sb.append("    clockoutTime: ").append(toIndentedString(clockoutTime)).append("\n");
    sb.append("    clockinLocationId: ").append(toIndentedString(clockinLocationId)).append("\n");
    sb.append("    clockoutLocationId: ").append(toIndentedString(clockoutLocationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}


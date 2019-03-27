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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * An employee created in the **Square Dashboard** account of a business.  Used by the Labor API.
 */
@ApiModel(description = "An employee created in the **Square Dashboard** account of a business.  Used by the Labor API.")

public class Employee {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("location_ids")
  private List<String> locationIds = new ArrayList<String>();

  /**
   * Specifies the status of the employee being fetched. See [EmployeeStatus](#type-employeestatus) for possible values
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  public Employee id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID for this `Employee`.
   * @return id
  **/
  @ApiModelProperty(value = "UUID for this `Employee`.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Given (first) name of the employee.
   * @return firstName
  **/
  @ApiModelProperty(value = "Given (first) name of the employee.")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Family (last) name of the employee
   * @return lastName
  **/
  @ApiModelProperty(value = "Family (last) name of the employee")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public Employee addLocationIdsItem(String locationIdsItem) {
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * A list of location IDs where this employee has access.
   * @return locationIds
  **/
  @ApiModelProperty(value = "A list of location IDs where this employee has access.")
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public Employee status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Specifies the status of the employee being fetched. See [EmployeeStatus](#type-employeestatus) for possible values
   * @return status
  **/
  @ApiModelProperty(value = "Specifies the status of the employee being fetched. See [EmployeeStatus](#type-employeestatus) for possible values")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Employee createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A read-only timestamp in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "A read-only timestamp in RFC 3339 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Employee updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * A read-only timestamp in RFC 3339 format.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "A read-only timestamp in RFC 3339 format.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.firstName, employee.firstName) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.locationIds, employee.locationIds) &&
        Objects.equals(this.status, employee.status) &&
        Objects.equals(this.createdAt, employee.createdAt) &&
        Objects.equals(this.updatedAt, employee.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, locationIds, status, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


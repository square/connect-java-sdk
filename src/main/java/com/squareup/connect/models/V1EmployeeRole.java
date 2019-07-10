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
 * V1EmployeeRole
 */
@ApiModel(description = "V1EmployeeRole")

public class V1EmployeeRole {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("permissions")
  private List<String> permissions = new ArrayList<String>();

  @JsonProperty("is_owner")
  private Boolean isOwner = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  public V1EmployeeRole id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The role's unique ID, Can only be set by Square.
   * @return id
  **/
  @ApiModelProperty(value = "The role's unique ID, Can only be set by Square.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1EmployeeRole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The role's merchant-defined name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The role's merchant-defined name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1EmployeeRole permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public V1EmployeeRole addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * The role's permissions. See [V1EmployeeRolePermissions](#type-v1employeerolepermissions) for possible values
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "The role's permissions. See [V1EmployeeRolePermissions](#type-v1employeerolepermissions) for possible values")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public V1EmployeeRole isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

   /**
   * If true, employees with this role have all permissions, regardless of the values indicated in permissions.
   * @return isOwner
  **/
  @ApiModelProperty(value = "If true, employees with this role have all permissions, regardless of the values indicated in permissions.")
  public Boolean getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  public V1EmployeeRole createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the employee entity was created, in ISO 8601 format. Is set by Square when the Role is created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the employee entity was created, in ISO 8601 format. Is set by Square when the Role is created.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public V1EmployeeRole updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time when the employee entity was most recently updated, in ISO 8601 format. Is set by Square when the Role updated.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The time when the employee entity was most recently updated, in ISO 8601 format. Is set by Square when the Role updated.")
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
    V1EmployeeRole v1EmployeeRole = (V1EmployeeRole) o;
    return Objects.equals(this.id, v1EmployeeRole.id) &&
        Objects.equals(this.name, v1EmployeeRole.name) &&
        Objects.equals(this.permissions, v1EmployeeRole.permissions) &&
        Objects.equals(this.isOwner, v1EmployeeRole.isOwner) &&
        Objects.equals(this.createdAt, v1EmployeeRole.createdAt) &&
        Objects.equals(this.updatedAt, v1EmployeeRole.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, permissions, isOwner, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EmployeeRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
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


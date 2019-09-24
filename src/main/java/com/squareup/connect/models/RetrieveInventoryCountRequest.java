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

/**
 * 
 */
@ApiModel(description = "")

public class RetrieveInventoryCountRequest {
  @JsonProperty("location_ids")
  private String locationIds = null;

  @JsonProperty("cursor")
  private String cursor = null;

  public RetrieveInventoryCountRequest locationIds(String locationIds) {
    this.locationIds = locationIds;
    return this;
  }

   /**
   * The `Location` IDs to look up as a comma-separated list. An empty list queries all locations.
   * @return locationIds
  **/
  @ApiModelProperty(value = "The `Location` IDs to look up as a comma-separated list. An empty list queries all locations.")
  public String getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(String locationIds) {
    this.locationIds = locationIds;
  }

  public RetrieveInventoryCountRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveInventoryCountRequest retrieveInventoryCountRequest = (RetrieveInventoryCountRequest) o;
    return Objects.equals(this.locationIds, retrieveInventoryCountRequest.locationIds) &&
        Objects.equals(this.cursor, retrieveInventoryCountRequest.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationIds, cursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveInventoryCountRequest {\n");
    
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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


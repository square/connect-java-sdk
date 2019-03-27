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
 * 
 */
@ApiModel(description = "")

public class BatchRetrieveInventoryChangesRequest {
  @JsonProperty("catalog_object_ids")
  private List<String> catalogObjectIds = new ArrayList<String>();

  @JsonProperty("location_ids")
  private List<String> locationIds = new ArrayList<String>();

  /**
   * Gets or Sets types
   */
  public enum TypesEnum {
    PHYSICAL_COUNT("PHYSICAL_COUNT"),
    
    ADJUSTMENT("ADJUSTMENT"),
    
    TRANSFER("TRANSFER");

    private String value;

    TypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypesEnum fromValue(String text) {
      for (TypesEnum b : TypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("types")
  private List<TypesEnum> types = new ArrayList<TypesEnum>();

  /**
   * Gets or Sets states
   */
  public enum StatesEnum {
    CUSTOM("CUSTOM"),
    
    IN_STOCK("IN_STOCK"),
    
    SOLD("SOLD"),
    
    RETURNED_BY_CUSTOMER("RETURNED_BY_CUSTOMER"),
    
    RESERVED_FOR_SALE("RESERVED_FOR_SALE"),
    
    SOLD_ONLINE("SOLD_ONLINE"),
    
    ORDERED_FROM_VENDOR("ORDERED_FROM_VENDOR"),
    
    RECEIVED_FROM_VENDOR("RECEIVED_FROM_VENDOR"),
    
    IN_TRANSIT_TO("IN_TRANSIT_TO"),
    
    NONE("NONE"),
    
    WASTE("WASTE"),
    
    UNLINKED_RETURN("UNLINKED_RETURN");

    private String value;

    StatesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatesEnum fromValue(String text) {
      for (StatesEnum b : StatesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("states")
  private List<StatesEnum> states = new ArrayList<StatesEnum>();

  @JsonProperty("updated_after")
  private String updatedAfter = null;

  @JsonProperty("updated_before")
  private String updatedBefore = null;

  @JsonProperty("cursor")
  private String cursor = null;

  public BatchRetrieveInventoryChangesRequest catalogObjectIds(List<String> catalogObjectIds) {
    this.catalogObjectIds = catalogObjectIds;
    return this;
  }

  public BatchRetrieveInventoryChangesRequest addCatalogObjectIdsItem(String catalogObjectIdsItem) {
    this.catalogObjectIds.add(catalogObjectIdsItem);
    return this;
  }

   /**
   * Filters results by [CatalogObject](#type-catalogobject) ID. Only applied when set. Default: unset.
   * @return catalogObjectIds
  **/
  @ApiModelProperty(value = "Filters results by [CatalogObject](#type-catalogobject) ID. Only applied when set. Default: unset.")
  public List<String> getCatalogObjectIds() {
    return catalogObjectIds;
  }

  public void setCatalogObjectIds(List<String> catalogObjectIds) {
    this.catalogObjectIds = catalogObjectIds;
  }

  public BatchRetrieveInventoryChangesRequest locationIds(List<String> locationIds) {
    this.locationIds = locationIds;
    return this;
  }

  public BatchRetrieveInventoryChangesRequest addLocationIdsItem(String locationIdsItem) {
    this.locationIds.add(locationIdsItem);
    return this;
  }

   /**
   * Filters results by [Location](#type-location) ID. Only applied when set. Default: unset.
   * @return locationIds
  **/
  @ApiModelProperty(value = "Filters results by [Location](#type-location) ID. Only applied when set. Default: unset.")
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
  }

  public BatchRetrieveInventoryChangesRequest types(List<TypesEnum> types) {
    this.types = types;
    return this;
  }

  public BatchRetrieveInventoryChangesRequest addTypesItem(TypesEnum typesItem) {
    this.types.add(typesItem);
    return this;
  }

   /**
   * Filters results by [InventoryChangeType](#type-inventorychangetype). Default: [`PHYSICAL_COUNT`, `ADJUSTMENT`]. `TRANSFER` is not supported as a filter. See [InventoryChangeType](#type-inventorychangetype) for possible values
   * @return types
  **/
  @ApiModelProperty(value = "Filters results by [InventoryChangeType](#type-inventorychangetype). Default: [`PHYSICAL_COUNT`, `ADJUSTMENT`]. `TRANSFER` is not supported as a filter. See [InventoryChangeType](#type-inventorychangetype) for possible values")
  public List<TypesEnum> getTypes() {
    return types;
  }

  public void setTypes(List<TypesEnum> types) {
    this.types = types;
  }

  public BatchRetrieveInventoryChangesRequest states(List<StatesEnum> states) {
    this.states = states;
    return this;
  }

  public BatchRetrieveInventoryChangesRequest addStatesItem(StatesEnum statesItem) {
    this.states.add(statesItem);
    return this;
  }

   /**
   * Filters `ADJUSTMENT` query results by [InventoryState](#type-inventorystate). Only applied when set. Default: unset. See [InventoryState](#type-inventorystate) for possible values
   * @return states
  **/
  @ApiModelProperty(value = "Filters `ADJUSTMENT` query results by [InventoryState](#type-inventorystate). Only applied when set. Default: unset. See [InventoryState](#type-inventorystate) for possible values")
  public List<StatesEnum> getStates() {
    return states;
  }

  public void setStates(List<StatesEnum> states) {
    this.states = states;
  }

  public BatchRetrieveInventoryChangesRequest updatedAfter(String updatedAfter) {
    this.updatedAfter = updatedAfter;
    return this;
  }

   /**
   * Provided as an RFC 3339 timestamp. Returns results whose `created_at` or `calculated_at` value is after the given time. Default: UNIX epoch (`1970-01-01T00:00:00Z`).
   * @return updatedAfter
  **/
  @ApiModelProperty(value = "Provided as an RFC 3339 timestamp. Returns results whose `created_at` or `calculated_at` value is after the given time. Default: UNIX epoch (`1970-01-01T00:00:00Z`).")
  public String getUpdatedAfter() {
    return updatedAfter;
  }

  public void setUpdatedAfter(String updatedAfter) {
    this.updatedAfter = updatedAfter;
  }

  public BatchRetrieveInventoryChangesRequest updatedBefore(String updatedBefore) {
    this.updatedBefore = updatedBefore;
    return this;
  }

   /**
   * Provided as an RFC 3339 timestamp. Returns results whose `created_at` or `calculated_at` value is strictly before the given time. Default: UNIX epoch (`1970-01-01T00:00:00Z`).
   * @return updatedBefore
  **/
  @ApiModelProperty(value = "Provided as an RFC 3339 timestamp. Returns results whose `created_at` or `calculated_at` value is strictly before the given time. Default: UNIX epoch (`1970-01-01T00:00:00Z`).")
  public String getUpdatedBefore() {
    return updatedBefore;
  }

  public void setUpdatedBefore(String updatedBefore) {
    this.updatedBefore = updatedBefore;
  }

  public BatchRetrieveInventoryChangesRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Pagination](/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "A pagination cursor returned by a previous call to this endpoint. Provide this to retrieve the next set of results for the original query.  See [Pagination](/basics/api101/pagination) for more information.")
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
    BatchRetrieveInventoryChangesRequest batchRetrieveInventoryChangesRequest = (BatchRetrieveInventoryChangesRequest) o;
    return Objects.equals(this.catalogObjectIds, batchRetrieveInventoryChangesRequest.catalogObjectIds) &&
        Objects.equals(this.locationIds, batchRetrieveInventoryChangesRequest.locationIds) &&
        Objects.equals(this.types, batchRetrieveInventoryChangesRequest.types) &&
        Objects.equals(this.states, batchRetrieveInventoryChangesRequest.states) &&
        Objects.equals(this.updatedAfter, batchRetrieveInventoryChangesRequest.updatedAfter) &&
        Objects.equals(this.updatedBefore, batchRetrieveInventoryChangesRequest.updatedBefore) &&
        Objects.equals(this.cursor, batchRetrieveInventoryChangesRequest.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogObjectIds, locationIds, types, states, updatedAfter, updatedBefore, cursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRetrieveInventoryChangesRequest {\n");
    
    sb.append("    catalogObjectIds: ").append(toIndentedString(catalogObjectIds)).append("\n");
    sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    updatedAfter: ").append(toIndentedString(updatedAfter)).append("\n");
    sb.append("    updatedBefore: ").append(toIndentedString(updatedBefore)).append("\n");
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


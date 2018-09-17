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
import com.squareup.connect.models.SourceApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a verified (re)count of items in a given state at a specific location. For example, the quantity of items currently on hand at a physical store).
 */
@ApiModel(description = "Represents a verified (re)count of items in a given state at a specific location. For example, the quantity of items currently on hand at a physical store).")

public class InventoryPhysicalCount {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("reference_id")
  private String referenceId = null;

  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("catalog_object_type")
  private String catalogObjectType = null;

  /**
   * The current [InventoryState](#type-inventorystate) for the related quantity of items.
   */
  public enum StateEnum {
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

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("source")
  private SourceApplication source = null;

  @JsonProperty("employee_id")
  private String employeeId = null;

  @JsonProperty("occurred_at")
  private String occurredAt = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  public InventoryPhysicalCount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique ID generated by Square for the [InventoryPhysicalCount](#type-inventoryphysicalcount).
   * @return id
  **/
  @ApiModelProperty(value = "A unique ID generated by Square for the [InventoryPhysicalCount](#type-inventoryphysicalcount).")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InventoryPhysicalCount referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * An optional ID provided by the application to tie the [InventoryPhysicalCount](#type-inventoryphysicalcount) to an external system.
   * @return referenceId
  **/
  @ApiModelProperty(value = "An optional ID provided by the application to tie the [InventoryPhysicalCount](#type-inventoryphysicalcount) to an external system.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public InventoryPhysicalCount catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * The Square generated ID of the [CatalogObject](#type-catalogobject) being tracked.
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "The Square generated ID of the [CatalogObject](#type-catalogobject) being tracked.")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public InventoryPhysicalCount catalogObjectType(String catalogObjectType) {
    this.catalogObjectType = catalogObjectType;
    return this;
  }

   /**
   * The [CatalogObjectType](#type-catalogobjecttype) of the [CatalogObject](#type-catalogobject) being tracked. Tracking is only supported for the `ITEM_VARIATION` type.
   * @return catalogObjectType
  **/
  @ApiModelProperty(value = "The [CatalogObjectType](#type-catalogobjecttype) of the [CatalogObject](#type-catalogobject) being tracked. Tracking is only supported for the `ITEM_VARIATION` type.")
  public String getCatalogObjectType() {
    return catalogObjectType;
  }

  public void setCatalogObjectType(String catalogObjectType) {
    this.catalogObjectType = catalogObjectType;
  }

  public InventoryPhysicalCount state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The current [InventoryState](#type-inventorystate) for the related quantity of items.
   * @return state
  **/
  @ApiModelProperty(value = "The current [InventoryState](#type-inventorystate) for the related quantity of items.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public InventoryPhysicalCount locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The Square ID of the [Location](#type-location) where the related quantity of items are being tracked.
   * @return locationId
  **/
  @ApiModelProperty(value = "The Square ID of the [Location](#type-location) where the related quantity of items are being tracked.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public InventoryPhysicalCount quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of items affected by the physical count as a decimal string. Fractional quantities are not supported.
   * @return quantity
  **/
  @ApiModelProperty(value = "The number of items affected by the physical count as a decimal string. Fractional quantities are not supported.")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public InventoryPhysicalCount source(SourceApplication source) {
    this.source = source;
    return this;
  }

   /**
   * Read-only information about the application that submitted the physical count.
   * @return source
  **/
  @ApiModelProperty(value = "Read-only information about the application that submitted the physical count.")
  public SourceApplication getSource() {
    return source;
  }

  public void setSource(SourceApplication source) {
    this.source = source;
  }

  public InventoryPhysicalCount employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The Square ID of the [Employee](#type-employee) responsible for the physical count.
   * @return employeeId
  **/
  @ApiModelProperty(value = "The Square ID of the [Employee](#type-employee) responsible for the physical count.")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public InventoryPhysicalCount occurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * A client-generated timestamp in RFC 3339 format that indicates when the physical count took place. For write actions, the `occurred_at` timestamp cannot be older than 24 hours or in the future relative to the time of the request.
   * @return occurredAt
  **/
  @ApiModelProperty(value = "A client-generated timestamp in RFC 3339 format that indicates when the physical count took place. For write actions, the `occurred_at` timestamp cannot be older than 24 hours or in the future relative to the time of the request.")
  public String getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
  }

  public InventoryPhysicalCount createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A read-only timestamp in RFC 3339 format that indicates when Square received the physical count.
   * @return createdAt
  **/
  @ApiModelProperty(value = "A read-only timestamp in RFC 3339 format that indicates when Square received the physical count.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryPhysicalCount inventoryPhysicalCount = (InventoryPhysicalCount) o;
    return Objects.equals(this.id, inventoryPhysicalCount.id) &&
        Objects.equals(this.referenceId, inventoryPhysicalCount.referenceId) &&
        Objects.equals(this.catalogObjectId, inventoryPhysicalCount.catalogObjectId) &&
        Objects.equals(this.catalogObjectType, inventoryPhysicalCount.catalogObjectType) &&
        Objects.equals(this.state, inventoryPhysicalCount.state) &&
        Objects.equals(this.locationId, inventoryPhysicalCount.locationId) &&
        Objects.equals(this.quantity, inventoryPhysicalCount.quantity) &&
        Objects.equals(this.source, inventoryPhysicalCount.source) &&
        Objects.equals(this.employeeId, inventoryPhysicalCount.employeeId) &&
        Objects.equals(this.occurredAt, inventoryPhysicalCount.occurredAt) &&
        Objects.equals(this.createdAt, inventoryPhysicalCount.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, referenceId, catalogObjectId, catalogObjectType, state, locationId, quantity, source, employeeId, occurredAt, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryPhysicalCount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    catalogObjectType: ").append(toIndentedString(catalogObjectType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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


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
 * __Deprecated__: Please use the [OrderLineItemTax](#type-orderlineitemtax) type in the order field of [CreateOrderRequest](#type-createorderrequest) instead.  Represents a tax that can apply to either a single line item or an entire order.
 */
@ApiModel(description = "__Deprecated__: Please use the [OrderLineItemTax](#type-orderlineitemtax) type in the order field of [CreateOrderRequest](#type-createorderrequest) instead.  Represents a tax that can apply to either a single line item or an entire order.")

public class CreateOrderRequestTax {
  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("percentage")
  private String percentage = null;

  public CreateOrderRequestTax catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * Only used for catalog taxes. The catalog object ID of an existing `CatalogTax`.  Do not provide a value for this field if you provide values in other fields for an ad hoc tax.
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "Only used for catalog taxes. The catalog object ID of an existing `CatalogTax`.  Do not provide a value for this field if you provide values in other fields for an ad hoc tax.")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public CreateOrderRequestTax name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Only used for ad hoc taxes. The tax's name.  Do not provide a value for this field if you set `catalog_object_id`.
   * @return name
  **/
  @ApiModelProperty(value = "Only used for ad hoc taxes. The tax's name.  Do not provide a value for this field if you set `catalog_object_id`.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateOrderRequestTax type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Only used for ad hoc taxes. Indicates the calculation method used to apply the line item tax.  Default: `ADDITIVE`; See `OrderLineItemTaxType` for possible values. See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values
   * @return type
  **/
  @ApiModelProperty(value = "Only used for ad hoc taxes. Indicates the calculation method used to apply the line item tax.  Default: `ADDITIVE`; See `OrderLineItemTaxType` for possible values. See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreateOrderRequestTax percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Only used for ad hoc taxes. The percentage of the tax, as a string representation of a decimal number.  A value of `7.25` corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0
   * @return percentage
  **/
  @ApiModelProperty(value = "Only used for ad hoc taxes. The percentage of the tax, as a string representation of a decimal number.  A value of `7.25` corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequestTax createOrderRequestTax = (CreateOrderRequestTax) o;
    return Objects.equals(this.catalogObjectId, createOrderRequestTax.catalogObjectId) &&
        Objects.equals(this.name, createOrderRequestTax.name) &&
        Objects.equals(this.type, createOrderRequestTax.type) &&
        Objects.equals(this.percentage, createOrderRequestTax.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogObjectId, name, type, percentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequestTax {\n");
    
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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


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
 * Indicates the field to use for sorting customer profiles. For example, by total money spent with the merchant or the date of their first purchase.
 */
@ApiModel(description = "Indicates the field to use for sorting customer profiles. For example, by total money spent with the merchant or the date of their first purchase.")

public class CustomerSort {
  /**
   * The field to sort the results on. It could be the total money spent at the merchant, the date of the first visit (etc).  Default value: `DEFAULT`.
   */
  public enum FieldEnum {
    DEFAULT("DEFAULT"),
    
    CREATED_AT("CREATED_AT");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FieldEnum fromValue(String text) {
      for (FieldEnum b : FieldEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("field")
  private FieldEnum field = null;

  /**
   * Indicates the order in which results should be displayed based on the value of the sort field. String comparisons use standard alphabetic comparison to determine order. Strings representing numbers are sorted as strings. Default value: `ASC`.
   */
  public enum OrderEnum {
    DESC("DESC"),
    
    ASC("ASC");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrderEnum fromValue(String text) {
      for (OrderEnum b : OrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("order")
  private OrderEnum order = null;

  public CustomerSort field(FieldEnum field) {
    this.field = field;
    return this;
  }

   /**
   * The field to sort the results on. It could be the total money spent at the merchant, the date of the first visit (etc).  Default value: `DEFAULT`.
   * @return field
  **/
  @ApiModelProperty(value = "The field to sort the results on. It could be the total money spent at the merchant, the date of the first visit (etc).  Default value: `DEFAULT`.")
  public FieldEnum getField() {
    return field;
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public CustomerSort order(OrderEnum order) {
    this.order = order;
    return this;
  }

   /**
   * Indicates the order in which results should be displayed based on the value of the sort field. String comparisons use standard alphabetic comparison to determine order. Strings representing numbers are sorted as strings. Default value: `ASC`.
   * @return order
  **/
  @ApiModelProperty(value = "Indicates the order in which results should be displayed based on the value of the sort field. String comparisons use standard alphabetic comparison to determine order. Strings representing numbers are sorted as strings. Default value: `ASC`.")
  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSort customerSort = (CustomerSort) o;
    return Objects.equals(this.field, customerSort.field) &&
        Objects.equals(this.order, customerSort.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSort {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

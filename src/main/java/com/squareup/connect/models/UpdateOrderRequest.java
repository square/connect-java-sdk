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
import com.squareup.connect.models.Order;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that are included in requests to the [UpdateOrder](#endpoint-orders-updateorder) endpoint.
 */
@ApiModel(description = "Defines the fields that are included in requests to the [UpdateOrder](#endpoint-orders-updateorder) endpoint.")

public class UpdateOrderRequest {
  @JsonProperty("order")
  private Order order = null;

  @JsonProperty("fields_to_clear")
  private List<String> fieldsToClear = new ArrayList<String>();

  @JsonProperty("idempotency_key")
  private String idempotencyKey = null;

  public UpdateOrderRequest order(Order order) {
    this.order = order;
    return this;
  }

   /**
   * The [sparse order](https://developer.squareup.com/docs/orders-api/manage-orders#sparse-order-objects) containing only the fields to update and the version the update is being applied to.
   * @return order
  **/
  @ApiModelProperty(value = "The [sparse order](https://developer.squareup.com/docs/orders-api/manage-orders#sparse-order-objects) containing only the fields to update and the version the update is being applied to.")
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public UpdateOrderRequest fieldsToClear(List<String> fieldsToClear) {
    this.fieldsToClear = fieldsToClear;
    return this;
  }

  public UpdateOrderRequest addFieldsToClearItem(String fieldsToClearItem) {
    this.fieldsToClear.add(fieldsToClearItem);
    return this;
  }

   /**
   * The [dot notation paths](https://developer.squareup.com/docs/orders-api/manage-orders#on-dot-notation) fields to clear. For example, `line_items[uid].note` [Read more about Deleting fields](https://developer.squareup.com/docs/orders-api/manage-orders#delete-fields).
   * @return fieldsToClear
  **/
  @ApiModelProperty(value = "The [dot notation paths](https://developer.squareup.com/docs/orders-api/manage-orders#on-dot-notation) fields to clear. For example, `line_items[uid].note` [Read more about Deleting fields](https://developer.squareup.com/docs/orders-api/manage-orders#delete-fields).")
  public List<String> getFieldsToClear() {
    return fieldsToClear;
  }

  public void setFieldsToClear(List<String> fieldsToClear) {
    this.fieldsToClear = fieldsToClear;
  }

  public UpdateOrderRequest idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A value you specify that uniquely identifies this update request  If you're unsure whether a particular update was applied to an order successfully, you can reattempt it with the same idempotency key without worrying about creating duplicate updates to the order. The latest order version will be returned.  See [Idempotency](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.
   * @return idempotencyKey
  **/
  @ApiModelProperty(value = "A value you specify that uniquely identifies this update request  If you're unsure whether a particular update was applied to an order successfully, you can reattempt it with the same idempotency key without worrying about creating duplicate updates to the order. The latest order version will be returned.  See [Idempotency](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderRequest updateOrderRequest = (UpdateOrderRequest) o;
    return Objects.equals(this.order, updateOrderRequest.order) &&
        Objects.equals(this.fieldsToClear, updateOrderRequest.fieldsToClear) &&
        Objects.equals(this.idempotencyKey, updateOrderRequest.idempotencyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, fieldsToClear, idempotencyKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderRequest {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    fieldsToClear: ").append(toIndentedString(fieldsToClear)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
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


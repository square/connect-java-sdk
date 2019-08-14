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
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines the body parameters that can be included in a request to the [CreateRefund](#endpoint-createrefund) endpoint.  Deprecated - recommend using [RefundPayment](#endpoint-refunds-refundpayment)
 */
@ApiModel(description = "Defines the body parameters that can be included in a request to the [CreateRefund](#endpoint-createrefund) endpoint.  Deprecated - recommend using [RefundPayment](#endpoint-refunds-refundpayment)")

public class CreateRefundRequest {
  @JsonProperty("idempotency_key")
  private String idempotencyKey = null;

  @JsonProperty("tender_id")
  private String tenderId = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  public CreateRefundRequest idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A value you specify that uniquely identifies this refund among refunds you've created for the tender.  If you're unsure whether a particular refund succeeded, you can reattempt it with the same idempotency key without worrying about duplicating the refund.  See [Idempotency](/basics/api101/idempotency) for more information.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A value you specify that uniquely identifies this refund among refunds you've created for the tender.  If you're unsure whether a particular refund succeeded, you can reattempt it with the same idempotency key without worrying about duplicating the refund.  See [Idempotency](/basics/api101/idempotency) for more information.")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public CreateRefundRequest tenderId(String tenderId) {
    this.tenderId = tenderId;
    return this;
  }

   /**
   * The ID of the tender to refund.  A [`Transaction`](#type-transaction) has one or more `tenders` (i.e., methods of payment) associated with it, and you refund each tender separately with the Connect API.
   * @return tenderId
  **/
  @ApiModelProperty(required = true, value = "The ID of the tender to refund.  A [`Transaction`](#type-transaction) has one or more `tenders` (i.e., methods of payment) associated with it, and you refund each tender separately with the Connect API.")
  public String getTenderId() {
    return tenderId;
  }

  public void setTenderId(String tenderId) {
    this.tenderId = tenderId;
  }

  public CreateRefundRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * A description of the reason for the refund.  Default value: `Refund via API`
   * @return reason
  **/
  @ApiModelProperty(value = "A description of the reason for the refund.  Default value: `Refund via API`")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public CreateRefundRequest amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of money to refund.  Note that you specify the amount in the __smallest denomination of the applicable currency__. For example, US dollar amounts are specified in cents. See [Working with monetary amounts](#workingwithmonetaryamounts) for details.  This amount cannot exceed the amount that was originally charged to the tender that corresponds to `tender_id`.
   * @return amountMoney
  **/
  @ApiModelProperty(required = true, value = "The amount of money to refund.  Note that you specify the amount in the __smallest denomination of the applicable currency__. For example, US dollar amounts are specified in cents. See [Working with monetary amounts](#workingwithmonetaryamounts) for details.  This amount cannot exceed the amount that was originally charged to the tender that corresponds to `tender_id`.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRefundRequest createRefundRequest = (CreateRefundRequest) o;
    return Objects.equals(this.idempotencyKey, createRefundRequest.idempotencyKey) &&
        Objects.equals(this.tenderId, createRefundRequest.tenderId) &&
        Objects.equals(this.reason, createRefundRequest.reason) &&
        Objects.equals(this.amountMoney, createRefundRequest.amountMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idempotencyKey, tenderId, reason, amountMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRefundRequest {\n");
    
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    tenderId: ").append(toIndentedString(tenderId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
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


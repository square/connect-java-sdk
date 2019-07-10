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
import com.squareup.connect.models.V1Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A tender represents a discrete monetary exchange. Square represents this exchange as a money object with a specific currency and amount, where the amount is given in the smallest denomination of the given currency.  Square POS can accept more than one form of tender for a single payment (such as by splitting a bill between a credit card and a gift card). The &#x60;tender&#x60; field of the Payment object lists all forms of tender used for the payment.  Split tender payments behave slightly differently from single tender payments:  The receipt_url for a split tender corresponds only to the first tender listed in the tender field. To get the receipt URLs for the remaining tenders, use the receipt_url fields of the corresponding Tender objects.  *A note on gift cards**: when a customer purchases a Square gift card from a merchant, the merchant receives the full amount of the gift card in the associated payment.  When that gift card is used as a tender, the balance of the gift card is reduced and the merchant receives no funds. A &#x60;Tender&#x60; object with a type of &#x60;SQUARE_GIFT_CARD&#x60; indicates a gift card was used for some or all of the associated payment.
 */
@ApiModel(description = "A tender represents a discrete monetary exchange. Square represents this exchange as a money object with a specific currency and amount, where the amount is given in the smallest denomination of the given currency.  Square POS can accept more than one form of tender for a single payment (such as by splitting a bill between a credit card and a gift card). The `tender` field of the Payment object lists all forms of tender used for the payment.  Split tender payments behave slightly differently from single tender payments:  The receipt_url for a split tender corresponds only to the first tender listed in the tender field. To get the receipt URLs for the remaining tenders, use the receipt_url fields of the corresponding Tender objects.  *A note on gift cards**: when a customer purchases a Square gift card from a merchant, the merchant receives the full amount of the gift card in the associated payment.  When that gift card is used as a tender, the balance of the gift card is reduced and the merchant receives no funds. A `Tender` object with a type of `SQUARE_GIFT_CARD` indicates a gift card was used for some or all of the associated payment.")

public class V1Tender {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("employee_id")
  private String employeeId = null;

  @JsonProperty("receipt_url")
  private String receiptUrl = null;

  @JsonProperty("card_brand")
  private String cardBrand = null;

  @JsonProperty("pan_suffix")
  private String panSuffix = null;

  @JsonProperty("entry_method")
  private String entryMethod = null;

  @JsonProperty("payment_note")
  private String paymentNote = null;

  @JsonProperty("total_money")
  private V1Money totalMoney = null;

  @JsonProperty("tendered_money")
  private V1Money tenderedMoney = null;

  @JsonProperty("tendered_at")
  private String tenderedAt = null;

  @JsonProperty("settled_at")
  private String settledAt = null;

  @JsonProperty("change_back_money")
  private V1Money changeBackMoney = null;

  @JsonProperty("refunded_money")
  private V1Money refundedMoney = null;

  @JsonProperty("is_exchange")
  private Boolean isExchange = null;

  public V1Tender id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The tender's unique ID.
   * @return id
  **/
  @ApiModelProperty(value = "The tender's unique ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public V1Tender type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of tender. See [V1TenderType](#type-v1tendertype) for possible values
   * @return type
  **/
  @ApiModelProperty(value = "The type of tender. See [V1TenderType](#type-v1tendertype) for possible values")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public V1Tender name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-readable description of the tender.
   * @return name
  **/
  @ApiModelProperty(value = "A human-readable description of the tender.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1Tender employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The ID of the employee that processed the tender.
   * @return employeeId
  **/
  @ApiModelProperty(value = "The ID of the employee that processed the tender.")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public V1Tender receiptUrl(String receiptUrl) {
    this.receiptUrl = receiptUrl;
    return this;
  }

   /**
   * The URL of the receipt for the tender.
   * @return receiptUrl
  **/
  @ApiModelProperty(value = "The URL of the receipt for the tender.")
  public String getReceiptUrl() {
    return receiptUrl;
  }

  public void setReceiptUrl(String receiptUrl) {
    this.receiptUrl = receiptUrl;
  }

  public V1Tender cardBrand(String cardBrand) {
    this.cardBrand = cardBrand;
    return this;
  }

   /**
   * The brand of credit card provided. See [V1TenderCardBrand](#type-v1tendercardbrand) for possible values
   * @return cardBrand
  **/
  @ApiModelProperty(value = "The brand of credit card provided. See [V1TenderCardBrand](#type-v1tendercardbrand) for possible values")
  public String getCardBrand() {
    return cardBrand;
  }

  public void setCardBrand(String cardBrand) {
    this.cardBrand = cardBrand;
  }

  public V1Tender panSuffix(String panSuffix) {
    this.panSuffix = panSuffix;
    return this;
  }

   /**
   * The last four digits of the provided credit card's account number.
   * @return panSuffix
  **/
  @ApiModelProperty(value = "The last four digits of the provided credit card's account number.")
  public String getPanSuffix() {
    return panSuffix;
  }

  public void setPanSuffix(String panSuffix) {
    this.panSuffix = panSuffix;
  }

  public V1Tender entryMethod(String entryMethod) {
    this.entryMethod = entryMethod;
    return this;
  }

   /**
   * The tender's unique ID. See [V1TenderEntryMethod](#type-v1tenderentrymethod) for possible values
   * @return entryMethod
  **/
  @ApiModelProperty(value = "The tender's unique ID. See [V1TenderEntryMethod](#type-v1tenderentrymethod) for possible values")
  public String getEntryMethod() {
    return entryMethod;
  }

  public void setEntryMethod(String entryMethod) {
    this.entryMethod = entryMethod;
  }

  public V1Tender paymentNote(String paymentNote) {
    this.paymentNote = paymentNote;
    return this;
  }

   /**
   * Notes entered by the merchant about the tender at the time of payment, if any. Typically only present for tender with the type: OTHER.
   * @return paymentNote
  **/
  @ApiModelProperty(value = "Notes entered by the merchant about the tender at the time of payment, if any. Typically only present for tender with the type: OTHER.")
  public String getPaymentNote() {
    return paymentNote;
  }

  public void setPaymentNote(String paymentNote) {
    this.paymentNote = paymentNote;
  }

  public V1Tender totalMoney(V1Money totalMoney) {
    this.totalMoney = totalMoney;
    return this;
  }

   /**
   * The total amount of money provided in this form of tender.
   * @return totalMoney
  **/
  @ApiModelProperty(value = "The total amount of money provided in this form of tender.")
  public V1Money getTotalMoney() {
    return totalMoney;
  }

  public void setTotalMoney(V1Money totalMoney) {
    this.totalMoney = totalMoney;
  }

  public V1Tender tenderedMoney(V1Money tenderedMoney) {
    this.tenderedMoney = tenderedMoney;
    return this;
  }

   /**
   * The amount of total_money applied to the payment.
   * @return tenderedMoney
  **/
  @ApiModelProperty(value = "The amount of total_money applied to the payment.")
  public V1Money getTenderedMoney() {
    return tenderedMoney;
  }

  public void setTenderedMoney(V1Money tenderedMoney) {
    this.tenderedMoney = tenderedMoney;
  }

  public V1Tender tenderedAt(String tenderedAt) {
    this.tenderedAt = tenderedAt;
    return this;
  }

   /**
   * The time when the tender was created, in ISO 8601 format.
   * @return tenderedAt
  **/
  @ApiModelProperty(value = "The time when the tender was created, in ISO 8601 format.")
  public String getTenderedAt() {
    return tenderedAt;
  }

  public void setTenderedAt(String tenderedAt) {
    this.tenderedAt = tenderedAt;
  }

  public V1Tender settledAt(String settledAt) {
    this.settledAt = settledAt;
    return this;
  }

   /**
   * The time when the tender was settled, in ISO 8601 format.
   * @return settledAt
  **/
  @ApiModelProperty(value = "The time when the tender was settled, in ISO 8601 format.")
  public String getSettledAt() {
    return settledAt;
  }

  public void setSettledAt(String settledAt) {
    this.settledAt = settledAt;
  }

  public V1Tender changeBackMoney(V1Money changeBackMoney) {
    this.changeBackMoney = changeBackMoney;
    return this;
  }

   /**
   * The amount of total_money returned to the buyer as change.
   * @return changeBackMoney
  **/
  @ApiModelProperty(value = "The amount of total_money returned to the buyer as change.")
  public V1Money getChangeBackMoney() {
    return changeBackMoney;
  }

  public void setChangeBackMoney(V1Money changeBackMoney) {
    this.changeBackMoney = changeBackMoney;
  }

  public V1Tender refundedMoney(V1Money refundedMoney) {
    this.refundedMoney = refundedMoney;
    return this;
  }

   /**
   * The total of all refunds applied to this tender. This amount is always negative or zero.
   * @return refundedMoney
  **/
  @ApiModelProperty(value = "The total of all refunds applied to this tender. This amount is always negative or zero.")
  public V1Money getRefundedMoney() {
    return refundedMoney;
  }

  public void setRefundedMoney(V1Money refundedMoney) {
    this.refundedMoney = refundedMoney;
  }

  public V1Tender isExchange(Boolean isExchange) {
    this.isExchange = isExchange;
    return this;
  }

   /**
   * Indicates whether or not the tender is associated with an exchange. If is_exchange is true, the tender represents the value of goods returned in an exchange not the actual money paid. The exchange value reduces the tender amounts needed to pay for items purchased in the exchange.
   * @return isExchange
  **/
  @ApiModelProperty(value = "Indicates whether or not the tender is associated with an exchange. If is_exchange is true, the tender represents the value of goods returned in an exchange not the actual money paid. The exchange value reduces the tender amounts needed to pay for items purchased in the exchange.")
  public Boolean getIsExchange() {
    return isExchange;
  }

  public void setIsExchange(Boolean isExchange) {
    this.isExchange = isExchange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Tender v1Tender = (V1Tender) o;
    return Objects.equals(this.id, v1Tender.id) &&
        Objects.equals(this.type, v1Tender.type) &&
        Objects.equals(this.name, v1Tender.name) &&
        Objects.equals(this.employeeId, v1Tender.employeeId) &&
        Objects.equals(this.receiptUrl, v1Tender.receiptUrl) &&
        Objects.equals(this.cardBrand, v1Tender.cardBrand) &&
        Objects.equals(this.panSuffix, v1Tender.panSuffix) &&
        Objects.equals(this.entryMethod, v1Tender.entryMethod) &&
        Objects.equals(this.paymentNote, v1Tender.paymentNote) &&
        Objects.equals(this.totalMoney, v1Tender.totalMoney) &&
        Objects.equals(this.tenderedMoney, v1Tender.tenderedMoney) &&
        Objects.equals(this.tenderedAt, v1Tender.tenderedAt) &&
        Objects.equals(this.settledAt, v1Tender.settledAt) &&
        Objects.equals(this.changeBackMoney, v1Tender.changeBackMoney) &&
        Objects.equals(this.refundedMoney, v1Tender.refundedMoney) &&
        Objects.equals(this.isExchange, v1Tender.isExchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, name, employeeId, receiptUrl, cardBrand, panSuffix, entryMethod, paymentNote, totalMoney, tenderedMoney, tenderedAt, settledAt, changeBackMoney, refundedMoney, isExchange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Tender {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    receiptUrl: ").append(toIndentedString(receiptUrl)).append("\n");
    sb.append("    cardBrand: ").append(toIndentedString(cardBrand)).append("\n");
    sb.append("    panSuffix: ").append(toIndentedString(panSuffix)).append("\n");
    sb.append("    entryMethod: ").append(toIndentedString(entryMethod)).append("\n");
    sb.append("    paymentNote: ").append(toIndentedString(paymentNote)).append("\n");
    sb.append("    totalMoney: ").append(toIndentedString(totalMoney)).append("\n");
    sb.append("    tenderedMoney: ").append(toIndentedString(tenderedMoney)).append("\n");
    sb.append("    tenderedAt: ").append(toIndentedString(tenderedAt)).append("\n");
    sb.append("    settledAt: ").append(toIndentedString(settledAt)).append("\n");
    sb.append("    changeBackMoney: ").append(toIndentedString(changeBackMoney)).append("\n");
    sb.append("    refundedMoney: ").append(toIndentedString(refundedMoney)).append("\n");
    sb.append("    isExchange: ").append(toIndentedString(isExchange)).append("\n");
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


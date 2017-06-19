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
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a discount that applies to one or more line items in an order.
 */
@ApiModel(description = "Represents a discount that applies to one or more line items in an order.")

public class OrderLineItemDiscount {
  @JsonProperty("name")
  private String name = null;

  /**
   * The type of the discount. If it is created by API, it would be either FIXED_PERCENTAGE or FIXED_AMOUNT as VARIABLE_* is not supported in API because the order is created at the time of sale and either percentage or amount has to be specified.
   */
  public enum TypeEnum {
    UNKNOWN("UNKNOWN"),
    
    FIXED_PERCENTAGE("FIXED_PERCENTAGE"),
    
    FIXED_AMOUNT("FIXED_AMOUNT"),
    
    VARIABLE_PERCENTAGE("VARIABLE_PERCENTAGE"),
    
    VARIABLE_AMOUNT("VARIABLE_AMOUNT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  @JsonProperty("applied_money")
  private Money appliedMoney = null;

  /**
   * The scope of the discount.
   */
  public enum ScopeEnum {
    LINEITEM("LINEITEM"),
    
    ORDER("ORDER");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("scope")
  private ScopeEnum scope = null;

  public OrderLineItemDiscount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The discount's name.
   * @return name
  **/
  @ApiModelProperty(value = "The discount's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderLineItemDiscount type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the discount. If it is created by API, it would be either FIXED_PERCENTAGE or FIXED_AMOUNT as VARIABLE_* is not supported in API because the order is created at the time of sale and either percentage or amount has to be specified.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the discount. If it is created by API, it would be either FIXED_PERCENTAGE or FIXED_AMOUNT as VARIABLE_* is not supported in API because the order is created at the time of sale and either percentage or amount has to be specified.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OrderLineItemDiscount percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the tax, as a string representation of a decimal number. A value of `7.25` corresponds to a percentage of 7.25%.
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the tax, as a string representation of a decimal number. A value of `7.25` corresponds to a percentage of 7.25%.")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public OrderLineItemDiscount amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of the discount.
   * @return amountMoney
  **/
  @ApiModelProperty(value = "The amount of the discount.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public OrderLineItemDiscount appliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
    return this;
  }

   /**
   * The amount of the money applied by the discount in an order.
   * @return appliedMoney
  **/
  @ApiModelProperty(value = "The amount of the money applied by the discount in an order.")
  public Money getAppliedMoney() {
    return appliedMoney;
  }

  public void setAppliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
  }

  public OrderLineItemDiscount scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the discount.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope of the discount.")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineItemDiscount orderLineItemDiscount = (OrderLineItemDiscount) o;
    return Objects.equals(this.name, orderLineItemDiscount.name) &&
        Objects.equals(this.type, orderLineItemDiscount.type) &&
        Objects.equals(this.percentage, orderLineItemDiscount.percentage) &&
        Objects.equals(this.amountMoney, orderLineItemDiscount.amountMoney) &&
        Objects.equals(this.appliedMoney, orderLineItemDiscount.appliedMoney) &&
        Objects.equals(this.scope, orderLineItemDiscount.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, percentage, amountMoney, appliedMoney, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineItemDiscount {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    appliedMoney: ").append(toIndentedString(appliedMoney)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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


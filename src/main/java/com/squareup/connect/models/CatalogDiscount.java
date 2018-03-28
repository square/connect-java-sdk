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
 * A discount in the Catalog object model.
 */
@ApiModel(description = "A discount in the Catalog object model.")

public class CatalogDiscount {
  @JsonProperty("name")
  private String name = null;

  /**
   * Indicates whether the discount is a fixed amount or percentage, or entered at the time of sale. See [CatalogDiscountType](#type-catalogdiscounttype) for all possible values.
   */
  public enum DiscountTypeEnum {
    FIXED_PERCENTAGE("FIXED_PERCENTAGE"),
    
    FIXED_AMOUNT("FIXED_AMOUNT"),
    
    VARIABLE_PERCENTAGE("VARIABLE_PERCENTAGE"),
    
    VARIABLE_AMOUNT("VARIABLE_AMOUNT");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DiscountTypeEnum fromValue(String text) {
      for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("discount_type")
  private DiscountTypeEnum discountType = null;

  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  @JsonProperty("pin_required")
  private Boolean pinRequired = null;

  @JsonProperty("label_color")
  private String labelColor = null;

  public CatalogDiscount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The discount's name. Searchable.
   * @return name
  **/
  @ApiModelProperty(value = "The discount's name. Searchable.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogDiscount discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

   /**
   * Indicates whether the discount is a fixed amount or percentage, or entered at the time of sale. See [CatalogDiscountType](#type-catalogdiscounttype) for all possible values.
   * @return discountType
  **/
  @ApiModelProperty(value = "Indicates whether the discount is a fixed amount or percentage, or entered at the time of sale. See [CatalogDiscountType](#type-catalogdiscounttype) for all possible values.")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public CatalogDiscount percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the discount as a string representation of a decimal number, using a `.` as the decimal separator and without a `%` sign. A value of `7.5` corresponds to `7.5%`. Specify a percentage of `0` if `discount_type` is `VARIABLE_PERCENTAGE`.  Do not include this field for amount-based or variable discounts.
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the discount as a string representation of a decimal number, using a `.` as the decimal separator and without a `%` sign. A value of `7.5` corresponds to `7.5%`. Specify a percentage of `0` if `discount_type` is `VARIABLE_PERCENTAGE`.  Do not include this field for amount-based or variable discounts.")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public CatalogDiscount amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The amount of the discount. Specify an amount of `0` if `discount_type` is `VARIABLE_AMOUNT`.  Do not include this field for percentage-based or variable discounts.
   * @return amountMoney
  **/
  @ApiModelProperty(value = "The amount of the discount. Specify an amount of `0` if `discount_type` is `VARIABLE_AMOUNT`.  Do not include this field for percentage-based or variable discounts.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public CatalogDiscount pinRequired(Boolean pinRequired) {
    this.pinRequired = pinRequired;
    return this;
  }

   /**
   * Indicates whether a mobile staff member needs to enter their PIN to apply the discount to a payment in the Square Point of Sale app.
   * @return pinRequired
  **/
  @ApiModelProperty(value = "Indicates whether a mobile staff member needs to enter their PIN to apply the discount to a payment in the Square Point of Sale app.")
  public Boolean getPinRequired() {
    return pinRequired;
  }

  public void setPinRequired(Boolean pinRequired) {
    this.pinRequired = pinRequired;
  }

  public CatalogDiscount labelColor(String labelColor) {
    this.labelColor = labelColor;
    return this;
  }

   /**
   * The color of the discount's display label in the Square Point of Sale app.
   * @return labelColor
  **/
  @ApiModelProperty(value = "The color of the discount's display label in the Square Point of Sale app.")
  public String getLabelColor() {
    return labelColor;
  }

  public void setLabelColor(String labelColor) {
    this.labelColor = labelColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogDiscount catalogDiscount = (CatalogDiscount) o;
    return Objects.equals(this.name, catalogDiscount.name) &&
        Objects.equals(this.discountType, catalogDiscount.discountType) &&
        Objects.equals(this.percentage, catalogDiscount.percentage) &&
        Objects.equals(this.amountMoney, catalogDiscount.amountMoney) &&
        Objects.equals(this.pinRequired, catalogDiscount.pinRequired) &&
        Objects.equals(this.labelColor, catalogDiscount.labelColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, discountType, percentage, amountMoney, pinRequired, labelColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogDiscount {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    pinRequired: ").append(toIndentedString(pinRequired)).append("\n");
    sb.append("    labelColor: ").append(toIndentedString(labelColor)).append("\n");
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


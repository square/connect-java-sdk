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
 * Defines how prices are modified or set for items that match the pricing rule during the active time period.
 */
@ApiModel(description = "Defines how prices are modified or set for items that match the pricing rule during the active time period.")

public class CatalogPricingRule {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("time_period_ids")
  private List<String> timePeriodIds = new ArrayList<String>();

  @JsonProperty("discount_id")
  private String discountId = null;

  @JsonProperty("match_products_id")
  private String matchProductsId = null;

  @JsonProperty("apply_products_id")
  private String applyProductsId = null;

  @JsonProperty("exclude_products_id")
  private String excludeProductsId = null;

  @JsonProperty("valid_from_date")
  private String validFromDate = null;

  @JsonProperty("valid_from_local_time")
  private String validFromLocalTime = null;

  @JsonProperty("valid_until_date")
  private String validUntilDate = null;

  @JsonProperty("valid_until_local_time")
  private String validUntilLocalTime = null;

  public CatalogPricingRule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User-defined name for the pricing rule. For example, \"Buy one get one free\" or \"10% off\".
   * @return name
  **/
  @ApiModelProperty(value = "User-defined name for the pricing rule. For example, \"Buy one get one free\" or \"10% off\".")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogPricingRule timePeriodIds(List<String> timePeriodIds) {
    this.timePeriodIds = timePeriodIds;
    return this;
  }

  public CatalogPricingRule addTimePeriodIdsItem(String timePeriodIdsItem) {
    this.timePeriodIds.add(timePeriodIdsItem);
    return this;
  }

   /**
   * Unique ID for the `CatalogTimePeriod`s when this pricing rule is in effect. If left unset, the pricing rule is always in effect.
   * @return timePeriodIds
  **/
  @ApiModelProperty(value = "Unique ID for the `CatalogTimePeriod`s when this pricing rule is in effect. If left unset, the pricing rule is always in effect.")
  public List<String> getTimePeriodIds() {
    return timePeriodIds;
  }

  public void setTimePeriodIds(List<String> timePeriodIds) {
    this.timePeriodIds = timePeriodIds;
  }

  public CatalogPricingRule discountId(String discountId) {
    this.discountId = discountId;
    return this;
  }

   /**
   * Unique ID for the `CatalogDiscount` to take off the price of all matched items.
   * @return discountId
  **/
  @ApiModelProperty(value = "Unique ID for the `CatalogDiscount` to take off the price of all matched items.")
  public String getDiscountId() {
    return discountId;
  }

  public void setDiscountId(String discountId) {
    this.discountId = discountId;
  }

  public CatalogPricingRule matchProductsId(String matchProductsId) {
    this.matchProductsId = matchProductsId;
    return this;
  }

   /**
   * Unique ID for the `CatalogProductSet` that will be matched by this rule. A match rule matches within the entire cart.
   * @return matchProductsId
  **/
  @ApiModelProperty(value = "Unique ID for the `CatalogProductSet` that will be matched by this rule. A match rule matches within the entire cart.")
  public String getMatchProductsId() {
    return matchProductsId;
  }

  public void setMatchProductsId(String matchProductsId) {
    this.matchProductsId = matchProductsId;
  }

  public CatalogPricingRule applyProductsId(String applyProductsId) {
    this.applyProductsId = applyProductsId;
    return this;
  }

   /**
   * The `CatalogProductSet` to apply the pricing rule to within the set of matched products specified by `match_products_id`. An apply rule can only match once within the set of matched products. If left unset, the pricing rule will be applied to all products within the set of matched products.
   * @return applyProductsId
  **/
  @ApiModelProperty(value = "The `CatalogProductSet` to apply the pricing rule to within the set of matched products specified by `match_products_id`. An apply rule can only match once within the set of matched products. If left unset, the pricing rule will be applied to all products within the set of matched products.")
  public String getApplyProductsId() {
    return applyProductsId;
  }

  public void setApplyProductsId(String applyProductsId) {
    this.applyProductsId = applyProductsId;
  }

  public CatalogPricingRule excludeProductsId(String excludeProductsId) {
    this.excludeProductsId = excludeProductsId;
    return this;
  }

   /**
   * Identifies the `CatalogProductSet` to exclude from this pricing rule. An exclude rule matches within the subset of the cart that fits the match rules (the match set). An exclude rule can only match once in the match set. If not supplied, the pricing will be applied to all products in the match set. Other products retain their base price, or a price generated by other rules.
   * @return excludeProductsId
  **/
  @ApiModelProperty(value = "Identifies the `CatalogProductSet` to exclude from this pricing rule. An exclude rule matches within the subset of the cart that fits the match rules (the match set). An exclude rule can only match once in the match set. If not supplied, the pricing will be applied to all products in the match set. Other products retain their base price, or a price generated by other rules.")
  public String getExcludeProductsId() {
    return excludeProductsId;
  }

  public void setExcludeProductsId(String excludeProductsId) {
    this.excludeProductsId = excludeProductsId;
  }

  public CatalogPricingRule validFromDate(String validFromDate) {
    this.validFromDate = validFromDate;
    return this;
  }

   /**
   * Represents the date the Pricing Rule is valid from. Represented in RFC3339 full-date format (YYYY-MM-DD).
   * @return validFromDate
  **/
  @ApiModelProperty(value = "Represents the date the Pricing Rule is valid from. Represented in RFC3339 full-date format (YYYY-MM-DD).")
  public String getValidFromDate() {
    return validFromDate;
  }

  public void setValidFromDate(String validFromDate) {
    this.validFromDate = validFromDate;
  }

  public CatalogPricingRule validFromLocalTime(String validFromLocalTime) {
    this.validFromLocalTime = validFromLocalTime;
    return this;
  }

   /**
   * Represents the local time the pricing rule should be valid from. Time zone is determined by the device running the Point of Sale app.  Represented in RFC3339 partial-time format (HH:MM:SS). Partial seconds will be truncated.
   * @return validFromLocalTime
  **/
  @ApiModelProperty(value = "Represents the local time the pricing rule should be valid from. Time zone is determined by the device running the Point of Sale app.  Represented in RFC3339 partial-time format (HH:MM:SS). Partial seconds will be truncated.")
  public String getValidFromLocalTime() {
    return validFromLocalTime;
  }

  public void setValidFromLocalTime(String validFromLocalTime) {
    this.validFromLocalTime = validFromLocalTime;
  }

  public CatalogPricingRule validUntilDate(String validUntilDate) {
    this.validUntilDate = validUntilDate;
    return this;
  }

   /**
   * Represents the date the pricing rule will become inactive.  Represented in RFC3339 full-date format (YYYY-MM-DD).
   * @return validUntilDate
  **/
  @ApiModelProperty(value = "Represents the date the pricing rule will become inactive.  Represented in RFC3339 full-date format (YYYY-MM-DD).")
  public String getValidUntilDate() {
    return validUntilDate;
  }

  public void setValidUntilDate(String validUntilDate) {
    this.validUntilDate = validUntilDate;
  }

  public CatalogPricingRule validUntilLocalTime(String validUntilLocalTime) {
    this.validUntilLocalTime = validUntilLocalTime;
    return this;
  }

   /**
   * Represents the local time at which the pricing rule will become inactive. Time zone is determined by the device running the Point of Sale app.  Represented in RFC3339 partial-time format (HH:MM:SS). Partial seconds will be truncated.
   * @return validUntilLocalTime
  **/
  @ApiModelProperty(value = "Represents the local time at which the pricing rule will become inactive. Time zone is determined by the device running the Point of Sale app.  Represented in RFC3339 partial-time format (HH:MM:SS). Partial seconds will be truncated.")
  public String getValidUntilLocalTime() {
    return validUntilLocalTime;
  }

  public void setValidUntilLocalTime(String validUntilLocalTime) {
    this.validUntilLocalTime = validUntilLocalTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogPricingRule catalogPricingRule = (CatalogPricingRule) o;
    return Objects.equals(this.name, catalogPricingRule.name) &&
        Objects.equals(this.timePeriodIds, catalogPricingRule.timePeriodIds) &&
        Objects.equals(this.discountId, catalogPricingRule.discountId) &&
        Objects.equals(this.matchProductsId, catalogPricingRule.matchProductsId) &&
        Objects.equals(this.applyProductsId, catalogPricingRule.applyProductsId) &&
        Objects.equals(this.excludeProductsId, catalogPricingRule.excludeProductsId) &&
        Objects.equals(this.validFromDate, catalogPricingRule.validFromDate) &&
        Objects.equals(this.validFromLocalTime, catalogPricingRule.validFromLocalTime) &&
        Objects.equals(this.validUntilDate, catalogPricingRule.validUntilDate) &&
        Objects.equals(this.validUntilLocalTime, catalogPricingRule.validUntilLocalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timePeriodIds, discountId, matchProductsId, applyProductsId, excludeProductsId, validFromDate, validFromLocalTime, validUntilDate, validUntilLocalTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogPricingRule {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timePeriodIds: ").append(toIndentedString(timePeriodIds)).append("\n");
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    matchProductsId: ").append(toIndentedString(matchProductsId)).append("\n");
    sb.append("    applyProductsId: ").append(toIndentedString(applyProductsId)).append("\n");
    sb.append("    excludeProductsId: ").append(toIndentedString(excludeProductsId)).append("\n");
    sb.append("    validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
    sb.append("    validFromLocalTime: ").append(toIndentedString(validFromLocalTime)).append("\n");
    sb.append("    validUntilDate: ").append(toIndentedString(validUntilDate)).append("\n");
    sb.append("    validUntilLocalTime: ").append(toIndentedString(validUntilLocalTime)).append("\n");
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


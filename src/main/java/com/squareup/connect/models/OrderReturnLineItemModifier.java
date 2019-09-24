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
 * A line item modifier being returned.
 */
@ApiModel(description = "A line item modifier being returned.")

public class OrderReturnLineItemModifier {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("source_modifier_uid")
  private String sourceModifierUid = null;

  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("base_price_money")
  private Money basePriceMoney = null;

  @JsonProperty("total_price_money")
  private Money totalPriceMoney = null;

  public OrderReturnLineItemModifier uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID that identifies the return modifier only within this order.
   * @return uid
  **/
  @ApiModelProperty(value = "Unique ID that identifies the return modifier only within this order.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public OrderReturnLineItemModifier sourceModifierUid(String sourceModifierUid) {
    this.sourceModifierUid = sourceModifierUid;
    return this;
  }

   /**
   * `uid` of the Modifier from the LineItem from the Order which contains the original sale of this line item modifier.
   * @return sourceModifierUid
  **/
  @ApiModelProperty(value = "`uid` of the Modifier from the LineItem from the Order which contains the original sale of this line item modifier.")
  public String getSourceModifierUid() {
    return sourceModifierUid;
  }

  public void setSourceModifierUid(String sourceModifierUid) {
    this.sourceModifierUid = sourceModifierUid;
  }

  public OrderReturnLineItemModifier catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * The catalog object id referencing `CatalogModifier`.
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "The catalog object id referencing `CatalogModifier`.")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public OrderReturnLineItemModifier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the item modifier.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the item modifier.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderReturnLineItemModifier basePriceMoney(Money basePriceMoney) {
    this.basePriceMoney = basePriceMoney;
    return this;
  }

   /**
   * The base price for the modifier.  `base_price_money` is required for ad hoc modifiers. If both `catalog_object_id` and `base_price_money` are set, `base_price_money` will override the predefined `CatalogModifier` price.
   * @return basePriceMoney
  **/
  @ApiModelProperty(value = "The base price for the modifier.  `base_price_money` is required for ad hoc modifiers. If both `catalog_object_id` and `base_price_money` are set, `base_price_money` will override the predefined `CatalogModifier` price.")
  public Money getBasePriceMoney() {
    return basePriceMoney;
  }

  public void setBasePriceMoney(Money basePriceMoney) {
    this.basePriceMoney = basePriceMoney;
  }

  public OrderReturnLineItemModifier totalPriceMoney(Money totalPriceMoney) {
    this.totalPriceMoney = totalPriceMoney;
    return this;
  }

   /**
   * The total price of the item modifier for its line item. This is the modifier's `base_price_money` multiplied by the line item's quantity.
   * @return totalPriceMoney
  **/
  @ApiModelProperty(value = "The total price of the item modifier for its line item. This is the modifier's `base_price_money` multiplied by the line item's quantity.")
  public Money getTotalPriceMoney() {
    return totalPriceMoney;
  }

  public void setTotalPriceMoney(Money totalPriceMoney) {
    this.totalPriceMoney = totalPriceMoney;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReturnLineItemModifier orderReturnLineItemModifier = (OrderReturnLineItemModifier) o;
    return Objects.equals(this.uid, orderReturnLineItemModifier.uid) &&
        Objects.equals(this.sourceModifierUid, orderReturnLineItemModifier.sourceModifierUid) &&
        Objects.equals(this.catalogObjectId, orderReturnLineItemModifier.catalogObjectId) &&
        Objects.equals(this.name, orderReturnLineItemModifier.name) &&
        Objects.equals(this.basePriceMoney, orderReturnLineItemModifier.basePriceMoney) &&
        Objects.equals(this.totalPriceMoney, orderReturnLineItemModifier.totalPriceMoney);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, sourceModifierUid, catalogObjectId, name, basePriceMoney, totalPriceMoney);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReturnLineItemModifier {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    sourceModifierUid: ").append(toIndentedString(sourceModifierUid)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    basePriceMoney: ").append(toIndentedString(basePriceMoney)).append("\n");
    sb.append("    totalPriceMoney: ").append(toIndentedString(totalPriceMoney)).append("\n");
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


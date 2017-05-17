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
import com.squareup.connect.models.ItemVariationLocationOverrides;
import com.squareup.connect.models.Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * An item variation (i.e., product) in the Catalog object model.
 */
@ApiModel(description = "An item variation (i.e., product) in the Catalog object model.")

public class CatalogItemVariation {
  @JsonProperty("item_id")
  private String itemId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("sku")
  private String sku = null;

  @JsonProperty("upc")
  private String upc = null;

  /**
   * Indicates whether the item variation's price is fixed or determined at the time of sale. See [CatalogPricingType](#type-catalogpricingtype) for all possible values.
   */
  public enum PricingTypeEnum {
    FIXED_PRICING("FIXED_PRICING"),
    
    VARIABLE_PRICING("VARIABLE_PRICING");

    private String value;

    PricingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PricingTypeEnum fromValue(String text) {
      for (PricingTypeEnum b : PricingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("pricing_type")
  private PricingTypeEnum pricingType = null;

  @JsonProperty("price_money")
  private Money priceMoney = null;

  @JsonProperty("location_overrides")
  private List<ItemVariationLocationOverrides> locationOverrides = new ArrayList<ItemVariationLocationOverrides>();

  @JsonProperty("track_inventory")
  private Boolean trackInventory = null;

  /**
   * Indicates whether the item variation displays an alert when its inventory quantity is less than or equal to its `inventory_alert_threshold`. See [InventoryAlertType](#type-inventoryalerttype) for all possible values.
   */
  public enum InventoryAlertTypeEnum {
    NONE("NONE"),
    
    LOW_QUANTITY("LOW_QUANTITY");

    private String value;

    InventoryAlertTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InventoryAlertTypeEnum fromValue(String text) {
      for (InventoryAlertTypeEnum b : InventoryAlertTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("inventory_alert_type")
  private InventoryAlertTypeEnum inventoryAlertType = null;

  @JsonProperty("inventory_alert_threshold")
  private Long inventoryAlertThreshold = null;

  @JsonProperty("user_data")
  private String userData = null;

  @JsonProperty("service_duration")
  private Long serviceDuration = null;

  public CatalogItemVariation itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The ID of the [CatalogItem](#type-catalogitem) associated with this item variation. Searchable.
   * @return itemId
  **/
  @ApiModelProperty(value = "The ID of the [CatalogItem](#type-catalogitem) associated with this item variation. Searchable.")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogItemVariation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The item variation's name. Searchable.
   * @return name
  **/
  @ApiModelProperty(value = "The item variation's name. Searchable.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogItemVariation sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The item variation's SKU, if any. Searchable.
   * @return sku
  **/
  @ApiModelProperty(value = "The item variation's SKU, if any. Searchable.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public CatalogItemVariation upc(String upc) {
    this.upc = upc;
    return this;
  }

   /**
   * The item variation's UPC, if any. Searchable.
   * @return upc
  **/
  @ApiModelProperty(value = "The item variation's UPC, if any. Searchable.")
  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

  public CatalogItemVariation pricingType(PricingTypeEnum pricingType) {
    this.pricingType = pricingType;
    return this;
  }

   /**
   * Indicates whether the item variation's price is fixed or determined at the time of sale. See [CatalogPricingType](#type-catalogpricingtype) for all possible values.
   * @return pricingType
  **/
  @ApiModelProperty(value = "Indicates whether the item variation's price is fixed or determined at the time of sale. See [CatalogPricingType](#type-catalogpricingtype) for all possible values.")
  public PricingTypeEnum getPricingType() {
    return pricingType;
  }

  public void setPricingType(PricingTypeEnum pricingType) {
    this.pricingType = pricingType;
  }

  public CatalogItemVariation priceMoney(Money priceMoney) {
    this.priceMoney = priceMoney;
    return this;
  }

   /**
   * The item variation's price, if fixed pricing is used.
   * @return priceMoney
  **/
  @ApiModelProperty(value = "The item variation's price, if fixed pricing is used.")
  public Money getPriceMoney() {
    return priceMoney;
  }

  public void setPriceMoney(Money priceMoney) {
    this.priceMoney = priceMoney;
  }

  public CatalogItemVariation locationOverrides(List<ItemVariationLocationOverrides> locationOverrides) {
    this.locationOverrides = locationOverrides;
    return this;
  }

  public CatalogItemVariation addLocationOverridesItem(ItemVariationLocationOverrides locationOverridesItem) {
    this.locationOverrides.add(locationOverridesItem);
    return this;
  }

   /**
   * Per-location price and inventory overrides.
   * @return locationOverrides
  **/
  @ApiModelProperty(value = "Per-location price and inventory overrides.")
  public List<ItemVariationLocationOverrides> getLocationOverrides() {
    return locationOverrides;
  }

  public void setLocationOverrides(List<ItemVariationLocationOverrides> locationOverrides) {
    this.locationOverrides = locationOverrides;
  }

  public CatalogItemVariation trackInventory(Boolean trackInventory) {
    this.trackInventory = trackInventory;
    return this;
  }

   /**
   * If `true`, inventory tracking is active for the variation.
   * @return trackInventory
  **/
  @ApiModelProperty(value = "If `true`, inventory tracking is active for the variation.")
  public Boolean getTrackInventory() {
    return trackInventory;
  }

  public void setTrackInventory(Boolean trackInventory) {
    this.trackInventory = trackInventory;
  }

  public CatalogItemVariation inventoryAlertType(InventoryAlertTypeEnum inventoryAlertType) {
    this.inventoryAlertType = inventoryAlertType;
    return this;
  }

   /**
   * Indicates whether the item variation displays an alert when its inventory quantity is less than or equal to its `inventory_alert_threshold`. See [InventoryAlertType](#type-inventoryalerttype) for all possible values.
   * @return inventoryAlertType
  **/
  @ApiModelProperty(value = "Indicates whether the item variation displays an alert when its inventory quantity is less than or equal to its `inventory_alert_threshold`. See [InventoryAlertType](#type-inventoryalerttype) for all possible values.")
  public InventoryAlertTypeEnum getInventoryAlertType() {
    return inventoryAlertType;
  }

  public void setInventoryAlertType(InventoryAlertTypeEnum inventoryAlertType) {
    this.inventoryAlertType = inventoryAlertType;
  }

  public CatalogItemVariation inventoryAlertThreshold(Long inventoryAlertThreshold) {
    this.inventoryAlertThreshold = inventoryAlertThreshold;
    return this;
  }

   /**
   * If the inventory quantity for the variation is less than or equal to this value and `inventory_alert_type` is `LOW_QUANTITY`, the variation displays an alert in the merchant dashboard.  This value is always an integer.
   * @return inventoryAlertThreshold
  **/
  @ApiModelProperty(value = "If the inventory quantity for the variation is less than or equal to this value and `inventory_alert_type` is `LOW_QUANTITY`, the variation displays an alert in the merchant dashboard.  This value is always an integer.")
  public Long getInventoryAlertThreshold() {
    return inventoryAlertThreshold;
  }

  public void setInventoryAlertThreshold(Long inventoryAlertThreshold) {
    this.inventoryAlertThreshold = inventoryAlertThreshold;
  }

  public CatalogItemVariation userData(String userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Arbitrary user metadata to associate with the item variation. Cannot exceed 255 characters. Searchable.
   * @return userData
  **/
  @ApiModelProperty(value = "Arbitrary user metadata to associate with the item variation. Cannot exceed 255 characters. Searchable.")
  public String getUserData() {
    return userData;
  }

  public void setUserData(String userData) {
    this.userData = userData;
  }

  public CatalogItemVariation serviceDuration(Long serviceDuration) {
    this.serviceDuration = serviceDuration;
    return this;
  }

   /**
   * If the [CatalogItem](#type-catalogitem) that owns this item variation is of type `APPOINTMENTS_SERVICE`, then this is the duration of the service in milliseconds. For example, a 30 minute appointment would have the value `1800000`, which is equal to 30 (minutes) * 60 (seconds per minute) * 1000 (milliseconds per second).
   * @return serviceDuration
  **/
  @ApiModelProperty(value = "If the [CatalogItem](#type-catalogitem) that owns this item variation is of type `APPOINTMENTS_SERVICE`, then this is the duration of the service in milliseconds. For example, a 30 minute appointment would have the value `1800000`, which is equal to 30 (minutes) * 60 (seconds per minute) * 1000 (milliseconds per second).")
  public Long getServiceDuration() {
    return serviceDuration;
  }

  public void setServiceDuration(Long serviceDuration) {
    this.serviceDuration = serviceDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogItemVariation catalogItemVariation = (CatalogItemVariation) o;
    return Objects.equals(this.itemId, catalogItemVariation.itemId) &&
        Objects.equals(this.name, catalogItemVariation.name) &&
        Objects.equals(this.sku, catalogItemVariation.sku) &&
        Objects.equals(this.upc, catalogItemVariation.upc) &&
        Objects.equals(this.pricingType, catalogItemVariation.pricingType) &&
        Objects.equals(this.priceMoney, catalogItemVariation.priceMoney) &&
        Objects.equals(this.locationOverrides, catalogItemVariation.locationOverrides) &&
        Objects.equals(this.trackInventory, catalogItemVariation.trackInventory) &&
        Objects.equals(this.inventoryAlertType, catalogItemVariation.inventoryAlertType) &&
        Objects.equals(this.inventoryAlertThreshold, catalogItemVariation.inventoryAlertThreshold) &&
        Objects.equals(this.userData, catalogItemVariation.userData) &&
        Objects.equals(this.serviceDuration, catalogItemVariation.serviceDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, name, sku, upc, pricingType, priceMoney, locationOverrides, trackInventory, inventoryAlertType, inventoryAlertThreshold, userData, serviceDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItemVariation {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    priceMoney: ").append(toIndentedString(priceMoney)).append("\n");
    sb.append("    locationOverrides: ").append(toIndentedString(locationOverrides)).append("\n");
    sb.append("    trackInventory: ").append(toIndentedString(trackInventory)).append("\n");
    sb.append("    inventoryAlertType: ").append(toIndentedString(inventoryAlertType)).append("\n");
    sb.append("    inventoryAlertThreshold: ").append(toIndentedString(inventoryAlertThreshold)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    serviceDuration: ").append(toIndentedString(serviceDuration)).append("\n");
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


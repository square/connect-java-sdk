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
 * 
 */
@ApiModel(description = "")

public class CatalogModifierOverride {
  @JsonProperty("modifier_id")
  private String modifierId = null;

  @JsonProperty("on_by_default")
  private Boolean onByDefault = null;

  public CatalogModifierOverride modifierId(String modifierId) {
    this.modifierId = modifierId;
    return this;
  }

   /**
   * The ID of the `CatalogModifier` whose default behavior is being overridden.
   * @return modifierId
  **/
  @ApiModelProperty(required = true, value = "The ID of the `CatalogModifier` whose default behavior is being overridden.")
  public String getModifierId() {
    return modifierId;
  }

  public void setModifierId(String modifierId) {
    this.modifierId = modifierId;
  }

  public CatalogModifierOverride onByDefault(Boolean onByDefault) {
    this.onByDefault = onByDefault;
    return this;
  }

   /**
   * If `true`, this `CatalogModifier](#type-catalogmodifier) should be selected by default for this [CatalogItem`.
   * @return onByDefault
  **/
  @ApiModelProperty(value = "If `true`, this `CatalogModifier](#type-catalogmodifier) should be selected by default for this [CatalogItem`.")
  public Boolean getOnByDefault() {
    return onByDefault;
  }

  public void setOnByDefault(Boolean onByDefault) {
    this.onByDefault = onByDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogModifierOverride catalogModifierOverride = (CatalogModifierOverride) o;
    return Objects.equals(this.modifierId, catalogModifierOverride.modifierId) &&
        Objects.equals(this.onByDefault, catalogModifierOverride.onByDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifierId, onByDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogModifierOverride {\n");
    
    sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
    sb.append("    onByDefault: ").append(toIndentedString(onByDefault)).append("\n");
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


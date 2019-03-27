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
import com.squareup.connect.models.CatalogObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A modifier list in the Catalog object model. A [CatalogModifierList](#type-catalogmodifierlist) contains [Modifier](#type-catalogmodifier)s that can be applied to a [CatalogItem](#type-catalogitem) at the time of sale.  For example, a modifier list \&quot;Condiments\&quot; that would apply to a \&quot;Hot Dog\&quot; [CatalogItem](#type-catalogitem) might contain [CatalogModifier](#type-catalogmodifier)s \&quot;Ketchup\&quot;, \&quot;Mustard\&quot;, and \&quot;Relish\&quot;. The &#x60;selection_type&#x60; field specifies whether or not multiple selections from the modifier list are allowed.
 */
@ApiModel(description = "A modifier list in the Catalog object model. A [CatalogModifierList](#type-catalogmodifierlist) contains [Modifier](#type-catalogmodifier)s that can be applied to a [CatalogItem](#type-catalogitem) at the time of sale.  For example, a modifier list \"Condiments\" that would apply to a \"Hot Dog\" [CatalogItem](#type-catalogitem) might contain [CatalogModifier](#type-catalogmodifier)s \"Ketchup\", \"Mustard\", and \"Relish\". The `selection_type` field specifies whether or not multiple selections from the modifier list are allowed.")

public class CatalogModifierList {
  @JsonProperty("name")
  private String name = null;

  /**
   * Indicates whether multiple options from the [CatalogModifierList](#type-catalogmodifierlist) can be applied to a single [CatalogItem](#type-catalogitem). See [CatalogModifierListSelectionType](#type-catalogmodifierlistselectiontype) for possible values
   */
  public enum SelectionTypeEnum {
    SINGLE("SINGLE"),
    
    MULTIPLE("MULTIPLE");

    private String value;

    SelectionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SelectionTypeEnum fromValue(String text) {
      for (SelectionTypeEnum b : SelectionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("selection_type")
  private SelectionTypeEnum selectionType = null;

  @JsonProperty("modifiers")
  private List<CatalogObject> modifiers = new ArrayList<CatalogObject>();

  public CatalogModifierList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The [CatalogModifierList](#type-catalogmodifierlist)'s name. Searchable. This field has max length of 255 Unicode code points.
   * @return name
  **/
  @ApiModelProperty(value = "The [CatalogModifierList](#type-catalogmodifierlist)'s name. Searchable. This field has max length of 255 Unicode code points.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogModifierList selectionType(SelectionTypeEnum selectionType) {
    this.selectionType = selectionType;
    return this;
  }

   /**
   * Indicates whether multiple options from the [CatalogModifierList](#type-catalogmodifierlist) can be applied to a single [CatalogItem](#type-catalogitem). See [CatalogModifierListSelectionType](#type-catalogmodifierlistselectiontype) for possible values
   * @return selectionType
  **/
  @ApiModelProperty(value = "Indicates whether multiple options from the [CatalogModifierList](#type-catalogmodifierlist) can be applied to a single [CatalogItem](#type-catalogitem). See [CatalogModifierListSelectionType](#type-catalogmodifierlistselectiontype) for possible values")
  public SelectionTypeEnum getSelectionType() {
    return selectionType;
  }

  public void setSelectionType(SelectionTypeEnum selectionType) {
    this.selectionType = selectionType;
  }

  public CatalogModifierList modifiers(List<CatalogObject> modifiers) {
    this.modifiers = modifiers;
    return this;
  }

  public CatalogModifierList addModifiersItem(CatalogObject modifiersItem) {
    this.modifiers.add(modifiersItem);
    return this;
  }

   /**
   * The options included in the [CatalogModifierList](#type-catalogmodifierlist). You must include at least one [CatalogModifier](#type-catalogmodifier). Each [CatalogObject](#type-catalogobject) must have type `MODIFIER` and contain [CatalogModifier](#type-catalogmodifier) data.
   * @return modifiers
  **/
  @ApiModelProperty(value = "The options included in the [CatalogModifierList](#type-catalogmodifierlist). You must include at least one [CatalogModifier](#type-catalogmodifier). Each [CatalogObject](#type-catalogobject) must have type `MODIFIER` and contain [CatalogModifier](#type-catalogmodifier) data.")
  public List<CatalogObject> getModifiers() {
    return modifiers;
  }

  public void setModifiers(List<CatalogObject> modifiers) {
    this.modifiers = modifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogModifierList catalogModifierList = (CatalogModifierList) o;
    return Objects.equals(this.name, catalogModifierList.name) &&
        Objects.equals(this.selectionType, catalogModifierList.selectionType) &&
        Objects.equals(this.modifiers, catalogModifierList.modifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, selectionType, modifiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogModifierList {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selectionType: ").append(toIndentedString(selectionType)).append("\n");
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
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


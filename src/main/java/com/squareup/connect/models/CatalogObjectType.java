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
import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Possible kinds of [CatalogObject](#type-catalogobject)s returned from the Catalog, each containing type-specific properties in the `*_data` field corresponding to the object type.
 */
public enum CatalogObjectType {
  
  ITEM("ITEM"),
  
  IMAGE("IMAGE"),
  
  CATEGORY("CATEGORY"),
  
  ITEM_VARIATION("ITEM_VARIATION"),
  
  TAX("TAX"),
  
  DISCOUNT("DISCOUNT"),
  
  MODIFIER_LIST("MODIFIER_LIST"),
  
  MODIFIER("MODIFIER");

  private String value;

  CatalogObjectType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogObjectType fromValue(String text) {
    for (CatalogObjectType b : CatalogObjectType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


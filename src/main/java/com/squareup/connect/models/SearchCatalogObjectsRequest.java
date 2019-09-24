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
import com.squareup.connect.models.CatalogQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")

public class SearchCatalogObjectsRequest {
  @JsonProperty("cursor")
  private String cursor = null;

  @JsonProperty("object_types")
  private List<String> objectTypes = new ArrayList<String>();

  @JsonProperty("include_deleted_objects")
  private Boolean includeDeletedObjects = null;

  @JsonProperty("include_related_objects")
  private Boolean includeRelatedObjects = null;

  @JsonProperty("begin_time")
  private String beginTime = null;

  @JsonProperty("query")
  private CatalogQuery query = null;

  @JsonProperty("limit")
  private Integer limit = null;

  public SearchCatalogObjectsRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * The pagination cursor returned in the previous response. Leave unset for an initial request. See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "The pagination cursor returned in the previous response. Leave unset for an initial request. See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public SearchCatalogObjectsRequest objectTypes(List<String> objectTypes) {
    this.objectTypes = objectTypes;
    return this;
  }

  public SearchCatalogObjectsRequest addObjectTypesItem(String objectTypesItem) {
    this.objectTypes.add(objectTypesItem);
    return this;
  }

   /**
   * The desired set of object types to appear in the search results. The legal values are taken from the `CatalogObjectType` enumeration, namely `\"ITEM\"`, `\"ITEM_VARIATION\"`, `\"CATEGORY\"`, `\"DISCOUNT\"`, `\"TAX\"`, `\"MODIFIER\"`, or `\"MODIFIER_LIST\"`. See [CatalogObjectType](#type-catalogobjecttype) for possible values
   * @return objectTypes
  **/
  @ApiModelProperty(value = "The desired set of object types to appear in the search results. The legal values are taken from the `CatalogObjectType` enumeration, namely `\"ITEM\"`, `\"ITEM_VARIATION\"`, `\"CATEGORY\"`, `\"DISCOUNT\"`, `\"TAX\"`, `\"MODIFIER\"`, or `\"MODIFIER_LIST\"`. See [CatalogObjectType](#type-catalogobjecttype) for possible values")
  public List<String> getObjectTypes() {
    return objectTypes;
  }

  public void setObjectTypes(List<String> objectTypes) {
    this.objectTypes = objectTypes;
  }

  public SearchCatalogObjectsRequest includeDeletedObjects(Boolean includeDeletedObjects) {
    this.includeDeletedObjects = includeDeletedObjects;
    return this;
  }

   /**
   * If `true`, deleted objects will be included in the results. Deleted objects will have their `is_deleted` field set to `true`.
   * @return includeDeletedObjects
  **/
  @ApiModelProperty(value = "If `true`, deleted objects will be included in the results. Deleted objects will have their `is_deleted` field set to `true`.")
  public Boolean getIncludeDeletedObjects() {
    return includeDeletedObjects;
  }

  public void setIncludeDeletedObjects(Boolean includeDeletedObjects) {
    this.includeDeletedObjects = includeDeletedObjects;
  }

  public SearchCatalogObjectsRequest includeRelatedObjects(Boolean includeRelatedObjects) {
    this.includeRelatedObjects = includeRelatedObjects;
    return this;
  }

   /**
   * If `true`, the response will include additional objects that are related to the requested object, as follows:  If a `CatalogItem` is returned in the object field of the response, its associated `CatalogCategory](#type-catalogcategory), [CatalogTax`es, `CatalogImage](#type-catalogimage)s and [CatalogModifierList`s will be included in the `related_objects` field of the response.  If a `CatalogItemVariation` is returned in the object field of the response, its parent `CatalogItem` will be included in the `related_objects` field of the response.
   * @return includeRelatedObjects
  **/
  @ApiModelProperty(value = "If `true`, the response will include additional objects that are related to the requested object, as follows:  If a `CatalogItem` is returned in the object field of the response, its associated `CatalogCategory](#type-catalogcategory), [CatalogTax`es, `CatalogImage](#type-catalogimage)s and [CatalogModifierList`s will be included in the `related_objects` field of the response.  If a `CatalogItemVariation` is returned in the object field of the response, its parent `CatalogItem` will be included in the `related_objects` field of the response.")
  public Boolean getIncludeRelatedObjects() {
    return includeRelatedObjects;
  }

  public void setIncludeRelatedObjects(Boolean includeRelatedObjects) {
    this.includeRelatedObjects = includeRelatedObjects;
  }

  public SearchCatalogObjectsRequest beginTime(String beginTime) {
    this.beginTime = beginTime;
    return this;
  }

   /**
   * Return objects modified after this [timestamp](#workingwithdates), in RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\". The timestamp is exclusive - objects with a timestamp equal to `begin_time` will not be included in the response.
   * @return beginTime
  **/
  @ApiModelProperty(value = "Return objects modified after this [timestamp](#workingwithdates), in RFC 3339 format, e.g., \"2016-09-04T23:59:33.123Z\". The timestamp is exclusive - objects with a timestamp equal to `begin_time` will not be included in the response.")
  public String getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(String beginTime) {
    this.beginTime = beginTime;
  }

  public SearchCatalogObjectsRequest query(CatalogQuery query) {
    this.query = query;
    return this;
  }

   /**
   * A query to be used to filter or sort the results. If no query is specified, the entire catalog will be returned.
   * @return query
  **/
  @ApiModelProperty(value = "A query to be used to filter or sort the results. If no query is specified, the entire catalog will be returned.")
  public CatalogQuery getQuery() {
    return query;
  }

  public void setQuery(CatalogQuery query) {
    this.query = query;
  }

  public SearchCatalogObjectsRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * A limit on the number of results to be returned in a single page. The limit is advisory - the implementation may return more or fewer results. If the supplied limit is negative, zero, or is higher than the maximum limit of 1,000, it will be ignored.
   * @return limit
  **/
  @ApiModelProperty(value = "A limit on the number of results to be returned in a single page. The limit is advisory - the implementation may return more or fewer results. If the supplied limit is negative, zero, or is higher than the maximum limit of 1,000, it will be ignored.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCatalogObjectsRequest searchCatalogObjectsRequest = (SearchCatalogObjectsRequest) o;
    return Objects.equals(this.cursor, searchCatalogObjectsRequest.cursor) &&
        Objects.equals(this.objectTypes, searchCatalogObjectsRequest.objectTypes) &&
        Objects.equals(this.includeDeletedObjects, searchCatalogObjectsRequest.includeDeletedObjects) &&
        Objects.equals(this.includeRelatedObjects, searchCatalogObjectsRequest.includeRelatedObjects) &&
        Objects.equals(this.beginTime, searchCatalogObjectsRequest.beginTime) &&
        Objects.equals(this.query, searchCatalogObjectsRequest.query) &&
        Objects.equals(this.limit, searchCatalogObjectsRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, objectTypes, includeDeletedObjects, includeRelatedObjects, beginTime, query, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCatalogObjectsRequest {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    objectTypes: ").append(toIndentedString(objectTypes)).append("\n");
    sb.append("    includeDeletedObjects: ").append(toIndentedString(includeDeletedObjects)).append("\n");
    sb.append("    includeRelatedObjects: ").append(toIndentedString(includeRelatedObjects)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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


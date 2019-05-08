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
import com.squareup.connect.models.SearchOrdersCustomerFilter;
import com.squareup.connect.models.SearchOrdersDateTimeFilter;
import com.squareup.connect.models.SearchOrdersFulfillmentFilter;
import com.squareup.connect.models.SearchOrdersSourceFilter;
import com.squareup.connect.models.SearchOrdersStateFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Filter options to use for a query. Multiple filters will be ANDed together.
 */
@ApiModel(description = "Filter options to use for a query. Multiple filters will be ANDed together.")

public class SearchOrdersFilter {
  @JsonProperty("state_filter")
  private SearchOrdersStateFilter stateFilter = null;

  @JsonProperty("date_time_filter")
  private SearchOrdersDateTimeFilter dateTimeFilter = null;

  @JsonProperty("fulfillment_filter")
  private SearchOrdersFulfillmentFilter fulfillmentFilter = null;

  @JsonProperty("source_filter")
  private SearchOrdersSourceFilter sourceFilter = null;

  @JsonProperty("customer_filter")
  private SearchOrdersCustomerFilter customerFilter = null;

  public SearchOrdersFilter stateFilter(SearchOrdersStateFilter stateFilter) {
    this.stateFilter = stateFilter;
    return this;
  }

   /**
   * Filter by [`OrderState`](#type-orderstate).
   * @return stateFilter
  **/
  @ApiModelProperty(value = "Filter by [`OrderState`](#type-orderstate).")
  public SearchOrdersStateFilter getStateFilter() {
    return stateFilter;
  }

  public void setStateFilter(SearchOrdersStateFilter stateFilter) {
    this.stateFilter = stateFilter;
  }

  public SearchOrdersFilter dateTimeFilter(SearchOrdersDateTimeFilter dateTimeFilter) {
    this.dateTimeFilter = dateTimeFilter;
    return this;
  }

   /**
   * Filter for results within a time range.
   * @return dateTimeFilter
  **/
  @ApiModelProperty(value = "Filter for results within a time range.")
  public SearchOrdersDateTimeFilter getDateTimeFilter() {
    return dateTimeFilter;
  }

  public void setDateTimeFilter(SearchOrdersDateTimeFilter dateTimeFilter) {
    this.dateTimeFilter = dateTimeFilter;
  }

  public SearchOrdersFilter fulfillmentFilter(SearchOrdersFulfillmentFilter fulfillmentFilter) {
    this.fulfillmentFilter = fulfillmentFilter;
    return this;
  }

   /**
   * Filter by fulfillment type or state.
   * @return fulfillmentFilter
  **/
  @ApiModelProperty(value = "Filter by fulfillment type or state.")
  public SearchOrdersFulfillmentFilter getFulfillmentFilter() {
    return fulfillmentFilter;
  }

  public void setFulfillmentFilter(SearchOrdersFulfillmentFilter fulfillmentFilter) {
    this.fulfillmentFilter = fulfillmentFilter;
  }

  public SearchOrdersFilter sourceFilter(SearchOrdersSourceFilter sourceFilter) {
    this.sourceFilter = sourceFilter;
    return this;
  }

   /**
   * Filter by source of order.
   * @return sourceFilter
  **/
  @ApiModelProperty(value = "Filter by source of order.")
  public SearchOrdersSourceFilter getSourceFilter() {
    return sourceFilter;
  }

  public void setSourceFilter(SearchOrdersSourceFilter sourceFilter) {
    this.sourceFilter = sourceFilter;
  }

  public SearchOrdersFilter customerFilter(SearchOrdersCustomerFilter customerFilter) {
    this.customerFilter = customerFilter;
    return this;
  }

   /**
   * Filter by customers associated with the order.
   * @return customerFilter
  **/
  @ApiModelProperty(value = "Filter by customers associated with the order.")
  public SearchOrdersCustomerFilter getCustomerFilter() {
    return customerFilter;
  }

  public void setCustomerFilter(SearchOrdersCustomerFilter customerFilter) {
    this.customerFilter = customerFilter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchOrdersFilter searchOrdersFilter = (SearchOrdersFilter) o;
    return Objects.equals(this.stateFilter, searchOrdersFilter.stateFilter) &&
        Objects.equals(this.dateTimeFilter, searchOrdersFilter.dateTimeFilter) &&
        Objects.equals(this.fulfillmentFilter, searchOrdersFilter.fulfillmentFilter) &&
        Objects.equals(this.sourceFilter, searchOrdersFilter.sourceFilter) &&
        Objects.equals(this.customerFilter, searchOrdersFilter.customerFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateFilter, dateTimeFilter, fulfillmentFilter, sourceFilter, customerFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOrdersFilter {\n");
    
    sb.append("    stateFilter: ").append(toIndentedString(stateFilter)).append("\n");
    sb.append("    dateTimeFilter: ").append(toIndentedString(dateTimeFilter)).append("\n");
    sb.append("    fulfillmentFilter: ").append(toIndentedString(fulfillmentFilter)).append("\n");
    sb.append("    sourceFilter: ").append(toIndentedString(sourceFilter)).append("\n");
    sb.append("    customerFilter: ").append(toIndentedString(customerFilter)).append("\n");
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


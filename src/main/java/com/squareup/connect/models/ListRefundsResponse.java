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
import com.squareup.connect.models.Error;
import com.squareup.connect.models.Refund;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that are included in the response body of a request to the [ListRefunds](#endpoint-listrefunds) endpoint.  One of &#x60;errors&#x60; or &#x60;refunds&#x60; is present in a given response (never both).
 */
@ApiModel(description = "Defines the fields that are included in the response body of a request to the [ListRefunds](#endpoint-listrefunds) endpoint.  One of `errors` or `refunds` is present in a given response (never both).")

public class ListRefundsResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("refunds")
  private List<Refund> refunds = new ArrayList<Refund>();

  @JsonProperty("cursor")
  private String cursor = null;

  public ListRefundsResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ListRefundsResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occurred during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Any errors that occurred during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public ListRefundsResponse refunds(List<Refund> refunds) {
    this.refunds = refunds;
    return this;
  }

  public ListRefundsResponse addRefundsItem(Refund refundsItem) {
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * An array of refunds that match your query.
   * @return refunds
  **/
  @ApiModelProperty(value = "An array of refunds that match your query.")
  public List<Refund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<Refund> refunds) {
    this.refunds = refunds;
  }

  public ListRefundsResponse cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * A pagination cursor for retrieving the next set of results, if any remain. Provide this value as the `cursor` parameter in a subsequent request to this endpoint.  See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "A pagination cursor for retrieving the next set of results, if any remain. Provide this value as the `cursor` parameter in a subsequent request to this endpoint.  See [Pagination](https://developer.squareup.com/docs/basics/api101/pagination) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRefundsResponse listRefundsResponse = (ListRefundsResponse) o;
    return Objects.equals(this.errors, listRefundsResponse.errors) &&
        Objects.equals(this.refunds, listRefundsResponse.refunds) &&
        Objects.equals(this.cursor, listRefundsResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, refunds, cursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRefundsResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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


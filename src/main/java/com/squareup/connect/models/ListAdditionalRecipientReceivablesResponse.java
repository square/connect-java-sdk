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
import com.squareup.connect.models.AdditionalRecipientReceivable;
import com.squareup.connect.models.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that are included in the response body of a request to the ListAdditionalRecipientReceivables endpoint.  One of &#x60;errors&#x60; or &#x60;additional_recipient_receivables&#x60; is present in a given response (never both).
 */
@ApiModel(description = "Defines the fields that are included in the response body of a request to the ListAdditionalRecipientReceivables endpoint.  One of `errors` or `additional_recipient_receivables` is present in a given response (never both).")

public class ListAdditionalRecipientReceivablesResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("receivables")
  private List<AdditionalRecipientReceivable> receivables = new ArrayList<AdditionalRecipientReceivable>();

  @JsonProperty("cursor")
  private String cursor = null;

  public ListAdditionalRecipientReceivablesResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ListAdditionalRecipientReceivablesResponse addErrorsItem(Error errorsItem) {
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

  public ListAdditionalRecipientReceivablesResponse receivables(List<AdditionalRecipientReceivable> receivables) {
    this.receivables = receivables;
    return this;
  }

  public ListAdditionalRecipientReceivablesResponse addReceivablesItem(AdditionalRecipientReceivable receivablesItem) {
    this.receivables.add(receivablesItem);
    return this;
  }

   /**
   * An array of AdditionalRecipientReceivables that match your query.
   * @return receivables
  **/
  @ApiModelProperty(value = "An array of AdditionalRecipientReceivables that match your query.")
  public List<AdditionalRecipientReceivable> getReceivables() {
    return receivables;
  }

  public void setReceivables(List<AdditionalRecipientReceivable> receivables) {
    this.receivables = receivables;
  }

  public ListAdditionalRecipientReceivablesResponse cursor(String cursor) {
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
    ListAdditionalRecipientReceivablesResponse listAdditionalRecipientReceivablesResponse = (ListAdditionalRecipientReceivablesResponse) o;
    return Objects.equals(this.errors, listAdditionalRecipientReceivablesResponse.errors) &&
        Objects.equals(this.receivables, listAdditionalRecipientReceivablesResponse.receivables) &&
        Objects.equals(this.cursor, listAdditionalRecipientReceivablesResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, receivables, cursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAdditionalRecipientReceivablesResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    receivables: ").append(toIndentedString(receivables)).append("\n");
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


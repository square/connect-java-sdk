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
 * Defines the fields that are included in the response body of a request to the [CreateRefund](#endpoint-createrefund) endpoint.  One of &#x60;errors&#x60; or &#x60;refund&#x60; is present in a given response (never both).
 */
@ApiModel(description = "Defines the fields that are included in the response body of a request to the [CreateRefund](#endpoint-createrefund) endpoint.  One of `errors` or `refund` is present in a given response (never both).")

public class CreateRefundResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("refund")
  private Refund refund = null;

  public CreateRefundResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CreateRefundResponse addErrorsItem(Error errorsItem) {
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

  public CreateRefundResponse refund(Refund refund) {
    this.refund = refund;
    return this;
  }

   /**
   * The created refund.
   * @return refund
  **/
  @ApiModelProperty(value = "The created refund.")
  public Refund getRefund() {
    return refund;
  }

  public void setRefund(Refund refund) {
    this.refund = refund;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRefundResponse createRefundResponse = (CreateRefundResponse) o;
    return Objects.equals(this.errors, createRefundResponse.errors) &&
        Objects.equals(this.refund, createRefundResponse.refund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, refund);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRefundResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
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


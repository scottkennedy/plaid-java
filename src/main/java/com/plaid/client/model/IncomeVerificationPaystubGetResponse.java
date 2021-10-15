/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.39.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.Error;
import com.plaid.client.model.Paystub;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IncomeVerificationPaystubGetResponse defines the response schema for &#x60;/income/verification/paystub/get&#x60;.
 */
@ApiModel(description = "IncomeVerificationPaystubGetResponse defines the response schema for `/income/verification/paystub/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-15T19:47:39.714Z[GMT]")
public class IncomeVerificationPaystubGetResponse {
  public static final String SERIALIZED_NAME_PAYSTUB = "paystub";
  @SerializedName(SERIALIZED_NAME_PAYSTUB)
  private Paystub paystub;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public IncomeVerificationPaystubGetResponse paystub(Paystub paystub) {
    
    this.paystub = paystub;
    return this;
  }

   /**
   * Get paystub
   * @return paystub
  **/
  @ApiModelProperty(required = true, value = "")

  public Paystub getPaystub() {
    return paystub;
  }


  public void setPaystub(Paystub paystub) {
    this.paystub = paystub;
  }


  public IncomeVerificationPaystubGetResponse error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  public IncomeVerificationPaystubGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationPaystubGetResponse incomeVerificationPaystubGetResponse = (IncomeVerificationPaystubGetResponse) o;
    return Objects.equals(this.paystub, incomeVerificationPaystubGetResponse.paystub) &&
        Objects.equals(this.error, incomeVerificationPaystubGetResponse.error) &&
        Objects.equals(this.requestId, incomeVerificationPaystubGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paystub, error, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationPaystubGetResponse {\n");
    sb.append("    paystub: ").append(toIndentedString(paystub)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


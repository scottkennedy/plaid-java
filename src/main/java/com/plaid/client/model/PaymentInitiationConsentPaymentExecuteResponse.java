/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.0
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
import com.plaid.client.model.PaymentInitiationPaymentStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentInitiationConsentPaymentExecuteResponse defines the response schema for &#x60;/payment_initiation/consent/payment/execute&#x60;
 */
@ApiModel(description = "PaymentInitiationConsentPaymentExecuteResponse defines the response schema for `/payment_initiation/consent/payment/execute`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T19:49:08.269481Z[Etc/UTC]")
public class PaymentInitiationConsentPaymentExecuteResponse {
  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PaymentInitiationPaymentStatus status;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PaymentInitiationConsentPaymentExecuteResponse paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * A unique ID identifying the payment
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "A unique ID identifying the payment")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public PaymentInitiationConsentPaymentExecuteResponse status(PaymentInitiationPaymentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationPaymentStatus getStatus() {
    return status;
  }


  public void setStatus(PaymentInitiationPaymentStatus status) {
    this.status = status;
  }


  public PaymentInitiationConsentPaymentExecuteResponse requestId(String requestId) {
    
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
    PaymentInitiationConsentPaymentExecuteResponse paymentInitiationConsentPaymentExecuteResponse = (PaymentInitiationConsentPaymentExecuteResponse) o;
    return Objects.equals(this.paymentId, paymentInitiationConsentPaymentExecuteResponse.paymentId) &&
        Objects.equals(this.status, paymentInitiationConsentPaymentExecuteResponse.status) &&
        Objects.equals(this.requestId, paymentInitiationConsentPaymentExecuteResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, status, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationConsentPaymentExecuteResponse {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


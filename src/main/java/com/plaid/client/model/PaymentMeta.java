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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Transaction information specific to inter-bank transfers. If the transaction was not an inter-bank transfer, all fields will be &#x60;null&#x60;.  If the &#x60;transactions&#x60; object was returned by a Transactions endpoint such as &#x60;/transactions/sync&#x60; or &#x60;/transactions/get&#x60;, the &#x60;payment_meta&#x60; key will always appear, but no data elements are guaranteed. If the &#x60;transactions&#x60; object was returned by an Assets endpoint such as &#x60;/asset_report/get/&#x60; or &#x60;/asset_report/pdf/get&#x60;, this field will only appear in an Asset Report with Insights.
 */
@ApiModel(description = "Transaction information specific to inter-bank transfers. If the transaction was not an inter-bank transfer, all fields will be `null`.  If the `transactions` object was returned by a Transactions endpoint such as `/transactions/sync` or `/transactions/get`, the `payment_meta` key will always appear, but no data elements are guaranteed. If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class PaymentMeta {
  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "reference_number";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_PPD_ID = "ppd_id";
  @SerializedName(SERIALIZED_NAME_PPD_ID)
  private String ppdId;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private String payee;

  public static final String SERIALIZED_NAME_BY_ORDER_OF = "by_order_of";
  @SerializedName(SERIALIZED_NAME_BY_ORDER_OF)
  private String byOrderOf;

  public static final String SERIALIZED_NAME_PAYER = "payer";
  @SerializedName(SERIALIZED_NAME_PAYER)
  private String payer;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_PAYMENT_PROCESSOR = "payment_processor";
  @SerializedName(SERIALIZED_NAME_PAYMENT_PROCESSOR)
  private String paymentProcessor;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;


  public PaymentMeta referenceNumber(String referenceNumber) {
    
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * The transaction reference number supplied by the financial institution.
   * @return referenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The transaction reference number supplied by the financial institution.")

  public String getReferenceNumber() {
    return referenceNumber;
  }


  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public PaymentMeta ppdId(String ppdId) {
    
    this.ppdId = ppdId;
    return this;
  }

   /**
   * The ACH PPD ID for the payer.
   * @return ppdId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ACH PPD ID for the payer.")

  public String getPpdId() {
    return ppdId;
  }


  public void setPpdId(String ppdId) {
    this.ppdId = ppdId;
  }


  public PaymentMeta payee(String payee) {
    
    this.payee = payee;
    return this;
  }

   /**
   * For transfers, the party that is receiving the transaction.
   * @return payee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "For transfers, the party that is receiving the transaction.")

  public String getPayee() {
    return payee;
  }


  public void setPayee(String payee) {
    this.payee = payee;
  }


  public PaymentMeta byOrderOf(String byOrderOf) {
    
    this.byOrderOf = byOrderOf;
    return this;
  }

   /**
   * The party initiating a wire transfer. Will be &#x60;null&#x60; if the transaction is not a wire transfer.
   * @return byOrderOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The party initiating a wire transfer. Will be `null` if the transaction is not a wire transfer.")

  public String getByOrderOf() {
    return byOrderOf;
  }


  public void setByOrderOf(String byOrderOf) {
    this.byOrderOf = byOrderOf;
  }


  public PaymentMeta payer(String payer) {
    
    this.payer = payer;
    return this;
  }

   /**
   * For transfers, the party that is paying the transaction.
   * @return payer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "For transfers, the party that is paying the transaction.")

  public String getPayer() {
    return payer;
  }


  public void setPayer(String payer) {
    this.payer = payer;
  }


  public PaymentMeta paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The type of transfer, e.g. &#39;ACH&#39;
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The type of transfer, e.g. 'ACH'")

  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentMeta paymentProcessor(String paymentProcessor) {
    
    this.paymentProcessor = paymentProcessor;
    return this;
  }

   /**
   * The name of the payment processor
   * @return paymentProcessor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The name of the payment processor")

  public String getPaymentProcessor() {
    return paymentProcessor;
  }


  public void setPaymentProcessor(String paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
  }


  public PaymentMeta reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The payer-supplied description of the transfer.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The payer-supplied description of the transfer.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMeta paymentMeta = (PaymentMeta) o;
    return Objects.equals(this.referenceNumber, paymentMeta.referenceNumber) &&
        Objects.equals(this.ppdId, paymentMeta.ppdId) &&
        Objects.equals(this.payee, paymentMeta.payee) &&
        Objects.equals(this.byOrderOf, paymentMeta.byOrderOf) &&
        Objects.equals(this.payer, paymentMeta.payer) &&
        Objects.equals(this.paymentMethod, paymentMeta.paymentMethod) &&
        Objects.equals(this.paymentProcessor, paymentMeta.paymentProcessor) &&
        Objects.equals(this.reason, paymentMeta.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceNumber, ppdId, payee, byOrderOf, payer, paymentMethod, paymentProcessor, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMeta {\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    ppdId: ").append(toIndentedString(ppdId)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    byOrderOf: ").append(toIndentedString(byOrderOf)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentProcessor: ").append(toIndentedString(paymentProcessor)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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


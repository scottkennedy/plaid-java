/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.2
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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when a new transfer of a recurring transfer is originated.
 */
@ApiModel(description = "Fired when a new transfer of a recurring transfer is originated.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class RecurringNewTransferWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_RECURRING_TRANSFER_ID = "recurring_transfer_id";
  @SerializedName(SERIALIZED_NAME_RECURRING_TRANSFER_ID)
  private String recurringTransferId;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public RecurringNewTransferWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;TRANSFER&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`TRANSFER`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public RecurringNewTransferWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;RECURRING_NEW_TRANSFER&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`RECURRING_NEW_TRANSFER`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public RecurringNewTransferWebhook recurringTransferId(String recurringTransferId) {
    
    this.recurringTransferId = recurringTransferId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a recurring transfer.
   * @return recurringTransferId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a recurring transfer.")

  public String getRecurringTransferId() {
    return recurringTransferId;
  }


  public void setRecurringTransferId(String recurringTransferId) {
    this.recurringTransferId = recurringTransferId;
  }


  public RecurringNewTransferWebhook transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a transfer.
   * @return transferId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a transfer.")

  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public RecurringNewTransferWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringNewTransferWebhook recurringNewTransferWebhook = (RecurringNewTransferWebhook) o;
    return Objects.equals(this.webhookType, recurringNewTransferWebhook.webhookType) &&
        Objects.equals(this.webhookCode, recurringNewTransferWebhook.webhookCode) &&
        Objects.equals(this.recurringTransferId, recurringNewTransferWebhook.recurringTransferId) &&
        Objects.equals(this.transferId, recurringNewTransferWebhook.transferId) &&
        Objects.equals(this.environment, recurringNewTransferWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, recurringTransferId, transferId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringNewTransferWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    recurringTransferId: ").append(toIndentedString(recurringTransferId)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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


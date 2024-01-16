/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.485.0
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
 * This webhook is only sent to [Plaid processor partners](https://plaid.com/docs/auth/partnerships/).  Fired when an Item&#39;s transactions change. This can be due to any event resulting in new changes, such as an initial 30-day transactions fetch upon the initialization of an Item with transactions, the backfill of historical transactions that occurs shortly after, or when changes are populated from a regularly-scheduled transactions update job. It is recommended to listen for the &#x60;SYNC_UPDATES_AVAILABLE&#x60; webhook when using the &#x60;/processor/transactions/sync&#x60; endpoint. Note that when using &#x60;/processor/transactions/sync&#x60; the older webhooks &#x60;INITIAL_UPDATE&#x60;, &#x60;HISTORICAL_UPDATE&#x60;, &#x60;DEFAULT_UPDATE&#x60;, and &#x60;TRANSACTIONS_REMOVED&#x60;, which are intended for use with &#x60;/processor/transactions/get&#x60;, will also continue to be sent in order to maintain backwards compatibility. It is not necessary to listen for and respond to those webhooks when using &#x60;/processor/transactions/sync&#x60;.  After receipt of this webhook, the new changes can be fetched for the Item from &#x60;/processor/transactions/sync&#x60;.  Note that to receive this webhook for an Item, &#x60;/processor/transactions/sync&#x60; must have been called at least once on that Item. This means that, unlike the &#x60;INITIAL_UPDATE&#x60; and &#x60;HISTORICAL_UPDATE&#x60; webhooks, it will not fire immediately upon Item creation. If &#x60;/transactions/sync&#x60; is called on an Item that was *not* initialized with Transactions, the webhook will fire twice: once the first 30 days of transactions data has been fetched, and a second time when all available historical transactions data has been fetched.  This webhook will typically not fire in the Sandbox environment, due to the lack of dynamic transactions data. To test this webhook in Sandbox, call &#x60;/sandbox/item/fire_webhook&#x60;.
 */
@ApiModel(description = "This webhook is only sent to [Plaid processor partners](https://plaid.com/docs/auth/partnerships/).  Fired when an Item's transactions change. This can be due to any event resulting in new changes, such as an initial 30-day transactions fetch upon the initialization of an Item with transactions, the backfill of historical transactions that occurs shortly after, or when changes are populated from a regularly-scheduled transactions update job. It is recommended to listen for the `SYNC_UPDATES_AVAILABLE` webhook when using the `/processor/transactions/sync` endpoint. Note that when using `/processor/transactions/sync` the older webhooks `INITIAL_UPDATE`, `HISTORICAL_UPDATE`, `DEFAULT_UPDATE`, and `TRANSACTIONS_REMOVED`, which are intended for use with `/processor/transactions/get`, will also continue to be sent in order to maintain backwards compatibility. It is not necessary to listen for and respond to those webhooks when using `/processor/transactions/sync`.  After receipt of this webhook, the new changes can be fetched for the Item from `/processor/transactions/sync`.  Note that to receive this webhook for an Item, `/processor/transactions/sync` must have been called at least once on that Item. This means that, unlike the `INITIAL_UPDATE` and `HISTORICAL_UPDATE` webhooks, it will not fire immediately upon Item creation. If `/transactions/sync` is called on an Item that was *not* initialized with Transactions, the webhook will fire twice: once the first 30 days of transactions data has been fetched, and a second time when all available historical transactions data has been fetched.  This webhook will typically not fire in the Sandbox environment, due to the lack of dynamic transactions data. To test this webhook in Sandbox, call `/sandbox/item/fire_webhook`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T22:23:14.698759Z[Etc/UTC]")
public class ProcessorSyncUpdatesAvailableWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_INITIAL_UPDATE_COMPLETE = "initial_update_complete";
  @SerializedName(SERIALIZED_NAME_INITIAL_UPDATE_COMPLETE)
  private Boolean initialUpdateComplete;

  public static final String SERIALIZED_NAME_HISTORICAL_UPDATE_COMPLETE = "historical_update_complete";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_UPDATE_COMPLETE)
  private Boolean historicalUpdateComplete;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public ProcessorSyncUpdatesAvailableWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;TRANSACTIONS&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`TRANSACTIONS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public ProcessorSyncUpdatesAvailableWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;SYNC_UPDATES_AVAILABLE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`SYNC_UPDATES_AVAILABLE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public ProcessorSyncUpdatesAvailableWebhook accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ProcessorSyncUpdatesAvailableWebhook initialUpdateComplete(Boolean initialUpdateComplete) {
    
    this.initialUpdateComplete = initialUpdateComplete;
    return this;
  }

   /**
   * Indicates if initial pull information is available.
   * @return initialUpdateComplete
  **/
  @ApiModelProperty(required = true, value = "Indicates if initial pull information is available.")

  public Boolean getInitialUpdateComplete() {
    return initialUpdateComplete;
  }


  public void setInitialUpdateComplete(Boolean initialUpdateComplete) {
    this.initialUpdateComplete = initialUpdateComplete;
  }


  public ProcessorSyncUpdatesAvailableWebhook historicalUpdateComplete(Boolean historicalUpdateComplete) {
    
    this.historicalUpdateComplete = historicalUpdateComplete;
    return this;
  }

   /**
   * Indicates if historical pull information is available.
   * @return historicalUpdateComplete
  **/
  @ApiModelProperty(required = true, value = "Indicates if historical pull information is available.")

  public Boolean getHistoricalUpdateComplete() {
    return historicalUpdateComplete;
  }


  public void setHistoricalUpdateComplete(Boolean historicalUpdateComplete) {
    this.historicalUpdateComplete = historicalUpdateComplete;
  }


  public ProcessorSyncUpdatesAvailableWebhook environment(WebhookEnvironmentValues environment) {
    
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
    ProcessorSyncUpdatesAvailableWebhook processorSyncUpdatesAvailableWebhook = (ProcessorSyncUpdatesAvailableWebhook) o;
    return Objects.equals(this.webhookType, processorSyncUpdatesAvailableWebhook.webhookType) &&
        Objects.equals(this.webhookCode, processorSyncUpdatesAvailableWebhook.webhookCode) &&
        Objects.equals(this.accountId, processorSyncUpdatesAvailableWebhook.accountId) &&
        Objects.equals(this.initialUpdateComplete, processorSyncUpdatesAvailableWebhook.initialUpdateComplete) &&
        Objects.equals(this.historicalUpdateComplete, processorSyncUpdatesAvailableWebhook.historicalUpdateComplete) &&
        Objects.equals(this.environment, processorSyncUpdatesAvailableWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, accountId, initialUpdateComplete, historicalUpdateComplete, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorSyncUpdatesAvailableWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    initialUpdateComplete: ").append(toIndentedString(initialUpdateComplete)).append("\n");
    sb.append("    historicalUpdateComplete: ").append(toIndentedString(historicalUpdateComplete)).append("\n");
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


/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.196.0
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
import com.plaid.client.model.IncomeVerificationCreateRequestOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IncomeVerificationCreateRequest defines the request schema for &#x60;/income/verification/create&#x60;
 */
@ApiModel(description = "IncomeVerificationCreateRequest defines the request schema for `/income/verification/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T23:20:54.499428Z[Etc/UTC]")
public class IncomeVerificationCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;

  public static final String SERIALIZED_NAME_PRECHECK_ID = "precheck_id";
  @SerializedName(SERIALIZED_NAME_PRECHECK_ID)
  private String precheckId;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private IncomeVerificationCreateRequestOptions options;


  public IncomeVerificationCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public IncomeVerificationCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public IncomeVerificationCreateRequest webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The URL endpoint to which Plaid should send webhooks related to the progress of the income verification process.
   * @return webhook
  **/
  @ApiModelProperty(required = true, value = "The URL endpoint to which Plaid should send webhooks related to the progress of the income verification process.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  public IncomeVerificationCreateRequest precheckId(String precheckId) {
    
    this.precheckId = precheckId;
    return this;
  }

   /**
   * The ID of a precheck created with &#x60;/income/verification/precheck&#x60;. Will be used to improve conversion of the income verification flow.
   * @return precheckId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of a precheck created with `/income/verification/precheck`. Will be used to improve conversion of the income verification flow.")

  public String getPrecheckId() {
    return precheckId;
  }


  public void setPrecheckId(String precheckId) {
    this.precheckId = precheckId;
  }


  public IncomeVerificationCreateRequest options(IncomeVerificationCreateRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeVerificationCreateRequestOptions getOptions() {
    return options;
  }


  public void setOptions(IncomeVerificationCreateRequestOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationCreateRequest incomeVerificationCreateRequest = (IncomeVerificationCreateRequest) o;
    return Objects.equals(this.clientId, incomeVerificationCreateRequest.clientId) &&
        Objects.equals(this.secret, incomeVerificationCreateRequest.secret) &&
        Objects.equals(this.webhook, incomeVerificationCreateRequest.webhook) &&
        Objects.equals(this.precheckId, incomeVerificationCreateRequest.precheckId) &&
        Objects.equals(this.options, incomeVerificationCreateRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, webhook, precheckId, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    precheckId: ").append(toIndentedString(precheckId)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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


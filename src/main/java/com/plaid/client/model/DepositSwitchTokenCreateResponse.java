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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DepositSwitchTokenCreateResponse defines the response schema for &#x60;/deposit_switch/token/create&#x60;
 */
@ApiModel(description = "DepositSwitchTokenCreateResponse defines the response schema for `/deposit_switch/token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-15T19:47:39.714Z[GMT]")
public class DepositSwitchTokenCreateResponse {
  public static final String SERIALIZED_NAME_DEPOSIT_SWITCH_TOKEN = "deposit_switch_token";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_SWITCH_TOKEN)
  private String depositSwitchToken;

  public static final String SERIALIZED_NAME_DEPOSIT_SWITCH_TOKEN_EXPIRATION_TIME = "deposit_switch_token_expiration_time";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_SWITCH_TOKEN_EXPIRATION_TIME)
  private String depositSwitchTokenExpirationTime;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public DepositSwitchTokenCreateResponse depositSwitchToken(String depositSwitchToken) {
    
    this.depositSwitchToken = depositSwitchToken;
    return this;
  }

   /**
   * Deposit switch token, used to initialize Link for the Deposit Switch product
   * @return depositSwitchToken
  **/
  @ApiModelProperty(required = true, value = "Deposit switch token, used to initialize Link for the Deposit Switch product")

  public String getDepositSwitchToken() {
    return depositSwitchToken;
  }


  public void setDepositSwitchToken(String depositSwitchToken) {
    this.depositSwitchToken = depositSwitchToken;
  }


  public DepositSwitchTokenCreateResponse depositSwitchTokenExpirationTime(String depositSwitchTokenExpirationTime) {
    
    this.depositSwitchTokenExpirationTime = depositSwitchTokenExpirationTime;
    return this;
  }

   /**
   * Expiration time of the token, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format
   * @return depositSwitchTokenExpirationTime
  **/
  @ApiModelProperty(required = true, value = "Expiration time of the token, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format")

  public String getDepositSwitchTokenExpirationTime() {
    return depositSwitchTokenExpirationTime;
  }


  public void setDepositSwitchTokenExpirationTime(String depositSwitchTokenExpirationTime) {
    this.depositSwitchTokenExpirationTime = depositSwitchTokenExpirationTime;
  }


  public DepositSwitchTokenCreateResponse requestId(String requestId) {
    
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
    DepositSwitchTokenCreateResponse depositSwitchTokenCreateResponse = (DepositSwitchTokenCreateResponse) o;
    return Objects.equals(this.depositSwitchToken, depositSwitchTokenCreateResponse.depositSwitchToken) &&
        Objects.equals(this.depositSwitchTokenExpirationTime, depositSwitchTokenCreateResponse.depositSwitchTokenExpirationTime) &&
        Objects.equals(this.requestId, depositSwitchTokenCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositSwitchToken, depositSwitchTokenExpirationTime, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSwitchTokenCreateResponse {\n");
    sb.append("    depositSwitchToken: ").append(toIndentedString(depositSwitchToken)).append("\n");
    sb.append("    depositSwitchTokenExpirationTime: ").append(toIndentedString(depositSwitchTokenExpirationTime)).append("\n");
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


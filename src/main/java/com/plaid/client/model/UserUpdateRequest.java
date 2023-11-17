/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.470.1
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
import com.plaid.client.model.ConsumerReportUserIdentity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserUpdateRequest defines the request schema for &#x60;/user/update&#x60;
 */
@ApiModel(description = "UserUpdateRequest defines the request schema for `/user/update`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T20:03:54.421530Z[Etc/UTC]")
public class UserUpdateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_CONSUMER_REPORT_USER_IDENTITY = "consumer_report_user_identity";
  @SerializedName(SERIALIZED_NAME_CONSUMER_REPORT_USER_IDENTITY)
  private ConsumerReportUserIdentity consumerReportUserIdentity;


  public UserUpdateRequest clientId(String clientId) {
    
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


  public UserUpdateRequest secret(String secret) {
    
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


  public UserUpdateRequest userToken(String userToken) {
    
    this.userToken = userToken;
    return this;
  }

   /**
   * The user token associated with the User data is being requested for.
   * @return userToken
  **/
  @ApiModelProperty(required = true, value = "The user token associated with the User data is being requested for.")

  public String getUserToken() {
    return userToken;
  }


  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }


  public UserUpdateRequest consumerReportUserIdentity(ConsumerReportUserIdentity consumerReportUserIdentity) {
    
    this.consumerReportUserIdentity = consumerReportUserIdentity;
    return this;
  }

   /**
   * Get consumerReportUserIdentity
   * @return consumerReportUserIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsumerReportUserIdentity getConsumerReportUserIdentity() {
    return consumerReportUserIdentity;
  }


  public void setConsumerReportUserIdentity(ConsumerReportUserIdentity consumerReportUserIdentity) {
    this.consumerReportUserIdentity = consumerReportUserIdentity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateRequest userUpdateRequest = (UserUpdateRequest) o;
    return Objects.equals(this.clientId, userUpdateRequest.clientId) &&
        Objects.equals(this.secret, userUpdateRequest.secret) &&
        Objects.equals(this.userToken, userUpdateRequest.userToken) &&
        Objects.equals(this.consumerReportUserIdentity, userUpdateRequest.consumerReportUserIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, userToken, consumerReportUserIdentity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    consumerReportUserIdentity: ").append(toIndentedString(consumerReportUserIdentity)).append("\n");
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

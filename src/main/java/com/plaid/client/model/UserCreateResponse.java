/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.413.0
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
 * UserCreateResponse defines the response schema for &#x60;/user/create&#x60;
 */
@ApiModel(description = "UserCreateResponse defines the response schema for `/user/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class UserCreateResponse {
  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public UserCreateResponse userToken(String userToken) {
    
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


  public UserCreateResponse userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The Plaid &#x60;user_id&#x60; of the User associated with this webhook, warning, or error.
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "The Plaid `user_id` of the User associated with this webhook, warning, or error.")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public UserCreateResponse requestId(String requestId) {
    
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
    UserCreateResponse userCreateResponse = (UserCreateResponse) o;
    return Objects.equals(this.userToken, userCreateResponse.userToken) &&
        Objects.equals(this.userId, userCreateResponse.userId) &&
        Objects.equals(this.requestId, userCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userToken, userId, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateResponse {\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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


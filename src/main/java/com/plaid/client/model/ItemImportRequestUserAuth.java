/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.170.0
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
 * Object of user ID and auth token pair, permitting Plaid to aggregate a user’s accounts
 */
@ApiModel(description = "Object of user ID and auth token pair, permitting Plaid to aggregate a user’s accounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T17:31:37.685875Z[Etc/UTC]")
public class ItemImportRequestUserAuth {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_AUTH_TOKEN = "auth_token";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN)
  private String authToken;


  public ItemImportRequestUserAuth userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Opaque user identifier
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "Opaque user identifier")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public ItemImportRequestUserAuth authToken(String authToken) {
    
    this.authToken = authToken;
    return this;
  }

   /**
   * Authorization token Plaid will use to aggregate this user’s accounts
   * @return authToken
  **/
  @ApiModelProperty(required = true, value = "Authorization token Plaid will use to aggregate this user’s accounts")

  public String getAuthToken() {
    return authToken;
  }


  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemImportRequestUserAuth itemImportRequestUserAuth = (ItemImportRequestUserAuth) o;
    return Objects.equals(this.userId, itemImportRequestUserAuth.userId) &&
        Objects.equals(this.authToken, itemImportRequestUserAuth.authToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, authToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemImportRequestUserAuth {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
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


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
import com.plaid.client.model.IdentityVerificationAutofillStatus;
import com.plaid.client.model.IdentityVerificationAutofillUserData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Autofill represents unverified customer information. This needs to be confirmed by the customer before using.
 */
@ApiModel(description = "Autofill represents unverified customer information. This needs to be confirmed by the customer before using.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class IdentityVerificationAutofillCreateResponse {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private IdentityVerificationAutofillStatus status;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private IdentityVerificationAutofillUserData user;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public IdentityVerificationAutofillCreateResponse status(IdentityVerificationAutofillStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationAutofillStatus getStatus() {
    return status;
  }


  public void setStatus(IdentityVerificationAutofillStatus status) {
    this.status = status;
  }


  public IdentityVerificationAutofillCreateResponse user(IdentityVerificationAutofillUserData user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public IdentityVerificationAutofillUserData getUser() {
    return user;
  }


  public void setUser(IdentityVerificationAutofillUserData user) {
    this.user = user;
  }


  public IdentityVerificationAutofillCreateResponse requestId(String requestId) {
    
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
    IdentityVerificationAutofillCreateResponse identityVerificationAutofillCreateResponse = (IdentityVerificationAutofillCreateResponse) o;
    return Objects.equals(this.status, identityVerificationAutofillCreateResponse.status) &&
        Objects.equals(this.user, identityVerificationAutofillCreateResponse.user) &&
        Objects.equals(this.requestId, identityVerificationAutofillCreateResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, user, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationAutofillCreateResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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


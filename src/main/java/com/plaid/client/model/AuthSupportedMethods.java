/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.343.0
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
 * Metadata specifically related to which auth methods an institution supports.
 */
@ApiModel(description = "Metadata specifically related to which auth methods an institution supports.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-22T21:32:38.660057Z[Etc/UTC]")
public class AuthSupportedMethods {
  public static final String SERIALIZED_NAME_INSTANT_AUTH = "instant_auth";
  @SerializedName(SERIALIZED_NAME_INSTANT_AUTH)
  private Boolean instantAuth;

  public static final String SERIALIZED_NAME_INSTANT_MATCH = "instant_match";
  @SerializedName(SERIALIZED_NAME_INSTANT_MATCH)
  private Boolean instantMatch;

  public static final String SERIALIZED_NAME_AUTOMATED_MICRO_DEPOSITS = "automated_micro_deposits";
  @SerializedName(SERIALIZED_NAME_AUTOMATED_MICRO_DEPOSITS)
  private Boolean automatedMicroDeposits;


  public AuthSupportedMethods instantAuth(Boolean instantAuth) {
    
    this.instantAuth = instantAuth;
    return this;
  }

   /**
   * Indicates if instant auth is supported.
   * @return instantAuth
  **/
  @ApiModelProperty(required = true, value = "Indicates if instant auth is supported.")

  public Boolean getInstantAuth() {
    return instantAuth;
  }


  public void setInstantAuth(Boolean instantAuth) {
    this.instantAuth = instantAuth;
  }


  public AuthSupportedMethods instantMatch(Boolean instantMatch) {
    
    this.instantMatch = instantMatch;
    return this;
  }

   /**
   * Indicates if instant match is supported.
   * @return instantMatch
  **/
  @ApiModelProperty(required = true, value = "Indicates if instant match is supported.")

  public Boolean getInstantMatch() {
    return instantMatch;
  }


  public void setInstantMatch(Boolean instantMatch) {
    this.instantMatch = instantMatch;
  }


  public AuthSupportedMethods automatedMicroDeposits(Boolean automatedMicroDeposits) {
    
    this.automatedMicroDeposits = automatedMicroDeposits;
    return this;
  }

   /**
   * Indicates if automated microdeposits are supported.
   * @return automatedMicroDeposits
  **/
  @ApiModelProperty(required = true, value = "Indicates if automated microdeposits are supported.")

  public Boolean getAutomatedMicroDeposits() {
    return automatedMicroDeposits;
  }


  public void setAutomatedMicroDeposits(Boolean automatedMicroDeposits) {
    this.automatedMicroDeposits = automatedMicroDeposits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthSupportedMethods authSupportedMethods = (AuthSupportedMethods) o;
    return Objects.equals(this.instantAuth, authSupportedMethods.instantAuth) &&
        Objects.equals(this.instantMatch, authSupportedMethods.instantMatch) &&
        Objects.equals(this.automatedMicroDeposits, authSupportedMethods.automatedMicroDeposits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instantAuth, instantMatch, automatedMicroDeposits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthSupportedMethods {\n");
    sb.append("    instantAuth: ").append(toIndentedString(instantAuth)).append("\n");
    sb.append("    instantMatch: ").append(toIndentedString(instantMatch)).append("\n");
    sb.append("    automatedMicroDeposits: ").append(toIndentedString(automatedMicroDeposits)).append("\n");
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


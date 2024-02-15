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
 * The reason for a failed transfer intent. Returned only if the transfer intent status is &#x60;failed&#x60;. Null otherwise.
 */
@ApiModel(description = "The reason for a failed transfer intent. Returned only if the transfer intent status is `failed`. Null otherwise.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class TransferIntentGetFailureReason {
  public static final String SERIALIZED_NAME_ERROR_TYPE = "error_type";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private String errorType;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;


  public TransferIntentGetFailureReason errorType(String errorType) {
    
    this.errorType = errorType;
    return this;
  }

   /**
   * A broad categorization of the error.
   * @return errorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A broad categorization of the error.")

  public String getErrorType() {
    return errorType;
  }


  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }


  public TransferIntentGetFailureReason errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * A code representing the reason for a failed transfer intent (i.e., an API error or the authorization being declined).
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A code representing the reason for a failed transfer intent (i.e., an API error or the authorization being declined).")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public TransferIntentGetFailureReason errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * A human-readable description of the code associated with a failed transfer intent.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable description of the code associated with a failed transfer intent.")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferIntentGetFailureReason transferIntentGetFailureReason = (TransferIntentGetFailureReason) o;
    return Objects.equals(this.errorType, transferIntentGetFailureReason.errorType) &&
        Objects.equals(this.errorCode, transferIntentGetFailureReason.errorCode) &&
        Objects.equals(this.errorMessage, transferIntentGetFailureReason.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorType, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferIntentGetFailureReason {\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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


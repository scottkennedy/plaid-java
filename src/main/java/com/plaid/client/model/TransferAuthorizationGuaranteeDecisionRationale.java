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
import com.plaid.client.model.TransferAuthorizationGuaranteeDecisionRationaleCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The rationale for Plaid&#39;s decision to not guarantee a transfer. Will be &#x60;null&#x60; unless &#x60;guarantee_decision&#x60; is &#x60;NOT_GUARANTEED&#x60;.
 */
@ApiModel(description = "The rationale for Plaid's decision to not guarantee a transfer. Will be `null` unless `guarantee_decision` is `NOT_GUARANTEED`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class TransferAuthorizationGuaranteeDecisionRationale {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private TransferAuthorizationGuaranteeDecisionRationaleCode code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public TransferAuthorizationGuaranteeDecisionRationale code(TransferAuthorizationGuaranteeDecisionRationaleCode code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationGuaranteeDecisionRationaleCode getCode() {
    return code;
  }


  public void setCode(TransferAuthorizationGuaranteeDecisionRationaleCode code) {
    this.code = code;
  }


  public TransferAuthorizationGuaranteeDecisionRationale description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of why the transfer cannot be guaranteed.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A human-readable description of why the transfer cannot be guaranteed.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferAuthorizationGuaranteeDecisionRationale transferAuthorizationGuaranteeDecisionRationale = (TransferAuthorizationGuaranteeDecisionRationale) o;
    return Objects.equals(this.code, transferAuthorizationGuaranteeDecisionRationale.code) &&
        Objects.equals(this.description, transferAuthorizationGuaranteeDecisionRationale.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferAuthorizationGuaranteeDecisionRationale {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


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
 * Configuration parameters for the Investments Auth Product
 */
@ApiModel(description = "Configuration parameters for the Investments Auth Product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T19:49:08.269481Z[Etc/UTC]")
public class LinkTokenInvestmentsAuth {
  public static final String SERIALIZED_NAME_MANUAL_ENTRY_ENABLED = "manual_entry_enabled";
  @SerializedName(SERIALIZED_NAME_MANUAL_ENTRY_ENABLED)
  private Boolean manualEntryEnabled = false;

  public static final String SERIALIZED_NAME_MASKED_NUMBER_MATCH_ENABLED = "masked_number_match_enabled";
  @SerializedName(SERIALIZED_NAME_MASKED_NUMBER_MATCH_ENABLED)
  private Boolean maskedNumberMatchEnabled = false;


  public LinkTokenInvestmentsAuth manualEntryEnabled(Boolean manualEntryEnabled) {
    
    this.manualEntryEnabled = manualEntryEnabled;
    return this;
  }

   /**
   * If &#x60;true&#x60;, show institutions that use the manual entry fallback flow.
   * @return manualEntryEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, show institutions that use the manual entry fallback flow.")

  public Boolean getManualEntryEnabled() {
    return manualEntryEnabled;
  }


  public void setManualEntryEnabled(Boolean manualEntryEnabled) {
    this.manualEntryEnabled = manualEntryEnabled;
  }


  public LinkTokenInvestmentsAuth maskedNumberMatchEnabled(Boolean maskedNumberMatchEnabled) {
    
    this.maskedNumberMatchEnabled = maskedNumberMatchEnabled;
    return this;
  }

   /**
   * If &#x60;true&#x60;, show institutions that use the masked number match fallback flow.
   * @return maskedNumberMatchEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, show institutions that use the masked number match fallback flow.")

  public Boolean getMaskedNumberMatchEnabled() {
    return maskedNumberMatchEnabled;
  }


  public void setMaskedNumberMatchEnabled(Boolean maskedNumberMatchEnabled) {
    this.maskedNumberMatchEnabled = maskedNumberMatchEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenInvestmentsAuth linkTokenInvestmentsAuth = (LinkTokenInvestmentsAuth) o;
    return Objects.equals(this.manualEntryEnabled, linkTokenInvestmentsAuth.manualEntryEnabled) &&
        Objects.equals(this.maskedNumberMatchEnabled, linkTokenInvestmentsAuth.maskedNumberMatchEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manualEntryEnabled, maskedNumberMatchEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenInvestmentsAuth {\n");
    sb.append("    manualEntryEnabled: ").append(toIndentedString(manualEntryEnabled)).append("\n");
    sb.append("    maskedNumberMatchEnabled: ").append(toIndentedString(maskedNumberMatchEnabled)).append("\n");
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


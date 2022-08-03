/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.161.5
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
import com.plaid.client.model.MatchSummaryCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result summary object specifying how the &#x60;phone&#x60; field matched.
 */
@ApiModel(description = "Result summary object specifying how the `phone` field matched.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T20:38:07.102590Z[Etc/UTC]")
public class KYCCheckPhoneSummary {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private MatchSummaryCode summary;


  public KYCCheckPhoneSummary summary(MatchSummaryCode summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(required = true, value = "")

  public MatchSummaryCode getSummary() {
    return summary;
  }


  public void setSummary(MatchSummaryCode summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KYCCheckPhoneSummary kyCCheckPhoneSummary = (KYCCheckPhoneSummary) o;
    return Objects.equals(this.summary, kyCCheckPhoneSummary.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KYCCheckPhoneSummary {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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


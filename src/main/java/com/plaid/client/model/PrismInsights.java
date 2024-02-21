/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.2
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
 * The data from the Insights product returned by Prism.
 */
@ApiModel(description = "The data from the Insights product returned by Prism.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class PrismInsights {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Object result;


  public PrismInsights version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of Prism&#39;s insights model used.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version of Prism's insights model used.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public PrismInsights result(Object result) {
    
    this.result = result;
    return this;
  }

   /**
   * The Insights Result object is a map of cash flow attributes, in string to float format.
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Insights Result object is a map of cash flow attributes, in string to float format.")

  public Object getResult() {
    return result;
  }


  public void setResult(Object result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrismInsights prismInsights = (PrismInsights) o;
    return Objects.equals(this.version, prismInsights.version) &&
        Objects.equals(this.result, prismInsights.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrismInsights {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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


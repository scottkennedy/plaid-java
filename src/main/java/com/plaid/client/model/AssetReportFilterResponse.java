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
 * AssetReportFilterResponse defines the response schema for &#x60;/asset_report/filter&#x60;
 */
@ApiModel(description = "AssetReportFilterResponse defines the response schema for `/asset_report/filter`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-22T21:32:38.660057Z[Etc/UTC]")
public class AssetReportFilterResponse {
  public static final String SERIALIZED_NAME_ASSET_REPORT_TOKEN = "asset_report_token";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_TOKEN)
  private String assetReportToken;

  public static final String SERIALIZED_NAME_ASSET_REPORT_ID = "asset_report_id";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_ID)
  private String assetReportId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public AssetReportFilterResponse assetReportToken(String assetReportToken) {
    
    this.assetReportToken = assetReportToken;
    return this;
  }

   /**
   * A token that can be provided to endpoints such as &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60; to fetch or update an Asset Report.
   * @return assetReportToken
  **/
  @ApiModelProperty(required = true, value = "A token that can be provided to endpoints such as `/asset_report/get` or `/asset_report/pdf/get` to fetch or update an Asset Report.")

  public String getAssetReportToken() {
    return assetReportToken;
  }


  public void setAssetReportToken(String assetReportToken) {
    this.assetReportToken = assetReportToken;
  }


  public AssetReportFilterResponse assetReportId(String assetReportId) {
    
    this.assetReportId = assetReportId;
    return this;
  }

   /**
   * A unique ID identifying an Asset Report. Like all Plaid identifiers, this ID is case sensitive.
   * @return assetReportId
  **/
  @ApiModelProperty(required = true, value = "A unique ID identifying an Asset Report. Like all Plaid identifiers, this ID is case sensitive.")

  public String getAssetReportId() {
    return assetReportId;
  }


  public void setAssetReportId(String assetReportId) {
    this.assetReportId = assetReportId;
  }


  public AssetReportFilterResponse requestId(String requestId) {
    
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
    AssetReportFilterResponse assetReportFilterResponse = (AssetReportFilterResponse) o;
    return Objects.equals(this.assetReportToken, assetReportFilterResponse.assetReportToken) &&
        Objects.equals(this.assetReportId, assetReportFilterResponse.assetReportId) &&
        Objects.equals(this.requestId, assetReportFilterResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetReportToken, assetReportId, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportFilterResponse {\n");
    sb.append("    assetReportToken: ").append(toIndentedString(assetReportToken)).append("\n");
    sb.append("    assetReportId: ").append(toIndentedString(assetReportId)).append("\n");
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


/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.97.0
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
 * Fired when the Asset Report has been generated and &#x60;/asset_report/get&#x60; is ready to be called.  If you attempt to retrieve an Asset Report before this webhook has fired, you’ll receive a response with the HTTP status code 400 and a Plaid error code of &#x60;PRODUCT_NOT_READY&#x60;.
 */
@ApiModel(description = "Fired when the Asset Report has been generated and `/asset_report/get` is ready to be called.  If you attempt to retrieve an Asset Report before this webhook has fired, you’ll receive a response with the HTTP status code 400 and a Plaid error code of `PRODUCT_NOT_READY`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-15T01:32:54.341913Z[Etc/UTC]")
public class AssetsProductReadyWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ASSET_REPORT_ID = "asset_report_id";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_ID)
  private String assetReportId;


  public AssetsProductReadyWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;ASSETS&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`ASSETS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public AssetsProductReadyWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;PRODUCT_READY&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`PRODUCT_READY`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public AssetsProductReadyWebhook assetReportId(String assetReportId) {
    
    this.assetReportId = assetReportId;
    return this;
  }

   /**
   * The &#x60;asset_report_id&#x60; that can be provided to &#x60;/asset_report/get&#x60; to retrieve the Asset Report.
   * @return assetReportId
  **/
  @ApiModelProperty(required = true, value = "The `asset_report_id` that can be provided to `/asset_report/get` to retrieve the Asset Report.")

  public String getAssetReportId() {
    return assetReportId;
  }


  public void setAssetReportId(String assetReportId) {
    this.assetReportId = assetReportId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsProductReadyWebhook assetsProductReadyWebhook = (AssetsProductReadyWebhook) o;
    return Objects.equals(this.webhookType, assetsProductReadyWebhook.webhookType) &&
        Objects.equals(this.webhookCode, assetsProductReadyWebhook.webhookCode) &&
        Objects.equals(this.assetReportId, assetsProductReadyWebhook.assetReportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, assetReportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsProductReadyWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    assetReportId: ").append(toIndentedString(assetReportId)).append("\n");
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


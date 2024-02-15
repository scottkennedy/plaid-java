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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when a Beacon User created within your organization matches one of your existing users.
 */
@ApiModel(description = "Fired when a Beacon User created within your organization matches one of your existing users.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T19:49:08.269481Z[Etc/UTC]")
public class BeaconDuplicateDetectedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_BEACON_DUPLICATE_ID = "beacon_duplicate_id";
  @SerializedName(SERIALIZED_NAME_BEACON_DUPLICATE_ID)
  private String beaconDuplicateId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public BeaconDuplicateDetectedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;BEACON&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`BEACON`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public BeaconDuplicateDetectedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;DUPLICATE_DETECTED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`DUPLICATE_DETECTED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public BeaconDuplicateDetectedWebhook beaconDuplicateId(String beaconDuplicateId) {
    
    this.beaconDuplicateId = beaconDuplicateId;
    return this;
  }

   /**
   * The ID of the associated Beacon Duplicate.
   * @return beaconDuplicateId
  **/
  @ApiModelProperty(required = true, value = "The ID of the associated Beacon Duplicate.")

  public String getBeaconDuplicateId() {
    return beaconDuplicateId;
  }


  public void setBeaconDuplicateId(String beaconDuplicateId) {
    this.beaconDuplicateId = beaconDuplicateId;
  }


  public BeaconDuplicateDetectedWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconDuplicateDetectedWebhook beaconDuplicateDetectedWebhook = (BeaconDuplicateDetectedWebhook) o;
    return Objects.equals(this.webhookType, beaconDuplicateDetectedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, beaconDuplicateDetectedWebhook.webhookCode) &&
        Objects.equals(this.beaconDuplicateId, beaconDuplicateDetectedWebhook.beaconDuplicateId) &&
        Objects.equals(this.environment, beaconDuplicateDetectedWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, beaconDuplicateId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconDuplicateDetectedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    beaconDuplicateId: ").append(toIndentedString(beaconDuplicateId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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


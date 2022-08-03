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
import com.plaid.client.model.Source;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the last change made to the parent object specifying what caused the change as well as when it occurred.
 */
@ApiModel(description = "Information about the last change made to the parent object specifying what caused the change as well as when it occurred.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T20:38:07.102590Z[Etc/UTC]")
public class WatchlistScreeningAuditTrail {
  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Source source;

  public static final String SERIALIZED_NAME_DASHBOARD_USER_ID = "dashboard_user_id";
  @SerializedName(SERIALIZED_NAME_DASHBOARD_USER_ID)
  private String dashboardUserId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private java.sql.Timestamp timestamp;


  public WatchlistScreeningAuditTrail source(Source source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(required = true, value = "")

  public Source getSource() {
    return source;
  }


  public void setSource(Source source) {
    this.source = source;
  }


  public WatchlistScreeningAuditTrail dashboardUserId(String dashboardUserId) {
    
    this.dashboardUserId = dashboardUserId;
    return this;
  }

   /**
   * Get dashboardUserId
   * @return dashboardUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getDashboardUserId() {
    return dashboardUserId;
  }


  public void setDashboardUserId(String dashboardUserId) {
    this.dashboardUserId = dashboardUserId;
  }


  public WatchlistScreeningAuditTrail timestamp(java.sql.Timestamp timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "")

  public java.sql.Timestamp getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(java.sql.Timestamp timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistScreeningAuditTrail watchlistScreeningAuditTrail = (WatchlistScreeningAuditTrail) o;
    return Objects.equals(this.source, watchlistScreeningAuditTrail.source) &&
        Objects.equals(this.dashboardUserId, watchlistScreeningAuditTrail.dashboardUserId) &&
        Objects.equals(this.timestamp, watchlistScreeningAuditTrail.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, dashboardUserId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningAuditTrail {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dashboardUserId: ").append(toIndentedString(dashboardUserId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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


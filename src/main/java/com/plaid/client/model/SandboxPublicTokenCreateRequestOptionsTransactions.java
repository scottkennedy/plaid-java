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
import java.time.LocalDate;

/**
 * An optional set of parameters corresponding to transactions options.
 */
@ApiModel(description = "An optional set of parameters corresponding to transactions options.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T19:49:08.269481Z[Etc/UTC]")
public class SandboxPublicTokenCreateRequestOptionsTransactions {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested = 90;


  public SandboxPublicTokenCreateRequestOptionsTransactions startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The earliest date for which to fetch transaction history. Dates should be formatted as YYYY-MM-DD.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The earliest date for which to fetch transaction history. Dates should be formatted as YYYY-MM-DD.")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public SandboxPublicTokenCreateRequestOptionsTransactions endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The most recent date for which to fetch transaction history. Dates should be formatted as YYYY-MM-DD.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The most recent date for which to fetch transaction history. Dates should be formatted as YYYY-MM-DD.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public SandboxPublicTokenCreateRequestOptionsTransactions daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * The maximum number of days of transaction history to request for the Transactions product.
   * minimum: 1
   * maximum: 730
   * @return daysRequested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of days of transaction history to request for the Transactions product.")

  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxPublicTokenCreateRequestOptionsTransactions sandboxPublicTokenCreateRequestOptionsTransactions = (SandboxPublicTokenCreateRequestOptionsTransactions) o;
    return Objects.equals(this.startDate, sandboxPublicTokenCreateRequestOptionsTransactions.startDate) &&
        Objects.equals(this.endDate, sandboxPublicTokenCreateRequestOptionsTransactions.endDate) &&
        Objects.equals(this.daysRequested, sandboxPublicTokenCreateRequestOptionsTransactions.daysRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, daysRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxPublicTokenCreateRequestOptionsTransactions {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
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


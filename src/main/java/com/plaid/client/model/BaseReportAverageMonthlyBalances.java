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
import com.plaid.client.model.CreditAmountWithCurrency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Average balance in dollar amount per month
 */
@ApiModel(description = "Average balance in dollar amount per month")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class BaseReportAverageMonthlyBalances {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_AVERAGE_BALANCE = "average_balance";
  @SerializedName(SERIALIZED_NAME_AVERAGE_BALANCE)
  private CreditAmountWithCurrency averageBalance;


  public BaseReportAverageMonthlyBalances startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public BaseReportAverageMonthlyBalances endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date of this time period. The date will be returned in an ISO 8601 format (YYYY-MM-DD).")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public BaseReportAverageMonthlyBalances averageBalance(CreditAmountWithCurrency averageBalance) {
    
    this.averageBalance = averageBalance;
    return this;
  }

   /**
   * Get averageBalance
   * @return averageBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditAmountWithCurrency getAverageBalance() {
    return averageBalance;
  }


  public void setAverageBalance(CreditAmountWithCurrency averageBalance) {
    this.averageBalance = averageBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportAverageMonthlyBalances baseReportAverageMonthlyBalances = (BaseReportAverageMonthlyBalances) o;
    return Objects.equals(this.startDate, baseReportAverageMonthlyBalances.startDate) &&
        Objects.equals(this.endDate, baseReportAverageMonthlyBalances.endDate) &&
        Objects.equals(this.averageBalance, baseReportAverageMonthlyBalances.averageBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, averageBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportAverageMonthlyBalances {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    averageBalance: ").append(toIndentedString(averageBalance)).append("\n");
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


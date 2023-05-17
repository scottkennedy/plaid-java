/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.370.0
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
import com.plaid.client.model.ExternalPaymentScheduleBase;
import com.plaid.client.model.PaymentScheduleInterval;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * The schedule that the payment will be executed on. If a schedule is provided, the payment is automatically set up as a standing order. If no schedule is specified, the payment will be executed only once.
 */
@ApiModel(description = "The schedule that the payment will be executed on. If a schedule is provided, the payment is automatically set up as a standing order. If no schedule is specified, the payment will be executed only once.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class ExternalPaymentScheduleGet {
  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private PaymentScheduleInterval interval;

  public static final String SERIALIZED_NAME_INTERVAL_EXECUTION_DAY = "interval_execution_day";
  @SerializedName(SERIALIZED_NAME_INTERVAL_EXECUTION_DAY)
  private Integer intervalExecutionDay;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_ADJUSTED_START_DATE = "adjusted_start_date";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_START_DATE)
  private LocalDate adjustedStartDate;


  public ExternalPaymentScheduleGet interval(PaymentScheduleInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentScheduleInterval getInterval() {
    return interval;
  }


  public void setInterval(PaymentScheduleInterval interval) {
    this.interval = interval;
  }


  public ExternalPaymentScheduleGet intervalExecutionDay(Integer intervalExecutionDay) {
    
    this.intervalExecutionDay = intervalExecutionDay;
    return this;
  }

   /**
   * The day of the interval on which to schedule the payment.  If the payment interval is weekly, &#x60;interval_execution_day&#x60; should be an integer from 1 (Monday) to 7 (Sunday).  If the payment interval is monthly, &#x60;interval_execution_day&#x60; should be an integer indicating which day of the month to make the payment on. Integers from 1 to 28 can be used to make a payment on that day of the month. Negative integers from -1 to -5 can be used to make a payment relative to the end of the month. To make a payment on the last day of the month, use -1; to make the payment on the second-to-last day, use -2, and so on.
   * @return intervalExecutionDay
  **/
  @ApiModelProperty(required = true, value = "The day of the interval on which to schedule the payment.  If the payment interval is weekly, `interval_execution_day` should be an integer from 1 (Monday) to 7 (Sunday).  If the payment interval is monthly, `interval_execution_day` should be an integer indicating which day of the month to make the payment on. Integers from 1 to 28 can be used to make a payment on that day of the month. Negative integers from -1 to -5 can be used to make a payment relative to the end of the month. To make a payment on the last day of the month, use -1; to make the payment on the second-to-last day, use -2, and so on.")

  public Integer getIntervalExecutionDay() {
    return intervalExecutionDay;
  }


  public void setIntervalExecutionDay(Integer intervalExecutionDay) {
    this.intervalExecutionDay = intervalExecutionDay;
  }


  public ExternalPaymentScheduleGet startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). Standing order payments will begin on the first &#x60;interval_execution_day&#x60; on or after the &#x60;start_date&#x60;.  If the first &#x60;interval_execution_day&#x60; on or after the start date is also the same day that &#x60;/payment_initiation/payment/create&#x60; was called, the bank *may* make the first payment on that day, but it is not guaranteed to do so.
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). Standing order payments will begin on the first `interval_execution_day` on or after the `start_date`.  If the first `interval_execution_day` on or after the start date is also the same day that `/payment_initiation/payment/create` was called, the bank *may* make the first payment on that day, but it is not guaranteed to do so.")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public ExternalPaymentScheduleGet endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). Standing order payments will end on the last &#x60;interval_execution_day&#x60; on or before the &#x60;end_date&#x60;. If the only &#x60;interval_execution_day&#x60; between the start date and the end date (inclusive) is also the same day that &#x60;/payment_initiation/payment/create&#x60; was called, the bank *may* make a payment on that day, but it is not guaranteed to do so.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). Standing order payments will end on the last `interval_execution_day` on or before the `end_date`. If the only `interval_execution_day` between the start date and the end date (inclusive) is also the same day that `/payment_initiation/payment/create` was called, the bank *may* make a payment on that day, but it is not guaranteed to do so.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public ExternalPaymentScheduleGet adjustedStartDate(LocalDate adjustedStartDate) {
    
    this.adjustedStartDate = adjustedStartDate;
    return this;
  }

   /**
   * The start date sent to the bank after adjusting for holidays or weekends.  Will be provided in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). If the start date did not require adjustment, this field will be &#x60;null&#x60;.
   * @return adjustedStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The start date sent to the bank after adjusting for holidays or weekends.  Will be provided in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). If the start date did not require adjustment, this field will be `null`.")

  public LocalDate getAdjustedStartDate() {
    return adjustedStartDate;
  }


  public void setAdjustedStartDate(LocalDate adjustedStartDate) {
    this.adjustedStartDate = adjustedStartDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPaymentScheduleGet externalPaymentScheduleGet = (ExternalPaymentScheduleGet) o;
    return Objects.equals(this.interval, externalPaymentScheduleGet.interval) &&
        Objects.equals(this.intervalExecutionDay, externalPaymentScheduleGet.intervalExecutionDay) &&
        Objects.equals(this.startDate, externalPaymentScheduleGet.startDate) &&
        Objects.equals(this.endDate, externalPaymentScheduleGet.endDate) &&
        Objects.equals(this.adjustedStartDate, externalPaymentScheduleGet.adjustedStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, intervalExecutionDay, startDate, endDate, adjustedStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPaymentScheduleGet {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    intervalExecutionDay: ").append(toIndentedString(intervalExecutionDay)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    adjustedStartDate: ").append(toIndentedString(adjustedStartDate)).append("\n");
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


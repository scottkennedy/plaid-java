/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.121.0
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
 * Object containing metadata about the interest rate for the mortgage.
 */
@ApiModel(description = "Object containing metadata about the interest rate for the mortgage.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class MortgageInterestRate {
  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Double percentage;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public MortgageInterestRate percentage(Double percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Percentage value (interest rate of current mortgage, not APR) of interest payable on a loan.
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Percentage value (interest rate of current mortgage, not APR) of interest payable on a loan.")

  public Double getPercentage() {
    return percentage;
  }


  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }


  public MortgageInterestRate type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of interest charged (fixed or variable).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The type of interest charged (fixed or variable).")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MortgageInterestRate mortgageInterestRate = (MortgageInterestRate) o;
    return Objects.equals(this.percentage, mortgageInterestRate.percentage) &&
        Objects.equals(this.type, mortgageInterestRate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MortgageInterestRate {\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


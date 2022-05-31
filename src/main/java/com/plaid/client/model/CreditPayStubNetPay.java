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
 * An object representing information about the net pay amount on the pay stub.
 */
@ApiModel(description = "An object representing information about the net pay amount on the pay stub.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class CreditPayStubNetPay {
  public static final String SERIALIZED_NAME_CURRENT_AMOUNT = "current_amount";
  @SerializedName(SERIALIZED_NAME_CURRENT_AMOUNT)
  private Double currentAmount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public static final String SERIALIZED_NAME_YTD_AMOUNT = "ytd_amount";
  @SerializedName(SERIALIZED_NAME_YTD_AMOUNT)
  private Double ytdAmount;


  public CreditPayStubNetPay currentAmount(Double currentAmount) {
    
    this.currentAmount = currentAmount;
    return this;
  }

   /**
   * Raw amount of the net pay for the pay period.
   * @return currentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Raw amount of the net pay for the pay period.")

  public Double getCurrentAmount() {
    return currentAmount;
  }


  public void setCurrentAmount(Double currentAmount) {
    this.currentAmount = currentAmount;
  }


  public CreditPayStubNetPay description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the net pay.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Description of the net pay.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreditPayStubNetPay isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the net pay. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-null.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the net pay. Always `null` if `unofficial_currency_code` is non-null.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public CreditPayStubNetPay unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the net pay. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unofficial currency code associated with the net pay. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  public CreditPayStubNetPay ytdAmount(Double ytdAmount) {
    
    this.ytdAmount = ytdAmount;
    return this;
  }

   /**
   * The year-to-date amount of the net pay.
   * @return ytdAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The year-to-date amount of the net pay.")

  public Double getYtdAmount() {
    return ytdAmount;
  }


  public void setYtdAmount(Double ytdAmount) {
    this.ytdAmount = ytdAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditPayStubNetPay creditPayStubNetPay = (CreditPayStubNetPay) o;
    return Objects.equals(this.currentAmount, creditPayStubNetPay.currentAmount) &&
        Objects.equals(this.description, creditPayStubNetPay.description) &&
        Objects.equals(this.isoCurrencyCode, creditPayStubNetPay.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, creditPayStubNetPay.unofficialCurrencyCode) &&
        Objects.equals(this.ytdAmount, creditPayStubNetPay.ytdAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAmount, description, isoCurrencyCode, unofficialCurrencyCode, ytdAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditPayStubNetPay {\n");
    sb.append("    currentAmount: ").append(toIndentedString(currentAmount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("    ytdAmount: ").append(toIndentedString(ytdAmount)).append("\n");
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


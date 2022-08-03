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
import com.plaid.client.model.WalletISOCurrencyCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The amount and currency of a transaction
 */
@ApiModel(description = "The amount and currency of a transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T20:38:07.102590Z[Etc/UTC]")
public class WalletTransactionAmount {
  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private WalletISOCurrencyCode isoCurrencyCode;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value;


  public WalletTransactionAmount isoCurrencyCode(WalletISOCurrencyCode isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * Get isoCurrencyCode
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "")

  public WalletISOCurrencyCode getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(WalletISOCurrencyCode isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public WalletTransactionAmount value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * The amount of the transaction. Must contain at most two digits of precision e.g. &#x60;1.23&#x60;.
   * minimum: 1
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The amount of the transaction. Must contain at most two digits of precision e.g. `1.23`.")

  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionAmount walletTransactionAmount = (WalletTransactionAmount) o;
    return Objects.equals(this.isoCurrencyCode, walletTransactionAmount.isoCurrencyCode) &&
        Objects.equals(this.value, walletTransactionAmount.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCurrencyCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionAmount {\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


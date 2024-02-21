/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.2
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
import com.plaid.client.model.WalletTransactionCounterpartyBACS;
import com.plaid.client.model.WalletTransactionCounterpartyInternational;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The counterparty&#39;s bank account numbers. Exactly one of IBAN or BACS data is required.
 */
@ApiModel(description = "The counterparty's bank account numbers. Exactly one of IBAN or BACS data is required.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class WalletTransactionCounterpartyNumbers {
  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private WalletTransactionCounterpartyBACS bacs;

  public static final String SERIALIZED_NAME_INTERNATIONAL = "international";
  @SerializedName(SERIALIZED_NAME_INTERNATIONAL)
  private WalletTransactionCounterpartyInternational international;


  public WalletTransactionCounterpartyNumbers bacs(WalletTransactionCounterpartyBACS bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WalletTransactionCounterpartyBACS getBacs() {
    return bacs;
  }


  public void setBacs(WalletTransactionCounterpartyBACS bacs) {
    this.bacs = bacs;
  }


  public WalletTransactionCounterpartyNumbers international(WalletTransactionCounterpartyInternational international) {
    
    this.international = international;
    return this;
  }

   /**
   * Get international
   * @return international
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WalletTransactionCounterpartyInternational getInternational() {
    return international;
  }


  public void setInternational(WalletTransactionCounterpartyInternational international) {
    this.international = international;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionCounterpartyNumbers walletTransactionCounterpartyNumbers = (WalletTransactionCounterpartyNumbers) o;
    return Objects.equals(this.bacs, walletTransactionCounterpartyNumbers.bacs) &&
        Objects.equals(this.international, walletTransactionCounterpartyNumbers.international);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bacs, international);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionCounterpartyNumbers {\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
    sb.append("    international: ").append(toIndentedString(international)).append("\n");
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


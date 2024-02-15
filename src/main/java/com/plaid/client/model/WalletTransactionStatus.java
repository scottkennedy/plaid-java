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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The status of the transaction.  &#x60;AUTHORISING&#x60;: The transaction is being processed for validation and compliance.  &#x60;INITIATED&#x60;: The transaction has been initiated and is currently being processed.  &#x60;EXECUTED&#x60;: The transaction has been successfully executed and is considered complete. This is only applicable for debit transactions.  &#x60;SETTLED&#x60;: The transaction has settled and funds are available for use. This is only applicable for credit transactions. A transaction will typically settle within seconds to several days, depending on which payment rail is used.  &#x60;FAILED&#x60;: The transaction failed to process successfully. This is a terminal status.  &#x60;BLOCKED&#x60;: The transaction has been blocked for violating compliance rules. This is a terminal status.
 */
@JsonAdapter(WalletTransactionStatus.Adapter.class)
public enum WalletTransactionStatus {
  
  AUTHORISING("AUTHORISING"),
  
  INITIATED("INITIATED"),
  
  EXECUTED("EXECUTED"),
  
  SETTLED("SETTLED"),
  
  BLOCKED("BLOCKED"),
  
  FAILED("FAILED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  WalletTransactionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WalletTransactionStatus fromValue(String value) {
    for (WalletTransactionStatus b : WalletTransactionStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return WalletTransactionStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<WalletTransactionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WalletTransactionStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WalletTransactionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WalletTransactionStatus.fromValue(value);
    }
  }
}


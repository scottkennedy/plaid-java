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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Indicates the direction of the transfer: &#x60;outbound&#x60; for API-initiated transfers, or &#x60;inbound&#x60; for payments received by the FBO account.
 */
@JsonAdapter(BankTransferDirection.Adapter.class)
public enum BankTransferDirection {
  
  OUTBOUND("outbound"),
  
  INBOUND("inbound"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BankTransferDirection(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BankTransferDirection fromValue(String value) {
    for (BankTransferDirection b : BankTransferDirection.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<BankTransferDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final BankTransferDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BankTransferDirection read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BankTransferDirection.fromValue(value);
    }
  }
}


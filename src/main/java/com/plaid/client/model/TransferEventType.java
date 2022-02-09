/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.64.13
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
 * The type of event that this transfer represents.  &#x60;pending&#x60;: A new transfer was created; it is in the pending state.  &#x60;cancelled&#x60;: The transfer was cancelled by the client.  &#x60;failed&#x60;: The transfer failed, no funds were moved.  &#x60;posted&#x60;: The transfer has been successfully submitted to the payment network.  &#x60;reversed&#x60;: A posted transfer was reversed.  &#x60;swept&#x60;: The transfer was swept to / from the sweep account.  &#x60;reverse_swept&#x60;: Due to the transfer reversing, funds were pulled from or pushed back to the sweep account.
 */
@JsonAdapter(TransferEventType.Adapter.class)
public enum TransferEventType {
  
  PENDING("pending"),
  
  CANCELLED("cancelled"),
  
  FAILED("failed"),
  
  POSTED("posted"),
  
  REVERSED("reversed"),
  
  SWEPT("swept"),
  
  REVERSE_SWEPT("reverse_swept"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferEventType fromValue(String value) {
    for (TransferEventType b : TransferEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferEventType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferEventType.fromValue(value);
    }
  }
}


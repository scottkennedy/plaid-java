/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.474.0
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
 * Originator’s diligence status.
 */
@JsonAdapter(TransferDiligenceStatus.Adapter.class)
public enum TransferDiligenceStatus {
  
  NOT_SUBMITTED("not_submitted"),
  
  SUBMITTED("submitted"),
  
  UNDER_REVIEW("under_review"),
  
  APPROVED("approved"),
  
  DENIED("denied"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferDiligenceStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferDiligenceStatus fromValue(String value) {
    for (TransferDiligenceStatus b : TransferDiligenceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferDiligenceStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferDiligenceStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferDiligenceStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferDiligenceStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferDiligenceStatus.fromValue(value);
    }
  }
}


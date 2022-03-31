/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.94.0
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
 * Current employment status.
 */
@JsonAdapter(EmploymentVerificationStatus.Adapter.class)
public enum EmploymentVerificationStatus {
  
  EMPLOYMENT_STATUS_ACTIVE("EMPLOYMENT_STATUS_ACTIVE"),
  
  EMPLOYMENT_STATUS_INACTIVE("EMPLOYMENT_STATUS_INACTIVE"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  EmploymentVerificationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EmploymentVerificationStatus fromValue(String value) {
    for (EmploymentVerificationStatus b : EmploymentVerificationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<EmploymentVerificationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final EmploymentVerificationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EmploymentVerificationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EmploymentVerificationStatus.fromValue(value);
    }
  }
}


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
 * Field describing the overall user interaction signals of a behavior risk check. This value represents how familiar the user is with the personal data they provide, based on a number of signals that are collected during their session.  &#x60;genuine&#x60; indicates the user has high familiarity with the data they are providing, and that fraud is unlikely.  &#x60;neutral&#x60; indicates some signals are present in between &#x60;risky&#x60; and &#x60;genuine&#x60;, but there are not enough clear signals to determine an outcome.  &#x60;risky&#x60; indicates the user has low familiarity with the data they are providing, and that fraud is likely.  &#x60;no_data&#x60; indicates there is not sufficient information to give an accurate signal.
 */
@JsonAdapter(RiskCheckBehaviorUserInteractionsLabel.Adapter.class)
public enum RiskCheckBehaviorUserInteractionsLabel {
  
  GENUINE("genuine"),
  
  NEUTRAL("neutral"),
  
  RISKY("risky"),
  
  NO_DATA("no_data"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  RiskCheckBehaviorUserInteractionsLabel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RiskCheckBehaviorUserInteractionsLabel fromValue(String value) {
    for (RiskCheckBehaviorUserInteractionsLabel b : RiskCheckBehaviorUserInteractionsLabel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return RiskCheckBehaviorUserInteractionsLabel.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<RiskCheckBehaviorUserInteractionsLabel> {
    @Override
    public void write(final JsonWriter jsonWriter, final RiskCheckBehaviorUserInteractionsLabel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RiskCheckBehaviorUserInteractionsLabel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RiskCheckBehaviorUserInteractionsLabel.fromValue(value);
    }
  }
}


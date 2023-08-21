/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.419.0
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
 * The status of the given Payment Profile.  &#x60;READY&#x60;: This Payment Profile is ready to be used to create transfers using &#x60;/transfer/authorization/create&#x60; and &#x60;/transfer/create&#x60;.  &#x60;PENDING&#x60;: This Payment Profile is not ready to be used. You’ll need to call &#x60;/link/token/create&#x60; and provide the &#x60;payment_profile_token&#x60; in the &#x60;transfer.payment_profile_token&#x60; field to initiate the account linking experience.  &#x60;REMOVED&#x60;: This Payment Profile has been removed.
 */
@JsonAdapter(PaymentProfileStatus.Adapter.class)
public enum PaymentProfileStatus {
  
  PENDING("PENDING"),
  
  READY("READY"),
  
  REMOVED("REMOVED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PaymentProfileStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentProfileStatus fromValue(String value) {
    for (PaymentProfileStatus b : PaymentProfileStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PaymentProfileStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PaymentProfileStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentProfileStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentProfileStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentProfileStatus.fromValue(value);
    }
  }
}


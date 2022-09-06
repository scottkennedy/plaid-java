/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.170.0
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
 * The delivery method to be used to deliver the Link Delivery URL.  &#x60;SMS&#x60;: The URL will be delivered through SMS  &#x60;EMAIL&#x60;: The URL will be delivered through email
 */
@JsonAdapter(LinkDeliveryDeliveryMethod.Adapter.class)
public enum LinkDeliveryDeliveryMethod {
  
  SMS("SMS"),
  
  EMAIL("EMAIL"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  LinkDeliveryDeliveryMethod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LinkDeliveryDeliveryMethod fromValue(String value) {
    for (LinkDeliveryDeliveryMethod b : LinkDeliveryDeliveryMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return LinkDeliveryDeliveryMethod.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<LinkDeliveryDeliveryMethod> {
    @Override
    public void write(final JsonWriter jsonWriter, final LinkDeliveryDeliveryMethod enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LinkDeliveryDeliveryMethod read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LinkDeliveryDeliveryMethod.fromValue(value);
    }
  }
}


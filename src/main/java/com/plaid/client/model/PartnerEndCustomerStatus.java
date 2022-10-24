/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.196.0
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
 * The status of the given end customer.  &#x60;UNDER REVIEW&#x60;: The end customer has been created and enabled in the non-Production environments. The end customer must be manually reviewed by the Plaid team before it can be enabled in production, at which point its status will automatically transition to &#x60;READY FOR ENABLEMENT&#x60; or &#x60;DENIED&#x60;.  &#x60;READY FOR ENABLEMENT&#x60;: The end customer is ready to be enabled in the Production environment. Call the &#x60;/partner/customer/enable&#x60; endpoint to enable the end customer in Production.  &#x60;ACTIVE&#x60;: The end customer has been enabled in all environments.   &#x60;DENIED&#x60;: The end customer has been created and enabled in the non-Production environments, but it did not pass review by the Plaid team and therefore cannot be enabled in the Production environment. Talk to your Account Manager for more information.
 */
@JsonAdapter(PartnerEndCustomerStatus.Adapter.class)
public enum PartnerEndCustomerStatus {
  
  UNDER_REVIEW("UNDER REVIEW"),
  
  READY_FOR_ENABLEMENT("READY FOR ENABLEMENT"),
  
  ACTIVE("ACTIVE"),
  
  DENIED("DENIED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PartnerEndCustomerStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PartnerEndCustomerStatus fromValue(String value) {
    for (PartnerEndCustomerStatus b : PartnerEndCustomerStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PartnerEndCustomerStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PartnerEndCustomerStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PartnerEndCustomerStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PartnerEndCustomerStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PartnerEndCustomerStatus.fromValue(value);
    }
  }
}


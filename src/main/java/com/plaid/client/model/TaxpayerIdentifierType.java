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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A value from a MISMO prescribed list that classifies identification numbers used by the Internal Revenue Service (IRS) in the administration of tax laws. A Social Security number (SSN) is issued by the SSA; all other taxpayer identification numbers are issued by the IRS.
 */
@JsonAdapter(TaxpayerIdentifierType.Adapter.class)
public enum TaxpayerIdentifierType {
  
  INDIVIDUALTAXPAYERIDENTIFICATIONNUMBER("IndividualTaxpayerIdentificationNumber"),
  
  SOCIALSECURITYNUMBER("SocialSecurityNumber"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TaxpayerIdentifierType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaxpayerIdentifierType fromValue(String value) {
    for (TaxpayerIdentifierType b : TaxpayerIdentifierType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<TaxpayerIdentifierType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaxpayerIdentifierType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaxpayerIdentifierType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaxpayerIdentifierType.fromValue(value);
    }
  }
}


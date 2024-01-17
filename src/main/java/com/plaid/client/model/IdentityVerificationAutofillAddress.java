/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.485.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.AddressPurposeLabel;
import com.plaid.client.model.POBoxStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Even if an address has been autofilled, some fields may be null depending on the region&#39;s addressing system. For example:  Addresses from the United Kingdom will not include a region  Addresses from Hong Kong will not include postal code
 */
@ApiModel(description = "Even if an address has been autofilled, some fields may be null depending on the region's addressing system. For example:  Addresses from the United Kingdom will not include a region  Addresses from Hong Kong will not include postal code")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T22:23:14.698759Z[Etc/UTC]")
public class IdentityVerificationAutofillAddress {
  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_STREET2 = "street2";
  @SerializedName(SERIALIZED_NAME_STREET2)
  private String street2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PO_BOX = "po_box";
  @SerializedName(SERIALIZED_NAME_PO_BOX)
  private POBoxStatus poBox;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AddressPurposeLabel type;


  public IdentityVerificationAutofillAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The primary street portion of an address. If an address is provided, this field will always be filled.
   * @return street
  **/
  @ApiModelProperty(example = "123 Main St.", required = true, value = "The primary street portion of an address. If an address is provided, this field will always be filled.")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public IdentityVerificationAutofillAddress street2(String street2) {
    
    this.street2 = street2;
    return this;
  }

   /**
   * Extra street information, like an apartment or suite number.
   * @return street2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Unit 42", required = true, value = "Extra street information, like an apartment or suite number.")

  public String getStreet2() {
    return street2;
  }


  public void setStreet2(String street2) {
    this.street2 = street2;
  }


  public IdentityVerificationAutofillAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City from the end user&#39;s address
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Pawnee", required = true, value = "City from the end user's address")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public IdentityVerificationAutofillAddress region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * An ISO 3166-2 subdivision code. Related terms would be \&quot;state\&quot;, \&quot;province\&quot;, \&quot;prefecture\&quot;, \&quot;zone\&quot;, \&quot;subdivision\&quot;, etc.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IN", required = true, value = "An ISO 3166-2 subdivision code. Related terms would be \"state\", \"province\", \"prefecture\", \"zone\", \"subdivision\", etc.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public IdentityVerificationAutofillAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code for the associated address. Between 2 and 10 alphanumeric characters. For US-based addresses this must be 5 numeric digits.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "46001", required = true, value = "The postal code for the associated address. Between 2 and 10 alphanumeric characters. For US-based addresses this must be 5 numeric digits.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public IdentityVerificationAutofillAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.
   * @return country
  **/
  @ApiModelProperty(example = "US", required = true, value = "Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public IdentityVerificationAutofillAddress poBox(POBoxStatus poBox) {
    
    this.poBox = poBox;
    return this;
  }

   /**
   * Get poBox
   * @return poBox
  **/
  @ApiModelProperty(required = true, value = "")

  public POBoxStatus getPoBox() {
    return poBox;
  }


  public void setPoBox(POBoxStatus poBox) {
    this.poBox = poBox;
  }


  public IdentityVerificationAutofillAddress type(AddressPurposeLabel type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public AddressPurposeLabel getType() {
    return type;
  }


  public void setType(AddressPurposeLabel type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationAutofillAddress identityVerificationAutofillAddress = (IdentityVerificationAutofillAddress) o;
    return Objects.equals(this.street, identityVerificationAutofillAddress.street) &&
        Objects.equals(this.street2, identityVerificationAutofillAddress.street2) &&
        Objects.equals(this.city, identityVerificationAutofillAddress.city) &&
        Objects.equals(this.region, identityVerificationAutofillAddress.region) &&
        Objects.equals(this.postalCode, identityVerificationAutofillAddress.postalCode) &&
        Objects.equals(this.country, identityVerificationAutofillAddress.country) &&
        Objects.equals(this.poBox, identityVerificationAutofillAddress.poBox) &&
        Objects.equals(this.type, identityVerificationAutofillAddress.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, street2, city, region, postalCode, country, poBox, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationAutofillAddress {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    poBox: ").append(toIndentedString(poBox)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


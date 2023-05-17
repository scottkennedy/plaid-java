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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The technical contact for the end customer. Defaults to partner&#39;s technical contact if omitted.
 */
@ApiModel(description = "The technical contact for the end customer. Defaults to partner's technical contact if omitted.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class PartnerEndCustomerTechnicalContact {
  public static final String SERIALIZED_NAME_GIVEN_NAME = "given_name";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "family_name";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;


  public PartnerEndCustomerTechnicalContact givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public PartnerEndCustomerTechnicalContact familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public PartnerEndCustomerTechnicalContact email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerEndCustomerTechnicalContact partnerEndCustomerTechnicalContact = (PartnerEndCustomerTechnicalContact) o;
    return Objects.equals(this.givenName, partnerEndCustomerTechnicalContact.givenName) &&
        Objects.equals(this.familyName, partnerEndCustomerTechnicalContact.familyName) &&
        Objects.equals(this.email, partnerEndCustomerTechnicalContact.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, familyName, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerEndCustomerTechnicalContact {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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


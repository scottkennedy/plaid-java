/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.121.0
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
 * The legal name and other information for the account holder.
 */
@ApiModel(description = "The legal name and other information for the account holder.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class BankTransferUser {
  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;


  public BankTransferUser legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The account holder’s full legal name. If the transfer &#x60;ach_class&#x60; is &#x60;ccd&#x60;, this should be the business name of the account holder.
   * @return legalName
  **/
  @ApiModelProperty(required = true, value = "The account holder’s full legal name. If the transfer `ach_class` is `ccd`, this should be the business name of the account holder.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public BankTransferUser emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The account holder’s email.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account holder’s email.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


   /**
   * The account holder&#39;s routing number. This field is only used in response data. Do not provide this field when making requests.
   * @return routingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account holder's routing number. This field is only used in response data. Do not provide this field when making requests.")

  public String getRoutingNumber() {
    return routingNumber;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferUser bankTransferUser = (BankTransferUser) o;
    return Objects.equals(this.legalName, bankTransferUser.legalName) &&
        Objects.equals(this.emailAddress, bankTransferUser.emailAddress) &&
        Objects.equals(this.routingNumber, bankTransferUser.routingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalName, emailAddress, routingNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferUser {\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
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


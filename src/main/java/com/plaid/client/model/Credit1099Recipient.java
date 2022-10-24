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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.CreditPayStubAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing a recipient used in both 1099-K and 1099-MISC tax documents.
 */
@ApiModel(description = "An object representing a recipient used in both 1099-K and 1099-MISC tax documents.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T23:20:54.499428Z[Etc/UTC]")
public class Credit1099Recipient {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private CreditPayStubAddress address;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIN = "tin";
  @SerializedName(SERIALIZED_NAME_TIN)
  private String tin;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_FACTA_FILING_REQUIREMENT = "facta_filing_requirement";
  @SerializedName(SERIALIZED_NAME_FACTA_FILING_REQUIREMENT)
  private String factaFilingRequirement;

  public static final String SERIALIZED_NAME_SECOND_TIN_EXISTS = "second_tin_exists";
  @SerializedName(SERIALIZED_NAME_SECOND_TIN_EXISTS)
  private String secondTinExists;


  public Credit1099Recipient address(CreditPayStubAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditPayStubAddress getAddress() {
    return address;
  }


  public void setAddress(CreditPayStubAddress address) {
    this.address = address;
  }


  public Credit1099Recipient name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of recipient.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of recipient.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Credit1099Recipient tin(String tin) {
    
    this.tin = tin;
    return this;
  }

   /**
   * Tax identification number of recipient.
   * @return tin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax identification number of recipient.")

  public String getTin() {
    return tin;
  }


  public void setTin(String tin) {
    this.tin = tin;
  }


  public Credit1099Recipient accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account number number of recipient.
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account number number of recipient.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public Credit1099Recipient factaFilingRequirement(String factaFilingRequirement) {
    
    this.factaFilingRequirement = factaFilingRequirement;
    return this;
  }

   /**
   * Checked if FACTA is a filing requirement.
   * @return factaFilingRequirement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Checked if FACTA is a filing requirement.")

  public String getFactaFilingRequirement() {
    return factaFilingRequirement;
  }


  public void setFactaFilingRequirement(String factaFilingRequirement) {
    this.factaFilingRequirement = factaFilingRequirement;
  }


  public Credit1099Recipient secondTinExists(String secondTinExists) {
    
    this.secondTinExists = secondTinExists;
    return this;
  }

   /**
   * Checked if 2nd TIN exists.
   * @return secondTinExists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Checked if 2nd TIN exists.")

  public String getSecondTinExists() {
    return secondTinExists;
  }


  public void setSecondTinExists(String secondTinExists) {
    this.secondTinExists = secondTinExists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credit1099Recipient credit1099Recipient = (Credit1099Recipient) o;
    return Objects.equals(this.address, credit1099Recipient.address) &&
        Objects.equals(this.name, credit1099Recipient.name) &&
        Objects.equals(this.tin, credit1099Recipient.tin) &&
        Objects.equals(this.accountNumber, credit1099Recipient.accountNumber) &&
        Objects.equals(this.factaFilingRequirement, credit1099Recipient.factaFilingRequirement) &&
        Objects.equals(this.secondTinExists, credit1099Recipient.secondTinExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, name, tin, accountNumber, factaFilingRequirement, secondTinExists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credit1099Recipient {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tin: ").append(toIndentedString(tin)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    factaFilingRequirement: ").append(toIndentedString(factaFilingRequirement)).append("\n");
    sb.append("    secondTinExists: ").append(toIndentedString(secondTinExists)).append("\n");
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


/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.413.0
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
import com.plaid.client.model.IncomeVerificationSourceType;
import com.plaid.client.model.SandboxPublicTokenCreateRequestIncomeVerificationBankIncome;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A set of parameters for income verification options. This field is required if &#x60;income_verification&#x60; is included in the &#x60;initial_products&#x60; array.
 */
@ApiModel(description = "A set of parameters for income verification options. This field is required if `income_verification` is included in the `initial_products` array.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class SandboxPublicTokenCreateRequestOptionsIncomeVerification {
  public static final String SERIALIZED_NAME_INCOME_SOURCE_TYPES = "income_source_types";
  @SerializedName(SERIALIZED_NAME_INCOME_SOURCE_TYPES)
  private List<IncomeVerificationSourceType> incomeSourceTypes = null;

  public static final String SERIALIZED_NAME_BANK_INCOME = "bank_income";
  @SerializedName(SERIALIZED_NAME_BANK_INCOME)
  private SandboxPublicTokenCreateRequestIncomeVerificationBankIncome bankIncome;


  public SandboxPublicTokenCreateRequestOptionsIncomeVerification incomeSourceTypes(List<IncomeVerificationSourceType> incomeSourceTypes) {
    
    this.incomeSourceTypes = incomeSourceTypes;
    return this;
  }

  public SandboxPublicTokenCreateRequestOptionsIncomeVerification addIncomeSourceTypesItem(IncomeVerificationSourceType incomeSourceTypesItem) {
    if (this.incomeSourceTypes == null) {
      this.incomeSourceTypes = new ArrayList<>();
    }
    this.incomeSourceTypes.add(incomeSourceTypesItem);
    return this;
  }

   /**
   * The types of source income data that users will be permitted to share. Options include &#x60;bank&#x60; and &#x60;payroll&#x60;. Currently you can only specify one of these options.
   * @return incomeSourceTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The types of source income data that users will be permitted to share. Options include `bank` and `payroll`. Currently you can only specify one of these options.")

  public List<IncomeVerificationSourceType> getIncomeSourceTypes() {
    return incomeSourceTypes;
  }


  public void setIncomeSourceTypes(List<IncomeVerificationSourceType> incomeSourceTypes) {
    this.incomeSourceTypes = incomeSourceTypes;
  }


  public SandboxPublicTokenCreateRequestOptionsIncomeVerification bankIncome(SandboxPublicTokenCreateRequestIncomeVerificationBankIncome bankIncome) {
    
    this.bankIncome = bankIncome;
    return this;
  }

   /**
   * Get bankIncome
   * @return bankIncome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SandboxPublicTokenCreateRequestIncomeVerificationBankIncome getBankIncome() {
    return bankIncome;
  }


  public void setBankIncome(SandboxPublicTokenCreateRequestIncomeVerificationBankIncome bankIncome) {
    this.bankIncome = bankIncome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SandboxPublicTokenCreateRequestOptionsIncomeVerification sandboxPublicTokenCreateRequestOptionsIncomeVerification = (SandboxPublicTokenCreateRequestOptionsIncomeVerification) o;
    return Objects.equals(this.incomeSourceTypes, sandboxPublicTokenCreateRequestOptionsIncomeVerification.incomeSourceTypes) &&
        Objects.equals(this.bankIncome, sandboxPublicTokenCreateRequestOptionsIncomeVerification.bankIncome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeSourceTypes, bankIncome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SandboxPublicTokenCreateRequestOptionsIncomeVerification {\n");
    sb.append("    incomeSourceTypes: ").append(toIndentedString(incomeSourceTypes)).append("\n");
    sb.append("    bankIncome: ").append(toIndentedString(bankIncome)).append("\n");
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


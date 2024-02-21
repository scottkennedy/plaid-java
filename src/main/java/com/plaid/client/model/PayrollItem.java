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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.PayrollIncomeAccountData;
import com.plaid.client.model.PayrollIncomeObject;
import com.plaid.client.model.PayrollItemStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * An object containing information about the payroll item.
 */
@ApiModel(description = "An object containing information about the payroll item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class PayrollItem {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<PayrollIncomeAccountData> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYROLL_INCOME = "payroll_income";
  @SerializedName(SERIALIZED_NAME_PAYROLL_INCOME)
  private List<PayrollIncomeObject> payrollIncome = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PayrollItemStatus status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public PayrollItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public PayrollItem institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The unique identifier of the institution associated with the Item.
   * @return institutionId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the institution associated with the Item.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public PayrollItem institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The name of the institution associated with the Item.
   * @return institutionName
  **/
  @ApiModelProperty(required = true, value = "The name of the institution associated with the Item.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public PayrollItem accounts(List<PayrollIncomeAccountData> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public PayrollItem addAccountsItem(PayrollIncomeAccountData accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PayrollIncomeAccountData> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<PayrollIncomeAccountData> accounts) {
    this.accounts = accounts;
  }


  public PayrollItem payrollIncome(List<PayrollIncomeObject> payrollIncome) {
    
    this.payrollIncome = payrollIncome;
    return this;
  }

  public PayrollItem addPayrollIncomeItem(PayrollIncomeObject payrollIncomeItem) {
    this.payrollIncome.add(payrollIncomeItem);
    return this;
  }

   /**
   * Get payrollIncome
   * @return payrollIncome
  **/
  @ApiModelProperty(required = true, value = "")

  public List<PayrollIncomeObject> getPayrollIncome() {
    return payrollIncome;
  }


  public void setPayrollIncome(List<PayrollIncomeObject> payrollIncome) {
    this.payrollIncome = payrollIncome;
  }


  public PayrollItem status(PayrollItemStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PayrollItemStatus getStatus() {
    return status;
  }


  public void setStatus(PayrollItemStatus status) {
    this.status = status;
  }


  public PayrollItem updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DDTHH:mm:ssZ) indicating the last time that the Item was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DDTHH:mm:ssZ) indicating the last time that the Item was updated.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayrollItem payrollItem = (PayrollItem) o;
    return Objects.equals(this.itemId, payrollItem.itemId) &&
        Objects.equals(this.institutionId, payrollItem.institutionId) &&
        Objects.equals(this.institutionName, payrollItem.institutionName) &&
        Objects.equals(this.accounts, payrollItem.accounts) &&
        Objects.equals(this.payrollIncome, payrollItem.payrollIncome) &&
        Objects.equals(this.status, payrollItem.status) &&
        Objects.equals(this.updatedAt, payrollItem.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, institutionId, institutionName, accounts, payrollIncome, status, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    payrollIncome: ").append(toIndentedString(payrollIncome)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


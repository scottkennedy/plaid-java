/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.0
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
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * An object containing data about a transaction appearing on a user-uploaded bank statement.
 */
@ApiModel(description = "An object containing data about a transaction appearing on a user-uploaded bank statement.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class CreditBankStatementUploadTransaction {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_ORIGINAL_DESCRIPTION = "original_description";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DESCRIPTION)
  private String originalDescription;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;


  public CreditBankStatementUploadTransaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The value of the transaction. A negative amount indicates that money moved into the account (such as a paycheck being deposited).
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The value of the transaction. A negative amount indicates that money moved into the account (such as a paycheck being deposited).")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public CreditBankStatementUploadTransaction date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * The date of when the transaction was made, in ISO 8601 format (YYYY-MM-DD).
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date of when the transaction was made, in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public CreditBankStatementUploadTransaction originalDescription(String originalDescription) {
    
    this.originalDescription = originalDescription;
    return this;
  }

   /**
   * The raw description of the transaction as it appears on the bank statement.
   * @return originalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The raw description of the transaction as it appears on the bank statement.")

  public String getOriginalDescription() {
    return originalDescription;
  }


  public void setOriginalDescription(String originalDescription) {
    this.originalDescription = originalDescription;
  }


  public CreditBankStatementUploadTransaction accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The unique id of the bank account that this transaction occurs in
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unique id of the bank account that this transaction occurs in")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankStatementUploadTransaction creditBankStatementUploadTransaction = (CreditBankStatementUploadTransaction) o;
    return Objects.equals(this.amount, creditBankStatementUploadTransaction.amount) &&
        Objects.equals(this.date, creditBankStatementUploadTransaction.date) &&
        Objects.equals(this.originalDescription, creditBankStatementUploadTransaction.originalDescription) &&
        Objects.equals(this.accountId, creditBankStatementUploadTransaction.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, date, originalDescription, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankStatementUploadTransaction {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    originalDescription: ").append(toIndentedString(originalDescription)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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


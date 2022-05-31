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
import com.plaid.client.model.AccountBase;
import com.plaid.client.model.Item;
import com.plaid.client.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsGetResponse defines the response schema for &#x60;/transactions/get&#x60;
 */
@ApiModel(description = "TransactionsGetResponse defines the response schema for `/transactions/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class TransactionsGetResponse {
  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<AccountBase> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<Transaction> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_TRANSACTIONS = "total_transactions";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRANSACTIONS)
  private Integer totalTransactions;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private Item item;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public TransactionsGetResponse accounts(List<AccountBase> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public TransactionsGetResponse addAccountsItem(AccountBase accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * An array containing the &#x60;accounts&#x60; associated with the Item for which transactions are being returned. Each transaction can be mapped to its corresponding account via the &#x60;account_id&#x60; field.
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "An array containing the `accounts` associated with the Item for which transactions are being returned. Each transaction can be mapped to its corresponding account via the `account_id` field.")

  public List<AccountBase> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<AccountBase> accounts) {
    this.accounts = accounts;
  }


  public TransactionsGetResponse transactions(List<Transaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public TransactionsGetResponse addTransactionsItem(Transaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * An array containing transactions from the account. Transactions are returned in reverse chronological order, with the most recent at the beginning of the array. The maximum number of transactions returned is determined by the &#x60;count&#x60; parameter.
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "An array containing transactions from the account. Transactions are returned in reverse chronological order, with the most recent at the beginning of the array. The maximum number of transactions returned is determined by the `count` parameter.")

  public List<Transaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  public TransactionsGetResponse totalTransactions(Integer totalTransactions) {
    
    this.totalTransactions = totalTransactions;
    return this;
  }

   /**
   * The total number of transactions available within the date range specified. If &#x60;total_transactions&#x60; is larger than the size of the &#x60;transactions&#x60; array, more transactions are available and can be fetched via manipulating the &#x60;offset&#x60; parameter.
   * @return totalTransactions
  **/
  @ApiModelProperty(required = true, value = "The total number of transactions available within the date range specified. If `total_transactions` is larger than the size of the `transactions` array, more transactions are available and can be fetched via manipulating the `offset` parameter.")

  public Integer getTotalTransactions() {
    return totalTransactions;
  }


  public void setTotalTransactions(Integer totalTransactions) {
    this.totalTransactions = totalTransactions;
  }


  public TransactionsGetResponse item(Item item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(required = true, value = "")

  public Item getItem() {
    return item;
  }


  public void setItem(Item item) {
    this.item = item;
  }


  public TransactionsGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsGetResponse transactionsGetResponse = (TransactionsGetResponse) o;
    return Objects.equals(this.accounts, transactionsGetResponse.accounts) &&
        Objects.equals(this.transactions, transactionsGetResponse.transactions) &&
        Objects.equals(this.totalTransactions, transactionsGetResponse.totalTransactions) &&
        Objects.equals(this.item, transactionsGetResponse.item) &&
        Objects.equals(this.requestId, transactionsGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, transactions, totalTransactions, item, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsGetResponse {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    totalTransactions: ").append(toIndentedString(totalTransactions)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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


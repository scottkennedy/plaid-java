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
import java.time.LocalDate;

/**
 * Data to populate as test transaction data. If not specified, random transactions will be generated instead.
 */
@ApiModel(description = "Data to populate as test transaction data. If not specified, random transactions will be generated instead.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T19:49:08.269481Z[Etc/UTC]")
public class TransactionOverride {
  public static final String SERIALIZED_NAME_DATE_TRANSACTED = "date_transacted";
  @SerializedName(SERIALIZED_NAME_DATE_TRANSACTED)
  private LocalDate dateTransacted;

  public static final String SERIALIZED_NAME_DATE_POSTED = "date_posted";
  @SerializedName(SERIALIZED_NAME_DATE_POSTED)
  private LocalDate datePosted;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;


  public TransactionOverride dateTransacted(LocalDate dateTransacted) {
    
    this.dateTransacted = dateTransacted;
    return this;
  }

   /**
   * The date of the transaction, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format. Transactions in Sandbox will move from pending to posted once their transaction date has been reached. If a &#x60;date_transacted&#x60; is not provided by the institution, a transaction date may be available in the [&#x60;authorized_date&#x60;](https://plaid.com/docs/api/products/transactions/#transactions-get-response-transactions-authorized-date) field.
   * @return dateTransacted
  **/
  @ApiModelProperty(required = true, value = "The date of the transaction, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format. Transactions in Sandbox will move from pending to posted once their transaction date has been reached. If a `date_transacted` is not provided by the institution, a transaction date may be available in the [`authorized_date`](https://plaid.com/docs/api/products/transactions/#transactions-get-response-transactions-authorized-date) field.")

  public LocalDate getDateTransacted() {
    return dateTransacted;
  }


  public void setDateTransacted(LocalDate dateTransacted) {
    this.dateTransacted = dateTransacted;
  }


  public TransactionOverride datePosted(LocalDate datePosted) {
    
    this.datePosted = datePosted;
    return this;
  }

   /**
   * The date the transaction posted, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format. Posted dates in the past or present will result in posted transactions; posted dates in the future will result in pending transactions.
   * @return datePosted
  **/
  @ApiModelProperty(required = true, value = "The date the transaction posted, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) (YYYY-MM-DD) format. Posted dates in the past or present will result in posted transactions; posted dates in the future will result in pending transactions.")

  public LocalDate getDatePosted() {
    return datePosted;
  }


  public void setDatePosted(LocalDate datePosted) {
    this.datePosted = datePosted;
  }


  public TransactionOverride amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The transaction amount. Can be negative.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The transaction amount. Can be negative.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public TransactionOverride description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The transaction description.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The transaction description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransactionOverride currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO-4217 format currency code for the transaction.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO-4217 format currency code for the transaction.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionOverride transactionOverride = (TransactionOverride) o;
    return Objects.equals(this.dateTransacted, transactionOverride.dateTransacted) &&
        Objects.equals(this.datePosted, transactionOverride.datePosted) &&
        Objects.equals(this.amount, transactionOverride.amount) &&
        Objects.equals(this.description, transactionOverride.description) &&
        Objects.equals(this.currency, transactionOverride.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTransacted, datePosted, amount, description, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionOverride {\n");
    sb.append("    dateTransacted: ").append(toIndentedString(dateTransacted)).append("\n");
    sb.append("    datePosted: ").append(toIndentedString(datePosted)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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


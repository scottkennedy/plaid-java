/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.97.0
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
 * For descriptions of possible transaction types and subtypes, see the [Investment transaction types schema](https://plaid.com/docs/api/accounts/#investment-transaction-types-schema).
 */
@JsonAdapter(InvestmentTransactionSubtype.Adapter.class)
public enum InvestmentTransactionSubtype {
  
  ACCOUNT_FEE("account fee"),
  
  ADJUSTMENT("adjustment"),
  
  ASSIGNMENT("assignment"),
  
  BUY("buy"),
  
  BUY_TO_COVER("buy to cover"),
  
  CONTRIBUTION("contribution"),
  
  DEPOSIT("deposit"),
  
  DISTRIBUTION("distribution"),
  
  DIVIDEND("dividend"),
  
  DIVIDEND_REINVESTMENT("dividend reinvestment"),
  
  EXERCISE("exercise"),
  
  EXPIRE("expire"),
  
  FUND_FEE("fund fee"),
  
  INTEREST("interest"),
  
  INTEREST_RECEIVABLE("interest receivable"),
  
  INTEREST_REINVESTMENT("interest reinvestment"),
  
  LEGAL_FEE("legal fee"),
  
  LOAN_PAYMENT("loan payment"),
  
  LONG_TERM_CAPITAL_GAIN("long-term capital gain"),
  
  LONG_TERM_CAPITAL_GAIN_REINVESTMENT("long-term capital gain reinvestment"),
  
  MANAGEMENT_FEE("management fee"),
  
  MARGIN_EXPENSE("margin expense"),
  
  MERGER("merger"),
  
  MISCELLANEOUS_FEE("miscellaneous fee"),
  
  NON_QUALIFIED_DIVIDEND("non-qualified dividend"),
  
  NON_RESIDENT_TAX("non-resident tax"),
  
  PENDING_CREDIT("pending credit"),
  
  PENDING_DEBIT("pending debit"),
  
  QUALIFIED_DIVIDEND("qualified dividend"),
  
  REBALANCE("rebalance"),
  
  RETURN_OF_PRINCIPAL("return of principal"),
  
  SELL("sell"),
  
  SELL_SHORT("sell short"),
  
  SHORT_TERM_CAPITAL_GAIN("short-term capital gain"),
  
  SHORT_TERM_CAPITAL_GAIN_REINVESTMENT("short-term capital gain reinvestment"),
  
  SPIN_OFF("spin off"),
  
  SPLIT("split"),
  
  STOCK_DISTRIBUTION("stock distribution"),
  
  TAX("tax"),
  
  TAX_WITHHELD("tax withheld"),
  
  TRANSFER("transfer"),
  
  TRANSFER_FEE("transfer fee"),
  
  TRUST_FEE("trust fee"),
  
  UNQUALIFIED_GAIN("unqualified gain"),
  
  WITHDRAWAL("withdrawal"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  InvestmentTransactionSubtype(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InvestmentTransactionSubtype fromValue(String value) {
    for (InvestmentTransactionSubtype b : InvestmentTransactionSubtype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return InvestmentTransactionSubtype.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<InvestmentTransactionSubtype> {
    @Override
    public void write(final JsonWriter jsonWriter, final InvestmentTransactionSubtype enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InvestmentTransactionSubtype read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InvestmentTransactionSubtype.fromValue(value);
    }
  }
}


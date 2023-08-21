/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.419.0
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
 * The details of a document income verification in Link
 */
@ApiModel(description = "The details of a document income verification in Link")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class CreditSessionDocumentIncomeResult {
  public static final String SERIALIZED_NAME_NUM_PAYSTUBS_UPLOADED = "num_paystubs_uploaded";
  @SerializedName(SERIALIZED_NAME_NUM_PAYSTUBS_UPLOADED)
  private Integer numPaystubsUploaded;

  public static final String SERIALIZED_NAME_NUM_W2S_UPLOADED = "num_w2s_uploaded";
  @SerializedName(SERIALIZED_NAME_NUM_W2S_UPLOADED)
  private Integer numW2sUploaded;

  public static final String SERIALIZED_NAME_NUM_BANK_STATEMENTS_UPLOADED = "num_bank_statements_uploaded";
  @SerializedName(SERIALIZED_NAME_NUM_BANK_STATEMENTS_UPLOADED)
  private Integer numBankStatementsUploaded;


  public CreditSessionDocumentIncomeResult numPaystubsUploaded(Integer numPaystubsUploaded) {
    
    this.numPaystubsUploaded = numPaystubsUploaded;
    return this;
  }

   /**
   * The number of paystubs uploaded by the user.
   * @return numPaystubsUploaded
  **/
  @ApiModelProperty(required = true, value = "The number of paystubs uploaded by the user.")

  public Integer getNumPaystubsUploaded() {
    return numPaystubsUploaded;
  }


  public void setNumPaystubsUploaded(Integer numPaystubsUploaded) {
    this.numPaystubsUploaded = numPaystubsUploaded;
  }


  public CreditSessionDocumentIncomeResult numW2sUploaded(Integer numW2sUploaded) {
    
    this.numW2sUploaded = numW2sUploaded;
    return this;
  }

   /**
   * The number of w2s uploaded by the user.
   * @return numW2sUploaded
  **/
  @ApiModelProperty(required = true, value = "The number of w2s uploaded by the user.")

  public Integer getNumW2sUploaded() {
    return numW2sUploaded;
  }


  public void setNumW2sUploaded(Integer numW2sUploaded) {
    this.numW2sUploaded = numW2sUploaded;
  }


  public CreditSessionDocumentIncomeResult numBankStatementsUploaded(Integer numBankStatementsUploaded) {
    
    this.numBankStatementsUploaded = numBankStatementsUploaded;
    return this;
  }

   /**
   * The number of bank statements uploaded by the user.
   * @return numBankStatementsUploaded
  **/
  @ApiModelProperty(required = true, value = "The number of bank statements uploaded by the user.")

  public Integer getNumBankStatementsUploaded() {
    return numBankStatementsUploaded;
  }


  public void setNumBankStatementsUploaded(Integer numBankStatementsUploaded) {
    this.numBankStatementsUploaded = numBankStatementsUploaded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditSessionDocumentIncomeResult creditSessionDocumentIncomeResult = (CreditSessionDocumentIncomeResult) o;
    return Objects.equals(this.numPaystubsUploaded, creditSessionDocumentIncomeResult.numPaystubsUploaded) &&
        Objects.equals(this.numW2sUploaded, creditSessionDocumentIncomeResult.numW2sUploaded) &&
        Objects.equals(this.numBankStatementsUploaded, creditSessionDocumentIncomeResult.numBankStatementsUploaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numPaystubsUploaded, numW2sUploaded, numBankStatementsUploaded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditSessionDocumentIncomeResult {\n");
    sb.append("    numPaystubsUploaded: ").append(toIndentedString(numPaystubsUploaded)).append("\n");
    sb.append("    numW2sUploaded: ").append(toIndentedString(numW2sUploaded)).append("\n");
    sb.append("    numBankStatementsUploaded: ").append(toIndentedString(numBankStatementsUploaded)).append("\n");
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


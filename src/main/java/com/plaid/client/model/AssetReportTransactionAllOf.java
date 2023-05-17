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
import com.plaid.client.model.CreditCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AssetReportTransactionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class AssetReportTransactionAllOf {
  public static final String SERIALIZED_NAME_DATE_TRANSACTED = "date_transacted";
  @SerializedName(SERIALIZED_NAME_DATE_TRANSACTED)
  private String dateTransacted;

  public static final String SERIALIZED_NAME_CREDIT_CATEGORY = "credit_category";
  @SerializedName(SERIALIZED_NAME_CREDIT_CATEGORY)
  private CreditCategory creditCategory;


  public AssetReportTransactionAllOf dateTransacted(String dateTransacted) {
    
    this.dateTransacted = dateTransacted;
    return this;
  }

   /**
   * The date on which the transaction took place, in IS0 8601 format.
   * @return dateTransacted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the transaction took place, in IS0 8601 format.")

  public String getDateTransacted() {
    return dateTransacted;
  }


  public void setDateTransacted(String dateTransacted) {
    this.dateTransacted = dateTransacted;
  }


  public AssetReportTransactionAllOf creditCategory(CreditCategory creditCategory) {
    
    this.creditCategory = creditCategory;
    return this;
  }

   /**
   * Get creditCategory
   * @return creditCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditCategory getCreditCategory() {
    return creditCategory;
  }


  public void setCreditCategory(CreditCategory creditCategory) {
    this.creditCategory = creditCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportTransactionAllOf assetReportTransactionAllOf = (AssetReportTransactionAllOf) o;
    return Objects.equals(this.dateTransacted, assetReportTransactionAllOf.dateTransacted) &&
        Objects.equals(this.creditCategory, assetReportTransactionAllOf.creditCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTransacted, creditCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportTransactionAllOf {\n");
    sb.append("    dateTransacted: ").append(toIndentedString(dateTransacted)).append("\n");
    sb.append("    creditCategory: ").append(toIndentedString(creditCategory)).append("\n");
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


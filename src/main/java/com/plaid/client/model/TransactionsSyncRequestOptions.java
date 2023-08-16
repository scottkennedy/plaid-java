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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An optional object to be used with the request. If specified, &#x60;options&#x60; must not be &#x60;null&#x60;.
 */
@ApiModel(description = "An optional object to be used with the request. If specified, `options` must not be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class TransactionsSyncRequestOptions {
  public static final String SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION = "include_original_description";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION)
  private Boolean includeOriginalDescription = false;

  public static final String SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY = "include_personal_finance_category";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY)
  private Boolean includePersonalFinanceCategory = false;

  public static final String SERIALIZED_NAME_INCLUDE_LOGO_AND_COUNTERPARTY_BETA = "include_logo_and_counterparty_beta";
  @SerializedName(SERIALIZED_NAME_INCLUDE_LOGO_AND_COUNTERPARTY_BETA)
  private Boolean includeLogoAndCounterpartyBeta = false;


  public TransactionsSyncRequestOptions includeOriginalDescription(Boolean includeOriginalDescription) {
    
    this.includeOriginalDescription = includeOriginalDescription;
    return this;
  }

   /**
   * Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager or submit a [Support request](https://dashboard.plaid.com/support/new/product-and-development/product-troubleshooting/product-functionality).
   * @return includeOriginalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager or submit a [Support request](https://dashboard.plaid.com/support/new/product-and-development/product-troubleshooting/product-functionality).")

  public Boolean getIncludeOriginalDescription() {
    return includeOriginalDescription;
  }


  public void setIncludeOriginalDescription(Boolean includeOriginalDescription) {
    this.includeOriginalDescription = includeOriginalDescription;
  }


  public TransactionsSyncRequestOptions includePersonalFinanceCategory(Boolean includePersonalFinanceCategory) {
    
    this.includePersonalFinanceCategory = includePersonalFinanceCategory;
    return this;
  }

   /**
   * Include the [&#x60;personal_finance_category&#x60;](https://plaid.com/docs/api/products/transactions/#transactions-sync-response-added-personal-finance-category) object in the response.  All implementations are encouraged to use set this field to &#x60;true&#x60; and to use the &#x60;personal_finance_category&#x60; instead of &#x60;category&#x60; for more meaningful and accurate categorization.  See the [&#x60;taxonomy csv file&#x60;](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories.
   * @return includePersonalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the [`personal_finance_category`](https://plaid.com/docs/api/products/transactions/#transactions-sync-response-added-personal-finance-category) object in the response.  All implementations are encouraged to use set this field to `true` and to use the `personal_finance_category` instead of `category` for more meaningful and accurate categorization.  See the [`taxonomy csv file`](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories.")

  public Boolean getIncludePersonalFinanceCategory() {
    return includePersonalFinanceCategory;
  }


  public void setIncludePersonalFinanceCategory(Boolean includePersonalFinanceCategory) {
    this.includePersonalFinanceCategory = includePersonalFinanceCategory;
  }


  public TransactionsSyncRequestOptions includeLogoAndCounterpartyBeta(Boolean includeLogoAndCounterpartyBeta) {
    
    this.includeLogoAndCounterpartyBeta = includeLogoAndCounterpartyBeta;
    return this;
  }

   /**
   * Include counterparties and extra merchant fields in the transaction. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager.
   * @return includeLogoAndCounterpartyBeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include counterparties and extra merchant fields in the transaction. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager.")

  public Boolean getIncludeLogoAndCounterpartyBeta() {
    return includeLogoAndCounterpartyBeta;
  }


  public void setIncludeLogoAndCounterpartyBeta(Boolean includeLogoAndCounterpartyBeta) {
    this.includeLogoAndCounterpartyBeta = includeLogoAndCounterpartyBeta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsSyncRequestOptions transactionsSyncRequestOptions = (TransactionsSyncRequestOptions) o;
    return Objects.equals(this.includeOriginalDescription, transactionsSyncRequestOptions.includeOriginalDescription) &&
        Objects.equals(this.includePersonalFinanceCategory, transactionsSyncRequestOptions.includePersonalFinanceCategory) &&
        Objects.equals(this.includeLogoAndCounterpartyBeta, transactionsSyncRequestOptions.includeLogoAndCounterpartyBeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeOriginalDescription, includePersonalFinanceCategory, includeLogoAndCounterpartyBeta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsSyncRequestOptions {\n");
    sb.append("    includeOriginalDescription: ").append(toIndentedString(includeOriginalDescription)).append("\n");
    sb.append("    includePersonalFinanceCategory: ").append(toIndentedString(includePersonalFinanceCategory)).append("\n");
    sb.append("    includeLogoAndCounterpartyBeta: ").append(toIndentedString(includeLogoAndCounterpartyBeta)).append("\n");
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


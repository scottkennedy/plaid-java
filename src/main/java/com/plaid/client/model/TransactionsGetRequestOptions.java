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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An optional object to be used with the request. If specified, &#x60;options&#x60; must not be &#x60;null&#x60;.
 */
@ApiModel(description = "An optional object to be used with the request. If specified, `options` must not be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-15T01:32:54.341913Z[Etc/UTC]")
public class TransactionsGetRequestOptions {
  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "account_ids";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = null;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 100;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION = "include_original_description";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION)
  private Boolean includeOriginalDescription = false;

  public static final String SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY_BETA = "include_personal_finance_category_beta";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY_BETA)
  private Boolean includePersonalFinanceCategoryBeta = false;

  public static final String SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY = "include_personal_finance_category";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY)
  private Boolean includePersonalFinanceCategory = false;


  public TransactionsGetRequestOptions accountIds(List<String> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public TransactionsGetRequestOptions addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * A list of &#x60;account_ids&#x60; to retrieve for the Item  Note: An error will be returned if a provided &#x60;account_id&#x60; is not associated with the Item.
   * @return accountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of `account_ids` to retrieve for the Item  Note: An error will be returned if a provided `account_id` is not associated with the Item.")

  public List<String> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  public TransactionsGetRequestOptions count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The number of transactions to fetch.
   * minimum: 1
   * maximum: 500
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of transactions to fetch.")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public TransactionsGetRequestOptions offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The number of transactions to skip. The default value is 0.
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of transactions to skip. The default value is 0.")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public TransactionsGetRequestOptions includeOriginalDescription(Boolean includeOriginalDescription) {
    
    this.includeOriginalDescription = includeOriginalDescription;
    return this;
  }

   /**
   * Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager.
   * @return includeOriginalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager.")

  public Boolean getIncludeOriginalDescription() {
    return includeOriginalDescription;
  }


  public void setIncludeOriginalDescription(Boolean includeOriginalDescription) {
    this.includeOriginalDescription = includeOriginalDescription;
  }


  public TransactionsGetRequestOptions includePersonalFinanceCategoryBeta(Boolean includePersonalFinanceCategoryBeta) {
    
    this.includePersonalFinanceCategoryBeta = includePersonalFinanceCategoryBeta;
    return this;
  }

   /**
   * Please use [&#x60;include_personal_finance_category&#x60;](https://plaid.com/docs/api/products/transactions/#transactions-get-request-options-include-personal-finance-category) instead.
   * @return includePersonalFinanceCategoryBeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Please use [`include_personal_finance_category`](https://plaid.com/docs/api/products/transactions/#transactions-get-request-options-include-personal-finance-category) instead.")

  public Boolean getIncludePersonalFinanceCategoryBeta() {
    return includePersonalFinanceCategoryBeta;
  }


  public void setIncludePersonalFinanceCategoryBeta(Boolean includePersonalFinanceCategoryBeta) {
    this.includePersonalFinanceCategoryBeta = includePersonalFinanceCategoryBeta;
  }


  public TransactionsGetRequestOptions includePersonalFinanceCategory(Boolean includePersonalFinanceCategory) {
    
    this.includePersonalFinanceCategory = includePersonalFinanceCategory;
    return this;
  }

   /**
   * Include the [&#x60;personal_finance_category&#x60;](https://plaid.com/docs/api/products/transactions/#transactions-get-response-transactions-personal-finance-category) object in the response.  See the [&#x60;taxonomy csv file&#x60;](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories.
   * @return includePersonalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the [`personal_finance_category`](https://plaid.com/docs/api/products/transactions/#transactions-get-response-transactions-personal-finance-category) object in the response.  See the [`taxonomy csv file`](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories.")

  public Boolean getIncludePersonalFinanceCategory() {
    return includePersonalFinanceCategory;
  }


  public void setIncludePersonalFinanceCategory(Boolean includePersonalFinanceCategory) {
    this.includePersonalFinanceCategory = includePersonalFinanceCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsGetRequestOptions transactionsGetRequestOptions = (TransactionsGetRequestOptions) o;
    return Objects.equals(this.accountIds, transactionsGetRequestOptions.accountIds) &&
        Objects.equals(this.count, transactionsGetRequestOptions.count) &&
        Objects.equals(this.offset, transactionsGetRequestOptions.offset) &&
        Objects.equals(this.includeOriginalDescription, transactionsGetRequestOptions.includeOriginalDescription) &&
        Objects.equals(this.includePersonalFinanceCategoryBeta, transactionsGetRequestOptions.includePersonalFinanceCategoryBeta) &&
        Objects.equals(this.includePersonalFinanceCategory, transactionsGetRequestOptions.includePersonalFinanceCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, count, offset, includeOriginalDescription, includePersonalFinanceCategoryBeta, includePersonalFinanceCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsGetRequestOptions {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    includeOriginalDescription: ").append(toIndentedString(includeOriginalDescription)).append("\n");
    sb.append("    includePersonalFinanceCategoryBeta: ").append(toIndentedString(includePersonalFinanceCategoryBeta)).append("\n");
    sb.append("    includePersonalFinanceCategory: ").append(toIndentedString(includePersonalFinanceCategory)).append("\n");
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


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
import java.util.ArrayList;
import java.util.List;

/**
 * An optional object to filter &#x60;/investments/transactions/get&#x60; results. If provided, must be non-&#x60;null&#x60;.
 */
@ApiModel(description = "An optional object to filter `/investments/transactions/get` results. If provided, must be non-`null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class InvestmentsTransactionsGetRequestOptions {
  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "account_ids";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = null;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 100;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset = 0;

  public static final String SERIALIZED_NAME_ASYNC_UPDATE = "async_update";
  @SerializedName(SERIALIZED_NAME_ASYNC_UPDATE)
  private Boolean asyncUpdate = false;


  public InvestmentsTransactionsGetRequestOptions accountIds(List<String> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public InvestmentsTransactionsGetRequestOptions addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * An array of &#x60;account_ids&#x60; to retrieve for the Item.
   * @return accountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of `account_ids` to retrieve for the Item.")

  public List<String> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  public InvestmentsTransactionsGetRequestOptions count(Integer count) {
    
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
  @ApiModelProperty(value = "The number of transactions to fetch. ")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public InvestmentsTransactionsGetRequestOptions offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * The number of transactions to skip when fetching transaction history
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of transactions to skip when fetching transaction history")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public InvestmentsTransactionsGetRequestOptions asyncUpdate(Boolean asyncUpdate) {
    
    this.asyncUpdate = asyncUpdate;
    return this;
  }

   /**
   * If the Item was not initialized with the investments product via the &#x60;products&#x60; array when calling &#x60;/link/token/create&#x60;, and &#x60;async_update&#x60; is set to true, the initial Investments extraction will happen asynchronously. Plaid will subsequently fire a &#x60;HISTORICAL_UPDATE&#x60; webhook when the extraction completes. When &#x60;false&#x60;, Plaid will wait to return a response until extraction completion and no &#x60;HISTORICAL_UPDATE&#x60; webhook will fire. Note that while the extraction is happening asynchronously, calls to &#x60;/investments/transactions/get&#x60; and &#x60;/investments/refresh&#x60; will return &#x60;PRODUCT_NOT_READY&#x60; errors until the extraction completes.
   * @return asyncUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the Item was not initialized with the investments product via the `products` array when calling `/link/token/create`, and `async_update` is set to true, the initial Investments extraction will happen asynchronously. Plaid will subsequently fire a `HISTORICAL_UPDATE` webhook when the extraction completes. When `false`, Plaid will wait to return a response until extraction completion and no `HISTORICAL_UPDATE` webhook will fire. Note that while the extraction is happening asynchronously, calls to `/investments/transactions/get` and `/investments/refresh` will return `PRODUCT_NOT_READY` errors until the extraction completes.")

  public Boolean getAsyncUpdate() {
    return asyncUpdate;
  }


  public void setAsyncUpdate(Boolean asyncUpdate) {
    this.asyncUpdate = asyncUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentsTransactionsGetRequestOptions investmentsTransactionsGetRequestOptions = (InvestmentsTransactionsGetRequestOptions) o;
    return Objects.equals(this.accountIds, investmentsTransactionsGetRequestOptions.accountIds) &&
        Objects.equals(this.count, investmentsTransactionsGetRequestOptions.count) &&
        Objects.equals(this.offset, investmentsTransactionsGetRequestOptions.offset) &&
        Objects.equals(this.asyncUpdate, investmentsTransactionsGetRequestOptions.asyncUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, count, offset, asyncUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsTransactionsGetRequestOptions {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    asyncUpdate: ").append(toIndentedString(asyncUpdate)).append("\n");
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


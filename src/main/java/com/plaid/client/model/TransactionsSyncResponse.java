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
import com.plaid.client.model.RemovedTransaction;
import com.plaid.client.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsSyncResponse defines the response schema for &#x60;/transactions/sync&#x60;
 */
@ApiModel(description = "TransactionsSyncResponse defines the response schema for `/transactions/sync`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class TransactionsSyncResponse {
  public static final String SERIALIZED_NAME_ADDED = "added";
  @SerializedName(SERIALIZED_NAME_ADDED)
  private List<Transaction> added = new ArrayList<>();

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private List<Transaction> modified = new ArrayList<>();

  public static final String SERIALIZED_NAME_REMOVED = "removed";
  @SerializedName(SERIALIZED_NAME_REMOVED)
  private List<RemovedTransaction> removed = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_HAS_MORE = "has_more";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public TransactionsSyncResponse added(List<Transaction> added) {
    
    this.added = added;
    return this;
  }

  public TransactionsSyncResponse addAddedItem(Transaction addedItem) {
    this.added.add(addedItem);
    return this;
  }

   /**
   * Transactions that have been added to the Item since &#x60;cursor&#x60; ordered by ascending last modified time.
   * @return added
  **/
  @ApiModelProperty(required = true, value = "Transactions that have been added to the Item since `cursor` ordered by ascending last modified time.")

  public List<Transaction> getAdded() {
    return added;
  }


  public void setAdded(List<Transaction> added) {
    this.added = added;
  }


  public TransactionsSyncResponse modified(List<Transaction> modified) {
    
    this.modified = modified;
    return this;
  }

  public TransactionsSyncResponse addModifiedItem(Transaction modifiedItem) {
    this.modified.add(modifiedItem);
    return this;
  }

   /**
   * Transactions that have been modified on the Item since &#x60;cursor&#x60; ordered by ascending last modified time.
   * @return modified
  **/
  @ApiModelProperty(required = true, value = "Transactions that have been modified on the Item since `cursor` ordered by ascending last modified time.")

  public List<Transaction> getModified() {
    return modified;
  }


  public void setModified(List<Transaction> modified) {
    this.modified = modified;
  }


  public TransactionsSyncResponse removed(List<RemovedTransaction> removed) {
    
    this.removed = removed;
    return this;
  }

  public TransactionsSyncResponse addRemovedItem(RemovedTransaction removedItem) {
    this.removed.add(removedItem);
    return this;
  }

   /**
   * Transactions that have been removed from the Item since &#x60;cursor&#x60; ordered by ascending last modified time.
   * @return removed
  **/
  @ApiModelProperty(required = true, value = "Transactions that have been removed from the Item since `cursor` ordered by ascending last modified time.")

  public List<RemovedTransaction> getRemoved() {
    return removed;
  }


  public void setRemoved(List<RemovedTransaction> removed) {
    this.removed = removed;
  }


  public TransactionsSyncResponse nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * Cursor used for fetching any future updates after the latest update provided in this response. The cursor obtained after all pages have been pulled (indicated by &#x60;has_more&#x60; being &#x60;false&#x60;) will be valid for at least 1 year. This cursor should be persisted for later calls. If transactions are not yet available, this will be an empty string.
   * @return nextCursor
  **/
  @ApiModelProperty(required = true, value = "Cursor used for fetching any future updates after the latest update provided in this response. The cursor obtained after all pages have been pulled (indicated by `has_more` being `false`) will be valid for at least 1 year. This cursor should be persisted for later calls. If transactions are not yet available, this will be an empty string.")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  public TransactionsSyncResponse hasMore(Boolean hasMore) {
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Represents if more than requested count of transaction updates exist. If true, the additional updates can be fetched by making an additional request with &#x60;cursor&#x60; set to &#x60;next_cursor&#x60;. If &#x60;has_more&#x60; is true, it’s important to pull all available pages, to make it less likely for underlying data changes to conflict with pagination.
   * @return hasMore
  **/
  @ApiModelProperty(required = true, value = "Represents if more than requested count of transaction updates exist. If true, the additional updates can be fetched by making an additional request with `cursor` set to `next_cursor`. If `has_more` is true, it’s important to pull all available pages, to make it less likely for underlying data changes to conflict with pagination.")

  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }


  public TransactionsSyncResponse requestId(String requestId) {
    
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
    TransactionsSyncResponse transactionsSyncResponse = (TransactionsSyncResponse) o;
    return Objects.equals(this.added, transactionsSyncResponse.added) &&
        Objects.equals(this.modified, transactionsSyncResponse.modified) &&
        Objects.equals(this.removed, transactionsSyncResponse.removed) &&
        Objects.equals(this.nextCursor, transactionsSyncResponse.nextCursor) &&
        Objects.equals(this.hasMore, transactionsSyncResponse.hasMore) &&
        Objects.equals(this.requestId, transactionsSyncResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(added, modified, removed, nextCursor, hasMore, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsSyncResponse {\n");
    sb.append("    added: ").append(toIndentedString(added)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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


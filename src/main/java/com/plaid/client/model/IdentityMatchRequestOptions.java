/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.161.5
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
 * An optional object to filter /identity/match results
 */
@ApiModel(description = "An optional object to filter /identity/match results")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T20:00:26.713837Z[Etc/UTC]")
public class IdentityMatchRequestOptions {
  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "account_ids";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = null;


  public IdentityMatchRequestOptions accountIds(List<String> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public IdentityMatchRequestOptions addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * An array of &#x60;account_ids&#x60; to perform fuzzy match
   * @return accountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of `account_ids` to perform fuzzy match")

  public List<String> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityMatchRequestOptions identityMatchRequestOptions = (IdentityMatchRequestOptions) o;
    return Objects.equals(this.accountIds, identityMatchRequestOptions.accountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityMatchRequestOptions {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
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

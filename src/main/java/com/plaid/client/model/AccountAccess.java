/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.196.0
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
import com.plaid.client.model.AccountProductAccessNullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Allow or disallow product access by account. Unlisted (e.g. missing) accounts will be considered &#x60;new_accounts&#x60;.
 */
@ApiModel(description = "Allow or disallow product access by account. Unlisted (e.g. missing) accounts will be considered `new_accounts`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T23:20:54.499428Z[Etc/UTC]")
public class AccountAccess {
  public static final String SERIALIZED_NAME_UNIQUE_ID = "unique_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_ID)
  private String uniqueId;

  public static final String SERIALIZED_NAME_AUTHORIZED = "authorized";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED)
  private Boolean authorized = true;

  public static final String SERIALIZED_NAME_ACCOUNT_PRODUCT_ACCESS = "account_product_access";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_PRODUCT_ACCESS)
  private AccountProductAccessNullable accountProductAccess;


  public AccountAccess uniqueId(String uniqueId) {
    
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * The unique account identifier for this account. This value must match that returned by the data access API for this account.
   * @return uniqueId
  **/
  @ApiModelProperty(required = true, value = "The unique account identifier for this account. This value must match that returned by the data access API for this account.")

  public String getUniqueId() {
    return uniqueId;
  }


  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  public AccountAccess authorized(Boolean authorized) {
    
    this.authorized = authorized;
    return this;
  }

   /**
   * Allow the application to see this account (and associated details, including balance) in the list of accounts  If unset, defaults to &#x60;true&#x60;.
   * @return authorized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow the application to see this account (and associated details, including balance) in the list of accounts  If unset, defaults to `true`.")

  public Boolean getAuthorized() {
    return authorized;
  }


  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }


  public AccountAccess accountProductAccess(AccountProductAccessNullable accountProductAccess) {
    
    this.accountProductAccess = accountProductAccess;
    return this;
  }

   /**
   * Get accountProductAccess
   * @return accountProductAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountProductAccessNullable getAccountProductAccess() {
    return accountProductAccess;
  }


  public void setAccountProductAccess(AccountProductAccessNullable accountProductAccess) {
    this.accountProductAccess = accountProductAccess;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAccess accountAccess = (AccountAccess) o;
    return Objects.equals(this.uniqueId, accountAccess.uniqueId) &&
        Objects.equals(this.authorized, accountAccess.authorized) &&
        Objects.equals(this.accountProductAccess, accountAccess.accountProductAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueId, authorized, accountProductAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAccess {\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    accountProductAccess: ").append(toIndentedString(accountProductAccess)).append("\n");
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


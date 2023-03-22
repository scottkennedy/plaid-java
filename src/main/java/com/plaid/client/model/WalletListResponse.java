/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.343.0
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
import com.plaid.client.model.Wallet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WalletListResponse defines the response schema for &#x60;/wallet/list&#x60;
 */
@ApiModel(description = "WalletListResponse defines the response schema for `/wallet/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-22T21:32:38.660057Z[Etc/UTC]")
public class WalletListResponse {
  public static final String SERIALIZED_NAME_WALLETS = "wallets";
  @SerializedName(SERIALIZED_NAME_WALLETS)
  private List<Wallet> wallets = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public WalletListResponse wallets(List<Wallet> wallets) {
    
    this.wallets = wallets;
    return this;
  }

  public WalletListResponse addWalletsItem(Wallet walletsItem) {
    this.wallets.add(walletsItem);
    return this;
  }

   /**
   * An array of e-wallets
   * @return wallets
  **/
  @ApiModelProperty(required = true, value = "An array of e-wallets")

  public List<Wallet> getWallets() {
    return wallets;
  }


  public void setWallets(List<Wallet> wallets) {
    this.wallets = wallets;
  }


  public WalletListResponse nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * Cursor used for fetching e-wallets created before the latest e-wallet provided in this response
   * @return nextCursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cursor used for fetching e-wallets created before the latest e-wallet provided in this response")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  public WalletListResponse requestId(String requestId) {
    
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
    WalletListResponse walletListResponse = (WalletListResponse) o;
    return Objects.equals(this.wallets, walletListResponse.wallets) &&
        Objects.equals(this.nextCursor, walletListResponse.nextCursor) &&
        Objects.equals(this.requestId, walletListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wallets, nextCursor, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletListResponse {\n");
    sb.append("    wallets: ").append(toIndentedString(wallets)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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


/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.474.0
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
 * Information about the balance of the ledger held with Plaid.
 */
@ApiModel(description = "Information about the balance of the ledger held with Plaid.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-27T21:25:22.505956Z[Etc/UTC]")
public class TransferLedgerBalance {
  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private String available;

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private String pending;


  public TransferLedgerBalance available(String available) {
    
    this.available = available;
    return this;
  }

   /**
   * The amount of this balance available for use (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return available
  **/
  @ApiModelProperty(required = true, value = "The amount of this balance available for use (decimal string with two digits of precision e.g. \"10.00\").")

  public String getAvailable() {
    return available;
  }


  public void setAvailable(String available) {
    this.available = available;
  }


  public TransferLedgerBalance pending(String pending) {
    
    this.pending = pending;
    return this;
  }

   /**
   * The amount of pending funds that are in processing (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return pending
  **/
  @ApiModelProperty(required = true, value = "The amount of pending funds that are in processing (decimal string with two digits of precision e.g. \"10.00\").")

  public String getPending() {
    return pending;
  }


  public void setPending(String pending) {
    this.pending = pending;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferLedgerBalance transferLedgerBalance = (TransferLedgerBalance) o;
    return Objects.equals(this.available, transferLedgerBalance.available) &&
        Objects.equals(this.pending, transferLedgerBalance.pending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, pending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferLedgerBalance {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
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


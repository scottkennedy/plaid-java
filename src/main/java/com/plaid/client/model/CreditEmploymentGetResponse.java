/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.214.0
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
import com.plaid.client.model.CreditEmploymentItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreditEmploymentGetResponse defines the response schema for &#x60;/credit/employment/get&#x60;.
 */
@ApiModel(description = "CreditEmploymentGetResponse defines the response schema for `/credit/employment/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-18T17:46:09.980340Z[Etc/UTC]")
public class CreditEmploymentGetResponse {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<CreditEmploymentItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public CreditEmploymentGetResponse items(List<CreditEmploymentItem> items) {
    
    this.items = items;
    return this;
  }

  public CreditEmploymentGetResponse addItemsItem(CreditEmploymentItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of employment items.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Array of employment items.")

  public List<CreditEmploymentItem> getItems() {
    return items;
  }


  public void setItems(List<CreditEmploymentItem> items) {
    this.items = items;
  }


  public CreditEmploymentGetResponse requestId(String requestId) {
    
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
    CreditEmploymentGetResponse creditEmploymentGetResponse = (CreditEmploymentGetResponse) o;
    return Objects.equals(this.items, creditEmploymentGetResponse.items) &&
        Objects.equals(this.requestId, creditEmploymentGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditEmploymentGetResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


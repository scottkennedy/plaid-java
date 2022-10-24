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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Deduction on the paystub
 */
@ApiModel(description = "Deduction on the paystub")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T23:20:54.499428Z[Etc/UTC]")
public class PaystubDeduction {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_IS_PRETAX = "is_pretax";
  @SerializedName(SERIALIZED_NAME_IS_PRETAX)
  private Boolean isPretax;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Double total;


  public PaystubDeduction type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The description of the deduction, as provided on the paystub. For example: &#x60;\&quot;401(k)\&quot;&#x60;, &#x60;\&quot;FICA MED TAX\&quot;&#x60;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The description of the deduction, as provided on the paystub. For example: `\"401(k)\"`, `\"FICA MED TAX\"`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PaystubDeduction isPretax(Boolean isPretax) {
    
    this.isPretax = isPretax;
    return this;
  }

   /**
   * &#x60;true&#x60; if the deduction is pre-tax; &#x60;false&#x60; otherwise.
   * @return isPretax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "`true` if the deduction is pre-tax; `false` otherwise.")

  public Boolean getIsPretax() {
    return isPretax;
  }


  public void setIsPretax(Boolean isPretax) {
    this.isPretax = isPretax;
  }


  public PaystubDeduction total(Double total) {
    
    this.total = total;
    return this;
  }

   /**
   * The amount of the deduction.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The amount of the deduction.")

  public Double getTotal() {
    return total;
  }


  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubDeduction paystubDeduction = (PaystubDeduction) o;
    return Objects.equals(this.type, paystubDeduction.type) &&
        Objects.equals(this.isPretax, paystubDeduction.isPretax) &&
        Objects.equals(this.total, paystubDeduction.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, isPretax, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubDeduction {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isPretax: ").append(toIndentedString(isPretax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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


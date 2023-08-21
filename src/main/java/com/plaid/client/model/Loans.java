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
import com.plaid.client.model.Loan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A collection of loans that are part of a single deal.
 */
@ApiModel(description = "A collection of loans that are part of a single deal.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-21T16:47:52.980339Z[Etc/UTC]")
public class Loans {
  public static final String SERIALIZED_NAME_L_O_A_N = "LOAN";
  @SerializedName(SERIALIZED_NAME_L_O_A_N)
  private Loan LOAN;


  public Loans LOAN(Loan LOAN) {
    
    this.LOAN = LOAN;
    return this;
  }

   /**
   * Get LOAN
   * @return LOAN
  **/
  @ApiModelProperty(required = true, value = "")

  public Loan getLOAN() {
    return LOAN;
  }


  public void setLOAN(Loan LOAN) {
    this.LOAN = LOAN;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loans loans = (Loans) o;
    return Objects.equals(this.LOAN, loans.LOAN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LOAN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Loans {\n");
    sb.append("    LOAN: ").append(toIndentedString(LOAN)).append("\n");
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


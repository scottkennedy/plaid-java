/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.2
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
import com.plaid.client.model.SecurityOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Specify the holdings on the account.
 */
@ApiModel(description = "Specify the holdings on the account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T20:55:29.933887Z[Etc/UTC]")
public class HoldingsOverride {
  public static final String SERIALIZED_NAME_INSTITUTION_PRICE = "institution_price";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_PRICE)
  private Double institutionPrice;

  public static final String SERIALIZED_NAME_INSTITUTION_PRICE_AS_OF = "institution_price_as_of";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_PRICE_AS_OF)
  private LocalDate institutionPriceAsOf;

  public static final String SERIALIZED_NAME_COST_BASIS = "cost_basis";
  @SerializedName(SERIALIZED_NAME_COST_BASIS)
  private Double costBasis;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Double quantity;

  public static final String SERIALIZED_NAME_VESTED_QUANTITY = "vested_quantity";
  @SerializedName(SERIALIZED_NAME_VESTED_QUANTITY)
  private Double vestedQuantity;

  public static final String SERIALIZED_NAME_VESTED_VALUE = "vested_value";
  @SerializedName(SERIALIZED_NAME_VESTED_VALUE)
  private Double vestedValue;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private SecurityOverride security;


  public HoldingsOverride institutionPrice(Double institutionPrice) {
    
    this.institutionPrice = institutionPrice;
    return this;
  }

   /**
   * The last price given by the institution for this security
   * @return institutionPrice
  **/
  @ApiModelProperty(required = true, value = "The last price given by the institution for this security")

  public Double getInstitutionPrice() {
    return institutionPrice;
  }


  public void setInstitutionPrice(Double institutionPrice) {
    this.institutionPrice = institutionPrice;
  }


  public HoldingsOverride institutionPriceAsOf(LocalDate institutionPriceAsOf) {
    
    this.institutionPriceAsOf = institutionPriceAsOf;
    return this;
  }

   /**
   * The date at which &#x60;institution_price&#x60; was current. Must be formatted as an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) date.
   * @return institutionPriceAsOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which `institution_price` was current. Must be formatted as an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) date.")

  public LocalDate getInstitutionPriceAsOf() {
    return institutionPriceAsOf;
  }


  public void setInstitutionPriceAsOf(LocalDate institutionPriceAsOf) {
    this.institutionPriceAsOf = institutionPriceAsOf;
  }


  public HoldingsOverride costBasis(Double costBasis) {
    
    this.costBasis = costBasis;
    return this;
  }

   /**
   * The total cost basis of the holding (e.g., the total amount spent to acquire all assets currently in the holding).
   * @return costBasis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total cost basis of the holding (e.g., the total amount spent to acquire all assets currently in the holding).")

  public Double getCostBasis() {
    return costBasis;
  }


  public void setCostBasis(Double costBasis) {
    this.costBasis = costBasis;
  }


  public HoldingsOverride quantity(Double quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The total quantity of the asset held, as reported by the financial institution.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The total quantity of the asset held, as reported by the financial institution.")

  public Double getQuantity() {
    return quantity;
  }


  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  public HoldingsOverride vestedQuantity(Double vestedQuantity) {
    
    this.vestedQuantity = vestedQuantity;
    return this;
  }

   /**
   * The total quantity of vested assets held, as reported by the financial institution. Vested assets are only associated with [equities](https://plaid.com/docs/api/products/investments/#investments-holdings-get-response-securities-type).
   * @return vestedQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total quantity of vested assets held, as reported by the financial institution. Vested assets are only associated with [equities](https://plaid.com/docs/api/products/investments/#investments-holdings-get-response-securities-type).")

  public Double getVestedQuantity() {
    return vestedQuantity;
  }


  public void setVestedQuantity(Double vestedQuantity) {
    this.vestedQuantity = vestedQuantity;
  }


  public HoldingsOverride vestedValue(Double vestedValue) {
    
    this.vestedValue = vestedValue;
    return this;
  }

   /**
   * The value of the vested holdings as reported by the institution.
   * @return vestedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the vested holdings as reported by the institution.")

  public Double getVestedValue() {
    return vestedValue;
  }


  public void setVestedValue(Double vestedValue) {
    this.vestedValue = vestedValue;
  }


  public HoldingsOverride currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Either a valid &#x60;iso_currency_code&#x60; or &#x60;unofficial_currency_code&#x60;
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Either a valid `iso_currency_code` or `unofficial_currency_code`")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public HoldingsOverride security(SecurityOverride security) {
    
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @ApiModelProperty(required = true, value = "")

  public SecurityOverride getSecurity() {
    return security;
  }


  public void setSecurity(SecurityOverride security) {
    this.security = security;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldingsOverride holdingsOverride = (HoldingsOverride) o;
    return Objects.equals(this.institutionPrice, holdingsOverride.institutionPrice) &&
        Objects.equals(this.institutionPriceAsOf, holdingsOverride.institutionPriceAsOf) &&
        Objects.equals(this.costBasis, holdingsOverride.costBasis) &&
        Objects.equals(this.quantity, holdingsOverride.quantity) &&
        Objects.equals(this.vestedQuantity, holdingsOverride.vestedQuantity) &&
        Objects.equals(this.vestedValue, holdingsOverride.vestedValue) &&
        Objects.equals(this.currency, holdingsOverride.currency) &&
        Objects.equals(this.security, holdingsOverride.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionPrice, institutionPriceAsOf, costBasis, quantity, vestedQuantity, vestedValue, currency, security);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldingsOverride {\n");
    sb.append("    institutionPrice: ").append(toIndentedString(institutionPrice)).append("\n");
    sb.append("    institutionPriceAsOf: ").append(toIndentedString(institutionPriceAsOf)).append("\n");
    sb.append("    costBasis: ").append(toIndentedString(costBasis)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    vestedQuantity: ").append(toIndentedString(vestedQuantity)).append("\n");
    sb.append("    vestedValue: ").append(toIndentedString(vestedValue)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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


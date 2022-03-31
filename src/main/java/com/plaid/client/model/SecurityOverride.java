/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.94.0
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
 * Specify the security associated with the holding or investment transaction. When inputting custom security data to the Sandbox, Plaid will perform post-data-retrieval normalization and enrichment. These processes may cause the data returned by the Sandbox to be slightly different from the data you input. An ISO-4217 currency code and a security identifier (&#x60;ticker_symbol&#x60;, &#x60;cusip&#x60;, &#x60;isin&#x60;, or &#x60;sedol&#x60;) are required.
 */
@ApiModel(description = "Specify the security associated with the holding or investment transaction. When inputting custom security data to the Sandbox, Plaid will perform post-data-retrieval normalization and enrichment. These processes may cause the data returned by the Sandbox to be slightly different from the data you input. An ISO-4217 currency code and a security identifier (`ticker_symbol`, `cusip`, `isin`, or `sedol`) are required.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-31T19:51:16.868353Z[Etc/UTC]")
public class SecurityOverride {
  public static final String SERIALIZED_NAME_ISIN = "isin";
  @SerializedName(SERIALIZED_NAME_ISIN)
  private String isin;

  public static final String SERIALIZED_NAME_CUSIP = "cusip";
  @SerializedName(SERIALIZED_NAME_CUSIP)
  private String cusip;

  public static final String SERIALIZED_NAME_SEDOL = "sedol";
  @SerializedName(SERIALIZED_NAME_SEDOL)
  private String sedol;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TICKER_SYMBOL = "ticker_symbol";
  @SerializedName(SERIALIZED_NAME_TICKER_SYMBOL)
  private String tickerSymbol;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;


  public SecurityOverride isin(String isin) {
    
    this.isin = isin;
    return this;
  }

   /**
   * 12-character ISIN, a globally unique securities identifier.
   * @return isin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "12-character ISIN, a globally unique securities identifier.")

  public String getIsin() {
    return isin;
  }


  public void setIsin(String isin) {
    this.isin = isin;
  }


  public SecurityOverride cusip(String cusip) {
    
    this.cusip = cusip;
    return this;
  }

   /**
   * 9-character CUSIP, an identifier assigned to North American securities.
   * @return cusip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "9-character CUSIP, an identifier assigned to North American securities.")

  public String getCusip() {
    return cusip;
  }


  public void setCusip(String cusip) {
    this.cusip = cusip;
  }


  public SecurityOverride sedol(String sedol) {
    
    this.sedol = sedol;
    return this;
  }

   /**
   * 7-character SEDOL, an identifier assigned to securities in the UK.
   * @return sedol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "7-character SEDOL, an identifier assigned to securities in the UK.")

  public String getSedol() {
    return sedol;
  }


  public void setSedol(String sedol) {
    this.sedol = sedol;
  }


  public SecurityOverride name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the security, suitable for display.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A descriptive name for the security, suitable for display.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SecurityOverride tickerSymbol(String tickerSymbol) {
    
    this.tickerSymbol = tickerSymbol;
    return this;
  }

   /**
   * The security’s trading symbol for publicly traded securities, and otherwise a short identifier if available.
   * @return tickerSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The security’s trading symbol for publicly traded securities, and otherwise a short identifier if available.")

  public String getTickerSymbol() {
    return tickerSymbol;
  }


  public void setTickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
  }


  public SecurityOverride currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Either a valid &#x60;iso_currency_code&#x60; or &#x60;unofficial_currency_code&#x60;
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Either a valid `iso_currency_code` or `unofficial_currency_code`")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityOverride securityOverride = (SecurityOverride) o;
    return Objects.equals(this.isin, securityOverride.isin) &&
        Objects.equals(this.cusip, securityOverride.cusip) &&
        Objects.equals(this.sedol, securityOverride.sedol) &&
        Objects.equals(this.name, securityOverride.name) &&
        Objects.equals(this.tickerSymbol, securityOverride.tickerSymbol) &&
        Objects.equals(this.currency, securityOverride.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isin, cusip, sedol, name, tickerSymbol, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityOverride {\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tickerSymbol: ").append(toIndentedString(tickerSymbol)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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


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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request input for listing reviews for an individual watchlist screening
 */
@ApiModel(description = "Request input for listing reviews for an individual watchlist screening")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-18T17:46:09.980340Z[Etc/UTC]")
public class WatchlistScreeningIndividualReviewListRequest {
  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_WATCHLIST_SCREENING_ID = "watchlist_screening_id";
  @SerializedName(SERIALIZED_NAME_WATCHLIST_SCREENING_ID)
  private String watchlistScreeningId;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private String cursor;


  public WatchlistScreeningIndividualReviewListRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public WatchlistScreeningIndividualReviewListRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public WatchlistScreeningIndividualReviewListRequest watchlistScreeningId(String watchlistScreeningId) {
    
    this.watchlistScreeningId = watchlistScreeningId;
    return this;
  }

   /**
   * ID of the associated screening.
   * @return watchlistScreeningId
  **/
  @ApiModelProperty(example = "scr_52xR9LKo77r1Np", required = true, value = "ID of the associated screening.")

  public String getWatchlistScreeningId() {
    return watchlistScreeningId;
  }


  public void setWatchlistScreeningId(String watchlistScreeningId) {
    this.watchlistScreeningId = watchlistScreeningId;
  }


  public WatchlistScreeningIndividualReviewListRequest cursor(String cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * An identifier that determines which page of results you receive.
   * @return cursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eyJkaXJlY3Rpb24iOiJuZXh0Iiwib2Zmc2V0IjoiMTU5NDM", value = "An identifier that determines which page of results you receive.")

  public String getCursor() {
    return cursor;
  }


  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistScreeningIndividualReviewListRequest watchlistScreeningIndividualReviewListRequest = (WatchlistScreeningIndividualReviewListRequest) o;
    return Objects.equals(this.secret, watchlistScreeningIndividualReviewListRequest.secret) &&
        Objects.equals(this.clientId, watchlistScreeningIndividualReviewListRequest.clientId) &&
        Objects.equals(this.watchlistScreeningId, watchlistScreeningIndividualReviewListRequest.watchlistScreeningId) &&
        Objects.equals(this.cursor, watchlistScreeningIndividualReviewListRequest.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secret, clientId, watchlistScreeningId, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningIndividualReviewListRequest {\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    watchlistScreeningId: ").append(toIndentedString(watchlistScreeningId)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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


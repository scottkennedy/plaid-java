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
import com.plaid.client.model.EntityScreeningHitAnalysis;
import com.plaid.client.model.EntityScreeningHitData;
import com.plaid.client.model.EntityWatchlistCode;
import com.plaid.client.model.WatchlistScreeningHitStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Data from a government watchlist that has been attached to the screening.
 */
@ApiModel(description = "Data from a government watchlist that has been attached to the screening.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-18T17:46:09.980340Z[Etc/UTC]")
public class EntityWatchlistScreeningHit {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REVIEW_STATUS = "review_status";
  @SerializedName(SERIALIZED_NAME_REVIEW_STATUS)
  private WatchlistScreeningHitStatus reviewStatus;

  public static final String SERIALIZED_NAME_FIRST_ACTIVE = "first_active";
  @SerializedName(SERIALIZED_NAME_FIRST_ACTIVE)
  private java.sql.Timestamp firstActive;

  public static final String SERIALIZED_NAME_INACTIVE_SINCE = "inactive_since";
  @SerializedName(SERIALIZED_NAME_INACTIVE_SINCE)
  private OffsetDateTime inactiveSince;

  public static final String SERIALIZED_NAME_HISTORICAL_SINCE = "historical_since";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_SINCE)
  private OffsetDateTime historicalSince;

  public static final String SERIALIZED_NAME_LIST_CODE = "list_code";
  @SerializedName(SERIALIZED_NAME_LIST_CODE)
  private EntityWatchlistCode listCode;

  public static final String SERIALIZED_NAME_PLAID_UID = "plaid_uid";
  @SerializedName(SERIALIZED_NAME_PLAID_UID)
  private String plaidUid;

  public static final String SERIALIZED_NAME_SOURCE_UID = "source_uid";
  @SerializedName(SERIALIZED_NAME_SOURCE_UID)
  private String sourceUid;

  public static final String SERIALIZED_NAME_ANALYSIS = "analysis";
  @SerializedName(SERIALIZED_NAME_ANALYSIS)
  private EntityScreeningHitAnalysis analysis;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private EntityScreeningHitData data;


  public EntityWatchlistScreeningHit id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated entity screening hit.
   * @return id
  **/
  @ApiModelProperty(example = "enthit_52xR9LKo77r1Np", required = true, value = "ID of the associated entity screening hit.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EntityWatchlistScreeningHit reviewStatus(WatchlistScreeningHitStatus reviewStatus) {
    
    this.reviewStatus = reviewStatus;
    return this;
  }

   /**
   * Get reviewStatus
   * @return reviewStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public WatchlistScreeningHitStatus getReviewStatus() {
    return reviewStatus;
  }


  public void setReviewStatus(WatchlistScreeningHitStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }


  public EntityWatchlistScreeningHit firstActive(java.sql.Timestamp firstActive) {
    
    this.firstActive = firstActive;
    return this;
  }

   /**
   * Get firstActive
   * @return firstActive
  **/
  @ApiModelProperty(required = true, value = "")

  public java.sql.Timestamp getFirstActive() {
    return firstActive;
  }


  public void setFirstActive(java.sql.Timestamp firstActive) {
    this.firstActive = firstActive;
  }


  public EntityWatchlistScreeningHit inactiveSince(OffsetDateTime inactiveSince) {
    
    this.inactiveSince = inactiveSince;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp.
   * @return inactiveSince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp.")

  public OffsetDateTime getInactiveSince() {
    return inactiveSince;
  }


  public void setInactiveSince(OffsetDateTime inactiveSince) {
    this.inactiveSince = inactiveSince;
  }


  public EntityWatchlistScreeningHit historicalSince(OffsetDateTime historicalSince) {
    
    this.historicalSince = historicalSince;
    return this;
  }

   /**
   * An ISO8601 formatted timestamp.
   * @return historicalSince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-07-24T03:26:02Z", required = true, value = "An ISO8601 formatted timestamp.")

  public OffsetDateTime getHistoricalSince() {
    return historicalSince;
  }


  public void setHistoricalSince(OffsetDateTime historicalSince) {
    this.historicalSince = historicalSince;
  }


  public EntityWatchlistScreeningHit listCode(EntityWatchlistCode listCode) {
    
    this.listCode = listCode;
    return this;
  }

   /**
   * Get listCode
   * @return listCode
  **/
  @ApiModelProperty(required = true, value = "")

  public EntityWatchlistCode getListCode() {
    return listCode;
  }


  public void setListCode(EntityWatchlistCode listCode) {
    this.listCode = listCode;
  }


  public EntityWatchlistScreeningHit plaidUid(String plaidUid) {
    
    this.plaidUid = plaidUid;
    return this;
  }

   /**
   * A universal identifier for a watchlist individual that is stable across searches and updates.
   * @return plaidUid
  **/
  @ApiModelProperty(example = "uid_3NggckTimGSJHS", required = true, value = "A universal identifier for a watchlist individual that is stable across searches and updates.")

  public String getPlaidUid() {
    return plaidUid;
  }


  public void setPlaidUid(String plaidUid) {
    this.plaidUid = plaidUid;
  }


  public EntityWatchlistScreeningHit sourceUid(String sourceUid) {
    
    this.sourceUid = sourceUid;
    return this;
  }

   /**
   * The identifier provided by the source sanction or watchlist. When one is not provided by the source, this is &#x60;null&#x60;.
   * @return sourceUid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "26192ABC", required = true, value = "The identifier provided by the source sanction or watchlist. When one is not provided by the source, this is `null`.")

  public String getSourceUid() {
    return sourceUid;
  }


  public void setSourceUid(String sourceUid) {
    this.sourceUid = sourceUid;
  }


  public EntityWatchlistScreeningHit analysis(EntityScreeningHitAnalysis analysis) {
    
    this.analysis = analysis;
    return this;
  }

   /**
   * Get analysis
   * @return analysis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityScreeningHitAnalysis getAnalysis() {
    return analysis;
  }


  public void setAnalysis(EntityScreeningHitAnalysis analysis) {
    this.analysis = analysis;
  }


  public EntityWatchlistScreeningHit data(EntityScreeningHitData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EntityScreeningHitData getData() {
    return data;
  }


  public void setData(EntityScreeningHitData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityWatchlistScreeningHit entityWatchlistScreeningHit = (EntityWatchlistScreeningHit) o;
    return Objects.equals(this.id, entityWatchlistScreeningHit.id) &&
        Objects.equals(this.reviewStatus, entityWatchlistScreeningHit.reviewStatus) &&
        Objects.equals(this.firstActive, entityWatchlistScreeningHit.firstActive) &&
        Objects.equals(this.inactiveSince, entityWatchlistScreeningHit.inactiveSince) &&
        Objects.equals(this.historicalSince, entityWatchlistScreeningHit.historicalSince) &&
        Objects.equals(this.listCode, entityWatchlistScreeningHit.listCode) &&
        Objects.equals(this.plaidUid, entityWatchlistScreeningHit.plaidUid) &&
        Objects.equals(this.sourceUid, entityWatchlistScreeningHit.sourceUid) &&
        Objects.equals(this.analysis, entityWatchlistScreeningHit.analysis) &&
        Objects.equals(this.data, entityWatchlistScreeningHit.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reviewStatus, firstActive, inactiveSince, historicalSince, listCode, plaidUid, sourceUid, analysis, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityWatchlistScreeningHit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    firstActive: ").append(toIndentedString(firstActive)).append("\n");
    sb.append("    inactiveSince: ").append(toIndentedString(inactiveSince)).append("\n");
    sb.append("    historicalSince: ").append(toIndentedString(historicalSince)).append("\n");
    sb.append("    listCode: ").append(toIndentedString(listCode)).append("\n");
    sb.append("    plaidUid: ").append(toIndentedString(plaidUid)).append("\n");
    sb.append("    sourceUid: ").append(toIndentedString(sourceUid)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


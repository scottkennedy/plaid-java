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
import com.plaid.client.model.IndividualWatchlistCode;
import com.plaid.client.model.ProgramNameSensitivity;
import com.plaid.client.model.WatchlistScreeningAuditTrail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * A program that configures the active lists, search parameters, and other behavior for initial and ongoing screening of individuals.
 */
@ApiModel(description = "A program that configures the active lists, search parameters, and other behavior for initial and ongoing screening of individuals.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T23:20:54.499428Z[Etc/UTC]")
public class IndividualWatchlistProgram {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private java.sql.Timestamp createdAt;

  public static final String SERIALIZED_NAME_IS_RESCANNING_ENABLED = "is_rescanning_enabled";
  @SerializedName(SERIALIZED_NAME_IS_RESCANNING_ENABLED)
  private Boolean isRescanningEnabled;

  public static final String SERIALIZED_NAME_LISTS_ENABLED = "lists_enabled";
  @SerializedName(SERIALIZED_NAME_LISTS_ENABLED)
  private Set<IndividualWatchlistCode> listsEnabled = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_SENSITIVITY = "name_sensitivity";
  @SerializedName(SERIALIZED_NAME_NAME_SENSITIVITY)
  private ProgramNameSensitivity nameSensitivity;

  public static final String SERIALIZED_NAME_AUDIT_TRAIL = "audit_trail";
  @SerializedName(SERIALIZED_NAME_AUDIT_TRAIL)
  private WatchlistScreeningAuditTrail auditTrail;

  public static final String SERIALIZED_NAME_IS_ARCHIVED = "is_archived";
  @SerializedName(SERIALIZED_NAME_IS_ARCHIVED)
  private Boolean isArchived;


  public IndividualWatchlistProgram id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated program.
   * @return id
  **/
  @ApiModelProperty(example = "prg_2eRPsDnL66rZ7H", required = true, value = "ID of the associated program.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IndividualWatchlistProgram createdAt(java.sql.Timestamp createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public IndividualWatchlistProgram isRescanningEnabled(Boolean isRescanningEnabled) {
    
    this.isRescanningEnabled = isRescanningEnabled;
    return this;
  }

   /**
   * Indicator specifying whether the program is enabled and will perform daily rescans.
   * @return isRescanningEnabled
  **/
  @ApiModelProperty(example = "true", required = true, value = "Indicator specifying whether the program is enabled and will perform daily rescans.")

  public Boolean getIsRescanningEnabled() {
    return isRescanningEnabled;
  }


  public void setIsRescanningEnabled(Boolean isRescanningEnabled) {
    this.isRescanningEnabled = isRescanningEnabled;
  }


  public IndividualWatchlistProgram listsEnabled(Set<IndividualWatchlistCode> listsEnabled) {
    
    this.listsEnabled = listsEnabled;
    return this;
  }

  public IndividualWatchlistProgram addListsEnabledItem(IndividualWatchlistCode listsEnabledItem) {
    this.listsEnabled.add(listsEnabledItem);
    return this;
  }

   /**
   * Watchlists enabled for the associated program
   * @return listsEnabled
  **/
  @ApiModelProperty(example = "[\"US_SDN\"]", required = true, value = "Watchlists enabled for the associated program")

  public Set<IndividualWatchlistCode> getListsEnabled() {
    return listsEnabled;
  }


  public void setListsEnabled(Set<IndividualWatchlistCode> listsEnabled) {
    this.listsEnabled = listsEnabled;
  }


  public IndividualWatchlistProgram name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A name for the program to define its purpose. For example, \&quot;High Risk Individuals\&quot;, \&quot;US Cardholders\&quot;, or \&quot;Applicants\&quot;.
   * @return name
  **/
  @ApiModelProperty(example = "Sample Program", required = true, value = "A name for the program to define its purpose. For example, \"High Risk Individuals\", \"US Cardholders\", or \"Applicants\".")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IndividualWatchlistProgram nameSensitivity(ProgramNameSensitivity nameSensitivity) {
    
    this.nameSensitivity = nameSensitivity;
    return this;
  }

   /**
   * Get nameSensitivity
   * @return nameSensitivity
  **/
  @ApiModelProperty(required = true, value = "")

  public ProgramNameSensitivity getNameSensitivity() {
    return nameSensitivity;
  }


  public void setNameSensitivity(ProgramNameSensitivity nameSensitivity) {
    this.nameSensitivity = nameSensitivity;
  }


  public IndividualWatchlistProgram auditTrail(WatchlistScreeningAuditTrail auditTrail) {
    
    this.auditTrail = auditTrail;
    return this;
  }

   /**
   * Get auditTrail
   * @return auditTrail
  **/
  @ApiModelProperty(required = true, value = "")

  public WatchlistScreeningAuditTrail getAuditTrail() {
    return auditTrail;
  }


  public void setAuditTrail(WatchlistScreeningAuditTrail auditTrail) {
    this.auditTrail = auditTrail;
  }


  public IndividualWatchlistProgram isArchived(Boolean isArchived) {
    
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Archived programs are read-only and cannot screen new customers nor participate in ongoing monitoring.
   * @return isArchived
  **/
  @ApiModelProperty(example = "false", required = true, value = "Archived programs are read-only and cannot screen new customers nor participate in ongoing monitoring.")

  public Boolean getIsArchived() {
    return isArchived;
  }


  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualWatchlistProgram individualWatchlistProgram = (IndividualWatchlistProgram) o;
    return Objects.equals(this.id, individualWatchlistProgram.id) &&
        Objects.equals(this.createdAt, individualWatchlistProgram.createdAt) &&
        Objects.equals(this.isRescanningEnabled, individualWatchlistProgram.isRescanningEnabled) &&
        Objects.equals(this.listsEnabled, individualWatchlistProgram.listsEnabled) &&
        Objects.equals(this.name, individualWatchlistProgram.name) &&
        Objects.equals(this.nameSensitivity, individualWatchlistProgram.nameSensitivity) &&
        Objects.equals(this.auditTrail, individualWatchlistProgram.auditTrail) &&
        Objects.equals(this.isArchived, individualWatchlistProgram.isArchived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, isRescanningEnabled, listsEnabled, name, nameSensitivity, auditTrail, isArchived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualWatchlistProgram {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isRescanningEnabled: ").append(toIndentedString(isRescanningEnabled)).append("\n");
    sb.append("    listsEnabled: ").append(toIndentedString(listsEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameSensitivity: ").append(toIndentedString(nameSensitivity)).append("\n");
    sb.append("    auditTrail: ").append(toIndentedString(auditTrail)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
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


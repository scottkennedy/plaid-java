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
import com.plaid.client.model.BaseReportAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * A representation of an Item within a Base Report.
 */
@ApiModel(description = "A representation of an Item within a Base Report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-27T21:25:22.505956Z[Etc/UTC]")
public class BaseReportItem {
  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_DATE_LAST_UPDATED = "date_last_updated";
  @SerializedName(SERIALIZED_NAME_DATE_LAST_UPDATED)
  private OffsetDateTime dateLastUpdated;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<BaseReportAccount> accounts = new ArrayList<>();


  public BaseReportItem institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The full financial institution name associated with the Item.
   * @return institutionName
  **/
  @ApiModelProperty(required = true, value = "The full financial institution name associated with the Item.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public BaseReportItem institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The id of the financial institution associated with the Item.
   * @return institutionId
  **/
  @ApiModelProperty(required = true, value = "The id of the financial institution associated with the Item.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public BaseReportItem dateLastUpdated(OffsetDateTime dateLastUpdated) {
    
    this.dateLastUpdated = dateLastUpdated;
    return this;
  }

   /**
   * The date and time when this Item’s data was last retrieved from the financial institution, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return dateLastUpdated
  **/
  @ApiModelProperty(required = true, value = "The date and time when this Item’s data was last retrieved from the financial institution, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getDateLastUpdated() {
    return dateLastUpdated;
  }


  public void setDateLastUpdated(OffsetDateTime dateLastUpdated) {
    this.dateLastUpdated = dateLastUpdated;
  }


  public BaseReportItem accounts(List<BaseReportAccount> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public BaseReportItem addAccountsItem(BaseReportAccount accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Data about each of the accounts open on the Item.
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "Data about each of the accounts open on the Item.")

  public List<BaseReportAccount> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<BaseReportAccount> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportItem baseReportItem = (BaseReportItem) o;
    return Objects.equals(this.institutionName, baseReportItem.institutionName) &&
        Objects.equals(this.institutionId, baseReportItem.institutionId) &&
        Objects.equals(this.dateLastUpdated, baseReportItem.dateLastUpdated) &&
        Objects.equals(this.accounts, baseReportItem.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionName, institutionId, dateLastUpdated, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportItem {\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    dateLastUpdated: ").append(toIndentedString(dateLastUpdated)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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


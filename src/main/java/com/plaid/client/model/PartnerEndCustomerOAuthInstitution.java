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
import com.plaid.client.model.PartnerEndCustomerOAuthInstitutionEnvironments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The OAuth registration information for an institution.
 */
@ApiModel(description = "The OAuth registration information for an institution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-27T21:25:22.505956Z[Etc/UTC]")
public class PartnerEndCustomerOAuthInstitution {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private PartnerEndCustomerOAuthInstitutionEnvironments environments;

  public static final String SERIALIZED_NAME_PRODUCTION_ENABLEMENT_DATE = "production_enablement_date";
  @SerializedName(SERIALIZED_NAME_PRODUCTION_ENABLEMENT_DATE)
  private String productionEnablementDate;

  public static final String SERIALIZED_NAME_CLASSIC_DISABLEMENT_DATE = "classic_disablement_date";
  @SerializedName(SERIALIZED_NAME_CLASSIC_DISABLEMENT_DATE)
  private String classicDisablementDate;


  public PartnerEndCustomerOAuthInstitution name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PartnerEndCustomerOAuthInstitution institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * Get institutionId
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public PartnerEndCustomerOAuthInstitution environments(PartnerEndCustomerOAuthInstitutionEnvironments environments) {
    
    this.environments = environments;
    return this;
  }

   /**
   * Get environments
   * @return environments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerOAuthInstitutionEnvironments getEnvironments() {
    return environments;
  }


  public void setEnvironments(PartnerEndCustomerOAuthInstitutionEnvironments environments) {
    this.environments = environments;
  }


  public PartnerEndCustomerOAuthInstitution productionEnablementDate(String productionEnablementDate) {
    
    this.productionEnablementDate = productionEnablementDate;
    return this;
  }

   /**
   * The date on which the end customer&#39;s application was approved by the institution, or an empty string if their application has not yet been approved.
   * @return productionEnablementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the end customer's application was approved by the institution, or an empty string if their application has not yet been approved.")

  public String getProductionEnablementDate() {
    return productionEnablementDate;
  }


  public void setProductionEnablementDate(String productionEnablementDate) {
    this.productionEnablementDate = productionEnablementDate;
  }


  public PartnerEndCustomerOAuthInstitution classicDisablementDate(String classicDisablementDate) {
    
    this.classicDisablementDate = classicDisablementDate;
    return this;
  }

   /**
   * The date on which non-OAuth Item adds will no longer be supported for this institution, or an empty string if no such date has been set by the institution.
   * @return classicDisablementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which non-OAuth Item adds will no longer be supported for this institution, or an empty string if no such date has been set by the institution.")

  public String getClassicDisablementDate() {
    return classicDisablementDate;
  }


  public void setClassicDisablementDate(String classicDisablementDate) {
    this.classicDisablementDate = classicDisablementDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerEndCustomerOAuthInstitution partnerEndCustomerOAuthInstitution = (PartnerEndCustomerOAuthInstitution) o;
    return Objects.equals(this.name, partnerEndCustomerOAuthInstitution.name) &&
        Objects.equals(this.institutionId, partnerEndCustomerOAuthInstitution.institutionId) &&
        Objects.equals(this.environments, partnerEndCustomerOAuthInstitution.environments) &&
        Objects.equals(this.productionEnablementDate, partnerEndCustomerOAuthInstitution.productionEnablementDate) &&
        Objects.equals(this.classicDisablementDate, partnerEndCustomerOAuthInstitution.classicDisablementDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, institutionId, environments, productionEnablementDate, classicDisablementDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerEndCustomerOAuthInstitution {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    productionEnablementDate: ").append(toIndentedString(productionEnablementDate)).append("\n");
    sb.append("    classicDisablementDate: ").append(toIndentedString(classicDisablementDate)).append("\n");
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


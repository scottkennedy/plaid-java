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
import com.plaid.client.model.ReportingInformation;
import com.plaid.client.model.ServiceProductFulfillment;
import com.plaid.client.model.VerificationOfAssetResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * No documentation available
 */
@ApiModel(description = "No documentation available")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T23:20:54.499428Z[Etc/UTC]")
public class VerificationOfAsset {
  public static final String SERIALIZED_NAME_R_E_P_O_R_T_I_N_G_I_N_F_O_R_M_A_T_I_O_N = "REPORTING_INFORMATION";
  @SerializedName(SERIALIZED_NAME_R_E_P_O_R_T_I_N_G_I_N_F_O_R_M_A_T_I_O_N)
  private ReportingInformation REPORTING_INFORMATION;

  public static final String SERIALIZED_NAME_S_E_R_V_I_C_E_P_R_O_D_U_C_T_F_U_L_F_I_L_L_M_E_N_T = "SERVICE_PRODUCT_FULFILLMENT";
  @SerializedName(SERIALIZED_NAME_S_E_R_V_I_C_E_P_R_O_D_U_C_T_F_U_L_F_I_L_L_M_E_N_T)
  private ServiceProductFulfillment SERVICE_PRODUCT_FULFILLMENT;

  public static final String SERIALIZED_NAME_V_E_R_I_F_I_C_A_T_I_O_N_O_F_A_S_S_E_T_R_E_S_P_O_N_S_E = "VERIFICATION_OF_ASSET_RESPONSE";
  @SerializedName(SERIALIZED_NAME_V_E_R_I_F_I_C_A_T_I_O_N_O_F_A_S_S_E_T_R_E_S_P_O_N_S_E)
  private VerificationOfAssetResponse VERIFICATION_OF_ASSET_RESPONSE;


  public VerificationOfAsset REPORTING_INFORMATION(ReportingInformation REPORTING_INFORMATION) {
    
    this.REPORTING_INFORMATION = REPORTING_INFORMATION;
    return this;
  }

   /**
   * Get REPORTING_INFORMATION
   * @return REPORTING_INFORMATION
  **/
  @ApiModelProperty(required = true, value = "")

  public ReportingInformation getREPORTINGINFORMATION() {
    return REPORTING_INFORMATION;
  }


  public void setREPORTINGINFORMATION(ReportingInformation REPORTING_INFORMATION) {
    this.REPORTING_INFORMATION = REPORTING_INFORMATION;
  }


  public VerificationOfAsset SERVICE_PRODUCT_FULFILLMENT(ServiceProductFulfillment SERVICE_PRODUCT_FULFILLMENT) {
    
    this.SERVICE_PRODUCT_FULFILLMENT = SERVICE_PRODUCT_FULFILLMENT;
    return this;
  }

   /**
   * Get SERVICE_PRODUCT_FULFILLMENT
   * @return SERVICE_PRODUCT_FULFILLMENT
  **/
  @ApiModelProperty(required = true, value = "")

  public ServiceProductFulfillment getSERVICEPRODUCTFULFILLMENT() {
    return SERVICE_PRODUCT_FULFILLMENT;
  }


  public void setSERVICEPRODUCTFULFILLMENT(ServiceProductFulfillment SERVICE_PRODUCT_FULFILLMENT) {
    this.SERVICE_PRODUCT_FULFILLMENT = SERVICE_PRODUCT_FULFILLMENT;
  }


  public VerificationOfAsset VERIFICATION_OF_ASSET_RESPONSE(VerificationOfAssetResponse VERIFICATION_OF_ASSET_RESPONSE) {
    
    this.VERIFICATION_OF_ASSET_RESPONSE = VERIFICATION_OF_ASSET_RESPONSE;
    return this;
  }

   /**
   * Get VERIFICATION_OF_ASSET_RESPONSE
   * @return VERIFICATION_OF_ASSET_RESPONSE
  **/
  @ApiModelProperty(required = true, value = "")

  public VerificationOfAssetResponse getVERIFICATIONOFASSETRESPONSE() {
    return VERIFICATION_OF_ASSET_RESPONSE;
  }


  public void setVERIFICATIONOFASSETRESPONSE(VerificationOfAssetResponse VERIFICATION_OF_ASSET_RESPONSE) {
    this.VERIFICATION_OF_ASSET_RESPONSE = VERIFICATION_OF_ASSET_RESPONSE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationOfAsset verificationOfAsset = (VerificationOfAsset) o;
    return Objects.equals(this.REPORTING_INFORMATION, verificationOfAsset.REPORTING_INFORMATION) &&
        Objects.equals(this.SERVICE_PRODUCT_FULFILLMENT, verificationOfAsset.SERVICE_PRODUCT_FULFILLMENT) &&
        Objects.equals(this.VERIFICATION_OF_ASSET_RESPONSE, verificationOfAsset.VERIFICATION_OF_ASSET_RESPONSE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(REPORTING_INFORMATION, SERVICE_PRODUCT_FULFILLMENT, VERIFICATION_OF_ASSET_RESPONSE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationOfAsset {\n");
    sb.append("    REPORTING_INFORMATION: ").append(toIndentedString(REPORTING_INFORMATION)).append("\n");
    sb.append("    SERVICE_PRODUCT_FULFILLMENT: ").append(toIndentedString(SERVICE_PRODUCT_FULFILLMENT)).append("\n");
    sb.append("    VERIFICATION_OF_ASSET_RESPONSE: ").append(toIndentedString(VERIFICATION_OF_ASSET_RESPONSE)).append("\n");
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


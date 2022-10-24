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
import com.plaid.client.model.WeakAliasDetermination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Name information for the associated entity watchlist hit
 */
@ApiModel(description = "Name information for the associated entity watchlist hit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T23:20:54.499428Z[Etc/UTC]")
public class EntityScreeningHitNames {
  public static final String SERIALIZED_NAME_FULL = "full";
  @SerializedName(SERIALIZED_NAME_FULL)
  private String full;

  public static final String SERIALIZED_NAME_IS_PRIMARY = "is_primary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;

  public static final String SERIALIZED_NAME_WEAK_ALIAS_DETERMINATION = "weak_alias_determination";
  @SerializedName(SERIALIZED_NAME_WEAK_ALIAS_DETERMINATION)
  private WeakAliasDetermination weakAliasDetermination;


  public EntityScreeningHitNames full(String full) {
    
    this.full = full;
    return this;
  }

   /**
   * The full name of the entity.
   * @return full
  **/
  @ApiModelProperty(example = "Al Qaida", required = true, value = "The full name of the entity.")

  public String getFull() {
    return full;
  }


  public void setFull(String full) {
    this.full = full;
  }


  public EntityScreeningHitNames isPrimary(Boolean isPrimary) {
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Primary names are those most commonly used to refer to this entity. Only one name will ever be marked as primary.
   * @return isPrimary
  **/
  @ApiModelProperty(example = "false", required = true, value = "Primary names are those most commonly used to refer to this entity. Only one name will ever be marked as primary.")

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  public EntityScreeningHitNames weakAliasDetermination(WeakAliasDetermination weakAliasDetermination) {
    
    this.weakAliasDetermination = weakAliasDetermination;
    return this;
  }

   /**
   * Get weakAliasDetermination
   * @return weakAliasDetermination
  **/
  @ApiModelProperty(required = true, value = "")

  public WeakAliasDetermination getWeakAliasDetermination() {
    return weakAliasDetermination;
  }


  public void setWeakAliasDetermination(WeakAliasDetermination weakAliasDetermination) {
    this.weakAliasDetermination = weakAliasDetermination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityScreeningHitNames entityScreeningHitNames = (EntityScreeningHitNames) o;
    return Objects.equals(this.full, entityScreeningHitNames.full) &&
        Objects.equals(this.isPrimary, entityScreeningHitNames.isPrimary) &&
        Objects.equals(this.weakAliasDetermination, entityScreeningHitNames.weakAliasDetermination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(full, isPrimary, weakAliasDetermination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityScreeningHitNames {\n");
    sb.append("    full: ").append(toIndentedString(full)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    weakAliasDetermination: ").append(toIndentedString(weakAliasDetermination)).append("\n");
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


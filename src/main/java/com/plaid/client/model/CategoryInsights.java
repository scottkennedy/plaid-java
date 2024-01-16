/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.485.0
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
import com.plaid.client.model.CategoryInsightDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Insights on a user&#39;s top personal finance categories.
 */
@ApiModel(description = "Insights on a user's top personal finance categories.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T22:23:14.698759Z[Etc/UTC]")
public class CategoryInsights {
  public static final String SERIALIZED_NAME_PRIMARY_CATEGORY_INSIGHTS = "primary_category_insights";
  @SerializedName(SERIALIZED_NAME_PRIMARY_CATEGORY_INSIGHTS)
  private List<CategoryInsightDetails> primaryCategoryInsights = null;

  public static final String SERIALIZED_NAME_DETAILED_CATEGORY_INSIGHTS = "detailed_category_insights";
  @SerializedName(SERIALIZED_NAME_DETAILED_CATEGORY_INSIGHTS)
  private List<CategoryInsightDetails> detailedCategoryInsights = null;


  public CategoryInsights primaryCategoryInsights(List<CategoryInsightDetails> primaryCategoryInsights) {
    
    this.primaryCategoryInsights = primaryCategoryInsights;
    return this;
  }

  public CategoryInsights addPrimaryCategoryInsightsItem(CategoryInsightDetails primaryCategoryInsightsItem) {
    if (this.primaryCategoryInsights == null) {
      this.primaryCategoryInsights = new ArrayList<>();
    }
    this.primaryCategoryInsights.add(primaryCategoryInsightsItem);
    return this;
  }

   /**
   * List of insights of top primary personal finance categories ranked by outflow.
   * @return primaryCategoryInsights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of insights of top primary personal finance categories ranked by outflow.")

  public List<CategoryInsightDetails> getPrimaryCategoryInsights() {
    return primaryCategoryInsights;
  }


  public void setPrimaryCategoryInsights(List<CategoryInsightDetails> primaryCategoryInsights) {
    this.primaryCategoryInsights = primaryCategoryInsights;
  }


  public CategoryInsights detailedCategoryInsights(List<CategoryInsightDetails> detailedCategoryInsights) {
    
    this.detailedCategoryInsights = detailedCategoryInsights;
    return this;
  }

  public CategoryInsights addDetailedCategoryInsightsItem(CategoryInsightDetails detailedCategoryInsightsItem) {
    if (this.detailedCategoryInsights == null) {
      this.detailedCategoryInsights = new ArrayList<>();
    }
    this.detailedCategoryInsights.add(detailedCategoryInsightsItem);
    return this;
  }

   /**
   * List of insights of top detailed personal finance categories ranked by outflow.
   * @return detailedCategoryInsights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of insights of top detailed personal finance categories ranked by outflow.")

  public List<CategoryInsightDetails> getDetailedCategoryInsights() {
    return detailedCategoryInsights;
  }


  public void setDetailedCategoryInsights(List<CategoryInsightDetails> detailedCategoryInsights) {
    this.detailedCategoryInsights = detailedCategoryInsights;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryInsights categoryInsights = (CategoryInsights) o;
    return Objects.equals(this.primaryCategoryInsights, categoryInsights.primaryCategoryInsights) &&
        Objects.equals(this.detailedCategoryInsights, categoryInsights.detailedCategoryInsights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryCategoryInsights, detailedCategoryInsights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryInsights {\n");
    sb.append("    primaryCategoryInsights: ").append(toIndentedString(primaryCategoryInsights)).append("\n");
    sb.append("    detailedCategoryInsights: ").append(toIndentedString(detailedCategoryInsights)).append("\n");
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


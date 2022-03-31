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
import com.plaid.client.model.Location;
import com.plaid.client.model.PaymentChannel;
import com.plaid.client.model.PersonalFinanceCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A grouping of the Plaid produced transaction enhancement fields.
 */
@ApiModel(description = "A grouping of the Plaid produced transaction enhancement fields.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-31T19:51:16.868353Z[Etc/UTC]")
public class Enhancements {
  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "check_number";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private String checkNumber;

  public static final String SERIALIZED_NAME_PAYMENT_CHANNEL = "payment_channel";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CHANNEL)
  private PaymentChannel paymentChannel;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<String> category = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY = "personal_finance_category";
  @SerializedName(SERIALIZED_NAME_PERSONAL_FINANCE_CATEGORY)
  private PersonalFinanceCategory personalFinanceCategory;


  public Enhancements merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The merchant name, as extracted by Plaid from the raw description.
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The merchant name, as extracted by Plaid from the raw description.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public Enhancements checkNumber(String checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * The check number of the transaction. This field is only populated for check transactions.
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The check number of the transaction. This field is only populated for check transactions.")

  public String getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  public Enhancements paymentChannel(PaymentChannel paymentChannel) {
    
    this.paymentChannel = paymentChannel;
    return this;
  }

   /**
   * Get paymentChannel
   * @return paymentChannel
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentChannel getPaymentChannel() {
    return paymentChannel;
  }


  public void setPaymentChannel(PaymentChannel paymentChannel) {
    this.paymentChannel = paymentChannel;
  }


  public Enhancements categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The ID of the category to which this transaction belongs. For a full list of categories, see [&#x60;/categories/get&#x60;](https://plaid.com/docs/api/products/transactions/#categoriesget).
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ID of the category to which this transaction belongs. For a full list of categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public Enhancements category(List<String> category) {
    
    this.category = category;
    return this;
  }

  public Enhancements addCategoryItem(String categoryItem) {
    this.category.add(categoryItem);
    return this;
  }

   /**
   * A hierarchical array of the categories to which this transaction belongs. For a full list of categories, see [&#x60;/categories/get&#x60;](https://plaid.com/docs/api/products/transactions/#categoriesget).
   * @return category
  **/
  @ApiModelProperty(required = true, value = "A hierarchical array of the categories to which this transaction belongs. For a full list of categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).")

  public List<String> getCategory() {
    return category;
  }


  public void setCategory(List<String> category) {
    this.category = category;
  }


  public Enhancements location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")

  public Location getLocation() {
    return location;
  }


  public void setLocation(Location location) {
    this.location = location;
  }


  public Enhancements personalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    
    this.personalFinanceCategory = personalFinanceCategory;
    return this;
  }

   /**
   * Get personalFinanceCategory
   * @return personalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersonalFinanceCategory getPersonalFinanceCategory() {
    return personalFinanceCategory;
  }


  public void setPersonalFinanceCategory(PersonalFinanceCategory personalFinanceCategory) {
    this.personalFinanceCategory = personalFinanceCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Enhancements enhancements = (Enhancements) o;
    return Objects.equals(this.merchantName, enhancements.merchantName) &&
        Objects.equals(this.checkNumber, enhancements.checkNumber) &&
        Objects.equals(this.paymentChannel, enhancements.paymentChannel) &&
        Objects.equals(this.categoryId, enhancements.categoryId) &&
        Objects.equals(this.category, enhancements.category) &&
        Objects.equals(this.location, enhancements.location) &&
        Objects.equals(this.personalFinanceCategory, enhancements.personalFinanceCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, checkNumber, paymentChannel, categoryId, category, location, personalFinanceCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enhancements {\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    personalFinanceCategory: ").append(toIndentedString(personalFinanceCategory)).append("\n");
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


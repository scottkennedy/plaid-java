/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.343.0
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
import com.plaid.client.model.Owner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountIdentityAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-22T21:32:38.660057Z[Etc/UTC]")
public class AccountIdentityAllOf {
  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Owner> owners = new ArrayList<>();


  public AccountIdentityAllOf owners(List<Owner> owners) {
    
    this.owners = owners;
    return this;
  }

  public AccountIdentityAllOf addOwnersItem(Owner ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Data returned by the financial institution about the account owner or owners. Only returned by Identity or Assets endpoints. For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same &#x60;owner&#x60; object, not in multiple owner objects within the array. In API versions 2018-05-22 and earlier, the &#x60;owners&#x60; object is not returned, and instead identity information is returned in the top level &#x60;identity&#x60; object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29)
   * @return owners
  **/
  @ApiModelProperty(required = true, value = "Data returned by the financial institution about the account owner or owners. Only returned by Identity or Assets endpoints. For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same `owner` object, not in multiple owner objects within the array. In API versions 2018-05-22 and earlier, the `owners` object is not returned, and instead identity information is returned in the top level `identity` object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29)")

  public List<Owner> getOwners() {
    return owners;
  }


  public void setOwners(List<Owner> owners) {
    this.owners = owners;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountIdentityAllOf accountIdentityAllOf = (AccountIdentityAllOf) o;
    return Objects.equals(this.owners, accountIdentityAllOf.owners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdentityAllOf {\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
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


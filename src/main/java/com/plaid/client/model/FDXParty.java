/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.413.0
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
import com.plaid.client.model.FDXPartyRegistry;
import com.plaid.client.model.FDXPartyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * FDX Participant - an entity or person that is a part of a FDX API transaction
 */
@ApiModel(description = "FDX Participant - an entity or person that is a part of a FDX API transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T22:28:13.023935Z[Etc/UTC]")
public class FDXParty {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private FDXPartyType type;

  public static final String SERIALIZED_NAME_HOME_URI = "homeUri";
  @SerializedName(SERIALIZED_NAME_HOME_URI)
  private URI homeUri;

  public static final String SERIALIZED_NAME_LOGO_URI = "logoUri";
  @SerializedName(SERIALIZED_NAME_LOGO_URI)
  private URI logoUri;

  public static final String SERIALIZED_NAME_REGISTRY = "registry";
  @SerializedName(SERIALIZED_NAME_REGISTRY)
  private FDXPartyRegistry registry;

  public static final String SERIALIZED_NAME_REGISTERED_ENTITY_NAME = "registeredEntityName";
  @SerializedName(SERIALIZED_NAME_REGISTERED_ENTITY_NAME)
  private String registeredEntityName;

  public static final String SERIALIZED_NAME_REGISTERED_ENTITY_ID = "registeredEntityId";
  @SerializedName(SERIALIZED_NAME_REGISTERED_ENTITY_ID)
  private String registeredEntityId;


  public FDXParty name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Human recognizable common name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Human recognizable common name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FDXParty type(FDXPartyType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public FDXPartyType getType() {
    return type;
  }


  public void setType(FDXPartyType type) {
    this.type = type;
  }


  public FDXParty homeUri(URI homeUri) {
    
    this.homeUri = homeUri;
    return this;
  }

   /**
   * URI for party, where an end user could learn more about the company or application involved in the data sharing chain
   * @return homeUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URI for party, where an end user could learn more about the company or application involved in the data sharing chain")

  public URI getHomeUri() {
    return homeUri;
  }


  public void setHomeUri(URI homeUri) {
    this.homeUri = homeUri;
  }


  public FDXParty logoUri(URI logoUri) {
    
    this.logoUri = logoUri;
    return this;
  }

   /**
   * URI for a logo asset to be displayed to the end user
   * @return logoUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URI for a logo asset to be displayed to the end user")

  public URI getLogoUri() {
    return logoUri;
  }


  public void setLogoUri(URI logoUri) {
    this.logoUri = logoUri;
  }


  public FDXParty registry(FDXPartyRegistry registry) {
    
    this.registry = registry;
    return this;
  }

   /**
   * Get registry
   * @return registry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FDXPartyRegistry getRegistry() {
    return registry;
  }


  public void setRegistry(FDXPartyRegistry registry) {
    this.registry = registry;
  }


  public FDXParty registeredEntityName(String registeredEntityName) {
    
    this.registeredEntityName = registeredEntityName;
    return this;
  }

   /**
   * Registered name of party
   * @return registeredEntityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Registered name of party")

  public String getRegisteredEntityName() {
    return registeredEntityName;
  }


  public void setRegisteredEntityName(String registeredEntityName) {
    this.registeredEntityName = registeredEntityName;
  }


  public FDXParty registeredEntityId(String registeredEntityId) {
    
    this.registeredEntityId = registeredEntityId;
    return this;
  }

   /**
   * Registered id of party
   * @return registeredEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Registered id of party")

  public String getRegisteredEntityId() {
    return registeredEntityId;
  }


  public void setRegisteredEntityId(String registeredEntityId) {
    this.registeredEntityId = registeredEntityId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FDXParty fdXParty = (FDXParty) o;
    return Objects.equals(this.name, fdXParty.name) &&
        Objects.equals(this.type, fdXParty.type) &&
        Objects.equals(this.homeUri, fdXParty.homeUri) &&
        Objects.equals(this.logoUri, fdXParty.logoUri) &&
        Objects.equals(this.registry, fdXParty.registry) &&
        Objects.equals(this.registeredEntityName, fdXParty.registeredEntityName) &&
        Objects.equals(this.registeredEntityId, fdXParty.registeredEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, homeUri, logoUri, registry, registeredEntityName, registeredEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FDXParty {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    homeUri: ").append(toIndentedString(homeUri)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    registeredEntityName: ").append(toIndentedString(registeredEntityName)).append("\n");
    sb.append("    registeredEntityId: ").append(toIndentedString(registeredEntityId)).append("\n");
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


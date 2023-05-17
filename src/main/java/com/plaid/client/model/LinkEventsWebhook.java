/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.370.0
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
import com.plaid.client.model.LinkEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains a summary of the events from a link session
 */
@ApiModel(description = "Contains a summary of the events from a link session")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-17T20:31:05.704177Z[Etc/UTC]")
public class LinkEventsWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<LinkEvent> events = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINK_SESSION_ID = "link_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_ID)
  private String linkSessionId;

  public static final String SERIALIZED_NAME_LINK_TOKEN = "link_token";
  @SerializedName(SERIALIZED_NAME_LINK_TOKEN)
  private String linkToken;


  public LinkEventsWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;LINK&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`LINK`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public LinkEventsWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;EVENTS&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`EVENTS`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public LinkEventsWebhook events(List<LinkEvent> events) {
    
    this.events = events;
    return this;
  }

  public LinkEventsWebhook addEventsItem(LinkEvent eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * The link events emitted during the link session
   * @return events
  **/
  @ApiModelProperty(required = true, value = "The link events emitted during the link session")

  public List<LinkEvent> getEvents() {
    return events;
  }


  public void setEvents(List<LinkEvent> events) {
    this.events = events;
  }


  public LinkEventsWebhook linkSessionId(String linkSessionId) {
    
    this.linkSessionId = linkSessionId;
    return this;
  }

   /**
   * An identifier for the link session these events occurred in
   * @return linkSessionId
  **/
  @ApiModelProperty(required = true, value = "An identifier for the link session these events occurred in")

  public String getLinkSessionId() {
    return linkSessionId;
  }


  public void setLinkSessionId(String linkSessionId) {
    this.linkSessionId = linkSessionId;
  }


  public LinkEventsWebhook linkToken(String linkToken) {
    
    this.linkToken = linkToken;
    return this;
  }

   /**
   * The link token used to create the link session these events are from
   * @return linkToken
  **/
  @ApiModelProperty(required = true, value = "The link token used to create the link session these events are from")

  public String getLinkToken() {
    return linkToken;
  }


  public void setLinkToken(String linkToken) {
    this.linkToken = linkToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkEventsWebhook linkEventsWebhook = (LinkEventsWebhook) o;
    return Objects.equals(this.webhookType, linkEventsWebhook.webhookType) &&
        Objects.equals(this.webhookCode, linkEventsWebhook.webhookCode) &&
        Objects.equals(this.events, linkEventsWebhook.events) &&
        Objects.equals(this.linkSessionId, linkEventsWebhook.linkSessionId) &&
        Objects.equals(this.linkToken, linkEventsWebhook.linkToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, events, linkSessionId, linkToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkEventsWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    linkSessionId: ").append(toIndentedString(linkSessionId)).append("\n");
    sb.append("    linkToken: ").append(toIndentedString(linkToken)).append("\n");
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


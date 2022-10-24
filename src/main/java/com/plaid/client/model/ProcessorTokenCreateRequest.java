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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProcessorTokenCreateRequest defines the request schema for &#x60;/processor/token/create&#x60;
 */
@ApiModel(description = "ProcessorTokenCreateRequest defines the request schema for `/processor/token/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T23:20:54.499428Z[Etc/UTC]")
public class ProcessorTokenCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  /**
   * The processor you are integrating with.
   */
  @JsonAdapter(ProcessorEnum.Adapter.class)
  public enum ProcessorEnum {
    DWOLLA("dwolla"),
    
    GALILEO("galileo"),
    
    MODERN_TREASURY("modern_treasury"),
    
    OCROLUS("ocrolus"),
    
    PRIME_TRUST("prime_trust"),
    
    VESTA("vesta"),
    
    DRIVEWEALTH("drivewealth"),
    
    VOPAY("vopay"),
    
    ACHQ("achq"),
    
    CHECK("check"),
    
    CHECKBOOK("checkbook"),
    
    CIRCLE("circle"),
    
    SILA_MONEY("sila_money"),
    
    RIZE("rize"),
    
    SVB_API("svb_api"),
    
    UNIT("unit"),
    
    WYRE("wyre"),
    
    LITHIC("lithic"),
    
    ALPACA("alpaca"),
    
    ASTRA("astra"),
    
    MOOV("moov"),
    
    TREASURY_PRIME("treasury_prime"),
    
    MARQETA("marqeta"),
    
    CHECKOUT("checkout"),
    
    SOLID("solid"),
    
    HIGHNOTE("highnote"),
    
    APEX_CLEARING("apex_clearing"),
    
    GUSTO("gusto"),
    
    ADYEN("adyen");

    private String value;

    ProcessorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProcessorEnum fromValue(String value) {
      for (ProcessorEnum b : ProcessorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProcessorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProcessorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProcessorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProcessorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private ProcessorEnum processor;


  public ProcessorTokenCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public ProcessorTokenCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public ProcessorTokenCreateRequest accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token associated with the Item data is being requested for.
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "The access token associated with the Item data is being requested for.")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public ProcessorTokenCreateRequest accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The &#x60;account_id&#x60; value obtained from the &#x60;onSuccess&#x60; callback in Link
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The `account_id` value obtained from the `onSuccess` callback in Link")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public ProcessorTokenCreateRequest processor(ProcessorEnum processor) {
    
    this.processor = processor;
    return this;
  }

   /**
   * The processor you are integrating with.
   * @return processor
  **/
  @ApiModelProperty(required = true, value = "The processor you are integrating with.")

  public ProcessorEnum getProcessor() {
    return processor;
  }


  public void setProcessor(ProcessorEnum processor) {
    this.processor = processor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorTokenCreateRequest processorTokenCreateRequest = (ProcessorTokenCreateRequest) o;
    return Objects.equals(this.clientId, processorTokenCreateRequest.clientId) &&
        Objects.equals(this.secret, processorTokenCreateRequest.secret) &&
        Objects.equals(this.accessToken, processorTokenCreateRequest.accessToken) &&
        Objects.equals(this.accountId, processorTokenCreateRequest.accountId) &&
        Objects.equals(this.processor, processorTokenCreateRequest.processor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, accessToken, accountId, processor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorTokenCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
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


/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.496.0
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
import com.plaid.client.model.IdentityVerificationRequestUserName;
import com.plaid.client.model.UserAddress;
import com.plaid.client.model.UserIDNumber;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * An object specifying information about the end user who will be linking their account.
 */
@ApiModel(description = "An object specifying information about the end user who will be linking their account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T20:08:18.129993Z[Etc/UTC]")
public class LinkTokenCreateRequestUser {
  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private IdentityVerificationRequestUserName name;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_VERIFIED_TIME = "phone_number_verified_time";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_VERIFIED_TIME)
  private OffsetDateTime phoneNumberVerifiedTime;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_VERIFIED_TIME = "email_address_verified_time";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_VERIFIED_TIME)
  private OffsetDateTime emailAddressVerifiedTime;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private UserAddress address;

  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private UserIDNumber idNumber;


  public LinkTokenCreateRequestUser clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * A unique ID representing the end user. Typically this will be a user ID number from your application. Personally identifiable information, such as an email address or phone number, should not be used in the &#x60;client_user_id&#x60;. It is currently used as a means of searching logs for the given user in the Plaid Dashboard.
   * @return clientUserId
  **/
  @ApiModelProperty(required = true, value = "A unique ID representing the end user. Typically this will be a user ID number from your application. Personally identifiable information, such as an email address or phone number, should not be used in the `client_user_id`. It is currently used as a means of searching logs for the given user in the Plaid Dashboard.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public LinkTokenCreateRequestUser legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The user&#39;s full legal name, used for [micro-deposit based verification flows](https://plaid.com/docs/auth/coverage/). For a small number of customers on legacy flows, providing this field is required to enable micro-deposit-based flows. For all other customers, this field is optional. Providing the user&#39;s name in this field when using micro-deposit-based verification will streamline the end user experience, as the user will not be prompted to enter their name during the Link flow; Plaid will use the provided legal name instead.
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's full legal name, used for [micro-deposit based verification flows](https://plaid.com/docs/auth/coverage/). For a small number of customers on legacy flows, providing this field is required to enable micro-deposit-based flows. For all other customers, this field is optional. Providing the user's name in this field when using micro-deposit-based verification will streamline the end user experience, as the user will not be prompted to enter their name during the Link flow; Plaid will use the provided legal name instead.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public LinkTokenCreateRequestUser name(IdentityVerificationRequestUserName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityVerificationRequestUserName getName() {
    return name;
  }


  public void setName(IdentityVerificationRequestUserName name) {
    this.name = name;
  }


  public LinkTokenCreateRequestUser phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The user&#39;s phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. This field is optional, but required to enable the [returning user experience](https://plaid.com/docs/link/returning-user). Can also be used to prefill Link fields when used with Identity Verification.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format. This field is optional, but required to enable the [returning user experience](https://plaid.com/docs/link/returning-user). Can also be used to prefill Link fields when used with Identity Verification.")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public LinkTokenCreateRequestUser phoneNumberVerifiedTime(OffsetDateTime phoneNumberVerifiedTime) {
    
    this.phoneNumberVerifiedTime = phoneNumberVerifiedTime;
    return this;
  }

   /**
   * The date and time the phone number was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDThh:mm:ssZ&#x60;). This was previously an optional field used in the [returning user experience](https://plaid.com/docs/link/returning-user). This field is no longer required to enable the returning user experience.   Only pass a verification time for a phone number that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: &#x60;2020-01-01T00:00:00Z&#x60; 
   * @return phoneNumberVerifiedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the phone number was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDThh:mm:ssZ`). This was previously an optional field used in the [returning user experience](https://plaid.com/docs/link/returning-user). This field is no longer required to enable the returning user experience.   Only pass a verification time for a phone number that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: `2020-01-01T00:00:00Z` ")

  public OffsetDateTime getPhoneNumberVerifiedTime() {
    return phoneNumberVerifiedTime;
  }


  public void setPhoneNumberVerifiedTime(OffsetDateTime phoneNumberVerifiedTime) {
    this.phoneNumberVerifiedTime = phoneNumberVerifiedTime;
  }


  public LinkTokenCreateRequestUser emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The user&#39;s email address. This field is optional, but required to enable the [pre-authenticated returning user flow](https://plaid.com/docs/link/returning-user/#pre-authenticated-rux). Can also be used to prefill Link fields when used with Identity Verification.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's email address. This field is optional, but required to enable the [pre-authenticated returning user flow](https://plaid.com/docs/link/returning-user/#pre-authenticated-rux). Can also be used to prefill Link fields when used with Identity Verification.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public LinkTokenCreateRequestUser emailAddressVerifiedTime(OffsetDateTime emailAddressVerifiedTime) {
    
    this.emailAddressVerifiedTime = emailAddressVerifiedTime;
    return this;
  }

   /**
   * The date and time the email address was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (&#x60;YYYY-MM-DDThh:mm:ssZ&#x60;). This was previously an optional field used in the [returning user experience](https://plaid.com/docs/link/returning-user). This field is no longer required to enable the returning user experience.   Only pass a verification time for an email address that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: &#x60;2020-01-01T00:00:00Z&#x60;
   * @return emailAddressVerifiedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the email address was verified in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDThh:mm:ssZ`). This was previously an optional field used in the [returning user experience](https://plaid.com/docs/link/returning-user). This field is no longer required to enable the returning user experience.   Only pass a verification time for an email address that you have verified. If you have performed verification but don’t have the time, you may supply a signal value of the start of the UNIX epoch.   Example: `2020-01-01T00:00:00Z`")

  public OffsetDateTime getEmailAddressVerifiedTime() {
    return emailAddressVerifiedTime;
  }


  public void setEmailAddressVerifiedTime(OffsetDateTime emailAddressVerifiedTime) {
    this.emailAddressVerifiedTime = emailAddressVerifiedTime;
  }


  public LinkTokenCreateRequestUser ssn(String ssn) {
    
    this.ssn = ssn;
    return this;
  }

   /**
   * Deprecated and not currently used, use the &#x60;id_number&#x60; field instead.
   * @return ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated and not currently used, use the `id_number` field instead.")

  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  public LinkTokenCreateRequestUser dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * To be provided in the format \&quot;yyyy-mm-dd\&quot;. Can be used to prefill Link fields when used with Identity Verification.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To be provided in the format \"yyyy-mm-dd\". Can be used to prefill Link fields when used with Identity Verification.")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public LinkTokenCreateRequestUser address(UserAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserAddress getAddress() {
    return address;
  }


  public void setAddress(UserAddress address) {
    this.address = address;
  }


  public LinkTokenCreateRequestUser idNumber(UserIDNumber idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * Get idNumber
   * @return idNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserIDNumber getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(UserIDNumber idNumber) {
    this.idNumber = idNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestUser linkTokenCreateRequestUser = (LinkTokenCreateRequestUser) o;
    return Objects.equals(this.clientUserId, linkTokenCreateRequestUser.clientUserId) &&
        Objects.equals(this.legalName, linkTokenCreateRequestUser.legalName) &&
        Objects.equals(this.name, linkTokenCreateRequestUser.name) &&
        Objects.equals(this.phoneNumber, linkTokenCreateRequestUser.phoneNumber) &&
        Objects.equals(this.phoneNumberVerifiedTime, linkTokenCreateRequestUser.phoneNumberVerifiedTime) &&
        Objects.equals(this.emailAddress, linkTokenCreateRequestUser.emailAddress) &&
        Objects.equals(this.emailAddressVerifiedTime, linkTokenCreateRequestUser.emailAddressVerifiedTime) &&
        Objects.equals(this.ssn, linkTokenCreateRequestUser.ssn) &&
        Objects.equals(this.dateOfBirth, linkTokenCreateRequestUser.dateOfBirth) &&
        Objects.equals(this.address, linkTokenCreateRequestUser.address) &&
        Objects.equals(this.idNumber, linkTokenCreateRequestUser.idNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, legalName, name, phoneNumber, phoneNumberVerifiedTime, emailAddress, emailAddressVerifiedTime, ssn, dateOfBirth, address, idNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestUser {\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberVerifiedTime: ").append(toIndentedString(phoneNumberVerifiedTime)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailAddressVerifiedTime: ").append(toIndentedString(emailAddressVerifiedTime)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
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


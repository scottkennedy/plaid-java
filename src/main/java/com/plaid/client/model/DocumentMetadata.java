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
import com.plaid.client.model.DocType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing metadata from the end user&#39;s uploaded document.
 */
@ApiModel(description = "An object representing metadata from the end user's uploaded document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-15T19:49:08.269481Z[Etc/UTC]")
public class DocumentMetadata {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DOC_ID = "doc_id";
  @SerializedName(SERIALIZED_NAME_DOC_ID)
  private String docId;

  public static final String SERIALIZED_NAME_DOC_TYPE = "doc_type";
  @SerializedName(SERIALIZED_NAME_DOC_TYPE)
  private DocType docType;


  public DocumentMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the document.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the document.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DocumentMetadata status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The processing status of the document.  &#x60;PROCESSING_COMPLETE&#x60;: The document was successfully processed.  &#x60;DOCUMENT_ERROR&#x60;: The document could not be processed. Possible causes include: The document was an unacceptable document type such as an offer letter or bank statement, the document image was cropped or blurry, or the document was corrupted.  &#x60;UNKNOWN&#x60; or &#x60;null&#x60;: An internal error occurred. If this happens repeatedly, contact support or your Plaid account manager.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The processing status of the document.  `PROCESSING_COMPLETE`: The document was successfully processed.  `DOCUMENT_ERROR`: The document could not be processed. Possible causes include: The document was an unacceptable document type such as an offer letter or bank statement, the document image was cropped or blurry, or the document was corrupted.  `UNKNOWN` or `null`: An internal error occurred. If this happens repeatedly, contact support or your Plaid account manager.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DocumentMetadata docId(String docId) {
    
    this.docId = docId;
    return this;
  }

   /**
   * An identifier of the document that is also present in the paystub response.
   * @return docId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier of the document that is also present in the paystub response.")

  public String getDocId() {
    return docId;
  }


  public void setDocId(String docId) {
    this.docId = docId;
  }


  public DocumentMetadata docType(DocType docType) {
    
    this.docType = docType;
    return this;
  }

   /**
   * Get docType
   * @return docType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DocType getDocType() {
    return docType;
  }


  public void setDocType(DocType docType) {
    this.docType = docType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentMetadata documentMetadata = (DocumentMetadata) o;
    return Objects.equals(this.name, documentMetadata.name) &&
        Objects.equals(this.status, documentMetadata.status) &&
        Objects.equals(this.docId, documentMetadata.docId) &&
        Objects.equals(this.docType, documentMetadata.docType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, docId, docType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentMetadata {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
    sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
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


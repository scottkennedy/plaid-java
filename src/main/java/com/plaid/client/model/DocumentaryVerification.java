/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.161.5
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
import com.plaid.client.model.DocumentaryVerificationDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * data, images, analysis, and results from the &#x60;documentary_verification&#x60; step.
 */
@ApiModel(description = "data, images, analysis, and results from the `documentary_verification` step.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T20:00:26.713837Z[Etc/UTC]")
public class DocumentaryVerification {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DOCUMENTS = "documents";
  @SerializedName(SERIALIZED_NAME_DOCUMENTS)
  private List<DocumentaryVerificationDocument> documents = new ArrayList<>();


  public DocumentaryVerification status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The outcome status for the associated Identity Verification attempt&#39;s &#x60;documentary_verification&#x60; step. This field will always have the same value as &#x60;steps.documentary_verification&#x60;.
   * @return status
  **/
  @ApiModelProperty(example = "success", required = true, value = "The outcome status for the associated Identity Verification attempt's `documentary_verification` step. This field will always have the same value as `steps.documentary_verification`.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public DocumentaryVerification documents(List<DocumentaryVerificationDocument> documents) {
    
    this.documents = documents;
    return this;
  }

  public DocumentaryVerification addDocumentsItem(DocumentaryVerificationDocument documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * An array of documents submitted to the &#x60;documentary_verification&#x60; step. Each entry represents one user submission, where each submission will contain both a front and back image, or just a front image, depending on the document type.  Note: Plaid will automatically let a user submit a new set of document images up to three times if we detect that a previous attempt might have failed due to user error. For example, if the first set of document images are blurry or obscured by glare, the user will be asked to capture their documents again, resulting in at least two separate entries within &#x60;documents&#x60;. If the overall &#x60;documentary_verification&#x60; is &#x60;failed&#x60;, the user has exhausted their retry attempts.
   * @return documents
  **/
  @ApiModelProperty(required = true, value = "An array of documents submitted to the `documentary_verification` step. Each entry represents one user submission, where each submission will contain both a front and back image, or just a front image, depending on the document type.  Note: Plaid will automatically let a user submit a new set of document images up to three times if we detect that a previous attempt might have failed due to user error. For example, if the first set of document images are blurry or obscured by glare, the user will be asked to capture their documents again, resulting in at least two separate entries within `documents`. If the overall `documentary_verification` is `failed`, the user has exhausted their retry attempts.")

  public List<DocumentaryVerificationDocument> getDocuments() {
    return documents;
  }


  public void setDocuments(List<DocumentaryVerificationDocument> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentaryVerification documentaryVerification = (DocumentaryVerification) o;
    return Objects.equals(this.status, documentaryVerification.status) &&
        Objects.equals(this.documents, documentaryVerification.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentaryVerification {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

/*
 * Factern API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: mailto:support@factern.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.BaseRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateMirrorRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-17T11:13:54.836-04:00")
public class CreateMirrorRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("destinationNodeId")
  private String destinationNodeId = null;

  @SerializedName("sourceNodeId")
  private String sourceNodeId = null;

  @SerializedName("templateId")
  private String templateId = null;

  public CreateMirrorRequest includeSummary(Boolean includeSummary) {
    this.includeSummary = includeSummary;
    return this;
  }

   /**
   * Get includeSummary
   * @return includeSummary
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeSummary() {
    return includeSummary;
  }

  public void setIncludeSummary(Boolean includeSummary) {
    this.includeSummary = includeSummary;
  }

  public CreateMirrorRequest destinationNodeId(String destinationNodeId) {
    this.destinationNodeId = destinationNodeId;
    return this;
  }

   /**
   * Get destinationNodeId
   * @return destinationNodeId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDestinationNodeId() {
    return destinationNodeId;
  }

  public void setDestinationNodeId(String destinationNodeId) {
    this.destinationNodeId = destinationNodeId;
  }

  public CreateMirrorRequest sourceNodeId(String sourceNodeId) {
    this.sourceNodeId = sourceNodeId;
    return this;
  }

   /**
   * Get sourceNodeId
   * @return sourceNodeId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSourceNodeId() {
    return sourceNodeId;
  }

  public void setSourceNodeId(String sourceNodeId) {
    this.sourceNodeId = sourceNodeId;
  }

  public CreateMirrorRequest templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMirrorRequest createMirrorRequest = (CreateMirrorRequest) o;
    return Objects.equals(this.includeSummary, createMirrorRequest.includeSummary) &&
        Objects.equals(this.destinationNodeId, createMirrorRequest.destinationNodeId) &&
        Objects.equals(this.sourceNodeId, createMirrorRequest.sourceNodeId) &&
        Objects.equals(this.templateId, createMirrorRequest.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, destinationNodeId, sourceNodeId, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMirrorRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
    sb.append("    destinationNodeId: ").append(toIndentedString(destinationNodeId)).append("\n");
    sb.append("    sourceNodeId: ").append(toIndentedString(sourceNodeId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
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

public class CreateMirrorRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_DESTINATION_NODE_ID = "destinationNodeId";
  @SerializedName(SERIALIZED_NAME_DESTINATION_NODE_ID)
  private String destinationNodeId = null;

  public static final String SERIALIZED_NAME_SOURCE_NODE_ID = "sourceNodeId";
  @SerializedName(SERIALIZED_NAME_SOURCE_NODE_ID)
  private String sourceNodeId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId = null;

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
    return Objects.equals(this.destinationNodeId, createMirrorRequest.destinationNodeId) &&
        Objects.equals(this.sourceNodeId, createMirrorRequest.sourceNodeId) &&
        Objects.equals(this.templateId, createMirrorRequest.templateId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationNodeId, sourceNodeId, templateId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMirrorRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


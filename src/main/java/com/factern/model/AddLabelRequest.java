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
 * AddLabelRequest
 */

public class AddLabelRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_TARGET_NODE_ID = "targetNodeId";
  @SerializedName(SERIALIZED_NAME_TARGET_NODE_ID)
  private String targetNodeId = null;

  public static final String SERIALIZED_NAME_LABEL_ID = "labelId";
  @SerializedName(SERIALIZED_NAME_LABEL_ID)
  private String labelId = null;

  public AddLabelRequest targetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
    return this;
  }

   /**
   * Get targetNodeId
   * @return targetNodeId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTargetNodeId() {
    return targetNodeId;
  }

  public void setTargetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
  }

  public AddLabelRequest labelId(String labelId) {
    this.labelId = labelId;
    return this;
  }

   /**
   * Get labelId
   * @return labelId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLabelId() {
    return labelId;
  }

  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddLabelRequest addLabelRequest = (AddLabelRequest) o;
    return Objects.equals(this.targetNodeId, addLabelRequest.targetNodeId) &&
        Objects.equals(this.labelId, addLabelRequest.labelId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetNodeId, labelId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddLabelRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targetNodeId: ").append(toIndentedString(targetNodeId)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
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


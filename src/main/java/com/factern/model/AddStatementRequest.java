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
 * AddStatementRequest
 */

public class AddStatementRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_TARGET_NODE_ID = "targetNodeId";
  @SerializedName(SERIALIZED_NAME_TARGET_NODE_ID)
  private String targetNodeId = null;

  public static final String SERIALIZED_NAME_ACTION_QUALIFIER_ID = "actionQualifierId";
  @SerializedName(SERIALIZED_NAME_ACTION_QUALIFIER_ID)
  private String actionQualifierId = null;

  public static final String SERIALIZED_NAME_ACTION_ID = "actionId";
  @SerializedName(SERIALIZED_NAME_ACTION_ID)
  private String actionId = null;

  public AddStatementRequest targetNodeId(String targetNodeId) {
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

  public AddStatementRequest actionQualifierId(String actionQualifierId) {
    this.actionQualifierId = actionQualifierId;
    return this;
  }

   /**
   * Get actionQualifierId
   * @return actionQualifierId
  **/
  @ApiModelProperty(value = "")
  public String getActionQualifierId() {
    return actionQualifierId;
  }

  public void setActionQualifierId(String actionQualifierId) {
    this.actionQualifierId = actionQualifierId;
  }

  public AddStatementRequest actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * @return actionId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddStatementRequest addStatementRequest = (AddStatementRequest) o;
    return Objects.equals(this.targetNodeId, addStatementRequest.targetNodeId) &&
        Objects.equals(this.actionQualifierId, addStatementRequest.actionQualifierId) &&
        Objects.equals(this.actionId, addStatementRequest.actionId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetNodeId, actionQualifierId, actionId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddStatementRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targetNodeId: ").append(toIndentedString(targetNodeId)).append("\n");
    sb.append("    actionQualifierId: ").append(toIndentedString(actionQualifierId)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
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


/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.Agent;
import com.factern.model.BaseResponse;
import com.factern.model.Summary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ResetLoginCredentialsRequest
 */

public class ResetLoginCredentialsRequest extends BaseResponse {
  public static final String SERIALIZED_NAME_NEW_PASSWORD = "newPassword";
  @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
  private String newPassword = null;

  public static final String SERIALIZED_NAME_OLD_PASSWORD = "oldPassword";
  @SerializedName(SERIALIZED_NAME_OLD_PASSWORD)
  private String oldPassword = null;

  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId = null;

  public ResetLoginCredentialsRequest newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

   /**
   * Get newPassword
   * @return newPassword
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public ResetLoginCredentialsRequest oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

   /**
   * Get oldPassword
   * @return oldPassword
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public ResetLoginCredentialsRequest nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetLoginCredentialsRequest resetLoginCredentialsRequest = (ResetLoginCredentialsRequest) o;
    return Objects.equals(this.newPassword, resetLoginCredentialsRequest.newPassword) &&
        Objects.equals(this.oldPassword, resetLoginCredentialsRequest.oldPassword) &&
        Objects.equals(this.nodeId, resetLoginCredentialsRequest.nodeId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPassword, oldPassword, nodeId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetLoginCredentialsRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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


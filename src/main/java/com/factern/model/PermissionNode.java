/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.PermissionPolicyDocument;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PermissionNode
 */

public class PermissionNode {
  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private PermissionPolicyDocument policy = null;

  public static final String SERIALIZED_NAME_TARGET_NODE_ID = "targetNodeId";
  @SerializedName(SERIALIZED_NAME_TARGET_NODE_ID)
  private String targetNodeId = null;

  public static final String SERIALIZED_NAME_PERMISSION_INTERFACE_ID = "permissionInterfaceId";
  @SerializedName(SERIALIZED_NAME_PERMISSION_INTERFACE_ID)
  private String permissionInterfaceId = null;

  public PermissionNode policy(PermissionPolicyDocument policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @ApiModelProperty(value = "")
  public PermissionPolicyDocument getPolicy() {
    return policy;
  }

  public void setPolicy(PermissionPolicyDocument policy) {
    this.policy = policy;
  }

  public PermissionNode targetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
    return this;
  }

   /**
   * Get targetNodeId
   * @return targetNodeId
  **/
  @ApiModelProperty(value = "")
  public String getTargetNodeId() {
    return targetNodeId;
  }

  public void setTargetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
  }

  public PermissionNode permissionInterfaceId(String permissionInterfaceId) {
    this.permissionInterfaceId = permissionInterfaceId;
    return this;
  }

   /**
   * Get permissionInterfaceId
   * @return permissionInterfaceId
  **/
  @ApiModelProperty(value = "")
  public String getPermissionInterfaceId() {
    return permissionInterfaceId;
  }

  public void setPermissionInterfaceId(String permissionInterfaceId) {
    this.permissionInterfaceId = permissionInterfaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionNode permissionNode = (PermissionNode) o;
    return Objects.equals(this.policy, permissionNode.policy) &&
        Objects.equals(this.targetNodeId, permissionNode.targetNodeId) &&
        Objects.equals(this.permissionInterfaceId, permissionNode.permissionInterfaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, targetNodeId, permissionInterfaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionNode {\n");
    
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    targetNodeId: ").append(toIndentedString(targetNodeId)).append("\n");
    sb.append("    permissionInterfaceId: ").append(toIndentedString(permissionInterfaceId)).append("\n");
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


/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.Agent;
import com.factern.model.PermissionPolicyDocument;
import com.factern.model.StandardNode;
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
 * Permission
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-19T14:47:47.507-04:00")
public class Permission extends StandardNode {
  @SerializedName("policy")
  private PermissionPolicyDocument policy = null;

  @SerializedName("targetNodeId")
  private String targetNodeId = null;

  @SerializedName("permissionInterfaceId")
  private String permissionInterfaceId = null;

  public Permission policy(PermissionPolicyDocument policy) {
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

  public Permission targetNodeId(String targetNodeId) {
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

  public Permission permissionInterfaceId(String permissionInterfaceId) {
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
    Permission permission = (Permission) o;
    return Objects.equals(this.policy, permission.policy) &&
        Objects.equals(this.targetNodeId, permission.targetNodeId) &&
        Objects.equals(this.permissionInterfaceId, permission.permissionInterfaceId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, targetNodeId, permissionInterfaceId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


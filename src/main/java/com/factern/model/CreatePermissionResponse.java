/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.Agent;
import com.factern.model.BaseResponse;
import com.factern.model.PermissionPolicyDocument;
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
 * CreatePermissionResponse
 */

public class CreatePermissionResponse {
  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  @SerializedName("nodeId")
  private String nodeId = null;

  @SerializedName("agent")
  private Agent agent = null;

  @SerializedName("summary")
  private Summary summary = null;

  @SerializedName("batchId")
  private String batchId = null;

  @SerializedName("factType")
  private String factType = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("policy")
  private PermissionPolicyDocument policy = null;

  @SerializedName("targetNodeId")
  private String targetNodeId = null;

  @SerializedName("permissionInterfaceId")
  private String permissionInterfaceId = null;

  public CreatePermissionResponse deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public CreatePermissionResponse timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public CreatePermissionResponse nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @ApiModelProperty(value = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public CreatePermissionResponse agent(Agent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @ApiModelProperty(value = "")
  public Agent getAgent() {
    return agent;
  }

  public void setAgent(Agent agent) {
    this.agent = agent;
  }

  public CreatePermissionResponse summary(Summary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public Summary getSummary() {
    return summary;
  }

  public void setSummary(Summary summary) {
    this.summary = summary;
  }

  public CreatePermissionResponse batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  @ApiModelProperty(value = "")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public CreatePermissionResponse factType(String factType) {
    this.factType = factType;
    return this;
  }

   /**
   * Get factType
   * @return factType
  **/
  @ApiModelProperty(value = "")
  public String getFactType() {
    return factType;
  }

  public void setFactType(String factType) {
    this.factType = factType;
  }

  public CreatePermissionResponse parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(value = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public CreatePermissionResponse policy(PermissionPolicyDocument policy) {
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

  public CreatePermissionResponse targetNodeId(String targetNodeId) {
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

  public CreatePermissionResponse permissionInterfaceId(String permissionInterfaceId) {
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
    CreatePermissionResponse createPermissionResponse = (CreatePermissionResponse) o;
    return Objects.equals(this.deleted, createPermissionResponse.deleted) &&
        Objects.equals(this.timestamp, createPermissionResponse.timestamp) &&
        Objects.equals(this.nodeId, createPermissionResponse.nodeId) &&
        Objects.equals(this.agent, createPermissionResponse.agent) &&
        Objects.equals(this.summary, createPermissionResponse.summary) &&
        Objects.equals(this.batchId, createPermissionResponse.batchId) &&
        Objects.equals(this.factType, createPermissionResponse.factType) &&
        Objects.equals(this.parentId, createPermissionResponse.parentId) &&
        Objects.equals(this.policy, createPermissionResponse.policy) &&
        Objects.equals(this.targetNodeId, createPermissionResponse.targetNodeId) &&
        Objects.equals(this.permissionInterfaceId, createPermissionResponse.permissionInterfaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, timestamp, nodeId, agent, summary, batchId, factType, parentId, policy, targetNodeId, permissionInterfaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePermissionResponse {\n");
    
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    factType: ").append(toIndentedString(factType)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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


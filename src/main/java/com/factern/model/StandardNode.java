/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.Agent;
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
 * StandardNode
 */


public class StandardNode {
  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted = null;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private BigDecimal timestamp = null;

  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId = null;

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private Agent agent = null;

  public static final String SERIALIZED_NAME_BATCH_ID = "batchId";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId = null;

  public static final String SERIALIZED_NAME_FACT_TYPE = "factType";
  @SerializedName(SERIALIZED_NAME_FACT_TYPE)
  private String factType = null;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId = null;

  public StandardNode() {
    this.factType = this.getClass().getSimpleName();
  }
  public StandardNode deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public StandardNode timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public StandardNode nodeId(String nodeId) {
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

  public StandardNode agent(Agent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @ApiModelProperty(required = true, value = "")
  public Agent getAgent() {
    return agent;
  }

  public void setAgent(Agent agent) {
    this.agent = agent;
  }

  public StandardNode batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public StandardNode factType(String factType) {
    this.factType = factType;
    return this;
  }

   /**
   * Get factType
   * @return factType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFactType() {
    return factType;
  }

  public void setFactType(String factType) {
    this.factType = factType;
  }

  public StandardNode parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardNode standardNode = (StandardNode) o;
    return Objects.equals(this.deleted, standardNode.deleted) &&
        Objects.equals(this.timestamp, standardNode.timestamp) &&
        Objects.equals(this.nodeId, standardNode.nodeId) &&
        Objects.equals(this.agent, standardNode.agent) &&
        Objects.equals(this.batchId, standardNode.batchId) &&
        Objects.equals(this.factType, standardNode.factType) &&
        Objects.equals(this.parentId, standardNode.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, timestamp, nodeId, agent, batchId, factType, parentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardNode {\n");
    
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    factType: ").append(toIndentedString(factType)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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


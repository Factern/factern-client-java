/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
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
 * CreatePriceResponse
 */

public class CreatePriceResponse {
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

  public CreatePriceResponse deleted(Boolean deleted) {
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

  public CreatePriceResponse timestamp(BigDecimal timestamp) {
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

  public CreatePriceResponse nodeId(String nodeId) {
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

  public CreatePriceResponse agent(Agent agent) {
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

  public CreatePriceResponse summary(Summary summary) {
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

  public CreatePriceResponse batchId(String batchId) {
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

  public CreatePriceResponse factType(String factType) {
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

  public CreatePriceResponse parentId(String parentId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePriceResponse createPriceResponse = (CreatePriceResponse) o;
    return Objects.equals(this.deleted, createPriceResponse.deleted) &&
        Objects.equals(this.timestamp, createPriceResponse.timestamp) &&
        Objects.equals(this.nodeId, createPriceResponse.nodeId) &&
        Objects.equals(this.agent, createPriceResponse.agent) &&
        Objects.equals(this.summary, createPriceResponse.summary) &&
        Objects.equals(this.batchId, createPriceResponse.batchId) &&
        Objects.equals(this.factType, createPriceResponse.factType) &&
        Objects.equals(this.parentId, createPriceResponse.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, timestamp, nodeId, agent, summary, batchId, factType, parentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePriceResponse {\n");
    
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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


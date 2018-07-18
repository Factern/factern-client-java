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
import com.factern.model.Agent;
import com.factern.model.BaseResponse;
import com.factern.model.LabelListMember;
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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateLabelListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-17T11:13:54.836-04:00")
public class CreateLabelListResponse {
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

  @SerializedName("description")
  private String description = null;

  @SerializedName("members")
  private List<LabelListMember> members = new ArrayList<LabelListMember>();

  @SerializedName("name")
  private String name = null;

  public CreateLabelListResponse timestamp(BigDecimal timestamp) {
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

  public CreateLabelListResponse nodeId(String nodeId) {
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

  public CreateLabelListResponse agent(Agent agent) {
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

  public CreateLabelListResponse summary(Summary summary) {
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

  public CreateLabelListResponse batchId(String batchId) {
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

  public CreateLabelListResponse factType(String factType) {
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

  public CreateLabelListResponse parentId(String parentId) {
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

  public CreateLabelListResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateLabelListResponse members(List<LabelListMember> members) {
    this.members = members;
    return this;
  }

  public CreateLabelListResponse addMembersItem(LabelListMember membersItem) {
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LabelListMember> getMembers() {
    return members;
  }

  public void setMembers(List<LabelListMember> members) {
    this.members = members;
  }

  public CreateLabelListResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLabelListResponse createLabelListResponse = (CreateLabelListResponse) o;
    return Objects.equals(this.timestamp, createLabelListResponse.timestamp) &&
        Objects.equals(this.nodeId, createLabelListResponse.nodeId) &&
        Objects.equals(this.agent, createLabelListResponse.agent) &&
        Objects.equals(this.summary, createLabelListResponse.summary) &&
        Objects.equals(this.batchId, createLabelListResponse.batchId) &&
        Objects.equals(this.factType, createLabelListResponse.factType) &&
        Objects.equals(this.parentId, createLabelListResponse.parentId) &&
        Objects.equals(this.description, createLabelListResponse.description) &&
        Objects.equals(this.members, createLabelListResponse.members) &&
        Objects.equals(this.name, createLabelListResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, nodeId, agent, summary, batchId, factType, parentId, description, members, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLabelListResponse {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    factType: ").append(toIndentedString(factType)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


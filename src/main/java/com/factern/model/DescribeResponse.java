/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.NodeListing;
import com.factern.model.StandardNode;
import com.factern.model.Summary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DescribeResponse
 */

public class DescribeResponse {
  public static final String SERIALIZED_NAME_NODE = "node";
  @SerializedName(SERIALIZED_NAME_NODE)
  private StandardNode node = null;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private Summary summary = null;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private NodeListing children = null;

  public static final String SERIALIZED_NAME_MEMBER_IDS = "memberIds";
  @SerializedName(SERIALIZED_NAME_MEMBER_IDS)
  private List<Object> memberIds = null;

  public DescribeResponse node(StandardNode node) {
    this.node = node;
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  @ApiModelProperty(required = true, value = "")
  public StandardNode getNode() {
    return node;
  }

  public void setNode(StandardNode node) {
    this.node = node;
  }

  public DescribeResponse summary(Summary summary) {
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

  public DescribeResponse children(NodeListing children) {
    this.children = children;
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(value = "")
  public NodeListing getChildren() {
    return children;
  }

  public void setChildren(NodeListing children) {
    this.children = children;
  }

  public DescribeResponse memberIds(List<Object> memberIds) {
    this.memberIds = memberIds;
    return this;
  }

  public DescribeResponse addMemberIdsItem(Object memberIdsItem) {
    if (this.memberIds == null) {
      this.memberIds = new ArrayList<Object>();
    }
    this.memberIds.add(memberIdsItem);
    return this;
  }

   /**
   * Get memberIds
   * @return memberIds
  **/
  @ApiModelProperty(value = "")
  public List<Object> getMemberIds() {
    return memberIds;
  }

  public void setMemberIds(List<Object> memberIds) {
    this.memberIds = memberIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeResponse describeResponse = (DescribeResponse) o;
    return Objects.equals(this.node, describeResponse.node) &&
        Objects.equals(this.summary, describeResponse.summary) &&
        Objects.equals(this.children, describeResponse.children) &&
        Objects.equals(this.memberIds, describeResponse.memberIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(node, summary, children, memberIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeResponse {\n");
    
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    memberIds: ").append(toIndentedString(memberIds)).append("\n");
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


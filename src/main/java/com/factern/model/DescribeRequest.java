/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.BaseRequest;
import com.factern.model.ListCriteria;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DescribeRequest
 */

public class DescribeRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_LIST_CHILDREN = "listChildren";
  @SerializedName(SERIALIZED_NAME_LIST_CHILDREN)
  private ListCriteria listChildren = null;

  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId = null;

  public static final String SERIALIZED_NAME_GENERATE_TEMPLATE = "generateTemplate";
  @SerializedName(SERIALIZED_NAME_GENERATE_TEMPLATE)
  private Boolean generateTemplate = null;

  public DescribeRequest listChildren(ListCriteria listChildren) {
    this.listChildren = listChildren;
    return this;
  }

   /**
   * Get listChildren
   * @return listChildren
  **/
  @ApiModelProperty(value = "")
  public ListCriteria getListChildren() {
    return listChildren;
  }

  public void setListChildren(ListCriteria listChildren) {
    this.listChildren = listChildren;
  }

  public DescribeRequest nodeId(String nodeId) {
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

  public DescribeRequest generateTemplate(Boolean generateTemplate) {
    this.generateTemplate = generateTemplate;
    return this;
  }

   /**
   * Get generateTemplate
   * @return generateTemplate
  **/
  @ApiModelProperty(value = "")
  public Boolean getGenerateTemplate() {
    return generateTemplate;
  }

  public void setGenerateTemplate(Boolean generateTemplate) {
    this.generateTemplate = generateTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeRequest describeRequest = (DescribeRequest) o;
    return Objects.equals(this.listChildren, describeRequest.listChildren) &&
        Objects.equals(this.nodeId, describeRequest.nodeId) &&
        Objects.equals(this.generateTemplate, describeRequest.generateTemplate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listChildren, nodeId, generateTemplate, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    listChildren: ").append(toIndentedString(listChildren)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    generateTemplate: ").append(toIndentedString(generateTemplate)).append("\n");
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


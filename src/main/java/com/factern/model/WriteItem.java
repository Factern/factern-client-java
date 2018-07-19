/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.WriteItem;
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
 * WriteItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-19T14:47:47.507-04:00")
public class WriteItem {
  @SerializedName("fieldId")
  private String fieldId = null;

  @SerializedName("children")
  private List<WriteItem> children = null;

  @SerializedName("nodeId")
  private String nodeId = null;

  public WriteItem fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Get fieldId
   * @return fieldId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public WriteItem children(List<WriteItem> children) {
    this.children = children;
    return this;
  }

  public WriteItem addChildrenItem(WriteItem childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<WriteItem>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(value = "")
  public List<WriteItem> getChildren() {
    return children;
  }

  public void setChildren(List<WriteItem> children) {
    this.children = children;
  }

  public WriteItem nodeId(String nodeId) {
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
    WriteItem writeItem = (WriteItem) o;
    return Objects.equals(this.fieldId, writeItem.fieldId) &&
        Objects.equals(this.children, writeItem.children) &&
        Objects.equals(this.nodeId, writeItem.nodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, children, nodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WriteItem {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
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


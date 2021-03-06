/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.DeletedItem;
import com.factern.model.DeletedStatusItem;
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
 * DeletedItem
 */

public class DeletedItem {
  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId = null;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<DeletedItem> nodes = null;

  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private String fieldId = null;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<DeletedStatusItem> children = null;

  public static final String SERIALIZED_NAME_DELETED_NODE_ID = "deletedNodeId";
  @SerializedName(SERIALIZED_NAME_DELETED_NODE_ID)
  private String deletedNodeId = null;

  public DeletedItem nodeId(String nodeId) {
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

  public DeletedItem nodes(List<DeletedItem> nodes) {
    this.nodes = nodes;
    return this;
  }

  public DeletedItem addNodesItem(DeletedItem nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<DeletedItem>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @ApiModelProperty(value = "")
  public List<DeletedItem> getNodes() {
    return nodes;
  }

  public void setNodes(List<DeletedItem> nodes) {
    this.nodes = nodes;
  }

  public DeletedItem fieldId(String fieldId) {
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

  public DeletedItem children(List<DeletedStatusItem> children) {
    this.children = children;
    return this;
  }

  public DeletedItem addChildrenItem(DeletedStatusItem childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<DeletedStatusItem>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(value = "")
  public List<DeletedStatusItem> getChildren() {
    return children;
  }

  public void setChildren(List<DeletedStatusItem> children) {
    this.children = children;
  }

  public DeletedItem deletedNodeId(String deletedNodeId) {
    this.deletedNodeId = deletedNodeId;
    return this;
  }

   /**
   * Get deletedNodeId
   * @return deletedNodeId
  **/
  @ApiModelProperty(value = "")
  public String getDeletedNodeId() {
    return deletedNodeId;
  }

  public void setDeletedNodeId(String deletedNodeId) {
    this.deletedNodeId = deletedNodeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedItem deletedItem = (DeletedItem) o;
    return Objects.equals(this.nodeId, deletedItem.nodeId) &&
        Objects.equals(this.nodes, deletedItem.nodes) &&
        Objects.equals(this.fieldId, deletedItem.fieldId) &&
        Objects.equals(this.children, deletedItem.children) &&
        Objects.equals(this.deletedNodeId, deletedItem.deletedNodeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, nodes, fieldId, children, deletedNodeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedItem {\n");
    
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    deletedNodeId: ").append(toIndentedString(deletedNodeId)).append("\n");
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


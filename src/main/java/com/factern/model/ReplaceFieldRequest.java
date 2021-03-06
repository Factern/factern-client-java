/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.BaseRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReplaceFieldRequest
 */

public class ReplaceFieldRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_STORAGE_INTERFACE_ID = "storageInterfaceId";
  @SerializedName(SERIALIZED_NAME_STORAGE_INTERFACE_ID)
  private String storageInterfaceId = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data = null;

  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId = null;

  public ReplaceFieldRequest storageInterfaceId(String storageInterfaceId) {
    this.storageInterfaceId = storageInterfaceId;
    return this;
  }

   /**
   * Get storageInterfaceId
   * @return storageInterfaceId
  **/
  @ApiModelProperty(value = "")
  public String getStorageInterfaceId() {
    return storageInterfaceId;
  }

  public void setStorageInterfaceId(String storageInterfaceId) {
    this.storageInterfaceId = storageInterfaceId;
  }

  public ReplaceFieldRequest data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ReplaceFieldRequest nodeId(String nodeId) {
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
    ReplaceFieldRequest replaceFieldRequest = (ReplaceFieldRequest) o;
    return Objects.equals(this.storageInterfaceId, replaceFieldRequest.storageInterfaceId) &&
        Objects.equals(this.data, replaceFieldRequest.data) &&
        Objects.equals(this.nodeId, replaceFieldRequest.nodeId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageInterfaceId, data, nodeId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceFieldRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    storageInterfaceId: ").append(toIndentedString(storageInterfaceId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


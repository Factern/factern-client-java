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
 * CreateWatchRequest
 */

public class CreateWatchRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_TARGET_NODE_ID = "targetNodeId";
  @SerializedName(SERIALIZED_NAME_TARGET_NODE_ID)
  private String targetNodeId = null;

  public static final String SERIALIZED_NAME_FILTER_ID = "filterId";
  @SerializedName(SERIALIZED_NAME_FILTER_ID)
  private String filterId = null;

  public static final String SERIALIZED_NAME_WATCH_INTERFACE_ID = "watchInterfaceId";
  @SerializedName(SERIALIZED_NAME_WATCH_INTERFACE_ID)
  private String watchInterfaceId = null;

  public CreateWatchRequest targetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
    return this;
  }

   /**
   * Get targetNodeId
   * @return targetNodeId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTargetNodeId() {
    return targetNodeId;
  }

  public void setTargetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
  }

  public CreateWatchRequest filterId(String filterId) {
    this.filterId = filterId;
    return this;
  }

   /**
   * Get filterId
   * @return filterId
  **/
  @ApiModelProperty(value = "")
  public String getFilterId() {
    return filterId;
  }

  public void setFilterId(String filterId) {
    this.filterId = filterId;
  }

  public CreateWatchRequest watchInterfaceId(String watchInterfaceId) {
    this.watchInterfaceId = watchInterfaceId;
    return this;
  }

   /**
   * Get watchInterfaceId
   * @return watchInterfaceId
  **/
  @ApiModelProperty(value = "")
  public String getWatchInterfaceId() {
    return watchInterfaceId;
  }

  public void setWatchInterfaceId(String watchInterfaceId) {
    this.watchInterfaceId = watchInterfaceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWatchRequest createWatchRequest = (CreateWatchRequest) o;
    return Objects.equals(this.targetNodeId, createWatchRequest.targetNodeId) &&
        Objects.equals(this.filterId, createWatchRequest.filterId) &&
        Objects.equals(this.watchInterfaceId, createWatchRequest.watchInterfaceId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetNodeId, filterId, watchInterfaceId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWatchRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targetNodeId: ").append(toIndentedString(targetNodeId)).append("\n");
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
    sb.append("    watchInterfaceId: ").append(toIndentedString(watchInterfaceId)).append("\n");
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


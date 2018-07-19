/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-19T14:47:47.507-04:00")
public class CreateWatchRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("targetNodeId")
  private String targetNodeId = null;

  @SerializedName("filterId")
  private String filterId = null;

  @SerializedName("watchInterfaceId")
  private String watchInterfaceId = null;

  public CreateWatchRequest includeSummary(Boolean includeSummary) {
    this.includeSummary = includeSummary;
    return this;
  }

   /**
   * Get includeSummary
   * @return includeSummary
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeSummary() {
    return includeSummary;
  }

  public void setIncludeSummary(Boolean includeSummary) {
    this.includeSummary = includeSummary;
  }

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
    return Objects.equals(this.includeSummary, createWatchRequest.includeSummary) &&
        Objects.equals(this.targetNodeId, createWatchRequest.targetNodeId) &&
        Objects.equals(this.filterId, createWatchRequest.filterId) &&
        Objects.equals(this.watchInterfaceId, createWatchRequest.watchInterfaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, targetNodeId, filterId, watchInterfaceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWatchRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
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


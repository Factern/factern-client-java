/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.ApiEndpoint;
import com.factern.model.CreateNamedRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateInterfaceRequest
 */

public class CreateInterfaceRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("deleteData")
  private ApiEndpoint deleteData = null;

  @SerializedName("getData")
  private ApiEndpoint getData = null;

  @SerializedName("addData")
  private ApiEndpoint addData = null;

  public CreateInterfaceRequest includeSummary(Boolean includeSummary) {
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

  public CreateInterfaceRequest parentId(String parentId) {
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

  public CreateInterfaceRequest description(String description) {
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

  public CreateInterfaceRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateInterfaceRequest deleteData(ApiEndpoint deleteData) {
    this.deleteData = deleteData;
    return this;
  }

   /**
   * Get deleteData
   * @return deleteData
  **/
  @ApiModelProperty(value = "")
  public ApiEndpoint getDeleteData() {
    return deleteData;
  }

  public void setDeleteData(ApiEndpoint deleteData) {
    this.deleteData = deleteData;
  }

  public CreateInterfaceRequest getData(ApiEndpoint getData) {
    this.getData = getData;
    return this;
  }

   /**
   * Get getData
   * @return getData
  **/
  @ApiModelProperty(value = "")
  public ApiEndpoint getGetData() {
    return getData;
  }

  public void setGetData(ApiEndpoint getData) {
    this.getData = getData;
  }

  public CreateInterfaceRequest addData(ApiEndpoint addData) {
    this.addData = addData;
    return this;
  }

   /**
   * Get addData
   * @return addData
  **/
  @ApiModelProperty(value = "")
  public ApiEndpoint getAddData() {
    return addData;
  }

  public void setAddData(ApiEndpoint addData) {
    this.addData = addData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInterfaceRequest createInterfaceRequest = (CreateInterfaceRequest) o;
    return Objects.equals(this.includeSummary, createInterfaceRequest.includeSummary) &&
        Objects.equals(this.parentId, createInterfaceRequest.parentId) &&
        Objects.equals(this.description, createInterfaceRequest.description) &&
        Objects.equals(this.name, createInterfaceRequest.name) &&
        Objects.equals(this.deleteData, createInterfaceRequest.deleteData) &&
        Objects.equals(this.getData, createInterfaceRequest.getData) &&
        Objects.equals(this.addData, createInterfaceRequest.addData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, parentId, description, name, deleteData, getData, addData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInterfaceRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deleteData: ").append(toIndentedString(deleteData)).append("\n");
    sb.append("    getData: ").append(toIndentedString(getData)).append("\n");
    sb.append("    addData: ").append(toIndentedString(addData)).append("\n");
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


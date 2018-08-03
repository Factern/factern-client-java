/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
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

public class CreateInterfaceRequest extends CreateNamedRequest {
  public static final String SERIALIZED_NAME_DELETE_DATA = "deleteData";
  @SerializedName(SERIALIZED_NAME_DELETE_DATA)
  private ApiEndpoint deleteData = null;

  public static final String SERIALIZED_NAME_GET_DATA = "getData";
  @SerializedName(SERIALIZED_NAME_GET_DATA)
  private ApiEndpoint getData = null;

  public static final String SERIALIZED_NAME_ADD_DATA = "addData";
  @SerializedName(SERIALIZED_NAME_ADD_DATA)
  private ApiEndpoint addData = null;

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
    return Objects.equals(this.deleteData, createInterfaceRequest.deleteData) &&
        Objects.equals(this.getData, createInterfaceRequest.getData) &&
        Objects.equals(this.addData, createInterfaceRequest.addData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteData, getData, addData, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInterfaceRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


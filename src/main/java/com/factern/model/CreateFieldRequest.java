/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
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
 * CreateFieldRequest
 */

public class CreateFieldRequest extends CreateNamedRequest {
  public static final String SERIALIZED_NAME_UNIQUE_BY_PARENT = "uniqueByParent";
  @SerializedName(SERIALIZED_NAME_UNIQUE_BY_PARENT)
  private Boolean uniqueByParent = null;

  public static final String SERIALIZED_NAME_SEARCHABLE = "searchable";
  @SerializedName(SERIALIZED_NAME_SEARCHABLE)
  private Boolean searchable = null;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private Boolean branch = null;

  public CreateFieldRequest uniqueByParent(Boolean uniqueByParent) {
    this.uniqueByParent = uniqueByParent;
    return this;
  }

   /**
   * Get uniqueByParent
   * @return uniqueByParent
  **/
  @ApiModelProperty(value = "")
  public Boolean getUniqueByParent() {
    return uniqueByParent;
  }

  public void setUniqueByParent(Boolean uniqueByParent) {
    this.uniqueByParent = uniqueByParent;
  }

  public CreateFieldRequest searchable(Boolean searchable) {
    this.searchable = searchable;
    return this;
  }

   /**
   * Get searchable
   * @return searchable
  **/
  @ApiModelProperty(value = "")
  public Boolean getSearchable() {
    return searchable;
  }

  public void setSearchable(Boolean searchable) {
    this.searchable = searchable;
  }

  public CreateFieldRequest branch(Boolean branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @ApiModelProperty(value = "")
  public Boolean getBranch() {
    return branch;
  }

  public void setBranch(Boolean branch) {
    this.branch = branch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFieldRequest createFieldRequest = (CreateFieldRequest) o;
    return Objects.equals(this.uniqueByParent, createFieldRequest.uniqueByParent) &&
        Objects.equals(this.searchable, createFieldRequest.searchable) &&
        Objects.equals(this.branch, createFieldRequest.branch) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueByParent, searchable, branch, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFieldRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    uniqueByParent: ").append(toIndentedString(uniqueByParent)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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


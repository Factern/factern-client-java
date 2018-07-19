/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
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

public class CreateFieldRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("uniqueByParent")
  private Boolean uniqueByParent = null;

  @SerializedName("searchable")
  private Boolean searchable = null;

  @SerializedName("branch")
  private Boolean branch = null;

  public CreateFieldRequest includeSummary(Boolean includeSummary) {
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

  public CreateFieldRequest parentId(String parentId) {
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

  public CreateFieldRequest description(String description) {
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

  public CreateFieldRequest name(String name) {
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

  public CreateFieldRequest uniqueByParent(Boolean uniqueByParent) {
    this.uniqueByParent = uniqueByParent;
    return this;
  }

   /**
   * Get uniqueByParent
   * @return uniqueByParent
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isUniqueByParent() {
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
  @ApiModelProperty(required = true, value = "")
  public Boolean isSearchable() {
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
  @ApiModelProperty(required = true, value = "")
  public Boolean isBranch() {
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
    return Objects.equals(this.includeSummary, createFieldRequest.includeSummary) &&
        Objects.equals(this.parentId, createFieldRequest.parentId) &&
        Objects.equals(this.description, createFieldRequest.description) &&
        Objects.equals(this.name, createFieldRequest.name) &&
        Objects.equals(this.uniqueByParent, createFieldRequest.uniqueByParent) &&
        Objects.equals(this.searchable, createFieldRequest.searchable) &&
        Objects.equals(this.branch, createFieldRequest.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, parentId, description, name, uniqueByParent, searchable, branch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFieldRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


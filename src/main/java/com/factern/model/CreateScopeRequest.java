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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateScopeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-19T14:47:47.507-04:00")
public class CreateScopeRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("filterIds")
  private List<String> filterIds = new ArrayList<String>();

  @SerializedName("templateIds")
  private List<String> templateIds = new ArrayList<String>();

  public CreateScopeRequest includeSummary(Boolean includeSummary) {
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

  public CreateScopeRequest parentId(String parentId) {
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

  public CreateScopeRequest description(String description) {
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

  public CreateScopeRequest name(String name) {
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

  public CreateScopeRequest filterIds(List<String> filterIds) {
    this.filterIds = filterIds;
    return this;
  }

  public CreateScopeRequest addFilterIdsItem(String filterIdsItem) {
    this.filterIds.add(filterIdsItem);
    return this;
  }

   /**
   * Get filterIds
   * @return filterIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getFilterIds() {
    return filterIds;
  }

  public void setFilterIds(List<String> filterIds) {
    this.filterIds = filterIds;
  }

  public CreateScopeRequest templateIds(List<String> templateIds) {
    this.templateIds = templateIds;
    return this;
  }

  public CreateScopeRequest addTemplateIdsItem(String templateIdsItem) {
    this.templateIds.add(templateIdsItem);
    return this;
  }

   /**
   * Get templateIds
   * @return templateIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getTemplateIds() {
    return templateIds;
  }

  public void setTemplateIds(List<String> templateIds) {
    this.templateIds = templateIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateScopeRequest createScopeRequest = (CreateScopeRequest) o;
    return Objects.equals(this.includeSummary, createScopeRequest.includeSummary) &&
        Objects.equals(this.parentId, createScopeRequest.parentId) &&
        Objects.equals(this.description, createScopeRequest.description) &&
        Objects.equals(this.name, createScopeRequest.name) &&
        Objects.equals(this.filterIds, createScopeRequest.filterIds) &&
        Objects.equals(this.templateIds, createScopeRequest.templateIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, parentId, description, name, filterIds, templateIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScopeRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filterIds: ").append(toIndentedString(filterIds)).append("\n");
    sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
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


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
 * CreateLabelListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-19T14:47:47.507-04:00")
public class CreateLabelListRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("members")
  private List<String> members = new ArrayList<String>();

  public CreateLabelListRequest includeSummary(Boolean includeSummary) {
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

  public CreateLabelListRequest parentId(String parentId) {
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

  public CreateLabelListRequest description(String description) {
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

  public CreateLabelListRequest name(String name) {
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

  public CreateLabelListRequest members(List<String> members) {
    this.members = members;
    return this;
  }

  public CreateLabelListRequest addMembersItem(String membersItem) {
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getMembers() {
    return members;
  }

  public void setMembers(List<String> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLabelListRequest createLabelListRequest = (CreateLabelListRequest) o;
    return Objects.equals(this.includeSummary, createLabelListRequest.includeSummary) &&
        Objects.equals(this.parentId, createLabelListRequest.parentId) &&
        Objects.equals(this.description, createLabelListRequest.description) &&
        Objects.equals(this.name, createLabelListRequest.name) &&
        Objects.equals(this.members, createLabelListRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, parentId, description, name, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLabelListRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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


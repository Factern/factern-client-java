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
 * CreateDomainRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-19T14:47:47.507-04:00")
public class CreateDomainRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("addFact")
  private ApiEndpoint addFact = null;

  @SerializedName("getFact")
  private ApiEndpoint getFact = null;

  @SerializedName("queryFacts")
  private ApiEndpoint queryFacts = null;

  public CreateDomainRequest includeSummary(Boolean includeSummary) {
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

  public CreateDomainRequest parentId(String parentId) {
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

  public CreateDomainRequest description(String description) {
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

  public CreateDomainRequest name(String name) {
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

  public CreateDomainRequest addFact(ApiEndpoint addFact) {
    this.addFact = addFact;
    return this;
  }

   /**
   * Get addFact
   * @return addFact
  **/
  @ApiModelProperty(required = true, value = "")
  public ApiEndpoint getAddFact() {
    return addFact;
  }

  public void setAddFact(ApiEndpoint addFact) {
    this.addFact = addFact;
  }

  public CreateDomainRequest getFact(ApiEndpoint getFact) {
    this.getFact = getFact;
    return this;
  }

   /**
   * Get getFact
   * @return getFact
  **/
  @ApiModelProperty(required = true, value = "")
  public ApiEndpoint getGetFact() {
    return getFact;
  }

  public void setGetFact(ApiEndpoint getFact) {
    this.getFact = getFact;
  }

  public CreateDomainRequest queryFacts(ApiEndpoint queryFacts) {
    this.queryFacts = queryFacts;
    return this;
  }

   /**
   * Get queryFacts
   * @return queryFacts
  **/
  @ApiModelProperty(value = "")
  public ApiEndpoint getQueryFacts() {
    return queryFacts;
  }

  public void setQueryFacts(ApiEndpoint queryFacts) {
    this.queryFacts = queryFacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDomainRequest createDomainRequest = (CreateDomainRequest) o;
    return Objects.equals(this.includeSummary, createDomainRequest.includeSummary) &&
        Objects.equals(this.parentId, createDomainRequest.parentId) &&
        Objects.equals(this.description, createDomainRequest.description) &&
        Objects.equals(this.name, createDomainRequest.name) &&
        Objects.equals(this.addFact, createDomainRequest.addFact) &&
        Objects.equals(this.getFact, createDomainRequest.getFact) &&
        Objects.equals(this.queryFacts, createDomainRequest.queryFacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, parentId, description, name, addFact, getFact, queryFacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDomainRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addFact: ").append(toIndentedString(addFact)).append("\n");
    sb.append("    getFact: ").append(toIndentedString(getFact)).append("\n");
    sb.append("    queryFacts: ").append(toIndentedString(queryFacts)).append("\n");
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


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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateScopeRequest
 */

public class CreateScopeRequest extends CreateNamedRequest {
  public static final String SERIALIZED_NAME_FILTER_IDS = "filterIds";
  @SerializedName(SERIALIZED_NAME_FILTER_IDS)
  private List<String> filterIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_TEMPLATE_IDS = "templateIds";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IDS)
  private List<String> templateIds = new ArrayList<String>();

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
    return Objects.equals(this.filterIds, createScopeRequest.filterIds) &&
        Objects.equals(this.templateIds, createScopeRequest.templateIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterIds, templateIds, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScopeRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


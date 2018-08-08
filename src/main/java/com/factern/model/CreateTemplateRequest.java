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
 * CreateTemplateRequest
 */

public class CreateTemplateRequest extends CreateNamedRequest {
  public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ID = "defaultStorageId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ID)
  private String defaultStorageId = null;

  public static final String SERIALIZED_NAME_MEMBER_IDS = "memberIds";
  @SerializedName(SERIALIZED_NAME_MEMBER_IDS)
  private List<String> memberIds = new ArrayList<String>();

  public CreateTemplateRequest defaultStorageId(String defaultStorageId) {
    this.defaultStorageId = defaultStorageId;
    return this;
  }

   /**
   * Get defaultStorageId
   * @return defaultStorageId
  **/
  @ApiModelProperty(value = "")
  public String getDefaultStorageId() {
    return defaultStorageId;
  }

  public void setDefaultStorageId(String defaultStorageId) {
    this.defaultStorageId = defaultStorageId;
  }

  public CreateTemplateRequest memberIds(List<String> memberIds) {
    this.memberIds = memberIds;
    return this;
  }

  public CreateTemplateRequest addMemberIdsItem(String memberIdsItem) {
    this.memberIds.add(memberIdsItem);
    return this;
  }

   /**
   * Get memberIds
   * @return memberIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getMemberIds() {
    return memberIds;
  }

  public void setMemberIds(List<String> memberIds) {
    this.memberIds = memberIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTemplateRequest createTemplateRequest = (CreateTemplateRequest) o;
    return Objects.equals(this.defaultStorageId, createTemplateRequest.defaultStorageId) &&
        Objects.equals(this.memberIds, createTemplateRequest.memberIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultStorageId, memberIds, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTemplateRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultStorageId: ").append(toIndentedString(defaultStorageId)).append("\n");
    sb.append("    memberIds: ").append(toIndentedString(memberIds)).append("\n");
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


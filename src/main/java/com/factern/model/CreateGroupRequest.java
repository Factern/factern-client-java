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
 * CreateGroupRequest
 */

public class CreateGroupRequest extends CreateNamedRequest {
  public static final String SERIALIZED_NAME_MEMBER_IDS = "memberIds";
  @SerializedName(SERIALIZED_NAME_MEMBER_IDS)
  private List<String> memberIds = new ArrayList<String>();

  public static final String SERIALIZED_NAME_MEMBER_FACT_TYPE = "memberFactType";
  @SerializedName(SERIALIZED_NAME_MEMBER_FACT_TYPE)
  private String memberFactType = null;

  public CreateGroupRequest memberIds(List<String> memberIds) {
    this.memberIds = memberIds;
    return this;
  }

  public CreateGroupRequest addMemberIdsItem(String memberIdsItem) {
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

  public CreateGroupRequest memberFactType(String memberFactType) {
    this.memberFactType = memberFactType;
    return this;
  }

   /**
   * Get memberFactType
   * @return memberFactType
  **/
  @ApiModelProperty(value = "")
  public String getMemberFactType() {
    return memberFactType;
  }

  public void setMemberFactType(String memberFactType) {
    this.memberFactType = memberFactType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequest createGroupRequest = (CreateGroupRequest) o;
    return Objects.equals(this.memberIds, createGroupRequest.memberIds) &&
        Objects.equals(this.memberFactType, createGroupRequest.memberFactType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberIds, memberFactType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    memberIds: ").append(toIndentedString(memberIds)).append("\n");
    sb.append("    memberFactType: ").append(toIndentedString(memberFactType)).append("\n");
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


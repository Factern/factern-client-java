/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.BaseRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateAliasRequest
 */

public class CreateAliasRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_TARGET_NODE_ID = "targetNodeId";
  @SerializedName(SERIALIZED_NAME_TARGET_NODE_ID)
  private String targetNodeId = null;

  public static final String SERIALIZED_NAME_LOCAL = "local";
  @SerializedName(SERIALIZED_NAME_LOCAL)
  private Boolean local = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public CreateAliasRequest targetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
    return this;
  }

   /**
   * Get targetNodeId
   * @return targetNodeId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTargetNodeId() {
    return targetNodeId;
  }

  public void setTargetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
  }

  public CreateAliasRequest local(Boolean local) {
    this.local = local;
    return this;
  }

   /**
   * Get local
   * @return local
  **/
  @ApiModelProperty(value = "")
  public Boolean getLocal() {
    return local;
  }

  public void setLocal(Boolean local) {
    this.local = local;
  }

  public CreateAliasRequest description(String description) {
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

  public CreateAliasRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAliasRequest createAliasRequest = (CreateAliasRequest) o;
    return Objects.equals(this.targetNodeId, createAliasRequest.targetNodeId) &&
        Objects.equals(this.local, createAliasRequest.local) &&
        Objects.equals(this.description, createAliasRequest.description) &&
        Objects.equals(this.name, createAliasRequest.name) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetNodeId, local, description, name, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAliasRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targetNodeId: ").append(toIndentedString(targetNodeId)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


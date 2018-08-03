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
 * CreateEntityRequest
 */

public class CreateEntityRequest extends CreateNamedRequest {
  public static final String SERIALIZED_NAME_DOMAIN_ID = "domainId";
  @SerializedName(SERIALIZED_NAME_DOMAIN_ID)
  private String domainId = null;

  public CreateEntityRequest domainId(String domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   * Get domainId
   * @return domainId
  **/
  @ApiModelProperty(value = "")
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEntityRequest createEntityRequest = (CreateEntityRequest) o;
    return Objects.equals(this.domainId, createEntityRequest.domainId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEntityRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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


/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
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

public class CreateDomainRequest extends CreateNamedRequest {
  public static final String SERIALIZED_NAME_ADD_FACT = "addFact";
  @SerializedName(SERIALIZED_NAME_ADD_FACT)
  private ApiEndpoint addFact = null;

  public static final String SERIALIZED_NAME_GET_FACT = "getFact";
  @SerializedName(SERIALIZED_NAME_GET_FACT)
  private ApiEndpoint getFact = null;

  public static final String SERIALIZED_NAME_QUERY_FACTS = "queryFacts";
  @SerializedName(SERIALIZED_NAME_QUERY_FACTS)
  private ApiEndpoint queryFacts = null;

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
    return Objects.equals(this.addFact, createDomainRequest.addFact) &&
        Objects.equals(this.getFact, createDomainRequest.getFact) &&
        Objects.equals(this.queryFacts, createDomainRequest.queryFacts) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addFact, getFact, queryFacts, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDomainRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


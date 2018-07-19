/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.Summary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SearchAliasResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-19T14:47:47.507-04:00")
public class SearchAliasResponse {
  @SerializedName("exists")
  private Boolean exists = null;

  @SerializedName("summary")
  private Summary summary = null;

  public SearchAliasResponse exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

   /**
   * Get exists
   * @return exists
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }

  public SearchAliasResponse summary(Summary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public Summary getSummary() {
    return summary;
  }

  public void setSummary(Summary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAliasResponse searchAliasResponse = (SearchAliasResponse) o;
    return Objects.equals(this.exists, searchAliasResponse.exists) &&
        Objects.equals(this.summary, searchAliasResponse.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exists, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAliasResponse {\n");
    
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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


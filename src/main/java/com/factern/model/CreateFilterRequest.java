/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.CreateNamedRequest;
import com.factern.model.FilterStatement;
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
 * CreateFilterRequest
 */

public class CreateFilterRequest extends CreateNamedRequest {
  public static final String SERIALIZED_NAME_STATEMENTS = "statements";
  @SerializedName(SERIALIZED_NAME_STATEMENTS)
  private List<FilterStatement> statements = new ArrayList<FilterStatement>();

  public CreateFilterRequest statements(List<FilterStatement> statements) {
    this.statements = statements;
    return this;
  }

  public CreateFilterRequest addStatementsItem(FilterStatement statementsItem) {
    this.statements.add(statementsItem);
    return this;
  }

   /**
   * Get statements
   * @return statements
  **/
  @ApiModelProperty(required = true, value = "")
  public List<FilterStatement> getStatements() {
    return statements;
  }

  public void setStatements(List<FilterStatement> statements) {
    this.statements = statements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFilterRequest createFilterRequest = (CreateFilterRequest) o;
    return Objects.equals(this.statements, createFilterRequest.statements) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statements, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFilterRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
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


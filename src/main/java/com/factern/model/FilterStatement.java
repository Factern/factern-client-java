/*
 * Factern API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: __VERSION__
 * Contact: mailto:support@factern.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
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
 * FilterStatement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-08-01T14:42:21.963-04:00[America/Toronto]")
public class FilterStatement {
  /**
   * Gets or Sets field
   */
  @JsonAdapter(FieldEnum.Adapter.class)
  public enum FieldEnum {
    TARGET("Target"),
    
    ACTION("Action"),
    
    ACTIONQUALIFIER("ActionQualifier"),
    
    ENTITY("Entity"),
    
    ID("Id"),
    
    BATCHID("BatchId"),
    
    LOGIN("Login"),
    
    APPLICATION("Application"),
    
    ONBEHALFOF("OnBehalfOf");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldEnum fromValue(String text) {
      for (FieldEnum b : FieldEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FieldEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private FieldEnum field = null;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private List<String> arguments = new ArrayList<String>();

  public FilterStatement field(FieldEnum field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(value = "")
  public FieldEnum getField() {
    return field;
  }

  public void setField(FieldEnum field) {
    this.field = field;
  }

  public FilterStatement arguments(List<String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public FilterStatement addArgumentsItem(String argumentsItem) {
    this.arguments.add(argumentsItem);
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getArguments() {
    return arguments;
  }

  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterStatement filterStatement = (FilterStatement) o;
    return Objects.equals(this.field, filterStatement.field) &&
        Objects.equals(this.arguments, filterStatement.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, arguments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterStatement {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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


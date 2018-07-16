/*
 * Factern API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * Contact: mailto:support@factern.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.factern.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * FactCount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-13T13:43:21.819-04:00")
public class FactCount {
  @SerializedName("read")
  private BigDecimal read = null;

  @SerializedName("written")
  private BigDecimal written = null;

  public FactCount read(BigDecimal read) {
    this.read = read;
    return this;
  }

   /**
   * Get read
   * @return read
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getRead() {
    return read;
  }

  public void setRead(BigDecimal read) {
    this.read = read;
  }

  public FactCount written(BigDecimal written) {
    this.written = written;
    return this;
  }

   /**
   * Get written
   * @return written
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getWritten() {
    return written;
  }

  public void setWritten(BigDecimal written) {
    this.written = written;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactCount factCount = (FactCount) o;
    return Objects.equals(this.read, factCount.read) &&
        Objects.equals(this.written, factCount.written);
  }

  @Override
  public int hashCode() {
    return Objects.hash(read, written);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactCount {\n");
    
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    written: ").append(toIndentedString(written)).append("\n");
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


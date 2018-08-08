/*
 * Factern API
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
import java.math.BigDecimal;

/**
 * ExternalDataUsage
 */

public class ExternalDataUsage {
  public static final String SERIALIZED_NAME_BYTES_READ = "bytesRead";
  @SerializedName(SERIALIZED_NAME_BYTES_READ)
  private BigDecimal bytesRead = null;

  public static final String SERIALIZED_NAME_BYTES_WRITTEN = "bytesWritten";
  @SerializedName(SERIALIZED_NAME_BYTES_WRITTEN)
  private BigDecimal bytesWritten = null;

  public ExternalDataUsage bytesRead(BigDecimal bytesRead) {
    this.bytesRead = bytesRead;
    return this;
  }

   /**
   * Get bytesRead
   * @return bytesRead
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getBytesRead() {
    return bytesRead;
  }

  public void setBytesRead(BigDecimal bytesRead) {
    this.bytesRead = bytesRead;
  }

  public ExternalDataUsage bytesWritten(BigDecimal bytesWritten) {
    this.bytesWritten = bytesWritten;
    return this;
  }

   /**
   * Get bytesWritten
   * @return bytesWritten
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getBytesWritten() {
    return bytesWritten;
  }

  public void setBytesWritten(BigDecimal bytesWritten) {
    this.bytesWritten = bytesWritten;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataUsage externalDataUsage = (ExternalDataUsage) o;
    return Objects.equals(this.bytesRead, externalDataUsage.bytesRead) &&
        Objects.equals(this.bytesWritten, externalDataUsage.bytesWritten);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesRead, bytesWritten);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataUsage {\n");
    
    sb.append("    bytesRead: ").append(toIndentedString(bytesRead)).append("\n");
    sb.append("    bytesWritten: ").append(toIndentedString(bytesWritten)).append("\n");
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


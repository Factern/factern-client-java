/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.ReadItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReadStatusItem
 */

public class ReadStatusItem {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status = null;

  public static final String SERIALIZED_NAME_READ_ITEM = "readItem";
  @SerializedName(SERIALIZED_NAME_READ_ITEM)
  private ReadItem readItem = null;

  public ReadStatusItem status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ReadStatusItem readItem(ReadItem readItem) {
    this.readItem = readItem;
    return this;
  }

   /**
   * Get readItem
   * @return readItem
  **/
  @ApiModelProperty(required = true, value = "")
  public ReadItem getReadItem() {
    return readItem;
  }

  public void setReadItem(ReadItem readItem) {
    this.readItem = readItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadStatusItem readStatusItem = (ReadStatusItem) o;
    return Objects.equals(this.status, readStatusItem.status) &&
        Objects.equals(this.readItem, readStatusItem.readItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, readItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadStatusItem {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    readItem: ").append(toIndentedString(readItem)).append("\n");
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


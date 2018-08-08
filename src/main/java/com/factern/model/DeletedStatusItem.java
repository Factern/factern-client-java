/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.DeletedItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeletedStatusItem
 */

public class DeletedStatusItem {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status = null;

  public static final String SERIALIZED_NAME_DELETED_ITEM = "deletedItem";
  @SerializedName(SERIALIZED_NAME_DELETED_ITEM)
  private DeletedItem deletedItem = null;

  public DeletedStatusItem status(Integer status) {
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

  public DeletedStatusItem deletedItem(DeletedItem deletedItem) {
    this.deletedItem = deletedItem;
    return this;
  }

   /**
   * Get deletedItem
   * @return deletedItem
  **/
  @ApiModelProperty(required = true, value = "")
  public DeletedItem getDeletedItem() {
    return deletedItem;
  }

  public void setDeletedItem(DeletedItem deletedItem) {
    this.deletedItem = deletedItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedStatusItem deletedStatusItem = (DeletedStatusItem) o;
    return Objects.equals(this.status, deletedStatusItem.status) &&
        Objects.equals(this.deletedItem, deletedStatusItem.deletedItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, deletedItem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedStatusItem {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    deletedItem: ").append(toIndentedString(deletedItem)).append("\n");
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


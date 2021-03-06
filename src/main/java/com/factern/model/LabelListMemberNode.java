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

/**
 * LabelListMemberNode
 */

public class LabelListMemberNode {
  public static final String SERIALIZED_NAME_LABEL_LIST_ID = "labelListId";
  @SerializedName(SERIALIZED_NAME_LABEL_LIST_ID)
  private String labelListId = null;

  public LabelListMemberNode labelListId(String labelListId) {
    this.labelListId = labelListId;
    return this;
  }

   /**
   * Get labelListId
   * @return labelListId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLabelListId() {
    return labelListId;
  }

  public void setLabelListId(String labelListId) {
    this.labelListId = labelListId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelListMemberNode labelListMemberNode = (LabelListMemberNode) o;
    return Objects.equals(this.labelListId, labelListMemberNode.labelListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelListId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelListMemberNode {\n");
    
    sb.append("    labelListId: ").append(toIndentedString(labelListId)).append("\n");
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


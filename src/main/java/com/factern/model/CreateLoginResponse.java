/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.Agent;
import com.factern.model.BaseResponse;
import com.factern.model.Summary;
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
 * CreateLoginResponse
 */

public class CreateLoginResponse extends BaseResponse {
  public static final String SERIALIZED_NAME_DATA_ROOT_NODE = "dataRootNode";
  @SerializedName(SERIALIZED_NAME_DATA_ROOT_NODE)
  private String dataRootNode = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING_CONFIRMATION("PENDING_CONFIRMATION"),
    
    FAILED_TO_SEND_EMAIL("FAILED_TO_SEND_EMAIL");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = null;

  public CreateLoginResponse dataRootNode(String dataRootNode) {
    this.dataRootNode = dataRootNode;
    return this;
  }

   /**
   * Get dataRootNode
   * @return dataRootNode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDataRootNode() {
    return dataRootNode;
  }

  public void setDataRootNode(String dataRootNode) {
    this.dataRootNode = dataRootNode;
  }

  public CreateLoginResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLoginResponse createLoginResponse = (CreateLoginResponse) o;
    return Objects.equals(this.dataRootNode, createLoginResponse.dataRootNode) &&
        Objects.equals(this.status, createLoginResponse.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataRootNode, status, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoginResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dataRootNode: ").append(toIndentedString(dataRootNode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


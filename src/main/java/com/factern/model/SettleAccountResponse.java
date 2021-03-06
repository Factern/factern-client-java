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
 * SettleAccountResponse
 */

public class SettleAccountResponse {
  public static final String SERIALIZED_NAME_SETTLEMENT_ID = "settlementId";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_ID)
  private String settlementId = null;

  public SettleAccountResponse settlementId(String settlementId) {
    this.settlementId = settlementId;
    return this;
  }

   /**
   * Get settlementId
   * @return settlementId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSettlementId() {
    return settlementId;
  }

  public void setSettlementId(String settlementId) {
    this.settlementId = settlementId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettleAccountResponse settleAccountResponse = (SettleAccountResponse) o;
    return Objects.equals(this.settlementId, settleAccountResponse.settlementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettleAccountResponse {\n");
    
    sb.append("    settlementId: ").append(toIndentedString(settlementId)).append("\n");
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


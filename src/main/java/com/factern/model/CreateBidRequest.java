/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.BaseRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateBidRequest
 */

public class CreateBidRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_PRICE_ID = "priceId";
  @SerializedName(SERIALIZED_NAME_PRICE_ID)
  private String priceId = null;

  public CreateBidRequest priceId(String priceId) {
    this.priceId = priceId;
    return this;
  }

   /**
   * Get priceId
   * @return priceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPriceId() {
    return priceId;
  }

  public void setPriceId(String priceId) {
    this.priceId = priceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBidRequest createBidRequest = (CreateBidRequest) o;
    return Objects.equals(this.priceId, createBidRequest.priceId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBidRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    priceId: ").append(toIndentedString(priceId)).append("\n");
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


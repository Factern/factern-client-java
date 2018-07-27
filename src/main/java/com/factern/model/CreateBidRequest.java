/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
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

public class CreateBidRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("priceId")
  private String priceId = null;

  public CreateBidRequest includeSummary(Boolean includeSummary) {
    this.includeSummary = includeSummary;
    return this;
  }

   /**
   * Get includeSummary
   * @return includeSummary
  **/
  @ApiModelProperty(value = "")
  public Boolean isIncludeSummary() {
    return includeSummary;
  }

  public void setIncludeSummary(Boolean includeSummary) {
    this.includeSummary = includeSummary;
  }

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
    return Objects.equals(this.includeSummary, createBidRequest.includeSummary) &&
        Objects.equals(this.priceId, createBidRequest.priceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, priceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBidRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
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


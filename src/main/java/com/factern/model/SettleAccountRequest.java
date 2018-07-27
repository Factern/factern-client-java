/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.BaseRequest;
import com.factern.model.TokenPayment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SettleAccountRequest
 */

public class SettleAccountRequest {
  @SerializedName("includeSummary")
  private Boolean includeSummary = null;

  @SerializedName("tokenPayment")
  private TokenPayment tokenPayment = null;

  public SettleAccountRequest includeSummary(Boolean includeSummary) {
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

  public SettleAccountRequest tokenPayment(TokenPayment tokenPayment) {
    this.tokenPayment = tokenPayment;
    return this;
  }

   /**
   * Get tokenPayment
   * @return tokenPayment
  **/
  @ApiModelProperty(required = true, value = "")
  public TokenPayment getTokenPayment() {
    return tokenPayment;
  }

  public void setTokenPayment(TokenPayment tokenPayment) {
    this.tokenPayment = tokenPayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettleAccountRequest settleAccountRequest = (SettleAccountRequest) o;
    return Objects.equals(this.includeSummary, settleAccountRequest.includeSummary) &&
        Objects.equals(this.tokenPayment, settleAccountRequest.tokenPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSummary, tokenPayment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettleAccountRequest {\n");
    
    sb.append("    includeSummary: ").append(toIndentedString(includeSummary)).append("\n");
    sb.append("    tokenPayment: ").append(toIndentedString(tokenPayment)).append("\n");
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


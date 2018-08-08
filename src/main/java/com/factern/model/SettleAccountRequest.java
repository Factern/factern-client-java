/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
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

public class SettleAccountRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_TOKEN_PAYMENT = "tokenPayment";
  @SerializedName(SERIALIZED_NAME_TOKEN_PAYMENT)
  private TokenPayment tokenPayment = null;

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
    return Objects.equals(this.tokenPayment, settleAccountRequest.tokenPayment) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenPayment, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettleAccountRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


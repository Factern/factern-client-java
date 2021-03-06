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
 * TokenPayment
 */

public class TokenPayment {
  public static final String SERIALIZED_NAME_PUBLICKEY = "publickey";
  @SerializedName(SERIALIZED_NAME_PUBLICKEY)
  private String publickey = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature = null;

  public TokenPayment publickey(String publickey) {
    this.publickey = publickey;
    return this;
  }

   /**
   * Get publickey
   * @return publickey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPublickey() {
    return publickey;
  }

  public void setPublickey(String publickey) {
    this.publickey = publickey;
  }

  public TokenPayment value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TokenPayment signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenPayment tokenPayment = (TokenPayment) o;
    return Objects.equals(this.publickey, tokenPayment.publickey) &&
        Objects.equals(this.value, tokenPayment.value) &&
        Objects.equals(this.signature, tokenPayment.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publickey, value, signature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPayment {\n");
    
    sb.append("    publickey: ").append(toIndentedString(publickey)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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


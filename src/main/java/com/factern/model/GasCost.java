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
import java.math.BigDecimal;

/**
 * GasCost
 */

public class GasCost {
  public static final String SERIALIZED_NAME_CONSUMED = "consumed";
  @SerializedName(SERIALIZED_NAME_CONSUMED)
  private BigDecimal consumed = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price = null;

  public GasCost consumed(BigDecimal consumed) {
    this.consumed = consumed;
    return this;
  }

   /**
   * Get consumed
   * @return consumed
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getConsumed() {
    return consumed;
  }

  public void setConsumed(BigDecimal consumed) {
    this.consumed = consumed;
  }

  public GasCost price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GasCost gasCost = (GasCost) o;
    return Objects.equals(this.consumed, gasCost.consumed) &&
        Objects.equals(this.price, gasCost.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumed, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GasCost {\n");
    
    sb.append("    consumed: ").append(toIndentedString(consumed)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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


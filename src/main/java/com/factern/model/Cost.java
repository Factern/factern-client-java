/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.GasCost;
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
 * Cost
 */

public class Cost {
  @SerializedName("total")
  private BigDecimal total = null;

  @SerializedName("gas")
  private GasCost gas = null;

  public Cost total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public Cost gas(GasCost gas) {
    this.gas = gas;
    return this;
  }

   /**
   * Get gas
   * @return gas
  **/
  @ApiModelProperty(value = "")
  public GasCost getGas() {
    return gas;
  }

  public void setGas(GasCost gas) {
    this.gas = gas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cost cost = (Cost) o;
    return Objects.equals(this.total, cost.total) &&
        Objects.equals(this.gas, cost.gas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, gas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cost {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
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


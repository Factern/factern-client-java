/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.BaseRequest;
import com.factern.model.PermissionPolicyDocument;
import com.factern.model.PriceDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreatePriceRequest
 */

public class CreatePriceRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private PermissionPolicyDocument policy = null;

  public static final String SERIALIZED_NAME_TARGET_NODE_ID = "targetNodeId";
  @SerializedName(SERIALIZED_NAME_TARGET_NODE_ID)
  private String targetNodeId = null;

  public static final String SERIALIZED_NAME_PRICE_DETAILS = "priceDetails";
  @SerializedName(SERIALIZED_NAME_PRICE_DETAILS)
  private PriceDetails priceDetails = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FIXED("Fixed");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = null;

  public CreatePriceRequest policy(PermissionPolicyDocument policy) {
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "")
  public PermissionPolicyDocument getPolicy() {
    return policy;
  }

  public void setPolicy(PermissionPolicyDocument policy) {
    this.policy = policy;
  }

  public CreatePriceRequest targetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
    return this;
  }

   /**
   * Get targetNodeId
   * @return targetNodeId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTargetNodeId() {
    return targetNodeId;
  }

  public void setTargetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
  }

  public CreatePriceRequest priceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
    return this;
  }

   /**
   * Get priceDetails
   * @return priceDetails
  **/
  @ApiModelProperty(required = true, value = "")
  public PriceDetails getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(PriceDetails priceDetails) {
    this.priceDetails = priceDetails;
  }

  public CreatePriceRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePriceRequest createPriceRequest = (CreatePriceRequest) o;
    return Objects.equals(this.policy, createPriceRequest.policy) &&
        Objects.equals(this.targetNodeId, createPriceRequest.targetNodeId) &&
        Objects.equals(this.priceDetails, createPriceRequest.priceDetails) &&
        Objects.equals(this.type, createPriceRequest.type) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, targetNodeId, priceDetails, type, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePriceRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    targetNodeId: ").append(toIndentedString(targetNodeId)).append("\n");
    sb.append("    priceDetails: ").append(toIndentedString(priceDetails)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


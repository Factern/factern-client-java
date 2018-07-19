/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.HttpHeader;
import com.factern.model.TransformElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApiEndpoint
 */

public class ApiEndpoint {
  @SerializedName("body")
  private String body = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("responseTransform")
  private List<TransformElement> responseTransform = null;

  @SerializedName("headers")
  private List<HttpHeader> headers = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DIRECT("Direct"),
    
    INDIRECT("Indirect");

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

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Gets or Sets method
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    GET("GET"),
    
    POST("POST"),
    
    PUT("PUT");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("method")
  private MethodEnum method = null;

  public ApiEndpoint body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public ApiEndpoint url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ApiEndpoint responseTransform(List<TransformElement> responseTransform) {
    this.responseTransform = responseTransform;
    return this;
  }

  public ApiEndpoint addResponseTransformItem(TransformElement responseTransformItem) {
    if (this.responseTransform == null) {
      this.responseTransform = new ArrayList<TransformElement>();
    }
    this.responseTransform.add(responseTransformItem);
    return this;
  }

   /**
   * Get responseTransform
   * @return responseTransform
  **/
  @ApiModelProperty(value = "")
  public List<TransformElement> getResponseTransform() {
    return responseTransform;
  }

  public void setResponseTransform(List<TransformElement> responseTransform) {
    this.responseTransform = responseTransform;
  }

  public ApiEndpoint headers(List<HttpHeader> headers) {
    this.headers = headers;
    return this;
  }

  public ApiEndpoint addHeadersItem(HttpHeader headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<HttpHeader>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public List<HttpHeader> getHeaders() {
    return headers;
  }

  public void setHeaders(List<HttpHeader> headers) {
    this.headers = headers;
  }

  public ApiEndpoint type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ApiEndpoint method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiEndpoint apiEndpoint = (ApiEndpoint) o;
    return Objects.equals(this.body, apiEndpoint.body) &&
        Objects.equals(this.url, apiEndpoint.url) &&
        Objects.equals(this.responseTransform, apiEndpoint.responseTransform) &&
        Objects.equals(this.headers, apiEndpoint.headers) &&
        Objects.equals(this.type, apiEndpoint.type) &&
        Objects.equals(this.method, apiEndpoint.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, url, responseTransform, headers, type, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiEndpoint {\n");
    
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    responseTransform: ").append(toIndentedString(responseTransform)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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


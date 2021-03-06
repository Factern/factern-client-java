/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.BaseRequest;
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
 * ReadRequest
 */

public class ReadRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ID = "defaultStorageId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ID)
  private String defaultStorageId = null;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private List<TransformElement> transform = null;

  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId = null;

  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  private String callback = null;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private List<Object> template = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId = null;

  public ReadRequest defaultStorageId(String defaultStorageId) {
    this.defaultStorageId = defaultStorageId;
    return this;
  }

   /**
   * Get defaultStorageId
   * @return defaultStorageId
  **/
  @ApiModelProperty(value = "")
  public String getDefaultStorageId() {
    return defaultStorageId;
  }

  public void setDefaultStorageId(String defaultStorageId) {
    this.defaultStorageId = defaultStorageId;
  }

  public ReadRequest transform(List<TransformElement> transform) {
    this.transform = transform;
    return this;
  }

  public ReadRequest addTransformItem(TransformElement transformItem) {
    if (this.transform == null) {
      this.transform = new ArrayList<TransformElement>();
    }
    this.transform.add(transformItem);
    return this;
  }

   /**
   * Get transform
   * @return transform
  **/
  @ApiModelProperty(value = "")
  public List<TransformElement> getTransform() {
    return transform;
  }

  public void setTransform(List<TransformElement> transform) {
    this.transform = transform;
  }

  public ReadRequest nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public ReadRequest callback(String callback) {
    this.callback = callback;
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @ApiModelProperty(value = "")
  public String getCallback() {
    return callback;
  }

  public void setCallback(String callback) {
    this.callback = callback;
  }

  public ReadRequest template(List<Object> template) {
    this.template = template;
    return this;
  }

  public ReadRequest addTemplateItem(Object templateItem) {
    if (this.template == null) {
      this.template = new ArrayList<Object>();
    }
    this.template.add(templateItem);
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(value = "")
  public List<Object> getTemplate() {
    return template;
  }

  public void setTemplate(List<Object> template) {
    this.template = template;
  }

  public ReadRequest templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(value = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadRequest readRequest = (ReadRequest) o;
    return Objects.equals(this.defaultStorageId, readRequest.defaultStorageId) &&
        Objects.equals(this.transform, readRequest.transform) &&
        Objects.equals(this.nodeId, readRequest.nodeId) &&
        Objects.equals(this.callback, readRequest.callback) &&
        Objects.equals(this.template, readRequest.template) &&
        Objects.equals(this.templateId, readRequest.templateId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultStorageId, transform, nodeId, callback, template, templateId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    defaultStorageId: ").append(toIndentedString(defaultStorageId)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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


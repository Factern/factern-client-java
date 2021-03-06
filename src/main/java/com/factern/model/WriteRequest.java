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
 * WriteRequest
 */

public class WriteRequest extends BaseRequest {
  public static final String SERIALIZED_NAME_SOURCE_NODE_ID = "sourceNodeId";
  @SerializedName(SERIALIZED_NAME_SOURCE_NODE_ID)
  private String sourceNodeId = null;

  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId = null;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private List<TransformElement> transform = null;

  public static final String SERIALIZED_NAME_DEFAULT_STORAGE_ID = "defaultStorageId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_ID)
  private String defaultStorageId = null;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Object> values = null;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private List<Object> template = null;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId = null;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private List<Object> document = null;

  public WriteRequest sourceNodeId(String sourceNodeId) {
    this.sourceNodeId = sourceNodeId;
    return this;
  }

   /**
   * Get sourceNodeId
   * @return sourceNodeId
  **/
  @ApiModelProperty(value = "")
  public String getSourceNodeId() {
    return sourceNodeId;
  }

  public void setSourceNodeId(String sourceNodeId) {
    this.sourceNodeId = sourceNodeId;
  }

  public WriteRequest nodeId(String nodeId) {
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

  public WriteRequest transform(List<TransformElement> transform) {
    this.transform = transform;
    return this;
  }

  public WriteRequest addTransformItem(TransformElement transformItem) {
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

  public WriteRequest defaultStorageId(String defaultStorageId) {
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

  public WriteRequest values(List<Object> values) {
    this.values = values;
    return this;
  }

  public WriteRequest addValuesItem(Object valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<Object>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")
  public List<Object> getValues() {
    return values;
  }

  public void setValues(List<Object> values) {
    this.values = values;
  }

  public WriteRequest template(List<Object> template) {
    this.template = template;
    return this;
  }

  public WriteRequest addTemplateItem(Object templateItem) {
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

  public WriteRequest templateId(String templateId) {
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

  public WriteRequest document(List<Object> document) {
    this.document = document;
    return this;
  }

  public WriteRequest addDocumentItem(Object documentItem) {
    if (this.document == null) {
      this.document = new ArrayList<Object>();
    }
    this.document.add(documentItem);
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(value = "")
  public List<Object> getDocument() {
    return document;
  }

  public void setDocument(List<Object> document) {
    this.document = document;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WriteRequest writeRequest = (WriteRequest) o;
    return Objects.equals(this.sourceNodeId, writeRequest.sourceNodeId) &&
        Objects.equals(this.nodeId, writeRequest.nodeId) &&
        Objects.equals(this.transform, writeRequest.transform) &&
        Objects.equals(this.defaultStorageId, writeRequest.defaultStorageId) &&
        Objects.equals(this.values, writeRequest.values) &&
        Objects.equals(this.template, writeRequest.template) &&
        Objects.equals(this.templateId, writeRequest.templateId) &&
        Objects.equals(this.document, writeRequest.document) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceNodeId, nodeId, transform, defaultStorageId, values, template, templateId, document, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WriteRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sourceNodeId: ").append(toIndentedString(sourceNodeId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    defaultStorageId: ").append(toIndentedString(defaultStorageId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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


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
 * ListCriteria
 */

public class ListCriteria {
  public static final String SERIALIZED_NAME_INCLUDE_DELETED = "includeDeleted";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DELETED)
  private Boolean includeDeleted = null;

  public static final String SERIALIZED_NAME_LABEL_LIST_NAME = "labelListName";
  @SerializedName(SERIALIZED_NAME_LABEL_LIST_NAME)
  private String labelListName = null;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private BigDecimal maxResults = null;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName = null;

  /**
   * Gets or Sets factType
   */
  @JsonAdapter(FactTypeEnum.Adapter.class)
  public enum FactTypeEnum {
    ENTITY("Entity"),
    
    LOGIN("Login"),
    
    APPLICATION("Application"),
    
    FIELD("Field"),
    
    INFORMATION("Information"),
    
    PERMISSION("Permission"),
    
    WATCH("Watch"),
    
    WATCHEVENT("WatchEvent"),
    
    GROUP("Group"),
    
    INTERFACE("Interface"),
    
    LABELLIST("LabelList"),
    
    LABEL("Label"),
    
    TEMPLATE("Template"),
    
    SCOPE("Scope");

    private String value;

    FactTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FactTypeEnum fromValue(String text) {
      for (FactTypeEnum b : FactTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FactTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FactTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FactTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FactTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_FACT_TYPE = "factType";
  @SerializedName(SERIALIZED_NAME_FACT_TYPE)
  private FactTypeEnum factType = null;

  public static final String SERIALIZED_NAME_ACTION_ID = "actionId";
  @SerializedName(SERIALIZED_NAME_ACTION_ID)
  private String actionId = null;

  public static final String SERIALIZED_NAME_LABEL_LIST_ID = "labelListId";
  @SerializedName(SERIALIZED_NAME_LABEL_LIST_ID)
  private String labelListId = null;

  public static final String SERIALIZED_NAME_STARTING_FROM_TIMESTAMP = "startingFromTimestamp";
  @SerializedName(SERIALIZED_NAME_STARTING_FROM_TIMESTAMP)
  private BigDecimal startingFromTimestamp = null;

  public static final String SERIALIZED_NAME_NEXT_TOKEN = "nextToken";
  @SerializedName(SERIALIZED_NAME_NEXT_TOKEN)
  private String nextToken = null;

  public static final String SERIALIZED_NAME_FIELD_ID = "fieldId";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private String fieldId = null;

  public ListCriteria includeDeleted(Boolean includeDeleted) {
    this.includeDeleted = includeDeleted;
    return this;
  }

   /**
   * Get includeDeleted
   * @return includeDeleted
  **/
  @ApiModelProperty(value = "")
  public Boolean getIncludeDeleted() {
    return includeDeleted;
  }

  public void setIncludeDeleted(Boolean includeDeleted) {
    this.includeDeleted = includeDeleted;
  }

  public ListCriteria labelListName(String labelListName) {
    this.labelListName = labelListName;
    return this;
  }

   /**
   * Get labelListName
   * @return labelListName
  **/
  @ApiModelProperty(value = "")
  public String getLabelListName() {
    return labelListName;
  }

  public void setLabelListName(String labelListName) {
    this.labelListName = labelListName;
  }

  public ListCriteria maxResults(BigDecimal maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(BigDecimal maxResults) {
    this.maxResults = maxResults;
  }

  public ListCriteria typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @ApiModelProperty(value = "")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public ListCriteria factType(FactTypeEnum factType) {
    this.factType = factType;
    return this;
  }

   /**
   * Get factType
   * @return factType
  **/
  @ApiModelProperty(value = "")
  public FactTypeEnum getFactType() {
    return factType;
  }

  public void setFactType(FactTypeEnum factType) {
    this.factType = factType;
  }

  public ListCriteria actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

   /**
   * Get actionId
   * @return actionId
  **/
  @ApiModelProperty(value = "")
  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }

  public ListCriteria labelListId(String labelListId) {
    this.labelListId = labelListId;
    return this;
  }

   /**
   * Get labelListId
   * @return labelListId
  **/
  @ApiModelProperty(value = "")
  public String getLabelListId() {
    return labelListId;
  }

  public void setLabelListId(String labelListId) {
    this.labelListId = labelListId;
  }

  public ListCriteria startingFromTimestamp(BigDecimal startingFromTimestamp) {
    this.startingFromTimestamp = startingFromTimestamp;
    return this;
  }

   /**
   * Get startingFromTimestamp
   * @return startingFromTimestamp
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getStartingFromTimestamp() {
    return startingFromTimestamp;
  }

  public void setStartingFromTimestamp(BigDecimal startingFromTimestamp) {
    this.startingFromTimestamp = startingFromTimestamp;
  }

  public ListCriteria nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Get nextToken
   * @return nextToken
  **/
  @ApiModelProperty(value = "")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ListCriteria fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Get fieldId
   * @return fieldId
  **/
  @ApiModelProperty(value = "")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCriteria listCriteria = (ListCriteria) o;
    return Objects.equals(this.includeDeleted, listCriteria.includeDeleted) &&
        Objects.equals(this.labelListName, listCriteria.labelListName) &&
        Objects.equals(this.maxResults, listCriteria.maxResults) &&
        Objects.equals(this.typeName, listCriteria.typeName) &&
        Objects.equals(this.factType, listCriteria.factType) &&
        Objects.equals(this.actionId, listCriteria.actionId) &&
        Objects.equals(this.labelListId, listCriteria.labelListId) &&
        Objects.equals(this.startingFromTimestamp, listCriteria.startingFromTimestamp) &&
        Objects.equals(this.nextToken, listCriteria.nextToken) &&
        Objects.equals(this.fieldId, listCriteria.fieldId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeDeleted, labelListName, maxResults, typeName, factType, actionId, labelListId, startingFromTimestamp, nextToken, fieldId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCriteria {\n");
    
    sb.append("    includeDeleted: ").append(toIndentedString(includeDeleted)).append("\n");
    sb.append("    labelListName: ").append(toIndentedString(labelListName)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    factType: ").append(toIndentedString(factType)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    labelListId: ").append(toIndentedString(labelListId)).append("\n");
    sb.append("    startingFromTimestamp: ").append(toIndentedString(startingFromTimestamp)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
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


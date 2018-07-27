/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import com.factern.model.PermissionAction;
import com.factern.model.PermissionEffect;
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
 * PermissionPolicyDocument
 */

public class PermissionPolicyDocument {
  @SerializedName("granteeId")
  private String granteeId = null;

  @SerializedName("effect")
  private PermissionEffect effect = null;

  @SerializedName("actions")
  private List<PermissionAction> actions = new ArrayList<PermissionAction>();

  @SerializedName("scopeId")
  private String scopeId = null;

  @SerializedName("requestInterfaceId")
  private String requestInterfaceId = null;

  @SerializedName("applicationId")
  private String applicationId = null;

  public PermissionPolicyDocument granteeId(String granteeId) {
    this.granteeId = granteeId;
    return this;
  }

   /**
   * Get granteeId
   * @return granteeId
  **/
  @ApiModelProperty(value = "")
  public String getGranteeId() {
    return granteeId;
  }

  public void setGranteeId(String granteeId) {
    this.granteeId = granteeId;
  }

  public PermissionPolicyDocument effect(PermissionEffect effect) {
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  @ApiModelProperty(value = "")
  public PermissionEffect getEffect() {
    return effect;
  }

  public void setEffect(PermissionEffect effect) {
    this.effect = effect;
  }

  public PermissionPolicyDocument actions(List<PermissionAction> actions) {
    this.actions = actions;
    return this;
  }

  public PermissionPolicyDocument addActionsItem(PermissionAction actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<PermissionAction> getActions() {
    return actions;
  }

  public void setActions(List<PermissionAction> actions) {
    this.actions = actions;
  }

  public PermissionPolicyDocument scopeId(String scopeId) {
    this.scopeId = scopeId;
    return this;
  }

   /**
   * Get scopeId
   * @return scopeId
  **/
  @ApiModelProperty(value = "")
  public String getScopeId() {
    return scopeId;
  }

  public void setScopeId(String scopeId) {
    this.scopeId = scopeId;
  }

  public PermissionPolicyDocument requestInterfaceId(String requestInterfaceId) {
    this.requestInterfaceId = requestInterfaceId;
    return this;
  }

   /**
   * Get requestInterfaceId
   * @return requestInterfaceId
  **/
  @ApiModelProperty(value = "")
  public String getRequestInterfaceId() {
    return requestInterfaceId;
  }

  public void setRequestInterfaceId(String requestInterfaceId) {
    this.requestInterfaceId = requestInterfaceId;
  }

  public PermissionPolicyDocument applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(value = "")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionPolicyDocument permissionPolicyDocument = (PermissionPolicyDocument) o;
    return Objects.equals(this.granteeId, permissionPolicyDocument.granteeId) &&
        Objects.equals(this.effect, permissionPolicyDocument.effect) &&
        Objects.equals(this.actions, permissionPolicyDocument.actions) &&
        Objects.equals(this.scopeId, permissionPolicyDocument.scopeId) &&
        Objects.equals(this.requestInterfaceId, permissionPolicyDocument.requestInterfaceId) &&
        Objects.equals(this.applicationId, permissionPolicyDocument.applicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granteeId, effect, actions, scopeId, requestInterfaceId, applicationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionPolicyDocument {\n");
    
    sb.append("    granteeId: ").append(toIndentedString(granteeId)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    scopeId: ").append(toIndentedString(scopeId)).append("\n");
    sb.append("    requestInterfaceId: ").append(toIndentedString(requestInterfaceId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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


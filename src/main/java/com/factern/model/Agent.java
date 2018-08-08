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
 * Agent
 */

public class Agent {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application = null;

  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login = null;

  public static final String SERIALIZED_NAME_REPRESENTING = "representing";
  @SerializedName(SERIALIZED_NAME_REPRESENTING)
  private String representing = null;

  public Agent application(String application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @ApiModelProperty(required = true, value = "")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public Agent login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public Agent representing(String representing) {
    this.representing = representing;
    return this;
  }

   /**
   * Get representing
   * @return representing
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRepresenting() {
    return representing;
  }

  public void setRepresenting(String representing) {
    this.representing = representing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(this.application, agent.application) &&
        Objects.equals(this.login, agent.login) &&
        Objects.equals(this.representing, agent.representing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, login, representing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    representing: ").append(toIndentedString(representing)).append("\n");
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


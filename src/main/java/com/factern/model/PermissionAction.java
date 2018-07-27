/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets PermissionAction
 */
@JsonAdapter(PermissionAction.Adapter.class)
public enum PermissionAction {
  
  READ("Read"),
  
  ACT("Act"),
  
  APPLICATION("Application"),
  
  CREATE("Create"),
  
  DESCRIBE("Describe");

  private String value;

  PermissionAction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PermissionAction fromValue(String text) {
    for (PermissionAction b : PermissionAction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PermissionAction> {
    @Override
    public void write(final JsonWriter jsonWriter, final PermissionAction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PermissionAction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PermissionAction.fromValue(String.valueOf(value));
    }
  }
}


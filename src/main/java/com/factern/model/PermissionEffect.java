/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets PermissionEffect
 */
@JsonAdapter(PermissionEffect.Adapter.class)
public enum PermissionEffect {
  
  ALLOW("Allow"),
  
  DENY("Deny");

  private String value;

  PermissionEffect(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PermissionEffect fromValue(String text) {
    for (PermissionEffect b : PermissionEffect.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PermissionEffect> {
    @Override
    public void write(final JsonWriter jsonWriter, final PermissionEffect enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PermissionEffect read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PermissionEffect.fromValue(String.valueOf(value));
    }
  }
}


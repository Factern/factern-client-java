/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
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
 * Searches
 */

public class Searches {
  @SerializedName("searches")
  private BigDecimal searches = null;

  @SerializedName("reindexingCalls")
  private BigDecimal reindexingCalls = null;

  @SerializedName("hits")
  private BigDecimal hits = null;

  @SerializedName("reindexedNodes")
  private BigDecimal reindexedNodes = null;

  public Searches searches(BigDecimal searches) {
    this.searches = searches;
    return this;
  }

   /**
   * Get searches
   * @return searches
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getSearches() {
    return searches;
  }

  public void setSearches(BigDecimal searches) {
    this.searches = searches;
  }

  public Searches reindexingCalls(BigDecimal reindexingCalls) {
    this.reindexingCalls = reindexingCalls;
    return this;
  }

   /**
   * Get reindexingCalls
   * @return reindexingCalls
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getReindexingCalls() {
    return reindexingCalls;
  }

  public void setReindexingCalls(BigDecimal reindexingCalls) {
    this.reindexingCalls = reindexingCalls;
  }

  public Searches hits(BigDecimal hits) {
    this.hits = hits;
    return this;
  }

   /**
   * Get hits
   * @return hits
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getHits() {
    return hits;
  }

  public void setHits(BigDecimal hits) {
    this.hits = hits;
  }

  public Searches reindexedNodes(BigDecimal reindexedNodes) {
    this.reindexedNodes = reindexedNodes;
    return this;
  }

   /**
   * Get reindexedNodes
   * @return reindexedNodes
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getReindexedNodes() {
    return reindexedNodes;
  }

  public void setReindexedNodes(BigDecimal reindexedNodes) {
    this.reindexedNodes = reindexedNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Searches searches = (Searches) o;
    return Objects.equals(this.searches, searches.searches) &&
        Objects.equals(this.reindexingCalls, searches.reindexingCalls) &&
        Objects.equals(this.hits, searches.hits) &&
        Objects.equals(this.reindexedNodes, searches.reindexedNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searches, reindexingCalls, hits, reindexedNodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Searches {\n");
    
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
    sb.append("    reindexingCalls: ").append(toIndentedString(reindexingCalls)).append("\n");
    sb.append("    hits: ").append(toIndentedString(hits)).append("\n");
    sb.append("    reindexedNodes: ").append(toIndentedString(reindexedNodes)).append("\n");
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


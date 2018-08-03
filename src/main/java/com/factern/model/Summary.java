/*
 * Factern API
 */


package com.factern.model;

import java.util.Objects;
import java.util.Arrays;
import com.factern.model.Account;
import com.factern.model.Cost;
import com.factern.model.ExternalDataUsage;
import com.factern.model.FactCount;
import com.factern.model.Searches;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Summary
 */

public class Summary {
  public static final String SERIALIZED_NAME_FACTS = "facts";
  @SerializedName(SERIALIZED_NAME_FACTS)
  private FactCount facts = null;

  public static final String SERIALIZED_NAME_EXTERNAL_DATA_USAGE = "externalDataUsage";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_DATA_USAGE)
  private ExternalDataUsage externalDataUsage = null;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private Account account = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Cost cost = null;

  public static final String SERIALIZED_NAME_SEARCHES = "searches";
  @SerializedName(SERIALIZED_NAME_SEARCHES)
  private Searches searches = null;

  public Summary facts(FactCount facts) {
    this.facts = facts;
    return this;
  }

   /**
   * Get facts
   * @return facts
  **/
  @ApiModelProperty(value = "")
  public FactCount getFacts() {
    return facts;
  }

  public void setFacts(FactCount facts) {
    this.facts = facts;
  }

  public Summary externalDataUsage(ExternalDataUsage externalDataUsage) {
    this.externalDataUsage = externalDataUsage;
    return this;
  }

   /**
   * Get externalDataUsage
   * @return externalDataUsage
  **/
  @ApiModelProperty(value = "")
  public ExternalDataUsage getExternalDataUsage() {
    return externalDataUsage;
  }

  public void setExternalDataUsage(ExternalDataUsage externalDataUsage) {
    this.externalDataUsage = externalDataUsage;
  }

  public Summary account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Summary cost(Cost cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")
  public Cost getCost() {
    return cost;
  }

  public void setCost(Cost cost) {
    this.cost = cost;
  }

  public Summary searches(Searches searches) {
    this.searches = searches;
    return this;
  }

   /**
   * Get searches
   * @return searches
  **/
  @ApiModelProperty(value = "")
  public Searches getSearches() {
    return searches;
  }

  public void setSearches(Searches searches) {
    this.searches = searches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Summary summary = (Summary) o;
    return Objects.equals(this.facts, summary.facts) &&
        Objects.equals(this.externalDataUsage, summary.externalDataUsage) &&
        Objects.equals(this.account, summary.account) &&
        Objects.equals(this.cost, summary.cost) &&
        Objects.equals(this.searches, summary.searches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facts, externalDataUsage, account, cost, searches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    
    sb.append("    facts: ").append(toIndentedString(facts)).append("\n");
    sb.append("    externalDataUsage: ").append(toIndentedString(externalDataUsage)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
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


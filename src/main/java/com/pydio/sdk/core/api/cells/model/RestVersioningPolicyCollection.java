/*
 * Pydio Cells Rest API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pydio.sdk.core.api.cells.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.pydio.sdk.core.api.cells.model.TreeVersioningPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RestVersioningPolicyCollection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-26T11:16:15.623+02:00")



public class RestVersioningPolicyCollection {
  @SerializedName("Policies")
  private List<TreeVersioningPolicy> policies = null;

  public RestVersioningPolicyCollection policies(List<TreeVersioningPolicy> policies) {
    this.policies = policies;
    return this;
  }

  public RestVersioningPolicyCollection addPoliciesItem(TreeVersioningPolicy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<TreeVersioningPolicy>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @ApiModelProperty(value = "")
  public List<TreeVersioningPolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<TreeVersioningPolicy> policies) {
    this.policies = policies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestVersioningPolicyCollection restVersioningPolicyCollection = (RestVersioningPolicyCollection) o;
    return Objects.equals(this.policies, restVersioningPolicyCollection.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestVersioningPolicyCollection {\n");
    
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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


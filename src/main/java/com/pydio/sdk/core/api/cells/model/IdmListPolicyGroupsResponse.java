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
import com.pydio.sdk.core.api.cells.model.IdmPolicyGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IdmListPolicyGroupsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-26T11:16:15.623+02:00")



public class IdmListPolicyGroupsResponse {
  @SerializedName("PolicyGroups")
  private List<IdmPolicyGroup> policyGroups = null;

  @SerializedName("Total")
  private Integer total = null;

  public IdmListPolicyGroupsResponse policyGroups(List<IdmPolicyGroup> policyGroups) {
    this.policyGroups = policyGroups;
    return this;
  }

  public IdmListPolicyGroupsResponse addPolicyGroupsItem(IdmPolicyGroup policyGroupsItem) {
    if (this.policyGroups == null) {
      this.policyGroups = new ArrayList<IdmPolicyGroup>();
    }
    this.policyGroups.add(policyGroupsItem);
    return this;
  }

   /**
   * Get policyGroups
   * @return policyGroups
  **/
  @ApiModelProperty(value = "")
  public List<IdmPolicyGroup> getPolicyGroups() {
    return policyGroups;
  }

  public void setPolicyGroups(List<IdmPolicyGroup> policyGroups) {
    this.policyGroups = policyGroups;
  }

  public IdmListPolicyGroupsResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdmListPolicyGroupsResponse idmListPolicyGroupsResponse = (IdmListPolicyGroupsResponse) o;
    return Objects.equals(this.policyGroups, idmListPolicyGroupsResponse.policyGroups) &&
        Objects.equals(this.total, idmListPolicyGroupsResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyGroups, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdmListPolicyGroupsResponse {\n");
    
    sb.append("    policyGroups: ").append(toIndentedString(policyGroups)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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


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
import com.pydio.sdk.core.api.cells.model.ServiceResourcePolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IdmUserMetaNamespace
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-26T11:16:15.623+02:00")



public class IdmUserMetaNamespace {
  @SerializedName("Namespace")
  private String namespace = null;

  @SerializedName("Label")
  private String label = null;

  @SerializedName("Order")
  private Integer order = null;

  @SerializedName("Indexable")
  private Boolean indexable = null;

  @SerializedName("JsonDefinition")
  private String jsonDefinition = null;

  @SerializedName("Policies")
  private List<ServiceResourcePolicy> policies = null;

  public IdmUserMetaNamespace namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IdmUserMetaNamespace label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public IdmUserMetaNamespace order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public IdmUserMetaNamespace indexable(Boolean indexable) {
    this.indexable = indexable;
    return this;
  }

   /**
   * Get indexable
   * @return indexable
  **/
  @ApiModelProperty(value = "")
  public Boolean isIndexable() {
    return indexable;
  }

  public void setIndexable(Boolean indexable) {
    this.indexable = indexable;
  }

  public IdmUserMetaNamespace jsonDefinition(String jsonDefinition) {
    this.jsonDefinition = jsonDefinition;
    return this;
  }

   /**
   * Get jsonDefinition
   * @return jsonDefinition
  **/
  @ApiModelProperty(value = "")
  public String getJsonDefinition() {
    return jsonDefinition;
  }

  public void setJsonDefinition(String jsonDefinition) {
    this.jsonDefinition = jsonDefinition;
  }

  public IdmUserMetaNamespace policies(List<ServiceResourcePolicy> policies) {
    this.policies = policies;
    return this;
  }

  public IdmUserMetaNamespace addPoliciesItem(ServiceResourcePolicy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<ServiceResourcePolicy>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @ApiModelProperty(value = "")
  public List<ServiceResourcePolicy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<ServiceResourcePolicy> policies) {
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
    IdmUserMetaNamespace idmUserMetaNamespace = (IdmUserMetaNamespace) o;
    return Objects.equals(this.namespace, idmUserMetaNamespace.namespace) &&
        Objects.equals(this.label, idmUserMetaNamespace.label) &&
        Objects.equals(this.order, idmUserMetaNamespace.order) &&
        Objects.equals(this.indexable, idmUserMetaNamespace.indexable) &&
        Objects.equals(this.jsonDefinition, idmUserMetaNamespace.jsonDefinition) &&
        Objects.equals(this.policies, idmUserMetaNamespace.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, label, order, indexable, jsonDefinition, policies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdmUserMetaNamespace {\n");
    
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    indexable: ").append(toIndentedString(indexable)).append("\n");
    sb.append("    jsonDefinition: ").append(toIndentedString(jsonDefinition)).append("\n");
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


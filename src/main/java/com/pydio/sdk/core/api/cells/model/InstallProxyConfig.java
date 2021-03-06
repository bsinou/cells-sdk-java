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
import com.pydio.sdk.core.api.cells.model.InstallTLSCertificate;
import com.pydio.sdk.core.api.cells.model.InstallTLSLetsEncrypt;
import com.pydio.sdk.core.api.cells.model.InstallTLSSelfSigned;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InstallProxyConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-26T11:16:15.623+02:00")



public class InstallProxyConfig {
  @SerializedName("BindURL")
  private String bindURL = null;

  @SerializedName("ExternalURL")
  private String externalURL = null;

  @SerializedName("RedirectURLs")
  private List<String> redirectURLs = null;

  @SerializedName("SelfSigned")
  private InstallTLSSelfSigned selfSigned = null;

  @SerializedName("LetsEncrypt")
  private InstallTLSLetsEncrypt letsEncrypt = null;

  @SerializedName("Certificate")
  private InstallTLSCertificate certificate = null;

  public InstallProxyConfig bindURL(String bindURL) {
    this.bindURL = bindURL;
    return this;
  }

   /**
   * Get bindURL
   * @return bindURL
  **/
  @ApiModelProperty(value = "")
  public String getBindURL() {
    return bindURL;
  }

  public void setBindURL(String bindURL) {
    this.bindURL = bindURL;
  }

  public InstallProxyConfig externalURL(String externalURL) {
    this.externalURL = externalURL;
    return this;
  }

   /**
   * Get externalURL
   * @return externalURL
  **/
  @ApiModelProperty(value = "")
  public String getExternalURL() {
    return externalURL;
  }

  public void setExternalURL(String externalURL) {
    this.externalURL = externalURL;
  }

  public InstallProxyConfig redirectURLs(List<String> redirectURLs) {
    this.redirectURLs = redirectURLs;
    return this;
  }

  public InstallProxyConfig addRedirectURLsItem(String redirectURLsItem) {
    if (this.redirectURLs == null) {
      this.redirectURLs = new ArrayList<String>();
    }
    this.redirectURLs.add(redirectURLsItem);
    return this;
  }

   /**
   * Get redirectURLs
   * @return redirectURLs
  **/
  @ApiModelProperty(value = "")
  public List<String> getRedirectURLs() {
    return redirectURLs;
  }

  public void setRedirectURLs(List<String> redirectURLs) {
    this.redirectURLs = redirectURLs;
  }

  public InstallProxyConfig selfSigned(InstallTLSSelfSigned selfSigned) {
    this.selfSigned = selfSigned;
    return this;
  }

   /**
   * Get selfSigned
   * @return selfSigned
  **/
  @ApiModelProperty(value = "")
  public InstallTLSSelfSigned getSelfSigned() {
    return selfSigned;
  }

  public void setSelfSigned(InstallTLSSelfSigned selfSigned) {
    this.selfSigned = selfSigned;
  }

  public InstallProxyConfig letsEncrypt(InstallTLSLetsEncrypt letsEncrypt) {
    this.letsEncrypt = letsEncrypt;
    return this;
  }

   /**
   * Get letsEncrypt
   * @return letsEncrypt
  **/
  @ApiModelProperty(value = "")
  public InstallTLSLetsEncrypt getLetsEncrypt() {
    return letsEncrypt;
  }

  public void setLetsEncrypt(InstallTLSLetsEncrypt letsEncrypt) {
    this.letsEncrypt = letsEncrypt;
  }

  public InstallProxyConfig certificate(InstallTLSCertificate certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @ApiModelProperty(value = "")
  public InstallTLSCertificate getCertificate() {
    return certificate;
  }

  public void setCertificate(InstallTLSCertificate certificate) {
    this.certificate = certificate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallProxyConfig installProxyConfig = (InstallProxyConfig) o;
    return Objects.equals(this.bindURL, installProxyConfig.bindURL) &&
        Objects.equals(this.externalURL, installProxyConfig.externalURL) &&
        Objects.equals(this.redirectURLs, installProxyConfig.redirectURLs) &&
        Objects.equals(this.selfSigned, installProxyConfig.selfSigned) &&
        Objects.equals(this.letsEncrypt, installProxyConfig.letsEncrypt) &&
        Objects.equals(this.certificate, installProxyConfig.certificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindURL, externalURL, redirectURLs, selfSigned, letsEncrypt, certificate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallProxyConfig {\n");
    
    sb.append("    bindURL: ").append(toIndentedString(bindURL)).append("\n");
    sb.append("    externalURL: ").append(toIndentedString(externalURL)).append("\n");
    sb.append("    redirectURLs: ").append(toIndentedString(redirectURLs)).append("\n");
    sb.append("    selfSigned: ").append(toIndentedString(selfSigned)).append("\n");
    sb.append("    letsEncrypt: ").append(toIndentedString(letsEncrypt)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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


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
import com.pydio.sdk.core.api.cells.model.RestCell;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RestPutCellRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-26T11:16:15.623+02:00")



public class RestPutCellRequest {
  @SerializedName("Room")
  private RestCell room = null;

  @SerializedName("CreateEmptyRoot")
  private Boolean createEmptyRoot = null;

  public RestPutCellRequest room(RestCell room) {
    this.room = room;
    return this;
  }

   /**
   * Get room
   * @return room
  **/
  @ApiModelProperty(value = "")
  public RestCell getRoom() {
    return room;
  }

  public void setRoom(RestCell room) {
    this.room = room;
  }

  public RestPutCellRequest createEmptyRoot(Boolean createEmptyRoot) {
    this.createEmptyRoot = createEmptyRoot;
    return this;
  }

   /**
   * Get createEmptyRoot
   * @return createEmptyRoot
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreateEmptyRoot() {
    return createEmptyRoot;
  }

  public void setCreateEmptyRoot(Boolean createEmptyRoot) {
    this.createEmptyRoot = createEmptyRoot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestPutCellRequest restPutCellRequest = (RestPutCellRequest) o;
    return Objects.equals(this.room, restPutCellRequest.room) &&
        Objects.equals(this.createEmptyRoot, restPutCellRequest.createEmptyRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(room, createEmptyRoot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestPutCellRequest {\n");
    
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    createEmptyRoot: ").append(toIndentedString(createEmptyRoot)).append("\n");
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


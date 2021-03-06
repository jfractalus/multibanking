/*
 * finAPI RESTful Services
 * finAPI RESTful Services
 *
 * OpenAPI spec version: v1.46.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Trigger categorization parameters
 */
@ApiModel(description = "Trigger categorization parameters")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-14T19:12:52.919Z")
public class TriggerCategorizationParams {
  @SerializedName("bankConnectionIds")
  private List<Long> bankConnectionIds = null;

  public TriggerCategorizationParams bankConnectionIds(List<Long> bankConnectionIds) {
    this.bankConnectionIds = bankConnectionIds;
    return this;
  }

  public TriggerCategorizationParams addBankConnectionIdsItem(Long bankConnectionIdsItem) {
    if (this.bankConnectionIds == null) {
      this.bankConnectionIds = new ArrayList<Long>();
    }
    this.bankConnectionIds.add(bankConnectionIdsItem);
    return this;
  }

   /**
   * List of identifiers of the bank connections that you want to trigger categorization for. Leaving the list unset or empty will trigger categorization for all of the user&#39;s bank connections. Please note that if there are no bank connections, then the service will return with HTTP code 422.
   * @return bankConnectionIds
  **/
  @ApiModelProperty(value = "List of identifiers of the bank connections that you want to trigger categorization for. Leaving the list unset or empty will trigger categorization for all of the user's bank connections. Please note that if there are no bank connections, then the service will return with HTTP code 422.")
  public List<Long> getBankConnectionIds() {
    return bankConnectionIds;
  }

  public void setBankConnectionIds(List<Long> bankConnectionIds) {
    this.bankConnectionIds = bankConnectionIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerCategorizationParams triggerCategorizationParams = (TriggerCategorizationParams) o;
    return Objects.equals(this.bankConnectionIds, triggerCategorizationParams.bankConnectionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankConnectionIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerCategorizationParams {\n");
    
    sb.append("    bankConnectionIds: ").append(toIndentedString(bankConnectionIds)).append("\n");
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


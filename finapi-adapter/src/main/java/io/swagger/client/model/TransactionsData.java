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
import io.swagger.client.model.TransactionDataWithIdentifier;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Transactions data
 */
@ApiModel(description = "Transactions data")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-14T19:12:52.919Z")
public class TransactionsData {
  @SerializedName("transactionData")
  private List<TransactionDataWithIdentifier> transactionData = new ArrayList<TransactionDataWithIdentifier>();

  public TransactionsData transactionData(List<TransactionDataWithIdentifier> transactionData) {
    this.transactionData = transactionData;
    return this;
  }

  public TransactionsData addTransactionDataItem(TransactionDataWithIdentifier transactionDataItem) {
    this.transactionData.add(transactionDataItem);
    return this;
  }

   /**
   * Set of transaction data (at most 100 transactions at once).
   * @return transactionData
  **/
  @ApiModelProperty(required = true, value = "Set of transaction data (at most 100 transactions at once).")
  public List<TransactionDataWithIdentifier> getTransactionData() {
    return transactionData;
  }

  public void setTransactionData(List<TransactionDataWithIdentifier> transactionData) {
    this.transactionData = transactionData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsData transactionsData = (TransactionsData) o;
    return Objects.equals(this.transactionData, transactionsData.transactionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsData {\n");
    
    sb.append("    transactionData: ").append(toIndentedString(transactionData)).append("\n");
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


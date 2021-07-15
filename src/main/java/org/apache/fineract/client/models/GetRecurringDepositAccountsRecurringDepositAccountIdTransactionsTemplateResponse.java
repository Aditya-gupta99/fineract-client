/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.5.0-23-g1ac2469-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.fineract.client.models.GetRecurringCurrency;
import org.apache.fineract.client.models.GetRecurringTransactionType;

/**
 * GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse
 */
@ApiModel(description = "GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse")

public class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private GetRecurringTransactionType transactionType;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private String accountNo;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private Date date;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetRecurringCurrency currency;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_REVERSED = "reversed";
  @SerializedName(SERIALIZED_NAME_REVERSED)
  private Boolean reversed;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE_OPTIONS = "paymentTypeOptions";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE_OPTIONS)
  private List<Integer> paymentTypeOptions = null;


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse transactionType(GetRecurringTransactionType transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringTransactionType getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(GetRecurringTransactionType transactionType) {
    this.transactionType = transactionType;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse accountNo(String accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000000001", value = "")

  public String getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse date(Date date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getDate() {
    return date;
  }


  public void setDate(Date date) {
    this.date = date;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse currency(GetRecurringCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetRecurringCurrency currency) {
    this.currency = currency;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100000.0", value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse reversed(Boolean reversed) {
    
    this.reversed = reversed;
    return this;
  }

   /**
   * Get reversed
   * @return reversed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getReversed() {
    return reversed;
  }


  public void setReversed(Boolean reversed) {
    this.reversed = reversed;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse paymentTypeOptions(List<Integer> paymentTypeOptions) {
    
    this.paymentTypeOptions = paymentTypeOptions;
    return this;
  }

  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse addPaymentTypeOptionsItem(Integer paymentTypeOptionsItem) {
    if (this.paymentTypeOptions == null) {
      this.paymentTypeOptions = new ArrayList<Integer>();
    }
    this.paymentTypeOptions.add(paymentTypeOptionsItem);
    return this;
  }

   /**
   * Get paymentTypeOptions
   * @return paymentTypeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "")

  public List<Integer> getPaymentTypeOptions() {
    return paymentTypeOptions;
  }


  public void setPaymentTypeOptions(List<Integer> paymentTypeOptions) {
    this.paymentTypeOptions = paymentTypeOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse = (GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse) o;
    return Objects.equals(this.id, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.id) &&
        Objects.equals(this.transactionType, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.transactionType) &&
        Objects.equals(this.accountId, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.accountId) &&
        Objects.equals(this.accountNo, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.accountNo) &&
        Objects.equals(this.date, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.date) &&
        Objects.equals(this.currency, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.currency) &&
        Objects.equals(this.amount, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.amount) &&
        Objects.equals(this.reversed, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.reversed) &&
        Objects.equals(this.paymentTypeOptions, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.paymentTypeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionType, accountId, accountNo, date, currency, amount, reversed, paymentTypeOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reversed: ").append(toIndentedString(reversed)).append("\n");
    sb.append("    paymentTypeOptions: ").append(toIndentedString(paymentTypeOptions)).append("\n");
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


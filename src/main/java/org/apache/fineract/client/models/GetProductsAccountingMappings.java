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
import org.apache.fineract.client.models.GetIncomeFromFeeAccountId;
import org.apache.fineract.client.models.GetShareEquityId;
import org.apache.fineract.client.models.GetShareReferenceId;
import org.apache.fineract.client.models.GetShareSuspenseId;

/**
 * GetProductsAccountingMappings
 */

public class GetProductsAccountingMappings {
  public static final String SERIALIZED_NAME_SHARE_REFERENCE_ID = "shareReferenceId";
  @SerializedName(SERIALIZED_NAME_SHARE_REFERENCE_ID)
  private GetShareReferenceId shareReferenceId;

  public static final String SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT_ID = "incomeFromFeeAccountId";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT_ID)
  private GetIncomeFromFeeAccountId incomeFromFeeAccountId;

  public static final String SERIALIZED_NAME_SHARE_EQUITY_ID = "shareEquityId";
  @SerializedName(SERIALIZED_NAME_SHARE_EQUITY_ID)
  private GetShareEquityId shareEquityId;

  public static final String SERIALIZED_NAME_SHARE_SUSPENSE_ID = "shareSuspenseId";
  @SerializedName(SERIALIZED_NAME_SHARE_SUSPENSE_ID)
  private GetShareSuspenseId shareSuspenseId;


  public GetProductsAccountingMappings shareReferenceId(GetShareReferenceId shareReferenceId) {
    
    this.shareReferenceId = shareReferenceId;
    return this;
  }

   /**
   * Get shareReferenceId
   * @return shareReferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareReferenceId getShareReferenceId() {
    return shareReferenceId;
  }


  public void setShareReferenceId(GetShareReferenceId shareReferenceId) {
    this.shareReferenceId = shareReferenceId;
  }


  public GetProductsAccountingMappings incomeFromFeeAccountId(GetIncomeFromFeeAccountId incomeFromFeeAccountId) {
    
    this.incomeFromFeeAccountId = incomeFromFeeAccountId;
    return this;
  }

   /**
   * Get incomeFromFeeAccountId
   * @return incomeFromFeeAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetIncomeFromFeeAccountId getIncomeFromFeeAccountId() {
    return incomeFromFeeAccountId;
  }


  public void setIncomeFromFeeAccountId(GetIncomeFromFeeAccountId incomeFromFeeAccountId) {
    this.incomeFromFeeAccountId = incomeFromFeeAccountId;
  }


  public GetProductsAccountingMappings shareEquityId(GetShareEquityId shareEquityId) {
    
    this.shareEquityId = shareEquityId;
    return this;
  }

   /**
   * Get shareEquityId
   * @return shareEquityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareEquityId getShareEquityId() {
    return shareEquityId;
  }


  public void setShareEquityId(GetShareEquityId shareEquityId) {
    this.shareEquityId = shareEquityId;
  }


  public GetProductsAccountingMappings shareSuspenseId(GetShareSuspenseId shareSuspenseId) {
    
    this.shareSuspenseId = shareSuspenseId;
    return this;
  }

   /**
   * Get shareSuspenseId
   * @return shareSuspenseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetShareSuspenseId getShareSuspenseId() {
    return shareSuspenseId;
  }


  public void setShareSuspenseId(GetShareSuspenseId shareSuspenseId) {
    this.shareSuspenseId = shareSuspenseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProductsAccountingMappings getProductsAccountingMappings = (GetProductsAccountingMappings) o;
    return Objects.equals(this.shareReferenceId, getProductsAccountingMappings.shareReferenceId) &&
        Objects.equals(this.incomeFromFeeAccountId, getProductsAccountingMappings.incomeFromFeeAccountId) &&
        Objects.equals(this.shareEquityId, getProductsAccountingMappings.shareEquityId) &&
        Objects.equals(this.shareSuspenseId, getProductsAccountingMappings.shareSuspenseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareReferenceId, incomeFromFeeAccountId, shareEquityId, shareSuspenseId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductsAccountingMappings {\n");
    sb.append("    shareReferenceId: ").append(toIndentedString(shareReferenceId)).append("\n");
    sb.append("    incomeFromFeeAccountId: ").append(toIndentedString(incomeFromFeeAccountId)).append("\n");
    sb.append("    shareEquityId: ").append(toIndentedString(shareEquityId)).append("\n");
    sb.append("    shareSuspenseId: ").append(toIndentedString(shareSuspenseId)).append("\n");
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


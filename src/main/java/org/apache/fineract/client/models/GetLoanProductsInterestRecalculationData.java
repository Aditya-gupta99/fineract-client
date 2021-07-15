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
import org.apache.fineract.client.models.GetLoanProductsInterestRecalculationCompoundingFrequencyType;
import org.apache.fineract.client.models.GetLoanProductsInterestRecalculationCompoundingType;
import org.apache.fineract.client.models.GetLoanProductsPreClosureInterestCalculationStrategy;
import org.apache.fineract.client.models.GetLoanProductsRescheduleStrategyType;

/**
 * GetLoanProductsInterestRecalculationData
 */

public class GetLoanProductsInterestRecalculationData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_INTEREST_RECALCULATION_COMPOUNDING_TYPE = "interestRecalculationCompoundingType";
  @SerializedName(SERIALIZED_NAME_INTEREST_RECALCULATION_COMPOUNDING_TYPE)
  private GetLoanProductsInterestRecalculationCompoundingType interestRecalculationCompoundingType;

  public static final String SERIALIZED_NAME_INTEREST_RECALCULATION_COMPOUNDING_FREQUENCY_TYPE = "interestRecalculationCompoundingFrequencyType";
  @SerializedName(SERIALIZED_NAME_INTEREST_RECALCULATION_COMPOUNDING_FREQUENCY_TYPE)
  private GetLoanProductsInterestRecalculationCompoundingFrequencyType interestRecalculationCompoundingFrequencyType;

  public static final String SERIALIZED_NAME_RESCHEDULE_STRATEGY_TYPE = "rescheduleStrategyType";
  @SerializedName(SERIALIZED_NAME_RESCHEDULE_STRATEGY_TYPE)
  private GetLoanProductsRescheduleStrategyType rescheduleStrategyType;

  public static final String SERIALIZED_NAME_RECALCULATION_REST_FREQUENCY_TYPE = "recalculationRestFrequencyType";
  @SerializedName(SERIALIZED_NAME_RECALCULATION_REST_FREQUENCY_TYPE)
  private GetLoanProductsInterestRecalculationCompoundingFrequencyType recalculationRestFrequencyType;

  public static final String SERIALIZED_NAME_PRE_CLOSURE_INTEREST_CALCULATION_STRATEGY = "preClosureInterestCalculationStrategy";
  @SerializedName(SERIALIZED_NAME_PRE_CLOSURE_INTEREST_CALCULATION_STRATEGY)
  private GetLoanProductsPreClosureInterestCalculationStrategy preClosureInterestCalculationStrategy;

  public static final String SERIALIZED_NAME_IS_ARREARS_BASED_ON_ORIGINAL_SCHEDULE = "isArrearsBasedOnOriginalSchedule";
  @SerializedName(SERIALIZED_NAME_IS_ARREARS_BASED_ON_ORIGINAL_SCHEDULE)
  private Boolean isArrearsBasedOnOriginalSchedule;


  public GetLoanProductsInterestRecalculationData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetLoanProductsInterestRecalculationData productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public GetLoanProductsInterestRecalculationData interestRecalculationCompoundingType(GetLoanProductsInterestRecalculationCompoundingType interestRecalculationCompoundingType) {
    
    this.interestRecalculationCompoundingType = interestRecalculationCompoundingType;
    return this;
  }

   /**
   * Get interestRecalculationCompoundingType
   * @return interestRecalculationCompoundingType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsInterestRecalculationCompoundingType getInterestRecalculationCompoundingType() {
    return interestRecalculationCompoundingType;
  }


  public void setInterestRecalculationCompoundingType(GetLoanProductsInterestRecalculationCompoundingType interestRecalculationCompoundingType) {
    this.interestRecalculationCompoundingType = interestRecalculationCompoundingType;
  }


  public GetLoanProductsInterestRecalculationData interestRecalculationCompoundingFrequencyType(GetLoanProductsInterestRecalculationCompoundingFrequencyType interestRecalculationCompoundingFrequencyType) {
    
    this.interestRecalculationCompoundingFrequencyType = interestRecalculationCompoundingFrequencyType;
    return this;
  }

   /**
   * Get interestRecalculationCompoundingFrequencyType
   * @return interestRecalculationCompoundingFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsInterestRecalculationCompoundingFrequencyType getInterestRecalculationCompoundingFrequencyType() {
    return interestRecalculationCompoundingFrequencyType;
  }


  public void setInterestRecalculationCompoundingFrequencyType(GetLoanProductsInterestRecalculationCompoundingFrequencyType interestRecalculationCompoundingFrequencyType) {
    this.interestRecalculationCompoundingFrequencyType = interestRecalculationCompoundingFrequencyType;
  }


  public GetLoanProductsInterestRecalculationData rescheduleStrategyType(GetLoanProductsRescheduleStrategyType rescheduleStrategyType) {
    
    this.rescheduleStrategyType = rescheduleStrategyType;
    return this;
  }

   /**
   * Get rescheduleStrategyType
   * @return rescheduleStrategyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsRescheduleStrategyType getRescheduleStrategyType() {
    return rescheduleStrategyType;
  }


  public void setRescheduleStrategyType(GetLoanProductsRescheduleStrategyType rescheduleStrategyType) {
    this.rescheduleStrategyType = rescheduleStrategyType;
  }


  public GetLoanProductsInterestRecalculationData recalculationRestFrequencyType(GetLoanProductsInterestRecalculationCompoundingFrequencyType recalculationRestFrequencyType) {
    
    this.recalculationRestFrequencyType = recalculationRestFrequencyType;
    return this;
  }

   /**
   * Get recalculationRestFrequencyType
   * @return recalculationRestFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsInterestRecalculationCompoundingFrequencyType getRecalculationRestFrequencyType() {
    return recalculationRestFrequencyType;
  }


  public void setRecalculationRestFrequencyType(GetLoanProductsInterestRecalculationCompoundingFrequencyType recalculationRestFrequencyType) {
    this.recalculationRestFrequencyType = recalculationRestFrequencyType;
  }


  public GetLoanProductsInterestRecalculationData preClosureInterestCalculationStrategy(GetLoanProductsPreClosureInterestCalculationStrategy preClosureInterestCalculationStrategy) {
    
    this.preClosureInterestCalculationStrategy = preClosureInterestCalculationStrategy;
    return this;
  }

   /**
   * Get preClosureInterestCalculationStrategy
   * @return preClosureInterestCalculationStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetLoanProductsPreClosureInterestCalculationStrategy getPreClosureInterestCalculationStrategy() {
    return preClosureInterestCalculationStrategy;
  }


  public void setPreClosureInterestCalculationStrategy(GetLoanProductsPreClosureInterestCalculationStrategy preClosureInterestCalculationStrategy) {
    this.preClosureInterestCalculationStrategy = preClosureInterestCalculationStrategy;
  }


  public GetLoanProductsInterestRecalculationData isArrearsBasedOnOriginalSchedule(Boolean isArrearsBasedOnOriginalSchedule) {
    
    this.isArrearsBasedOnOriginalSchedule = isArrearsBasedOnOriginalSchedule;
    return this;
  }

   /**
   * Get isArrearsBasedOnOriginalSchedule
   * @return isArrearsBasedOnOriginalSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsArrearsBasedOnOriginalSchedule() {
    return isArrearsBasedOnOriginalSchedule;
  }


  public void setIsArrearsBasedOnOriginalSchedule(Boolean isArrearsBasedOnOriginalSchedule) {
    this.isArrearsBasedOnOriginalSchedule = isArrearsBasedOnOriginalSchedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoanProductsInterestRecalculationData getLoanProductsInterestRecalculationData = (GetLoanProductsInterestRecalculationData) o;
    return Objects.equals(this.id, getLoanProductsInterestRecalculationData.id) &&
        Objects.equals(this.productId, getLoanProductsInterestRecalculationData.productId) &&
        Objects.equals(this.interestRecalculationCompoundingType, getLoanProductsInterestRecalculationData.interestRecalculationCompoundingType) &&
        Objects.equals(this.interestRecalculationCompoundingFrequencyType, getLoanProductsInterestRecalculationData.interestRecalculationCompoundingFrequencyType) &&
        Objects.equals(this.rescheduleStrategyType, getLoanProductsInterestRecalculationData.rescheduleStrategyType) &&
        Objects.equals(this.recalculationRestFrequencyType, getLoanProductsInterestRecalculationData.recalculationRestFrequencyType) &&
        Objects.equals(this.preClosureInterestCalculationStrategy, getLoanProductsInterestRecalculationData.preClosureInterestCalculationStrategy) &&
        Objects.equals(this.isArrearsBasedOnOriginalSchedule, getLoanProductsInterestRecalculationData.isArrearsBasedOnOriginalSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, interestRecalculationCompoundingType, interestRecalculationCompoundingFrequencyType, rescheduleStrategyType, recalculationRestFrequencyType, preClosureInterestCalculationStrategy, isArrearsBasedOnOriginalSchedule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoanProductsInterestRecalculationData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    interestRecalculationCompoundingType: ").append(toIndentedString(interestRecalculationCompoundingType)).append("\n");
    sb.append("    interestRecalculationCompoundingFrequencyType: ").append(toIndentedString(interestRecalculationCompoundingFrequencyType)).append("\n");
    sb.append("    rescheduleStrategyType: ").append(toIndentedString(rescheduleStrategyType)).append("\n");
    sb.append("    recalculationRestFrequencyType: ").append(toIndentedString(recalculationRestFrequencyType)).append("\n");
    sb.append("    preClosureInterestCalculationStrategy: ").append(toIndentedString(preClosureInterestCalculationStrategy)).append("\n");
    sb.append("    isArrearsBasedOnOriginalSchedule: ").append(toIndentedString(isArrearsBasedOnOriginalSchedule)).append("\n");
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


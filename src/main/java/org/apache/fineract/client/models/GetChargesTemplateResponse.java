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
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.GetChargesAppliesToResponse;
import org.apache.fineract.client.models.GetChargesCalculationTypeResponse;
import org.apache.fineract.client.models.GetChargesCurrencyResponse;
import org.apache.fineract.client.models.GetChargesPaymentModeResponse;
import org.apache.fineract.client.models.GetChargesTemplateFeeFrequencyOptions;
import org.apache.fineract.client.models.GetChargesTemplateLoanChargeCalculationTypeOptions;
import org.apache.fineract.client.models.GetChargesTemplateLoanChargeTimeTypeOptions;
import org.apache.fineract.client.models.GetChargesTimeTypeResponse;

/**
 * GetChargesTemplateResponse
 */
@ApiModel(description = "GetChargesTemplateResponse")

public class GetChargesTemplateResponse {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private String active;

  public static final String SERIALIZED_NAME_PENALTY = "penalty";
  @SerializedName(SERIALIZED_NAME_PENALTY)
  private String penalty;

  public static final String SERIALIZED_NAME_CURRENCY_OPTIONS = "currencyOptions";
  @SerializedName(SERIALIZED_NAME_CURRENCY_OPTIONS)
  private List<GetChargesCurrencyResponse> currencyOptions = null;

  public static final String SERIALIZED_NAME_CHARGE_CALCULATION_TYPE_OPTIONS = "chargeCalculationTypeOptions";
  @SerializedName(SERIALIZED_NAME_CHARGE_CALCULATION_TYPE_OPTIONS)
  private List<GetChargesCalculationTypeResponse> chargeCalculationTypeOptions = null;

  public static final String SERIALIZED_NAME_CHARGE_APPLIES_TO_OPTIONS = "chargeAppliesToOptions";
  @SerializedName(SERIALIZED_NAME_CHARGE_APPLIES_TO_OPTIONS)
  private List<GetChargesAppliesToResponse> chargeAppliesToOptions = null;

  public static final String SERIALIZED_NAME_CHARGE_TIME_TYPE_OPTIONS = "chargeTimeTypeOptions";
  @SerializedName(SERIALIZED_NAME_CHARGE_TIME_TYPE_OPTIONS)
  private List<GetChargesTimeTypeResponse> chargeTimeTypeOptions = null;

  public static final String SERIALIZED_NAME_CHARGE_PAYMENT_MODE_OPTIONS = "chargePaymentModeOptions";
  @SerializedName(SERIALIZED_NAME_CHARGE_PAYMENT_MODE_OPTIONS)
  private List<GetChargesPaymentModeResponse> chargePaymentModeOptions = null;

  public static final String SERIALIZED_NAME_LOAN_CHARGE_CALCULATION_TYPE_OPTIONS = "loanChargeCalculationTypeOptions";
  @SerializedName(SERIALIZED_NAME_LOAN_CHARGE_CALCULATION_TYPE_OPTIONS)
  private List<GetChargesTemplateLoanChargeCalculationTypeOptions> loanChargeCalculationTypeOptions = null;

  public static final String SERIALIZED_NAME_LOAN_CHARGE_TIME_TYPE_OPTIONS = "loanChargeTimeTypeOptions";
  @SerializedName(SERIALIZED_NAME_LOAN_CHARGE_TIME_TYPE_OPTIONS)
  private List<GetChargesTemplateLoanChargeTimeTypeOptions> loanChargeTimeTypeOptions = null;

  public static final String SERIALIZED_NAME_SAVINGS_CHARGE_CALCULATION_TYPE_OPTIONS = "savingsChargeCalculationTypeOptions";
  @SerializedName(SERIALIZED_NAME_SAVINGS_CHARGE_CALCULATION_TYPE_OPTIONS)
  private List<GetChargesTemplateLoanChargeCalculationTypeOptions> savingsChargeCalculationTypeOptions = null;

  public static final String SERIALIZED_NAME_SAVINGS_CHARGE_TIME_TYPE_OPTIONS = "savingsChargeTimeTypeOptions";
  @SerializedName(SERIALIZED_NAME_SAVINGS_CHARGE_TIME_TYPE_OPTIONS)
  private List<GetChargesTemplateLoanChargeTimeTypeOptions> savingsChargeTimeTypeOptions = null;

  public static final String SERIALIZED_NAME_FEE_FREQUENCY_OPTIONS = "feeFrequencyOptions";
  @SerializedName(SERIALIZED_NAME_FEE_FREQUENCY_OPTIONS)
  private List<GetChargesTemplateFeeFrequencyOptions> feeFrequencyOptions = null;


  public GetChargesTemplateResponse active(String active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public String getActive() {
    return active;
  }


  public void setActive(String active) {
    this.active = active;
  }


  public GetChargesTemplateResponse penalty(String penalty) {
    
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public String getPenalty() {
    return penalty;
  }


  public void setPenalty(String penalty) {
    this.penalty = penalty;
  }


  public GetChargesTemplateResponse currencyOptions(List<GetChargesCurrencyResponse> currencyOptions) {
    
    this.currencyOptions = currencyOptions;
    return this;
  }

  public GetChargesTemplateResponse addCurrencyOptionsItem(GetChargesCurrencyResponse currencyOptionsItem) {
    if (this.currencyOptions == null) {
      this.currencyOptions = new ArrayList<GetChargesCurrencyResponse>();
    }
    this.currencyOptions.add(currencyOptionsItem);
    return this;
  }

   /**
   * Get currencyOptions
   * @return currencyOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetChargesCurrencyResponse> getCurrencyOptions() {
    return currencyOptions;
  }


  public void setCurrencyOptions(List<GetChargesCurrencyResponse> currencyOptions) {
    this.currencyOptions = currencyOptions;
  }


  public GetChargesTemplateResponse chargeCalculationTypeOptions(List<GetChargesCalculationTypeResponse> chargeCalculationTypeOptions) {
    
    this.chargeCalculationTypeOptions = chargeCalculationTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addChargeCalculationTypeOptionsItem(GetChargesCalculationTypeResponse chargeCalculationTypeOptionsItem) {
    if (this.chargeCalculationTypeOptions == null) {
      this.chargeCalculationTypeOptions = new ArrayList<GetChargesCalculationTypeResponse>();
    }
    this.chargeCalculationTypeOptions.add(chargeCalculationTypeOptionsItem);
    return this;
  }

   /**
   * Get chargeCalculationTypeOptions
   * @return chargeCalculationTypeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetChargesCalculationTypeResponse> getChargeCalculationTypeOptions() {
    return chargeCalculationTypeOptions;
  }


  public void setChargeCalculationTypeOptions(List<GetChargesCalculationTypeResponse> chargeCalculationTypeOptions) {
    this.chargeCalculationTypeOptions = chargeCalculationTypeOptions;
  }


  public GetChargesTemplateResponse chargeAppliesToOptions(List<GetChargesAppliesToResponse> chargeAppliesToOptions) {
    
    this.chargeAppliesToOptions = chargeAppliesToOptions;
    return this;
  }

  public GetChargesTemplateResponse addChargeAppliesToOptionsItem(GetChargesAppliesToResponse chargeAppliesToOptionsItem) {
    if (this.chargeAppliesToOptions == null) {
      this.chargeAppliesToOptions = new ArrayList<GetChargesAppliesToResponse>();
    }
    this.chargeAppliesToOptions.add(chargeAppliesToOptionsItem);
    return this;
  }

   /**
   * Get chargeAppliesToOptions
   * @return chargeAppliesToOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetChargesAppliesToResponse> getChargeAppliesToOptions() {
    return chargeAppliesToOptions;
  }


  public void setChargeAppliesToOptions(List<GetChargesAppliesToResponse> chargeAppliesToOptions) {
    this.chargeAppliesToOptions = chargeAppliesToOptions;
  }


  public GetChargesTemplateResponse chargeTimeTypeOptions(List<GetChargesTimeTypeResponse> chargeTimeTypeOptions) {
    
    this.chargeTimeTypeOptions = chargeTimeTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addChargeTimeTypeOptionsItem(GetChargesTimeTypeResponse chargeTimeTypeOptionsItem) {
    if (this.chargeTimeTypeOptions == null) {
      this.chargeTimeTypeOptions = new ArrayList<GetChargesTimeTypeResponse>();
    }
    this.chargeTimeTypeOptions.add(chargeTimeTypeOptionsItem);
    return this;
  }

   /**
   * Get chargeTimeTypeOptions
   * @return chargeTimeTypeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetChargesTimeTypeResponse> getChargeTimeTypeOptions() {
    return chargeTimeTypeOptions;
  }


  public void setChargeTimeTypeOptions(List<GetChargesTimeTypeResponse> chargeTimeTypeOptions) {
    this.chargeTimeTypeOptions = chargeTimeTypeOptions;
  }


  public GetChargesTemplateResponse chargePaymentModeOptions(List<GetChargesPaymentModeResponse> chargePaymentModeOptions) {
    
    this.chargePaymentModeOptions = chargePaymentModeOptions;
    return this;
  }

  public GetChargesTemplateResponse addChargePaymentModeOptionsItem(GetChargesPaymentModeResponse chargePaymentModeOptionsItem) {
    if (this.chargePaymentModeOptions == null) {
      this.chargePaymentModeOptions = new ArrayList<GetChargesPaymentModeResponse>();
    }
    this.chargePaymentModeOptions.add(chargePaymentModeOptionsItem);
    return this;
  }

   /**
   * Get chargePaymentModeOptions
   * @return chargePaymentModeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetChargesPaymentModeResponse> getChargePaymentModeOptions() {
    return chargePaymentModeOptions;
  }


  public void setChargePaymentModeOptions(List<GetChargesPaymentModeResponse> chargePaymentModeOptions) {
    this.chargePaymentModeOptions = chargePaymentModeOptions;
  }


  public GetChargesTemplateResponse loanChargeCalculationTypeOptions(List<GetChargesTemplateLoanChargeCalculationTypeOptions> loanChargeCalculationTypeOptions) {
    
    this.loanChargeCalculationTypeOptions = loanChargeCalculationTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addLoanChargeCalculationTypeOptionsItem(GetChargesTemplateLoanChargeCalculationTypeOptions loanChargeCalculationTypeOptionsItem) {
    if (this.loanChargeCalculationTypeOptions == null) {
      this.loanChargeCalculationTypeOptions = new ArrayList<GetChargesTemplateLoanChargeCalculationTypeOptions>();
    }
    this.loanChargeCalculationTypeOptions.add(loanChargeCalculationTypeOptionsItem);
    return this;
  }

   /**
   * Get loanChargeCalculationTypeOptions
   * @return loanChargeCalculationTypeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetChargesTemplateLoanChargeCalculationTypeOptions> getLoanChargeCalculationTypeOptions() {
    return loanChargeCalculationTypeOptions;
  }


  public void setLoanChargeCalculationTypeOptions(List<GetChargesTemplateLoanChargeCalculationTypeOptions> loanChargeCalculationTypeOptions) {
    this.loanChargeCalculationTypeOptions = loanChargeCalculationTypeOptions;
  }


  public GetChargesTemplateResponse loanChargeTimeTypeOptions(List<GetChargesTemplateLoanChargeTimeTypeOptions> loanChargeTimeTypeOptions) {
    
    this.loanChargeTimeTypeOptions = loanChargeTimeTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addLoanChargeTimeTypeOptionsItem(GetChargesTemplateLoanChargeTimeTypeOptions loanChargeTimeTypeOptionsItem) {
    if (this.loanChargeTimeTypeOptions == null) {
      this.loanChargeTimeTypeOptions = new ArrayList<GetChargesTemplateLoanChargeTimeTypeOptions>();
    }
    this.loanChargeTimeTypeOptions.add(loanChargeTimeTypeOptionsItem);
    return this;
  }

   /**
   * Get loanChargeTimeTypeOptions
   * @return loanChargeTimeTypeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetChargesTemplateLoanChargeTimeTypeOptions> getLoanChargeTimeTypeOptions() {
    return loanChargeTimeTypeOptions;
  }


  public void setLoanChargeTimeTypeOptions(List<GetChargesTemplateLoanChargeTimeTypeOptions> loanChargeTimeTypeOptions) {
    this.loanChargeTimeTypeOptions = loanChargeTimeTypeOptions;
  }


  public GetChargesTemplateResponse savingsChargeCalculationTypeOptions(List<GetChargesTemplateLoanChargeCalculationTypeOptions> savingsChargeCalculationTypeOptions) {
    
    this.savingsChargeCalculationTypeOptions = savingsChargeCalculationTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addSavingsChargeCalculationTypeOptionsItem(GetChargesTemplateLoanChargeCalculationTypeOptions savingsChargeCalculationTypeOptionsItem) {
    if (this.savingsChargeCalculationTypeOptions == null) {
      this.savingsChargeCalculationTypeOptions = new ArrayList<GetChargesTemplateLoanChargeCalculationTypeOptions>();
    }
    this.savingsChargeCalculationTypeOptions.add(savingsChargeCalculationTypeOptionsItem);
    return this;
  }

   /**
   * Get savingsChargeCalculationTypeOptions
   * @return savingsChargeCalculationTypeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetChargesTemplateLoanChargeCalculationTypeOptions> getSavingsChargeCalculationTypeOptions() {
    return savingsChargeCalculationTypeOptions;
  }


  public void setSavingsChargeCalculationTypeOptions(List<GetChargesTemplateLoanChargeCalculationTypeOptions> savingsChargeCalculationTypeOptions) {
    this.savingsChargeCalculationTypeOptions = savingsChargeCalculationTypeOptions;
  }


  public GetChargesTemplateResponse savingsChargeTimeTypeOptions(List<GetChargesTemplateLoanChargeTimeTypeOptions> savingsChargeTimeTypeOptions) {
    
    this.savingsChargeTimeTypeOptions = savingsChargeTimeTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addSavingsChargeTimeTypeOptionsItem(GetChargesTemplateLoanChargeTimeTypeOptions savingsChargeTimeTypeOptionsItem) {
    if (this.savingsChargeTimeTypeOptions == null) {
      this.savingsChargeTimeTypeOptions = new ArrayList<GetChargesTemplateLoanChargeTimeTypeOptions>();
    }
    this.savingsChargeTimeTypeOptions.add(savingsChargeTimeTypeOptionsItem);
    return this;
  }

   /**
   * Get savingsChargeTimeTypeOptions
   * @return savingsChargeTimeTypeOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetChargesTemplateLoanChargeTimeTypeOptions> getSavingsChargeTimeTypeOptions() {
    return savingsChargeTimeTypeOptions;
  }


  public void setSavingsChargeTimeTypeOptions(List<GetChargesTemplateLoanChargeTimeTypeOptions> savingsChargeTimeTypeOptions) {
    this.savingsChargeTimeTypeOptions = savingsChargeTimeTypeOptions;
  }


  public GetChargesTemplateResponse feeFrequencyOptions(List<GetChargesTemplateFeeFrequencyOptions> feeFrequencyOptions) {
    
    this.feeFrequencyOptions = feeFrequencyOptions;
    return this;
  }

  public GetChargesTemplateResponse addFeeFrequencyOptionsItem(GetChargesTemplateFeeFrequencyOptions feeFrequencyOptionsItem) {
    if (this.feeFrequencyOptions == null) {
      this.feeFrequencyOptions = new ArrayList<GetChargesTemplateFeeFrequencyOptions>();
    }
    this.feeFrequencyOptions.add(feeFrequencyOptionsItem);
    return this;
  }

   /**
   * Get feeFrequencyOptions
   * @return feeFrequencyOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetChargesTemplateFeeFrequencyOptions> getFeeFrequencyOptions() {
    return feeFrequencyOptions;
  }


  public void setFeeFrequencyOptions(List<GetChargesTemplateFeeFrequencyOptions> feeFrequencyOptions) {
    this.feeFrequencyOptions = feeFrequencyOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChargesTemplateResponse getChargesTemplateResponse = (GetChargesTemplateResponse) o;
    return Objects.equals(this.active, getChargesTemplateResponse.active) &&
        Objects.equals(this.penalty, getChargesTemplateResponse.penalty) &&
        Objects.equals(this.currencyOptions, getChargesTemplateResponse.currencyOptions) &&
        Objects.equals(this.chargeCalculationTypeOptions, getChargesTemplateResponse.chargeCalculationTypeOptions) &&
        Objects.equals(this.chargeAppliesToOptions, getChargesTemplateResponse.chargeAppliesToOptions) &&
        Objects.equals(this.chargeTimeTypeOptions, getChargesTemplateResponse.chargeTimeTypeOptions) &&
        Objects.equals(this.chargePaymentModeOptions, getChargesTemplateResponse.chargePaymentModeOptions) &&
        Objects.equals(this.loanChargeCalculationTypeOptions, getChargesTemplateResponse.loanChargeCalculationTypeOptions) &&
        Objects.equals(this.loanChargeTimeTypeOptions, getChargesTemplateResponse.loanChargeTimeTypeOptions) &&
        Objects.equals(this.savingsChargeCalculationTypeOptions, getChargesTemplateResponse.savingsChargeCalculationTypeOptions) &&
        Objects.equals(this.savingsChargeTimeTypeOptions, getChargesTemplateResponse.savingsChargeTimeTypeOptions) &&
        Objects.equals(this.feeFrequencyOptions, getChargesTemplateResponse.feeFrequencyOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, penalty, currencyOptions, chargeCalculationTypeOptions, chargeAppliesToOptions, chargeTimeTypeOptions, chargePaymentModeOptions, loanChargeCalculationTypeOptions, loanChargeTimeTypeOptions, savingsChargeCalculationTypeOptions, savingsChargeTimeTypeOptions, feeFrequencyOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChargesTemplateResponse {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    currencyOptions: ").append(toIndentedString(currencyOptions)).append("\n");
    sb.append("    chargeCalculationTypeOptions: ").append(toIndentedString(chargeCalculationTypeOptions)).append("\n");
    sb.append("    chargeAppliesToOptions: ").append(toIndentedString(chargeAppliesToOptions)).append("\n");
    sb.append("    chargeTimeTypeOptions: ").append(toIndentedString(chargeTimeTypeOptions)).append("\n");
    sb.append("    chargePaymentModeOptions: ").append(toIndentedString(chargePaymentModeOptions)).append("\n");
    sb.append("    loanChargeCalculationTypeOptions: ").append(toIndentedString(loanChargeCalculationTypeOptions)).append("\n");
    sb.append("    loanChargeTimeTypeOptions: ").append(toIndentedString(loanChargeTimeTypeOptions)).append("\n");
    sb.append("    savingsChargeCalculationTypeOptions: ").append(toIndentedString(savingsChargeCalculationTypeOptions)).append("\n");
    sb.append("    savingsChargeTimeTypeOptions: ").append(toIndentedString(savingsChargeTimeTypeOptions)).append("\n");
    sb.append("    feeFrequencyOptions: ").append(toIndentedString(feeFrequencyOptions)).append("\n");
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


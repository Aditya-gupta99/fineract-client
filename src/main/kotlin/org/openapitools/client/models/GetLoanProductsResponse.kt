/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.GetLoanProductsAccountingRule
import org.openapitools.client.models.GetLoanProductsAmortizationType
import org.openapitools.client.models.GetLoanProductsCurrency
import org.openapitools.client.models.GetLoanProductsInterestRateFrequencyType
import org.openapitools.client.models.GetLoanProductsInterestRecalculationData
import org.openapitools.client.models.GetLoanProductsInterestType
import org.openapitools.client.models.GetLoanProductsRepaymentFrequencyType
import org.openapitools.client.models.GetLoanProductsRepaymentStartDateType
import org.openapitools.client.models.GetLoansProductsDaysInMonthType
import org.openapitools.client.models.GetLoansProductsDaysInYearType
import org.openapitools.client.models.GetLoansProductsInterestCalculationPeriodType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetLoanProductsResponse
 *
 * @param accountingRule 
 * @param amortizationType 
 * @param annualInterestRate 
 * @param currency 
 * @param daysInMonthType 
 * @param daysInYearType 
 * @param endDate 
 * @param fixedPrincipalPercentagePerInstallment 
 * @param id 
 * @param includeInBorrowerCycle 
 * @param interestCalculationPeriodType 
 * @param interestRateFrequencyType 
 * @param interestRatePerPeriod 
 * @param interestRateVariationsForBorrowerCycle 
 * @param interestRecalculationData 
 * @param interestType 
 * @param isInterestRecalculationEnabled 
 * @param maxNumberOfRepayments 
 * @param maxPrincipal 
 * @param minNumberOfRepayments 
 * @param minPrincipal 
 * @param name 
 * @param numberOfRepaymentVariationsForBorrowerCycle 
 * @param numberOfRepayments 
 * @param principal 
 * @param principalThresholdForLastInstalment 
 * @param principalVariationsForBorrowerCycle 
 * @param repaymentEvery 
 * @param repaymentFrequencyType 
 * @param repaymentStartDateType 
 * @param shortName 
 * @param startDate 
 * @param status 
 * @param transactionProcessingStrategy 
 * @param transactionProcessingStrategyName 
 * @param useBorrowerCycle 
 */


data class GetLoanProductsResponse (

    @Json(name = "accountingRule")
    val accountingRule: GetLoanProductsAccountingRule? = null,

    @Json(name = "amortizationType")
    val amortizationType: GetLoanProductsAmortizationType? = null,

    @Json(name = "annualInterestRate")
    val annualInterestRate: kotlin.Double? = null,

    @Json(name = "currency")
    val currency: GetLoanProductsCurrency? = null,

    @Json(name = "daysInMonthType")
    val daysInMonthType: GetLoansProductsDaysInMonthType? = null,

    @Json(name = "daysInYearType")
    val daysInYearType: GetLoansProductsDaysInYearType? = null,

    @Json(name = "endDate")
    val endDate: java.time.LocalDate? = null,

    @Json(name = "fixedPrincipalPercentagePerInstallment")
    val fixedPrincipalPercentagePerInstallment: java.math.BigDecimal? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "includeInBorrowerCycle")
    val includeInBorrowerCycle: kotlin.Boolean? = null,

    @Json(name = "interestCalculationPeriodType")
    val interestCalculationPeriodType: GetLoansProductsInterestCalculationPeriodType? = null,

    @Json(name = "interestRateFrequencyType")
    val interestRateFrequencyType: GetLoanProductsInterestRateFrequencyType? = null,

    @Json(name = "interestRatePerPeriod")
    val interestRatePerPeriod: kotlin.Double? = null,

    @Json(name = "interestRateVariationsForBorrowerCycle")
    val interestRateVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "interestRecalculationData")
    val interestRecalculationData: GetLoanProductsInterestRecalculationData? = null,

    @Json(name = "interestType")
    val interestType: GetLoanProductsInterestType? = null,

    @Json(name = "isInterestRecalculationEnabled")
    val isInterestRecalculationEnabled: kotlin.Boolean? = null,

    @Json(name = "maxNumberOfRepayments")
    val maxNumberOfRepayments: kotlin.Int? = null,

    @Json(name = "maxPrincipal")
    val maxPrincipal: kotlin.Double? = null,

    @Json(name = "minNumberOfRepayments")
    val minNumberOfRepayments: kotlin.Int? = null,

    @Json(name = "minPrincipal")
    val minPrincipal: kotlin.Double? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "numberOfRepaymentVariationsForBorrowerCycle")
    val numberOfRepaymentVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "numberOfRepayments")
    val numberOfRepayments: kotlin.Int? = null,

    @Json(name = "principal")
    val principal: kotlin.Double? = null,

    @Json(name = "principalThresholdForLastInstalment")
    val principalThresholdForLastInstalment: kotlin.Int? = null,

    @Json(name = "principalVariationsForBorrowerCycle")
    val principalVariationsForBorrowerCycle: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "repaymentEvery")
    val repaymentEvery: kotlin.Int? = null,

    @Json(name = "repaymentFrequencyType")
    val repaymentFrequencyType: GetLoanProductsRepaymentFrequencyType? = null,

    @Json(name = "repaymentStartDateType")
    val repaymentStartDateType: GetLoanProductsRepaymentStartDateType? = null,

    @Json(name = "shortName")
    val shortName: kotlin.String? = null,

    @Json(name = "startDate")
    val startDate: java.time.LocalDate? = null,

    @Json(name = "status")
    val status: kotlin.String? = null,

    @Json(name = "transactionProcessingStrategy")
    val transactionProcessingStrategy: kotlin.String? = null,

    @Json(name = "transactionProcessingStrategyName")
    val transactionProcessingStrategyName: kotlin.String? = null,

    @Json(name = "useBorrowerCycle")
    val useBorrowerCycle: kotlin.Boolean? = null

) {


}


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

import org.openapitools.client.models.PostFixedDepositProductsCharts

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PostFixedDepositProductsRequest
 *
 * @param accountingRule 
 * @param charts 
 * @param currencyCode 
 * @param description 
 * @param digitsAfterDecimal 
 * @param inMultiplesOf 
 * @param interestCalculationDaysInYearType 
 * @param interestCalculationType 
 * @param interestCompoundingPeriodType 
 * @param interestPostingPeriodType 
 * @param locale 
 * @param maxDepositTerm 
 * @param maxDepositTermTypeId 
 * @param minDepositTerm 
 * @param minDepositTermTypeId 
 * @param name 
 * @param preClosurePenalApplicable 
 * @param preClosurePenalInterest 
 * @param preClosurePenalInterestOnTypeId 
 * @param shortName 
 */


data class PostFixedDepositProductsRequest (

    @Json(name = "accountingRule")
    val accountingRule: kotlin.Int? = null,

    @Json(name = "charts")
    val charts: kotlin.collections.Set<PostFixedDepositProductsCharts>? = null,

    @Json(name = "currencyCode")
    val currencyCode: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "digitsAfterDecimal")
    val digitsAfterDecimal: kotlin.Int? = null,

    @Json(name = "inMultiplesOf")
    val inMultiplesOf: kotlin.Int? = null,

    @Json(name = "interestCalculationDaysInYearType")
    val interestCalculationDaysInYearType: kotlin.Int? = null,

    @Json(name = "interestCalculationType")
    val interestCalculationType: kotlin.Int? = null,

    @Json(name = "interestCompoundingPeriodType")
    val interestCompoundingPeriodType: kotlin.Int? = null,

    @Json(name = "interestPostingPeriodType")
    val interestPostingPeriodType: kotlin.Int? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "maxDepositTerm")
    val maxDepositTerm: kotlin.Int? = null,

    @Json(name = "maxDepositTermTypeId")
    val maxDepositTermTypeId: kotlin.Int? = null,

    @Json(name = "minDepositTerm")
    val minDepositTerm: kotlin.Int? = null,

    @Json(name = "minDepositTermTypeId")
    val minDepositTermTypeId: kotlin.Int? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "preClosurePenalApplicable")
    val preClosurePenalApplicable: kotlin.Boolean? = null,

    @Json(name = "preClosurePenalInterest")
    val preClosurePenalInterest: kotlin.Double? = null,

    @Json(name = "preClosurePenalInterestOnTypeId")
    val preClosurePenalInterestOnTypeId: kotlin.Int? = null,

    @Json(name = "shortName")
    val shortName: kotlin.String? = null

) {


}


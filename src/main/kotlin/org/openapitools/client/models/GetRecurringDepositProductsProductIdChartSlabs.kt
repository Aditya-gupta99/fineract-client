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

import org.openapitools.client.models.GetRecurringDepositProductsProductIdCurrency
import org.openapitools.client.models.GetRecurringDepositProductsProductIdPeriodType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param annualInterestRate 
 * @param currency 
 * @param description 
 * @param fromPeriod 
 * @param id 
 * @param periodType 
 * @param toPeriod 
 */


data class GetRecurringDepositProductsProductIdChartSlabs (

    @Json(name = "annualInterestRate")
    val annualInterestRate: kotlin.Double? = null,

    @Json(name = "currency")
    val currency: GetRecurringDepositProductsProductIdCurrency? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "fromPeriod")
    val fromPeriod: kotlin.Int? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "periodType")
    val periodType: GetRecurringDepositProductsProductIdPeriodType? = null,

    @Json(name = "toPeriod")
    val toPeriod: kotlin.Int? = null

) {


}


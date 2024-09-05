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

import org.openapitools.client.models.FloatingRate
import org.openapitools.client.models.LoanProduct

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param defaultDifferentialLendingRate 
 * @param floatingInterestRateCalculationAllowed 
 * @param floatingRate 
 * @param id 
 * @param interestRateDifferential 
 * @param loanProduct 
 * @param maxDifferentialLendingRate 
 * @param minDifferentialLendingRate 
 * @param new 
 */


data class LoanProductFloatingRates (

    @Json(name = "defaultDifferentialLendingRate")
    val defaultDifferentialLendingRate: java.math.BigDecimal? = null,

    @Json(name = "floatingInterestRateCalculationAllowed")
    val floatingInterestRateCalculationAllowed: kotlin.Boolean? = null,

    @Json(name = "floatingRate")
    val floatingRate: FloatingRate? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "interestRateDifferential")
    val interestRateDifferential: java.math.BigDecimal? = null,

    @Json(name = "loanProduct")
    val loanProduct: LoanProduct? = null,

    @Json(name = "maxDifferentialLendingRate")
    val maxDifferentialLendingRate: java.math.BigDecimal? = null,

    @Json(name = "minDifferentialLendingRate")
    val minDifferentialLendingRate: java.math.BigDecimal? = null,

    @Json(name = "new")
    val new: kotlin.Boolean? = null

) {


}


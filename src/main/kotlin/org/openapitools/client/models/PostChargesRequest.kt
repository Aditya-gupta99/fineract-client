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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PostChargesRequest
 *
 * @param active 
 * @param amount 
 * @param chargeAppliesTo 
 * @param chargeCalculationType 
 * @param chargePaymentMode 
 * @param chargeTimeType 
 * @param currencyCode 
 * @param locale 
 * @param monthDayFormat 
 * @param name 
 * @param penalty 
 */


data class PostChargesRequest (

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "amount")
    val amount: kotlin.Double? = null,

    @Json(name = "chargeAppliesTo")
    val chargeAppliesTo: kotlin.Int? = null,

    @Json(name = "chargeCalculationType")
    val chargeCalculationType: kotlin.Int? = null,

    @Json(name = "chargePaymentMode")
    val chargePaymentMode: kotlin.Int? = null,

    @Json(name = "chargeTimeType")
    val chargeTimeType: kotlin.Int? = null,

    @Json(name = "currencyCode")
    val currencyCode: kotlin.String? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "monthDayFormat")
    val monthDayFormat: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "penalty")
    val penalty: kotlin.Boolean? = null

) {


}


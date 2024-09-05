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

import org.openapitools.client.models.GetLoanChargeCalculationType
import org.openapitools.client.models.GetLoanChargeCurrency
import org.openapitools.client.models.GetLoanChargeTemplateChargeAppliesTo
import org.openapitools.client.models.GetLoanChargeTemplateChargeTimeType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param active 
 * @param amount 
 * @param chargeAppliesTo 
 * @param chargeCalculationType 
 * @param chargeTimeType 
 * @param currency 
 * @param id 
 * @param name 
 * @param penalty 
 */


data class GetLoanChargeTemplateChargeOptions (

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "amount")
    val amount: kotlin.Double? = null,

    @Json(name = "chargeAppliesTo")
    val chargeAppliesTo: GetLoanChargeTemplateChargeAppliesTo? = null,

    @Json(name = "chargeCalculationType")
    val chargeCalculationType: GetLoanChargeCalculationType? = null,

    @Json(name = "chargeTimeType")
    val chargeTimeType: GetLoanChargeTemplateChargeTimeType? = null,

    @Json(name = "currency")
    val currency: GetLoanChargeCurrency? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "penalty")
    val penalty: kotlin.Boolean? = null

) {


}


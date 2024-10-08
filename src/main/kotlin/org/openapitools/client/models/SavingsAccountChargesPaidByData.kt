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

import org.openapitools.client.models.SavingsAccountChargeData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param amount 
 * @param chargeId 
 * @param feeCharge 
 * @param penaltyCharge 
 * @param savingsAccountChargeData 
 */


data class SavingsAccountChargesPaidByData (

    @Json(name = "amount")
    val amount: java.math.BigDecimal? = null,

    @Json(name = "chargeId")
    val chargeId: kotlin.Long? = null,

    @Json(name = "feeCharge")
    val feeCharge: kotlin.Boolean? = null,

    @Json(name = "penaltyCharge")
    val penaltyCharge: kotlin.Boolean? = null,

    @Json(name = "savingsAccountChargeData")
    val savingsAccountChargeData: SavingsAccountChargeData? = null

) {


}


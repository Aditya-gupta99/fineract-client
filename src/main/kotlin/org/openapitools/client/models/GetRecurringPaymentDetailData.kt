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

import org.openapitools.client.models.GetRecurringPaymentType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param accountNumber 
 * @param bankNumber 
 * @param checkNumber 
 * @param id 
 * @param paymentType 
 * @param receiptNumber 
 * @param routingCode 
 */


data class GetRecurringPaymentDetailData (

    @Json(name = "accountNumber")
    val accountNumber: kotlin.Int? = null,

    @Json(name = "bankNumber")
    val bankNumber: kotlin.Int? = null,

    @Json(name = "checkNumber")
    val checkNumber: kotlin.Int? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "paymentType")
    val paymentType: GetRecurringPaymentType? = null,

    @Json(name = "receiptNumber")
    val receiptNumber: kotlin.Int? = null,

    @Json(name = "routingCode")
    val routingCode: kotlin.Int? = null

) {


}


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
 * 
 *
 * @param dateFormat 
 * @param externalId 
 * @param locale 
 * @param note 
 * @param paymentTypeId 
 * @param reversalExternalId 
 * @param transactionAmount 
 * @param transactionDate 
 */


data class PostLoansLoanIdTransactionsResponseChanges (

    @Json(name = "dateFormat")
    val dateFormat: kotlin.String? = null,

    @Json(name = "externalId")
    val externalId: kotlin.String? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "note")
    val note: kotlin.String? = null,

    @Json(name = "paymentTypeId")
    val paymentTypeId: kotlin.Long? = null,

    @Json(name = "reversalExternalId")
    val reversalExternalId: kotlin.String? = null,

    @Json(name = "transactionAmount")
    val transactionAmount: kotlin.String? = null,

    @Json(name = "transactionDate")
    val transactionDate: kotlin.String? = null

) {


}


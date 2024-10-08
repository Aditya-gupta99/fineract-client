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

import org.openapitools.client.models.ExtensionData
import org.openapitools.client.models.GeoCodeData
import org.openapitools.client.models.InteropTransactionTypeData
import org.openapitools.client.models.MoneyData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param accountId 
 * @param amount 
 * @param transactionCode 
 * @param transactionRole 
 * @param expiration 
 * @param expirationLocalDate 
 * @param extensionList 
 * @param geoCode 
 * @param note 
 * @param requestCode 
 * @param transactionType 
 */


data class InteropTransactionRequestData (

    @Json(name = "accountId")
    val accountId: kotlin.String,

    @Json(name = "amount")
    val amount: MoneyData,

    @Json(name = "transactionCode")
    val transactionCode: kotlin.String,

    @Json(name = "transactionRole")
    val transactionRole: InteropTransactionRequestData.TransactionRole,

    @Json(name = "expiration")
    val expiration: java.time.OffsetDateTime? = null,

    @Json(name = "expirationLocalDate")
    val expirationLocalDate: java.time.LocalDate? = null,

    @Json(name = "extensionList")
    val extensionList: kotlin.collections.List<ExtensionData>? = null,

    @Json(name = "geoCode")
    val geoCode: GeoCodeData? = null,

    @Json(name = "note")
    val note: kotlin.String? = null,

    @Json(name = "requestCode")
    val requestCode: kotlin.String? = null,

    @Json(name = "transactionType")
    val transactionType: InteropTransactionTypeData? = null

) {

    /**
     * 
     *
     * Values: PAYER,PAYEE
     */
    @JsonClass(generateAdapter = false)
    enum class TransactionRole(val value: kotlin.String) {
        @Json(name = "PAYER") PAYER("PAYER"),
        @Json(name = "PAYEE") PAYEE("PAYEE");
    }

}


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
 * @param accountId 
 * @param idType 
 * @param idValue 
 * @param subIdOrType 
 */


data class InteropIdentifierRequestData (

    @Json(name = "accountId")
    val accountId: kotlin.String,

    @Json(name = "idType")
    val idType: InteropIdentifierRequestData.IdType,

    @Json(name = "idValue")
    val idValue: kotlin.String,

    @Json(name = "subIdOrType")
    val subIdOrType: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: MSISDN,EMAIL,PERSONAL_ID,BUSINESS,DEVICE,ACCOUNT_ID,IBAN,ALIAS
     */
    @JsonClass(generateAdapter = false)
    enum class IdType(val value: kotlin.String) {
        @Json(name = "MSISDN") MSISDN("MSISDN"),
        @Json(name = "EMAIL") EMAIL("EMAIL"),
        @Json(name = "PERSONAL_ID") PERSONAL_ID("PERSONAL_ID"),
        @Json(name = "BUSINESS") BUSINESS("BUSINESS"),
        @Json(name = "DEVICE") DEVICE("DEVICE"),
        @Json(name = "ACCOUNT_ID") ACCOUNT_ID("ACCOUNT_ID"),
        @Json(name = "IBAN") IBAN("IBAN"),
        @Json(name = "ALIAS") ALIAS("ALIAS");
    }

}


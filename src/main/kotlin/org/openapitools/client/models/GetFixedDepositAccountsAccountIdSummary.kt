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

import org.openapitools.client.models.GetFixedDepositAccountsAccountIdCurrency

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param accountBalance 
 * @param currency 
 */


data class GetFixedDepositAccountsAccountIdSummary (

    @Json(name = "accountBalance")
    val accountBalance: kotlin.Float? = null,

    @Json(name = "currency")
    val currency: GetFixedDepositAccountsAccountIdCurrency? = null

) {


}


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

import org.openapitools.client.models.GetClientsLoanAccounts
import org.openapitools.client.models.GetClientsSavingsAccounts

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetClientsClientIdAccountsResponse
 *
 * @param loanAccounts 
 * @param savingsAccounts 
 */


data class GetClientsClientIdAccountsResponse (

    @Json(name = "loanAccounts")
    val loanAccounts: kotlin.collections.Set<GetClientsLoanAccounts>? = null,

    @Json(name = "savingsAccounts")
    val savingsAccounts: kotlin.collections.Set<GetClientsSavingsAccounts>? = null

) {


}


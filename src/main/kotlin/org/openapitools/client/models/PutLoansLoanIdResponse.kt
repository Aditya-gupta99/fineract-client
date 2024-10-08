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

import org.openapitools.client.models.PutLoansLoanIdChanges

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PutLoansLoanIdResponse
 *
 * @param changes 
 * @param clientId 
 * @param loanId 
 * @param officeId 
 * @param resourceExternalId 
 * @param resourceId 
 */


data class PutLoansLoanIdResponse (

    @Json(name = "changes")
    val changes: PutLoansLoanIdChanges? = null,

    @Json(name = "clientId")
    val clientId: kotlin.Long? = null,

    @Json(name = "loanId")
    val loanId: kotlin.Long? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "resourceExternalId")
    val resourceExternalId: kotlin.String? = null,

    @Json(name = "resourceId")
    val resourceId: kotlin.Long? = null

) {


}


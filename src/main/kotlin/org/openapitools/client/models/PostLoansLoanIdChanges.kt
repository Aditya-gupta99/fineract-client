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

import org.openapitools.client.models.PostLoansLoanIdStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PostLoansLoanIdChanges
 *
 * @param approvedOnDate 
 * @param dateFormat 
 * @param locale 
 * @param note 
 * @param status 
 */


data class PostLoansLoanIdChanges (

    @Json(name = "approvedOnDate")
    val approvedOnDate: kotlin.String? = null,

    @Json(name = "dateFormat")
    val dateFormat: kotlin.String? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "note")
    val note: kotlin.String? = null,

    @Json(name = "status")
    val status: PostLoansLoanIdStatus? = null

) {


}


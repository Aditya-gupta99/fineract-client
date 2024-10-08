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
 * PostAdhocQuerySearchResponse
 *
 * @param loanOutStanding 
 * @param loanProductName 
 * @param officeName 
 * @param percentage 
 */


data class PostAdhocQuerySearchResponse (

    @Json(name = "loanOutStanding")
    val loanOutStanding: kotlin.Long? = null,

    @Json(name = "loanProductName")
    val loanProductName: kotlin.String? = null,

    @Json(name = "officeName")
    val officeName: kotlin.String? = null,

    @Json(name = "percentage")
    val percentage: kotlin.Long? = null

) {


}


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

import org.openapitools.client.models.PutFinancialActivityAccountscommentsSwagger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PutFinancialActivityAccountsResponse
 *
 * @param comments 
 * @param resourceId 
 */


data class PutFinancialActivityAccountsResponse (

    @Json(name = "comments")
    val comments: PutFinancialActivityAccountscommentsSwagger? = null,

    @Json(name = "resourceId")
    val resourceId: kotlin.Long? = null

) {


}


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
 * PutGlClosuresResponse
 *
 * @param comments 
 * @param officeId 
 * @param resourceId 
 */


data class PutGlClosuresResponse (

    @Json(name = "comments")
    val comments: kotlin.String? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "resourceId")
    val resourceId: kotlin.Long? = null

) {


}


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
 * PostResourceTypeResourceIdNotesResponse
 *
 * @param clientId 
 * @param officeId 
 * @param resourceId 
 */


data class PostResourceTypeResourceIdNotesResponse (

    @Json(name = "clientId")
    val clientId: kotlin.Long? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "resourceId")
    val resourceId: kotlin.Int? = null

) {


}


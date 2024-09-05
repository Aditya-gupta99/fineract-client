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

import org.openapitools.client.models.GetNotification

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetNotificationsResponse
 *
 * @param pageItems 
 * @param totalFilteredRecords 
 */


data class GetNotificationsResponse (

    @Json(name = "pageItems")
    val pageItems: kotlin.collections.List<GetNotification>? = null,

    @Json(name = "totalFilteredRecords")
    val totalFilteredRecords: kotlin.Int? = null

) {


}


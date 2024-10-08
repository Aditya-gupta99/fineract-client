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

import org.openapitools.client.models.EnumOptionData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetSearchResponse
 *
 * @param entityAccountNo 
 * @param entityExternalId 
 * @param entityId 
 * @param entityName 
 * @param entityStatus 
 * @param entityType 
 * @param parentId 
 * @param parentName 
 */


data class GetSearchResponse (

    @Json(name = "entityAccountNo")
    val entityAccountNo: kotlin.Long? = null,

    @Json(name = "entityExternalId")
    val entityExternalId: kotlin.String? = null,

    @Json(name = "entityId")
    val entityId: kotlin.Long? = null,

    @Json(name = "entityName")
    val entityName: kotlin.String? = null,

    @Json(name = "entityStatus")
    val entityStatus: EnumOptionData? = null,

    @Json(name = "entityType")
    val entityType: kotlin.String? = null,

    @Json(name = "parentId")
    val parentId: kotlin.Long? = null,

    @Json(name = "parentName")
    val parentName: kotlin.String? = null

) {


}


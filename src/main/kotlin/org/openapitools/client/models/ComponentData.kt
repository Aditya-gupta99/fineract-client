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
 * 
 *
 * @param description 
 * @param id 
 * @param key 
 * @param sequenceNo 
 * @param text 
 */


data class ComponentData (

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "key")
    val key: kotlin.String? = null,

    @Json(name = "sequenceNo")
    val sequenceNo: kotlin.Int? = null,

    @Json(name = "text")
    val text: kotlin.String? = null

) {


}


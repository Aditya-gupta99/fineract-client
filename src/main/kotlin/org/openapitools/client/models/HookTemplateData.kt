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

import org.openapitools.client.models.Field

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param name 
 * @param schema 
 */


data class HookTemplateData (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "schema")
    val schema: kotlin.collections.List<Field>? = null

) {


}


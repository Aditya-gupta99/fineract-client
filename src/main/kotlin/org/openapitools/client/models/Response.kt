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

import org.openapitools.client.models.Question

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param new 
 * @param question 
 * @param sequenceNo 
 * @param text 
 * @param `value` 
 */


data class Response (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "new")
    val new: kotlin.Boolean? = null,

    @Json(name = "question")
    val question: Question? = null,

    @Json(name = "sequenceNo")
    val sequenceNo: kotlin.Int? = null,

    @Json(name = "text")
    val text: kotlin.String? = null,

    @Json(name = "value")
    val `value`: kotlin.Int? = null

) {


}


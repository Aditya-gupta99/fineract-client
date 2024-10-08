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
 * PostInterestRateChartsRequest
 *
 * @param dateFormat 
 * @param description 
 * @param fromDate 
 * @param locale 
 * @param name 
 * @param type 
 */


data class PostInterestRateChartsRequest (

    @Json(name = "dateFormat")
    val dateFormat: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "fromDate")
    val fromDate: kotlin.String? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "type")
    val type: kotlin.String? = null

) {


}


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
 * @param dateFormat 
 * @param description 
 * @param endDate 
 * @param locale 
 * @param startDate 
 */


data class PutTellersResponseChanges (

    @Json(name = "dateFormat")
    val dateFormat: kotlin.String? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "endDate")
    val endDate: java.time.LocalDate? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "startDate")
    val startDate: java.time.LocalDate? = null

) {


}


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
 * @param endDateTime 
 * @param errorLog 
 * @param errorMessage 
 * @param id 
 * @param reportMailingJobId 
 * @param startDateTime 
 * @param status 
 */


data class ReportMailingJobRunHistoryData (

    @Json(name = "endDateTime")
    val endDateTime: java.time.OffsetDateTime? = null,

    @Json(name = "errorLog")
    val errorLog: kotlin.String? = null,

    @Json(name = "errorMessage")
    val errorMessage: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "reportMailingJobId")
    val reportMailingJobId: kotlin.Long? = null,

    @Json(name = "startDateTime")
    val startDateTime: java.time.OffsetDateTime? = null,

    @Json(name = "status")
    val status: kotlin.String? = null

) {


}


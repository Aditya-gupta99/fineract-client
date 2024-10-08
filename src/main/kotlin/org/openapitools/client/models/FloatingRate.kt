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

import org.openapitools.client.models.FloatingRatePeriod

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param createdBy 
 * @param createdDate 
 * @param createdDateTime 
 * @param lastModifiedBy 
 * @param lastModifiedDate 
 * @param lastModifiedDateTime 
 * @param active 
 * @param baseLendingRate 
 * @param floatingRatePeriods 
 * @param id 
 * @param name 
 * @param new 
 */


data class FloatingRate (

    @Json(name = "createdBy")
    val createdBy: kotlin.Long,

    @Json(name = "createdDate")
    val createdDate: java.time.OffsetDateTime,

    @Json(name = "createdDateTime")
    val createdDateTime: java.time.OffsetDateTime,

    @Json(name = "lastModifiedBy")
    val lastModifiedBy: kotlin.Long,

    @Json(name = "lastModifiedDate")
    val lastModifiedDate: java.time.OffsetDateTime,

    @Json(name = "lastModifiedDateTime")
    val lastModifiedDateTime: java.time.OffsetDateTime,

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "baseLendingRate")
    val baseLendingRate: kotlin.Boolean? = null,

    @Json(name = "floatingRatePeriods")
    val floatingRatePeriods: kotlin.collections.List<FloatingRatePeriod>? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "new")
    val new: kotlin.Boolean? = null

) {


}


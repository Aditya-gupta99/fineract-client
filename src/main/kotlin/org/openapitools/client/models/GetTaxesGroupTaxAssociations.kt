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

import org.openapitools.client.models.GetTaxesGroupTaxComponent

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param startDate 
 * @param taxComponent 
 */


data class GetTaxesGroupTaxAssociations (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "startDate")
    val startDate: java.time.LocalDate? = null,

    @Json(name = "taxComponent")
    val taxComponent: GetTaxesGroupTaxComponent? = null

) {


}


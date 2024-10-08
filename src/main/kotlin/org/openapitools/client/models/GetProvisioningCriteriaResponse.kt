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
 * GetProvisioningCriteriaResponse
 *
 * @param createdBy 
 * @param criteriaId 
 * @param criteriaName 
 */


data class GetProvisioningCriteriaResponse (

    @Json(name = "createdBy")
    val createdBy: kotlin.String? = null,

    @Json(name = "criteriaId")
    val criteriaId: kotlin.Long? = null,

    @Json(name = "criteriaName")
    val criteriaName: kotlin.String? = null

) {


}


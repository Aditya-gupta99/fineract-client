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

import org.openapitools.client.models.GetSavingsAssetLiabilityType
import org.openapitools.client.models.GetSavingsProductsLiabilityUsage

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param disabled 
 * @param glCode 
 * @param id 
 * @param manualEntriesAllowed 
 * @param name 
 * @param tagId 
 * @param type 
 * @param usage 
 */


data class GetSavingsProductsAssetAccountOptions (

    @Json(name = "disabled")
    val disabled: kotlin.Boolean? = null,

    @Json(name = "glCode")
    val glCode: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "manualEntriesAllowed")
    val manualEntriesAllowed: kotlin.Boolean? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "tagId")
    val tagId: kotlin.Any? = null,

    @Json(name = "type")
    val type: GetSavingsAssetLiabilityType? = null,

    @Json(name = "usage")
    val usage: GetSavingsProductsLiabilityUsage? = null

) {


}


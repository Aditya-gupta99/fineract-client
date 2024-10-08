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
 * GetFieldConfigurationEntityResponse
 *
 * @param entity 
 * @param `field` 
 * @param fieldConfigurationId 
 * @param isEnabled 
 * @param isMandatory 
 * @param subentity 
 * @param validationRegex 
 */


data class GetFieldConfigurationEntityResponse (

    @Json(name = "entity")
    val entity: kotlin.String? = null,

    @Json(name = "field")
    val `field`: kotlin.String? = null,

    @Json(name = "fieldConfigurationId")
    val fieldConfigurationId: kotlin.Long? = null,

    @Json(name = "is_enabled")
    val isEnabled: kotlin.String? = null,

    @Json(name = "is_mandatory")
    val isMandatory: kotlin.String? = null,

    @Json(name = "subentity")
    val subentity: kotlin.String? = null,

    @Json(name = "validation_regex")
    val validationRegex: kotlin.String? = null

) {


}


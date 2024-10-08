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
 * @param displayName 
 * @param firstname 
 * @param id 
 * @param joiningDate 
 * @param lastname 
 * @param officeId 
 * @param officeName 
 * @param rowIndex 
 */


data class StaffData (

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "firstname")
    val firstname: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "joiningDate")
    val joiningDate: java.time.LocalDate? = null,

    @Json(name = "lastname")
    val lastname: kotlin.String? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "officeName")
    val officeName: kotlin.String? = null,

    @Json(name = "rowIndex")
    val rowIndex: kotlin.Int? = null

) {


}


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

import org.openapitools.client.models.GetSelfClientsStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param accountNo 
 * @param activationDate 
 * @param active 
 * @param displayName 
 * @param fullname 
 * @param id 
 * @param officeId 
 * @param officeName 
 * @param status 
 */


data class GetSelfClientsPageItems (

    @Json(name = "accountNo")
    val accountNo: kotlin.Long? = null,

    @Json(name = "activationDate")
    val activationDate: java.time.LocalDate? = null,

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "fullname")
    val fullname: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Int? = null,

    @Json(name = "officeName")
    val officeName: kotlin.String? = null,

    @Json(name = "status")
    val status: GetSelfClientsStatus? = null

) {


}


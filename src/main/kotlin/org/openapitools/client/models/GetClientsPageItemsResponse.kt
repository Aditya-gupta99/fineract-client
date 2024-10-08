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

import org.openapitools.client.models.GetClientStatus

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param accountNo 
 * @param active 
 * @param displayName 
 * @param emailAddress 
 * @param fullname 
 * @param id 
 * @param officeId 
 * @param officeName 
 * @param status 
 */


data class GetClientsPageItemsResponse (

    @Json(name = "accountNo")
    val accountNo: kotlin.String? = null,

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "emailAddress")
    val emailAddress: kotlin.String? = null,

    @Json(name = "fullname")
    val fullname: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "officeName")
    val officeName: kotlin.String? = null,

    @Json(name = "status")
    val status: GetClientStatus? = null

) {


}


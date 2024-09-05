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
 * PutUsersUserIdRequest
 *
 * @param clients 
 * @param email 
 * @param firstname 
 * @param isSelfServiceUser 
 * @param lastname 
 * @param officeId 
 * @param password 
 * @param repeatPassword 
 * @param roles 
 * @param sendPasswordToEmail 
 * @param staffId 
 */


data class PutUsersUserIdRequest (

    @Json(name = "clients")
    val clients: kotlin.collections.List<kotlin.Long>? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "firstname")
    val firstname: kotlin.String? = null,

    @Json(name = "isSelfServiceUser")
    val isSelfServiceUser: kotlin.Boolean? = null,

    @Json(name = "lastname")
    val lastname: kotlin.String? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "repeatPassword")
    val repeatPassword: kotlin.String? = null,

    @Json(name = "roles")
    val roles: kotlin.collections.List<kotlin.Long>? = null,

    @Json(name = "sendPasswordToEmail")
    val sendPasswordToEmail: kotlin.Boolean? = null,

    @Json(name = "staffId")
    val staffId: kotlin.Long? = null

) {


}


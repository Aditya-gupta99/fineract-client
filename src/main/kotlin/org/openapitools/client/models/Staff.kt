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

import org.openapitools.client.models.Image
import org.openapitools.client.models.Office

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param active 
 * @param displayName 
 * @param emailAddress 
 * @param externalId 
 * @param firstname 
 * @param id 
 * @param image 
 * @param joiningDate 
 * @param lastname 
 * @param loanOfficer 
 * @param mobileNo 
 * @param new 
 * @param notActive 
 * @param notLoanOfficer 
 * @param office 
 * @param organisationalRoleParentStaff 
 * @param organisationalRoleType 
 */


data class Staff (

    @Json(name = "active")
    val active: kotlin.Boolean? = null,

    @Json(name = "displayName")
    val displayName: kotlin.String? = null,

    @Json(name = "emailAddress")
    val emailAddress: kotlin.String? = null,

    @Json(name = "externalId")
    val externalId: kotlin.String? = null,

    @Json(name = "firstname")
    val firstname: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "image")
    val image: Image? = null,

    @Json(name = "joiningDate")
    val joiningDate: java.time.LocalDate? = null,

    @Json(name = "lastname")
    val lastname: kotlin.String? = null,

    @Json(name = "loanOfficer")
    val loanOfficer: kotlin.Boolean? = null,

    @Json(name = "mobileNo")
    val mobileNo: kotlin.String? = null,

    @Json(name = "new")
    val new: kotlin.Boolean? = null,

    @Json(name = "notActive")
    val notActive: kotlin.Boolean? = null,

    @Json(name = "notLoanOfficer")
    val notLoanOfficer: kotlin.Boolean? = null,

    @Json(name = "office")
    val office: Office? = null,

    @Json(name = "organisationalRoleParentStaff")
    val organisationalRoleParentStaff: Staff? = null,

    @Json(name = "organisationalRoleType")
    val organisationalRoleType: kotlin.Int? = null

) {


}


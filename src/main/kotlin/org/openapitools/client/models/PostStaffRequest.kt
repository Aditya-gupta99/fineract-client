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
 * PostStaffRequest
 *
 * @param dateFormat 
 * @param externalId 
 * @param firstname 
 * @param isActive 
 * @param isLoanOfficer 
 * @param joiningDate 
 * @param lastname 
 * @param locale 
 * @param mobileNo 
 * @param officeId 
 */


data class PostStaffRequest (

    @Json(name = "dateFormat")
    val dateFormat: kotlin.String? = null,

    @Json(name = "externalId")
    val externalId: kotlin.String? = null,

    @Json(name = "firstname")
    val firstname: kotlin.String? = null,

    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null,

    @Json(name = "isLoanOfficer")
    val isLoanOfficer: kotlin.Boolean? = null,

    @Json(name = "joiningDate")
    val joiningDate: java.time.LocalDate? = null,

    @Json(name = "lastname")
    val lastname: kotlin.String? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "mobileNo")
    val mobileNo: kotlin.String? = null,

    @Json(name = "officeId")
    val officeId: kotlin.Long? = null

) {


}


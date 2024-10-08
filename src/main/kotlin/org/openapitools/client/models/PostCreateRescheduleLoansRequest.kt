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
 * PostCreateRescheduleLoansRequest
 *
 * @param adjustedDueDate 
 * @param dateFormat 
 * @param extraTerms 
 * @param graceOnInterest 
 * @param graceOnPrincipal 
 * @param loanId 
 * @param locale 
 * @param newInterestRate 
 * @param rescheduleFromDate 
 * @param rescheduleReasonComment 
 * @param rescheduleReasonId 
 * @param submittedOnDate 
 */


data class PostCreateRescheduleLoansRequest (

    @Json(name = "adjustedDueDate")
    val adjustedDueDate: kotlin.String? = null,

    @Json(name = "dateFormat")
    val dateFormat: kotlin.String? = null,

    @Json(name = "extraTerms")
    val extraTerms: kotlin.Int? = null,

    @Json(name = "graceOnInterest")
    val graceOnInterest: kotlin.Int? = null,

    @Json(name = "graceOnPrincipal")
    val graceOnPrincipal: kotlin.Int? = null,

    @Json(name = "loanId")
    val loanId: kotlin.Long? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "newInterestRate")
    val newInterestRate: java.math.BigDecimal? = null,

    @Json(name = "rescheduleFromDate")
    val rescheduleFromDate: kotlin.String? = null,

    @Json(name = "rescheduleReasonComment")
    val rescheduleReasonComment: kotlin.String? = null,

    @Json(name = "rescheduleReasonId")
    val rescheduleReasonId: kotlin.Long? = null,

    @Json(name = "submittedOnDate")
    val submittedOnDate: kotlin.String? = null

) {


}


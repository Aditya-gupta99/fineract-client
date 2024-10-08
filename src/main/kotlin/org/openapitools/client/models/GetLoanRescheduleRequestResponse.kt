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

import org.openapitools.client.models.GetLoanRescheduleRequestStatus
import org.openapitools.client.models.LoanTermVariationsData
import org.openapitools.client.models.RescheduleReasonsCodeValue
import org.openapitools.client.models.RescheduleReasonsTimeline

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetLoanRescheduleRequestResponse
 *
 * @param clientId 
 * @param clientName 
 * @param id 
 * @param loanAccountNumber 
 * @param loanId 
 * @param loanTermVariationsData 
 * @param recalculateInterest 
 * @param rescheduleFromDate 
 * @param rescheduleFromInstallment 
 * @param rescheduleReasonCodeValue 
 * @param rescheduleReasonComment 
 * @param statusEnum 
 * @param timeline 
 */


data class GetLoanRescheduleRequestResponse (

    @Json(name = "clientId")
    val clientId: kotlin.Long? = null,

    @Json(name = "clientName")
    val clientName: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "loanAccountNumber")
    val loanAccountNumber: kotlin.String? = null,

    @Json(name = "loanId")
    val loanId: kotlin.Long? = null,

    @Json(name = "loanTermVariationsData")
    val loanTermVariationsData: kotlin.collections.Set<LoanTermVariationsData>? = null,

    @Json(name = "recalculateInterest")
    val recalculateInterest: kotlin.Boolean? = null,

    @Json(name = "rescheduleFromDate")
    val rescheduleFromDate: java.time.LocalDate? = null,

    @Json(name = "rescheduleFromInstallment")
    val rescheduleFromInstallment: kotlin.Int? = null,

    @Json(name = "rescheduleReasonCodeValue")
    val rescheduleReasonCodeValue: RescheduleReasonsCodeValue? = null,

    @Json(name = "rescheduleReasonComment")
    val rescheduleReasonComment: kotlin.String? = null,

    @Json(name = "statusEnum")
    val statusEnum: GetLoanRescheduleRequestStatus? = null,

    @Json(name = "timeline")
    val timeline: RescheduleReasonsTimeline? = null

) {


}


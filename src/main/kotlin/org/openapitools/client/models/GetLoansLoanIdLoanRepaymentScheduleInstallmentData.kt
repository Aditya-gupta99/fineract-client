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
 * List of GetLoansLoanIdLoanRepaymentScheduleInstallmentData
 *
 * @param amount 
 * @param date 
 * @param id 
 * @param installmentId 
 */


data class GetLoansLoanIdLoanRepaymentScheduleInstallmentData (

    @Json(name = "amount")
    val amount: java.math.BigDecimal? = null,

    @Json(name = "date")
    val date: java.time.LocalDate? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "installmentId")
    val installmentId: kotlin.Int? = null

) {


}


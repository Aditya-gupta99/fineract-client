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

import org.openapitools.client.models.EnumOptionData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetWorkingDaysResponse
 *
 * @param extendTermForDailyRepayments 
 * @param id 
 * @param recurrence 
 * @param repaymentRescheduleType 
 */


data class GetWorkingDaysResponse (

    @Json(name = "extendTermForDailyRepayments")
    val extendTermForDailyRepayments: kotlin.Boolean? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "recurrence")
    val recurrence: kotlin.String? = null,

    @Json(name = "repaymentRescheduleType")
    val repaymentRescheduleType: EnumOptionData? = null

) {


}


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
 * 
 *
 * @param allowCompoundingOnEod 
 * @param arrearsBasedOnOriginalSchedule 
 * @param compoundingToBePostedAsTransaction 
 * @param id 
 * @param interestRecalculationCompoundingType 
 * @param isArrearsBasedOnOriginalSchedule 
 * @param isCompoundingToBePostedAsTransaction 
 * @param preClosureInterestCalculationStrategy 
 * @param productId 
 * @param recalculationCompoundingFrequencyInterval 
 * @param recalculationCompoundingFrequencyNthDay 
 * @param recalculationCompoundingFrequencyOnDay 
 * @param recalculationCompoundingFrequencyType 
 * @param recalculationCompoundingFrequencyWeekday 
 * @param recalculationRestFrequencyInterval 
 * @param recalculationRestFrequencyNthDay 
 * @param recalculationRestFrequencyOnDay 
 * @param recalculationRestFrequencyType 
 * @param recalculationRestFrequencyWeekday 
 * @param rescheduleStrategyType 
 */


data class LoanProductInterestRecalculationData (

    @Json(name = "allowCompoundingOnEod")
    val allowCompoundingOnEod: kotlin.Boolean? = null,

    @Json(name = "arrearsBasedOnOriginalSchedule")
    val arrearsBasedOnOriginalSchedule: kotlin.Boolean? = null,

    @Json(name = "compoundingToBePostedAsTransaction")
    val compoundingToBePostedAsTransaction: kotlin.Boolean? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "interestRecalculationCompoundingType")
    val interestRecalculationCompoundingType: EnumOptionData? = null,

    @Json(name = "isArrearsBasedOnOriginalSchedule")
    val isArrearsBasedOnOriginalSchedule: kotlin.Boolean? = null,

    @Json(name = "isCompoundingToBePostedAsTransaction")
    val isCompoundingToBePostedAsTransaction: kotlin.Boolean? = null,

    @Json(name = "preClosureInterestCalculationStrategy")
    val preClosureInterestCalculationStrategy: EnumOptionData? = null,

    @Json(name = "productId")
    val productId: kotlin.Long? = null,

    @Json(name = "recalculationCompoundingFrequencyInterval")
    val recalculationCompoundingFrequencyInterval: kotlin.Int? = null,

    @Json(name = "recalculationCompoundingFrequencyNthDay")
    val recalculationCompoundingFrequencyNthDay: EnumOptionData? = null,

    @Json(name = "recalculationCompoundingFrequencyOnDay")
    val recalculationCompoundingFrequencyOnDay: kotlin.Int? = null,

    @Json(name = "recalculationCompoundingFrequencyType")
    val recalculationCompoundingFrequencyType: EnumOptionData? = null,

    @Json(name = "recalculationCompoundingFrequencyWeekday")
    val recalculationCompoundingFrequencyWeekday: EnumOptionData? = null,

    @Json(name = "recalculationRestFrequencyInterval")
    val recalculationRestFrequencyInterval: kotlin.Int? = null,

    @Json(name = "recalculationRestFrequencyNthDay")
    val recalculationRestFrequencyNthDay: EnumOptionData? = null,

    @Json(name = "recalculationRestFrequencyOnDay")
    val recalculationRestFrequencyOnDay: kotlin.Int? = null,

    @Json(name = "recalculationRestFrequencyType")
    val recalculationRestFrequencyType: EnumOptionData? = null,

    @Json(name = "recalculationRestFrequencyWeekday")
    val recalculationRestFrequencyWeekday: EnumOptionData? = null,

    @Json(name = "rescheduleStrategyType")
    val rescheduleStrategyType: EnumOptionData? = null

) {


}


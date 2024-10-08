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

import org.openapitools.client.models.CurrencyData
import org.openapitools.client.models.EnumOptionData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param accrualBasedAccountingEnabled 
 * @param allowOverdraft 
 * @param cashBasedAccountingEnabled 
 * @param currency 
 * @param depositAccountType 
 * @param id 
 * @param interestCalculationDaysInYearType 
 * @param interestCalculationType 
 * @param interestCompoundingPeriodType 
 * @param interestPostingPeriodType 
 * @param lockinPeriodFrequency 
 * @param lockinPeriodFrequencyType 
 * @param maxAllowedLienLimit 
 * @param minRequiredBalance 
 * @param minRequiredOpeningBalance 
 * @param name 
 * @param nominalAnnualInterestRate 
 * @param overdraftLimit 
 * @param periodicAccrualAccounting 
 * @param upfrontAccrualAccounting 
 * @param withdrawalFeeForTransfers 
 */


data class SavingsProductData (

    @Json(name = "accrualBasedAccountingEnabled")
    val accrualBasedAccountingEnabled: kotlin.Boolean? = null,

    @Json(name = "allowOverdraft")
    val allowOverdraft: kotlin.Boolean? = null,

    @Json(name = "cashBasedAccountingEnabled")
    val cashBasedAccountingEnabled: kotlin.Boolean? = null,

    @Json(name = "currency")
    val currency: CurrencyData? = null,

    @Json(name = "depositAccountType")
    val depositAccountType: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "interestCalculationDaysInYearType")
    val interestCalculationDaysInYearType: EnumOptionData? = null,

    @Json(name = "interestCalculationType")
    val interestCalculationType: EnumOptionData? = null,

    @Json(name = "interestCompoundingPeriodType")
    val interestCompoundingPeriodType: EnumOptionData? = null,

    @Json(name = "interestPostingPeriodType")
    val interestPostingPeriodType: EnumOptionData? = null,

    @Json(name = "lockinPeriodFrequency")
    val lockinPeriodFrequency: kotlin.Int? = null,

    @Json(name = "lockinPeriodFrequencyType")
    val lockinPeriodFrequencyType: EnumOptionData? = null,

    @Json(name = "maxAllowedLienLimit")
    val maxAllowedLienLimit: java.math.BigDecimal? = null,

    @Json(name = "minRequiredBalance")
    val minRequiredBalance: java.math.BigDecimal? = null,

    @Json(name = "minRequiredOpeningBalance")
    val minRequiredOpeningBalance: java.math.BigDecimal? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "nominalAnnualInterestRate")
    val nominalAnnualInterestRate: java.math.BigDecimal? = null,

    @Json(name = "overdraftLimit")
    val overdraftLimit: java.math.BigDecimal? = null,

    @Json(name = "periodicAccrualAccounting")
    val periodicAccrualAccounting: kotlin.Boolean? = null,

    @Json(name = "upfrontAccrualAccounting")
    val upfrontAccrualAccounting: kotlin.Boolean? = null,

    @Json(name = "withdrawalFeeForTransfers")
    val withdrawalFeeForTransfers: kotlin.Boolean? = null

) {


}


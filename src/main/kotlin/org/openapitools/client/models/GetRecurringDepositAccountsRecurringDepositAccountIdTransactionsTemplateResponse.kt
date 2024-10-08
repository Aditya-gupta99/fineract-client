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

import org.openapitools.client.models.GetRecurringCurrency
import org.openapitools.client.models.GetRecurringTransactionType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse
 *
 * @param accountId 
 * @param accountNo 
 * @param amount 
 * @param currency 
 * @param date 
 * @param id 
 * @param paymentTypeOptions 
 * @param reversed 
 * @param transactionType 
 */


data class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse (

    @Json(name = "accountId")
    val accountId: kotlin.Long? = null,

    @Json(name = "accountNo")
    val accountNo: kotlin.String? = null,

    @Json(name = "amount")
    val amount: java.math.BigDecimal? = null,

    @Json(name = "currency")
    val currency: GetRecurringCurrency? = null,

    @Json(name = "date")
    val date: java.time.LocalDate? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "paymentTypeOptions")
    val paymentTypeOptions: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "reversed")
    val reversed: kotlin.Boolean? = null,

    @Json(name = "transactionType")
    val transactionType: GetRecurringTransactionType? = null

) {


}


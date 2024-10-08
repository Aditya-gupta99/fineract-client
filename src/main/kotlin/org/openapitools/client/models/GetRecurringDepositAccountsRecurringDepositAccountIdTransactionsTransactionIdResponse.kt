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

import org.openapitools.client.models.GetRecurringPaymentDetailData
import org.openapitools.client.models.GetRecurringTransactionsCurrency
import org.openapitools.client.models.GetRecurringTransactionsTransactionType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse
 *
 * @param accountId 
 * @param accountNo 
 * @param amount 
 * @param currency 
 * @param date 
 * @param id 
 * @param paymentDetailData 
 * @param reversed 
 * @param runningBalance 
 * @param transactionType 
 */


data class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse (

    @Json(name = "accountId")
    val accountId: kotlin.Long? = null,

    @Json(name = "accountNo")
    val accountNo: kotlin.String? = null,

    @Json(name = "amount")
    val amount: kotlin.Float? = null,

    @Json(name = "currency")
    val currency: GetRecurringTransactionsCurrency? = null,

    @Json(name = "date")
    val date: java.time.LocalDate? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "paymentDetailData")
    val paymentDetailData: GetRecurringPaymentDetailData? = null,

    @Json(name = "reversed")
    val reversed: kotlin.Boolean? = null,

    @Json(name = "runningBalance")
    val runningBalance: kotlin.Int? = null,

    @Json(name = "transactionType")
    val transactionType: GetRecurringTransactionsTransactionType? = null

) {


}


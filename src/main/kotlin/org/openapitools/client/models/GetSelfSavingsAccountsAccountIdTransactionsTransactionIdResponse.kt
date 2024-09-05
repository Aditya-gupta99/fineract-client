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

import org.openapitools.client.models.GetSelfSavingsPaymentDetailData
import org.openapitools.client.models.GetSelfSavingsTransactionCurrency
import org.openapitools.client.models.GetSelfSavingsTransactionType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse
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


data class GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse (

    @Json(name = "accountId")
    val accountId: kotlin.Int? = null,

    @Json(name = "accountNo")
    val accountNo: kotlin.Long? = null,

    @Json(name = "amount")
    val amount: kotlin.Int? = null,

    @Json(name = "currency")
    val currency: GetSelfSavingsTransactionCurrency? = null,

    @Json(name = "date")
    val date: java.time.LocalDate? = null,

    @Json(name = "id")
    val id: kotlin.Int? = null,

    @Json(name = "paymentDetailData")
    val paymentDetailData: GetSelfSavingsPaymentDetailData? = null,

    @Json(name = "reversed")
    val reversed: kotlin.Boolean? = null,

    @Json(name = "runningBalance")
    val runningBalance: kotlin.Int? = null,

    @Json(name = "transactionType")
    val transactionType: GetSelfSavingsTransactionType? = null

) {


}


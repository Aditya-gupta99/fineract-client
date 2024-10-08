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

import org.openapitools.client.models.GetLoanProductsAssetAccountOptions
import org.openapitools.client.models.GetLoanProductsExpenseAccountOptions
import org.openapitools.client.models.GetLoanProductsIncomeAccountOptions
import org.openapitools.client.models.GetLoanProductsLiabilityAccountOptions

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param assetAccountOptions 
 * @param expenseAccountOptions 
 * @param incomeAccountOptions 
 * @param liabilityAccountOptions 
 */


data class GetLoanProductsAccountingMappingOptions (

    @Json(name = "assetAccountOptions")
    val assetAccountOptions: kotlin.collections.Set<GetLoanProductsAssetAccountOptions>? = null,

    @Json(name = "expenseAccountOptions")
    val expenseAccountOptions: kotlin.collections.Set<GetLoanProductsExpenseAccountOptions>? = null,

    @Json(name = "incomeAccountOptions")
    val incomeAccountOptions: kotlin.collections.Set<GetLoanProductsIncomeAccountOptions>? = null,

    @Json(name = "liabilityAccountOptions")
    val liabilityAccountOptions: kotlin.collections.Set<GetLoanProductsLiabilityAccountOptions>? = null

) {


}


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

import org.openapitools.client.models.GetCollateralCurrencyResponse
import org.openapitools.client.models.GetCollateralTypeResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetLoansLoanIdCollateralsResponse
 *
 * @param currency 
 * @param description 
 * @param id 
 * @param type 
 * @param `value` 
 */


data class GetLoansLoanIdCollateralsResponse (

    @Json(name = "currency")
    val currency: GetCollateralCurrencyResponse? = null,

    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "type")
    val type: GetCollateralTypeResponse? = null,

    @Json(name = "value")
    val `value`: kotlin.Long? = null

) {


}


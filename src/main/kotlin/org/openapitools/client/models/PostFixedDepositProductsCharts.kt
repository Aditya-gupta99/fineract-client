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

import org.openapitools.client.models.PostFixedDepositProductsChartSlabs

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param chartSlabs 
 * @param dateFormat 
 * @param fromDate 
 * @param locale 
 */


data class PostFixedDepositProductsCharts (

    @Json(name = "chartSlabs")
    val chartSlabs: kotlin.collections.Set<PostFixedDepositProductsChartSlabs>? = null,

    @Json(name = "dateFormat")
    val dateFormat: kotlin.String? = null,

    @Json(name = "fromDate")
    val fromDate: kotlin.String? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null

) {


}


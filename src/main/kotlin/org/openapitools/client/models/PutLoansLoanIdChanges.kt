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
 * 
 *
 * @param fraud 
 * @param locale 
 * @param principal 
 */


data class PutLoansLoanIdChanges (

    @Json(name = "fraud")
    val fraud: kotlin.Boolean? = null,

    @Json(name = "locale")
    val locale: kotlin.String? = null,

    @Json(name = "principal")
    val principal: kotlin.Long? = null

) {


}


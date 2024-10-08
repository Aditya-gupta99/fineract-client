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

import org.openapitools.client.models.GLAccountData
import org.openapitools.client.models.OfficeData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetAccountRulesTemplateResponse
 *
 * @param allowedAccounts 
 * @param allowedOffices 
 * @param systemDefined 
 */


data class GetAccountRulesTemplateResponse (

    @Json(name = "allowedAccounts")
    val allowedAccounts: kotlin.collections.List<GLAccountData>? = null,

    @Json(name = "allowedOffices")
    val allowedOffices: kotlin.collections.List<OfficeData>? = null,

    @Json(name = "systemDefined")
    val systemDefined: kotlin.Boolean? = null

) {


}


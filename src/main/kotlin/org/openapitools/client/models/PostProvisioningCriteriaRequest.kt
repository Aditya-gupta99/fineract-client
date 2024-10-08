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

import org.openapitools.client.models.LoanProductData
import org.openapitools.client.models.ProvisioningCriteriaDefinitionData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * PostProvisioningCriteriaRequest
 *
 * @param criteriaName 
 * @param loanProducts 
 * @param provisioningcriteria 
 */


data class PostProvisioningCriteriaRequest (

    @Json(name = "criteriaName")
    val criteriaName: kotlin.String? = null,

    @Json(name = "loanProducts")
    val loanProducts: kotlin.collections.List<LoanProductData>? = null,

    @Json(name = "provisioningcriteria")
    val provisioningcriteria: kotlin.collections.List<ProvisioningCriteriaDefinitionData>? = null

) {


}


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

import org.openapitools.client.models.GetFromAccountTypeOptionsResponseStandingInstructionSwagger
import org.openapitools.client.models.GetFromAccountTypeResponseStandingInstructionSwagger
import org.openapitools.client.models.GetFromClientOptionsResponseStandingInstructionSwagger
import org.openapitools.client.models.GetFromOfficeOptionsResponseStandingInstructionSwagger
import org.openapitools.client.models.GetFromOfficeResponseStandingInstructionSwagger
import org.openapitools.client.models.GetInstructionTypeOptionsResponseStandingInstructionSwagger
import org.openapitools.client.models.GetPriorityOptionsResponseStandingInstructionSwagger
import org.openapitools.client.models.GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger
import org.openapitools.client.models.GetRecurrenceTypeOptionsResponseStandingInstructionSwagger
import org.openapitools.client.models.GetStatusOptionsResponseStandingInstructionSwagger
import org.openapitools.client.models.GetToAccountTypeOptionsResponseStandingInstructionSwagger
import org.openapitools.client.models.GetToOfficeOptionsResponseStandingInstructionSwagger
import org.openapitools.client.models.GetTransferTypeOptionsResponseStandingInstructionSwagger

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetStandingInstructionsTemplateResponse
 *
 * @param fromAccountType 
 * @param fromAccountTypeOptions 
 * @param fromClientOptions 
 * @param fromOffice 
 * @param fromOfficeOptions 
 * @param instructionTypeOptions 
 * @param priorityOptions 
 * @param recurrenceFrequencyOptions 
 * @param recurrenceTypeOptions 
 * @param statusOptions 
 * @param toAccountTypeOptions 
 * @param toOfficeOptions 
 * @param transferTypeOptions 
 */


data class GetStandingInstructionsTemplateResponse (

    @Json(name = "fromAccountType")
    val fromAccountType: GetFromAccountTypeResponseStandingInstructionSwagger? = null,

    @Json(name = "fromAccountTypeOptions")
    val fromAccountTypeOptions: kotlin.collections.Set<GetFromAccountTypeOptionsResponseStandingInstructionSwagger>? = null,

    @Json(name = "fromClientOptions")
    val fromClientOptions: kotlin.collections.Set<GetFromClientOptionsResponseStandingInstructionSwagger>? = null,

    @Json(name = "fromOffice")
    val fromOffice: GetFromOfficeResponseStandingInstructionSwagger? = null,

    @Json(name = "fromOfficeOptions")
    val fromOfficeOptions: kotlin.collections.Set<GetFromOfficeOptionsResponseStandingInstructionSwagger>? = null,

    @Json(name = "instructionTypeOptions")
    val instructionTypeOptions: kotlin.collections.Set<GetInstructionTypeOptionsResponseStandingInstructionSwagger>? = null,

    @Json(name = "priorityOptions")
    val priorityOptions: kotlin.collections.Set<GetPriorityOptionsResponseStandingInstructionSwagger>? = null,

    @Json(name = "recurrenceFrequencyOptions")
    val recurrenceFrequencyOptions: kotlin.collections.Set<GetRecurrenceFrequencyOptionsResponseStandingInstructionSwagger>? = null,

    @Json(name = "recurrenceTypeOptions")
    val recurrenceTypeOptions: kotlin.collections.Set<GetRecurrenceTypeOptionsResponseStandingInstructionSwagger>? = null,

    @Json(name = "statusOptions")
    val statusOptions: kotlin.collections.Set<GetStatusOptionsResponseStandingInstructionSwagger>? = null,

    @Json(name = "toAccountTypeOptions")
    val toAccountTypeOptions: kotlin.collections.Set<GetToAccountTypeOptionsResponseStandingInstructionSwagger>? = null,

    @Json(name = "toOfficeOptions")
    val toOfficeOptions: kotlin.collections.Set<GetToOfficeOptionsResponseStandingInstructionSwagger>? = null,

    @Json(name = "transferTypeOptions")
    val transferTypeOptions: kotlin.collections.Set<GetTransferTypeOptionsResponseStandingInstructionSwagger>? = null

) {


}


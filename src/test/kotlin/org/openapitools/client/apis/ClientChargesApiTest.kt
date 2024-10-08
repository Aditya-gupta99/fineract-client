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

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.ClientChargesApi
import org.openapitools.client.models.DeleteClientsClientIdChargesChargeIdResponse
import org.openapitools.client.models.GetClientsChargesPageItems
import org.openapitools.client.models.GetClientsClientIdChargesResponse
import org.openapitools.client.models.PostClientsClientIdChargesChargeIdRequest
import org.openapitools.client.models.PostClientsClientIdChargesChargeIdResponse
import org.openapitools.client.models.PostClientsClientIdChargesRequest
import org.openapitools.client.models.PostClientsClientIdChargesResponse

class ClientChargesApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ClientChargesApi
        //val apiInstance = ClientChargesApi()

        // to test applyClientCharge
        should("test applyClientCharge") {
            // uncomment below to test applyClientCharge
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val postClientsClientIdChargesRequest : PostClientsClientIdChargesRequest =  // PostClientsClientIdChargesRequest | 
            //val result : PostClientsClientIdChargesResponse = apiInstance.applyClientCharge(clientId, postClientsClientIdChargesRequest)
            //result shouldBe ("TODO")
        }

        // to test deleteClientCharge
        should("test deleteClientCharge") {
            // uncomment below to test deleteClientCharge
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId
            //val result : DeleteClientsClientIdChargesChargeIdResponse = apiInstance.deleteClientCharge(clientId, chargeId)
            //result shouldBe ("TODO")
        }

        // to test payOrWaiveClientCharge
        should("test payOrWaiveClientCharge") {
            // uncomment below to test payOrWaiveClientCharge
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId
            //val postClientsClientIdChargesChargeIdRequest : PostClientsClientIdChargesChargeIdRequest =  // PostClientsClientIdChargesChargeIdRequest | 
            //val command : kotlin.String = command_example // kotlin.String | command
            //val result : PostClientsClientIdChargesChargeIdResponse = apiInstance.payOrWaiveClientCharge(clientId, chargeId, postClientsClientIdChargesChargeIdRequest, command)
            //result shouldBe ("TODO")
        }

        // to test retrieveAllClientCharges
        should("test retrieveAllClientCharges") {
            // uncomment below to test retrieveAllClientCharges
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus
            //val pendingPayment : kotlin.Boolean = true // kotlin.Boolean | pendingPayment
            //val limit : kotlin.Int = 56 // kotlin.Int | limit
            //val offset : kotlin.Int = 56 // kotlin.Int | offset
            //val result : GetClientsClientIdChargesResponse = apiInstance.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset)
            //result shouldBe ("TODO")
        }

        // to test retrieveClientCharge
        should("test retrieveClientCharge") {
            // uncomment below to test retrieveClientCharge
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId
            //val result : GetClientsChargesPageItems = apiInstance.retrieveClientCharge(clientId, chargeId)
            //result shouldBe ("TODO")
        }

        // to test retrieveTemplate4
        should("test retrieveTemplate4") {
            // uncomment below to test retrieveTemplate4
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val result : kotlin.String = apiInstance.retrieveTemplate4(clientId)
            //result shouldBe ("TODO")
        }

    }
}

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

import org.openapitools.client.apis.SelfClientApi
import org.openapitools.client.models.GetSelfClientsClientIdAccountsResponse
import org.openapitools.client.models.GetSelfClientsClientIdChargesChargeIdResponse
import org.openapitools.client.models.GetSelfClientsClientIdChargesResponse
import org.openapitools.client.models.GetSelfClientsClientIdResponse
import org.openapitools.client.models.GetSelfClientsClientIdTransactionsResponse
import org.openapitools.client.models.GetSelfClientsClientIdTransactionsTransactionIdResponse
import org.openapitools.client.models.GetSelfClientsResponse

class SelfClientApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SelfClientApi
        //val apiInstance = SelfClientApi()

        // to test addNewClientImage2
        should("test addNewClientImage2") {
            // uncomment below to test addNewClientImage2
            //val clientId : kotlin.Long = 789 // kotlin.Long | 
            //val contentLength : kotlin.Long = 789 // kotlin.Long | 
            //val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
            //val locale : kotlin.String = locale_example // kotlin.String | 
            //val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 
            //val result : kotlin.String = apiInstance.addNewClientImage2(clientId, contentLength, dateFormat, locale, uploadedInputStream)
            //result shouldBe ("TODO")
        }

        // to test deleteClientImage1
        should("test deleteClientImage1") {
            // uncomment below to test deleteClientImage1
            //val clientId : kotlin.Long = 789 // kotlin.Long | 
            //val result : kotlin.String = apiInstance.deleteClientImage1(clientId)
            //result shouldBe ("TODO")
        }

        // to test retrieveAll36
        should("test retrieveAll36") {
            // uncomment below to test retrieveAll36
            //val displayName : kotlin.String = displayName_example // kotlin.String | displayName
            //val firstName : kotlin.String = firstName_example // kotlin.String | firstName
            //val lastName : kotlin.String = lastName_example // kotlin.String | lastName
            //val offset : kotlin.Int = 56 // kotlin.Int | offset
            //val status : kotlin.String = status_example // kotlin.String | status
            //val limit : kotlin.Int = 56 // kotlin.Int | limit
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
            //val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
            //val result : GetSelfClientsResponse = apiInstance.retrieveAll36(displayName, firstName, lastName, offset, status, limit, orderBy, sortOrder)
            //result shouldBe ("TODO")
        }

        // to test retrieveAllClientCharges1
        should("test retrieveAllClientCharges1") {
            // uncomment below to test retrieveAllClientCharges1
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus
            //val pendingPayment : kotlin.Boolean = true // kotlin.Boolean | pendingPayment
            //val limit : kotlin.Int = 56 // kotlin.Int | limit
            //val offset : kotlin.Int = 56 // kotlin.Int | offset
            //val result : GetSelfClientsClientIdChargesResponse = apiInstance.retrieveAllClientCharges1(clientId, chargeStatus, pendingPayment, limit, offset)
            //result shouldBe ("TODO")
        }

        // to test retrieveAllClientTransactions2
        should("test retrieveAllClientTransactions2") {
            // uncomment below to test retrieveAllClientTransactions2
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val offset : kotlin.Int = 56 // kotlin.Int | offset
            //val limit : kotlin.Int = 56 // kotlin.Int | limit
            //val result : GetSelfClientsClientIdTransactionsResponse = apiInstance.retrieveAllClientTransactions2(clientId, offset, limit)
            //result shouldBe ("TODO")
        }

        // to test retrieveAssociatedAccounts2
        should("test retrieveAssociatedAccounts2") {
            // uncomment below to test retrieveAssociatedAccounts2
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val result : GetSelfClientsClientIdAccountsResponse = apiInstance.retrieveAssociatedAccounts2(clientId)
            //result shouldBe ("TODO")
        }

        // to test retrieveClientCharge1
        should("test retrieveClientCharge1") {
            // uncomment below to test retrieveClientCharge1
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId
            //val result : GetSelfClientsClientIdChargesChargeIdResponse = apiInstance.retrieveClientCharge1(clientId, chargeId)
            //result shouldBe ("TODO")
        }

        // to test retrieveClientTransaction4
        should("test retrieveClientTransaction4") {
            // uncomment below to test retrieveClientTransaction4
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
            //val result : GetSelfClientsClientIdTransactionsTransactionIdResponse = apiInstance.retrieveClientTransaction4(clientId, transactionId)
            //result shouldBe ("TODO")
        }

        // to test retrieveImage1
        should("test retrieveImage1") {
            // uncomment below to test retrieveImage1
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val maxWidth : kotlin.Int = maxWidth // kotlin.Int | 
            //val maxHeight : kotlin.Int = maxHeight // kotlin.Int | 
            //val output : kotlin.String = output // kotlin.String | 
            //apiInstance.retrieveImage1(clientId, maxWidth, maxHeight, output)
        }

        // to test retrieveObligeeDetails2
        should("test retrieveObligeeDetails2") {
            // uncomment below to test retrieveObligeeDetails2
            //val clientId : kotlin.Long = 789 // kotlin.Long | 
            //val result : kotlin.String = apiInstance.retrieveObligeeDetails2(clientId)
            //result shouldBe ("TODO")
        }

        // to test retrieveOne28
        should("test retrieveOne28") {
            // uncomment below to test retrieveOne28
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val result : GetSelfClientsClientIdResponse = apiInstance.retrieveOne28(clientId)
            //result shouldBe ("TODO")
        }

    }
}

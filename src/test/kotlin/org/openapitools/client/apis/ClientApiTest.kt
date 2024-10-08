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

import org.openapitools.client.apis.ClientApi
import org.openapitools.client.models.DeleteClientsClientIdResponse
import org.openapitools.client.models.GetClientObligeeDetailsResponse
import org.openapitools.client.models.GetClientTransferProposalDateResponse
import org.openapitools.client.models.GetClientsClientIdAccountsResponse
import org.openapitools.client.models.GetClientsClientIdResponse
import org.openapitools.client.models.GetClientsResponse
import org.openapitools.client.models.GetClientsTemplateResponse
import org.openapitools.client.models.PostClientsClientIdRequest
import org.openapitools.client.models.PostClientsClientIdResponse
import org.openapitools.client.models.PostClientsRequest
import org.openapitools.client.models.PostClientsResponse
import org.openapitools.client.models.PutClientsClientIdRequest
import org.openapitools.client.models.PutClientsClientIdResponse

class ClientApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ClientApi
        //val apiInstance = ClientApi()

        // to test activate1
        should("test activate1") {
            // uncomment below to test activate1
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val postClientsClientIdRequest : PostClientsClientIdRequest =  // PostClientsClientIdRequest | 
            //val command : kotlin.String = command_example // kotlin.String | command
            //val result : PostClientsClientIdResponse = apiInstance.activate1(clientId, postClientsClientIdRequest, command)
            //result shouldBe ("TODO")
        }

        // to test applyCommand
        should("test applyCommand") {
            // uncomment below to test applyCommand
            //val externalId : kotlin.String = externalId_example // kotlin.String | externalId
            //val postClientsClientIdRequest : PostClientsClientIdRequest =  // PostClientsClientIdRequest | 
            //val command : kotlin.String = command_example // kotlin.String | command
            //val result : PostClientsClientIdResponse = apiInstance.applyCommand(externalId, postClientsClientIdRequest, command)
            //result shouldBe ("TODO")
        }

        // to test create6
        should("test create6") {
            // uncomment below to test create6
            //val postClientsRequest : PostClientsRequest =  // PostClientsRequest | 
            //val result : PostClientsResponse = apiInstance.create6(postClientsRequest)
            //result shouldBe ("TODO")
        }

        // to test delete10
        should("test delete10") {
            // uncomment below to test delete10
            //val externalId : kotlin.String = externalId_example // kotlin.String | externalId
            //val body : kotlin.Any = Object // kotlin.Any | 
            //val result : DeleteClientsClientIdResponse = apiInstance.delete10(externalId, body)
            //result shouldBe ("TODO")
        }

        // to test delete9
        should("test delete9") {
            // uncomment below to test delete9
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val body : kotlin.Any = Object // kotlin.Any | 
            //val result : DeleteClientsClientIdResponse = apiInstance.delete9(clientId, body)
            //result shouldBe ("TODO")
        }

        // to test getClientTemplate
        should("test getClientTemplate") {
            // uncomment below to test getClientTemplate
            //val legalFormType : kotlin.String = legalFormType_example // kotlin.String | 
            //val officeId : kotlin.Long = 789 // kotlin.Long | 
            //val staffId : kotlin.Long = 789 // kotlin.Long | 
            //val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
            //apiInstance.getClientTemplate(legalFormType, officeId, staffId, dateFormat)
        }

        // to test postClientTemplate
        should("test postClientTemplate") {
            // uncomment below to test postClientTemplate
            //val legalFormType : kotlin.String = legalFormType_example // kotlin.String | 
            //val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
            //val locale : kotlin.String = locale_example // kotlin.String | 
            //val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 
            //val result : kotlin.String = apiInstance.postClientTemplate(legalFormType, dateFormat, locale, uploadedInputStream)
            //result shouldBe ("TODO")
        }

        // to test retrieveAll21
        should("test retrieveAll21") {
            // uncomment below to test retrieveAll21
            //val officeId : kotlin.Long = 789 // kotlin.Long | officeId
            //val externalId : kotlin.String = externalId_example // kotlin.String | externalId
            //val displayName : kotlin.String = displayName_example // kotlin.String | displayName
            //val firstName : kotlin.String = firstName_example // kotlin.String | firstName
            //val lastName : kotlin.String = lastName_example // kotlin.String | lastName
            //val status : kotlin.String = status_example // kotlin.String | status
            //val underHierarchy : kotlin.String = underHierarchy_example // kotlin.String | underHierarchy
            //val offset : kotlin.Int = 56 // kotlin.Int | offset
            //val limit : kotlin.Int = 56 // kotlin.Int | limit
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
            //val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
            //val orphansOnly : kotlin.Boolean = true // kotlin.Boolean | orphansOnly
            //val result : GetClientsResponse = apiInstance.retrieveAll21(officeId, externalId, displayName, firstName, lastName, status, underHierarchy, offset, limit, orderBy, sortOrder, orphansOnly)
            //result shouldBe ("TODO")
        }

        // to test retrieveAssociatedAccounts
        should("test retrieveAssociatedAccounts") {
            // uncomment below to test retrieveAssociatedAccounts
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val result : GetClientsClientIdAccountsResponse = apiInstance.retrieveAssociatedAccounts(clientId)
            //result shouldBe ("TODO")
        }

        // to test retrieveAssociatedAccounts1
        should("test retrieveAssociatedAccounts1") {
            // uncomment below to test retrieveAssociatedAccounts1
            //val externalId : kotlin.String = externalId_example // kotlin.String | externalId
            //val result : GetClientsClientIdAccountsResponse = apiInstance.retrieveAssociatedAccounts1(externalId)
            //result shouldBe ("TODO")
        }

        // to test retrieveObligeeDetails
        should("test retrieveObligeeDetails") {
            // uncomment below to test retrieveObligeeDetails
            //val clientId : kotlin.Long = 789 // kotlin.Long | 
            //val result : GetClientObligeeDetailsResponse = apiInstance.retrieveObligeeDetails(clientId)
            //result shouldBe ("TODO")
        }

        // to test retrieveObligeeDetails1
        should("test retrieveObligeeDetails1") {
            // uncomment below to test retrieveObligeeDetails1
            //val externalId : kotlin.String = externalId_example // kotlin.String | 
            //val result : GetClientObligeeDetailsResponse = apiInstance.retrieveObligeeDetails1(externalId)
            //result shouldBe ("TODO")
        }

        // to test retrieveOne11
        should("test retrieveOne11") {
            // uncomment below to test retrieveOne11
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
            //val result : GetClientsClientIdResponse = apiInstance.retrieveOne11(clientId, staffInSelectedOfficeOnly)
            //result shouldBe ("TODO")
        }

        // to test retrieveOne12
        should("test retrieveOne12") {
            // uncomment below to test retrieveOne12
            //val externalId : kotlin.String = externalId_example // kotlin.String | externalId
            //val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
            //val result : GetClientsClientIdResponse = apiInstance.retrieveOne12(externalId, staffInSelectedOfficeOnly)
            //result shouldBe ("TODO")
        }

        // to test retrieveTemplate5
        should("test retrieveTemplate5") {
            // uncomment below to test retrieveTemplate5
            //val officeId : kotlin.Long = 789 // kotlin.Long | officeId
            //val commandParam : kotlin.String = commandParam_example // kotlin.String | commandParam
            //val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
            //val result : GetClientsTemplateResponse = apiInstance.retrieveTemplate5(officeId, commandParam, staffInSelectedOfficeOnly)
            //result shouldBe ("TODO")
        }

        // to test retrieveTransferTemplate
        should("test retrieveTransferTemplate") {
            // uncomment below to test retrieveTransferTemplate
            //val clientId : kotlin.Long = 789 // kotlin.Long | 
            //val result : GetClientTransferProposalDateResponse = apiInstance.retrieveTransferTemplate(clientId)
            //result shouldBe ("TODO")
        }

        // to test retrieveTransferTemplate1
        should("test retrieveTransferTemplate1") {
            // uncomment below to test retrieveTransferTemplate1
            //val externalId : kotlin.String = externalId_example // kotlin.String | 
            //val result : GetClientTransferProposalDateResponse = apiInstance.retrieveTransferTemplate1(externalId)
            //result shouldBe ("TODO")
        }

        // to test update10
        should("test update10") {
            // uncomment below to test update10
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val putClientsClientIdRequest : PutClientsClientIdRequest =  // PutClientsClientIdRequest | 
            //val result : PutClientsClientIdResponse = apiInstance.update10(clientId, putClientsClientIdRequest)
            //result shouldBe ("TODO")
        }

        // to test update11
        should("test update11") {
            // uncomment below to test update11
            //val externalId : kotlin.String = externalId_example // kotlin.String | externalId
            //val putClientsClientIdRequest : PutClientsClientIdRequest =  // PutClientsClientIdRequest | 
            //val result : PutClientsClientIdResponse = apiInstance.update11(externalId, putClientsClientIdRequest)
            //result shouldBe ("TODO")
        }

    }
}

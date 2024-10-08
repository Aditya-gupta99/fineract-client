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

import org.openapitools.client.apis.ProvisioningEntriesApi
import org.openapitools.client.models.LoanProductProvisioningEntryData
import org.openapitools.client.models.PostProvisioningEntriesRequest
import org.openapitools.client.models.PostProvisioningEntriesResponse
import org.openapitools.client.models.ProvisioningEntryData
import org.openapitools.client.models.PutProvisioningEntriesRequest
import org.openapitools.client.models.PutProvisioningEntriesResponse

class ProvisioningEntriesApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ProvisioningEntriesApi
        //val apiInstance = ProvisioningEntriesApi()

        // to test createProvisioningEntries
        should("test createProvisioningEntries") {
            // uncomment below to test createProvisioningEntries
            //val postProvisioningEntriesRequest : PostProvisioningEntriesRequest =  // PostProvisioningEntriesRequest | 
            //val result : PostProvisioningEntriesResponse = apiInstance.createProvisioningEntries(postProvisioningEntriesRequest)
            //result shouldBe ("TODO")
        }

        // to test modifyProvisioningEntry
        should("test modifyProvisioningEntry") {
            // uncomment below to test modifyProvisioningEntry
            //val entryId : kotlin.Long = 789 // kotlin.Long | entryId
            //val command : kotlin.String = command_example // kotlin.String | command=createjournalentry command=recreateprovisioningentry
            //val putProvisioningEntriesRequest : PutProvisioningEntriesRequest =  // PutProvisioningEntriesRequest | 
            //val result : PutProvisioningEntriesResponse = apiInstance.modifyProvisioningEntry(entryId, command, putProvisioningEntriesRequest)
            //result shouldBe ("TODO")
        }

        // to test retrieveAllProvisioningEntries
        should("test retrieveAllProvisioningEntries") {
            // uncomment below to test retrieveAllProvisioningEntries
            //val offset : kotlin.Int = 56 // kotlin.Int | offset
            //val limit : kotlin.Int = 56 // kotlin.Int | limit
            //val result : kotlin.collections.List<ProvisioningEntryData> = apiInstance.retrieveAllProvisioningEntries(offset, limit)
            //result shouldBe ("TODO")
        }

        // to test retrieveProviioningEntries
        should("test retrieveProviioningEntries") {
            // uncomment below to test retrieveProviioningEntries
            //val entryId : kotlin.Long = 789 // kotlin.Long | 
            //val offset : kotlin.Int = 56 // kotlin.Int | 
            //val limit : kotlin.Int = 56 // kotlin.Int | 
            //val officeId : kotlin.Long = 789 // kotlin.Long | 
            //val productId : kotlin.Long = 789 // kotlin.Long | 
            //val categoryId : kotlin.Long = 789 // kotlin.Long | 
            //val result : LoanProductProvisioningEntryData = apiInstance.retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId)
            //result shouldBe ("TODO")
        }

        // to test retrieveProvisioningEntry
        should("test retrieveProvisioningEntry") {
            // uncomment below to test retrieveProvisioningEntry
            //val entryId : kotlin.Long = 789 // kotlin.Long | entryId
            //val result : ProvisioningEntryData = apiInstance.retrieveProvisioningEntry(entryId)
            //result shouldBe ("TODO")
        }

    }
}

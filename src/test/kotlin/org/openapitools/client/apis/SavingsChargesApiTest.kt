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

import org.openapitools.client.apis.SavingsChargesApi
import org.openapitools.client.models.DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesResponse
import org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.GetSavingsAccountsSavingsAccountIdChargesTemplateResponse
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesRequest
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesResponse
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
import org.openapitools.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
import org.openapitools.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
import org.openapitools.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse

class SavingsChargesApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SavingsChargesApi
        //val apiInstance = SavingsChargesApi()

        // to test addSavingsAccountCharge
        should("test addSavingsAccountCharge") {
            // uncomment below to test addSavingsAccountCharge
            //val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
            //val postSavingsAccountsSavingsAccountIdChargesRequest : PostSavingsAccountsSavingsAccountIdChargesRequest =  // PostSavingsAccountsSavingsAccountIdChargesRequest | 
            //val result : PostSavingsAccountsSavingsAccountIdChargesResponse = apiInstance.addSavingsAccountCharge(savingsAccountId, postSavingsAccountsSavingsAccountIdChargesRequest)
            //result shouldBe ("TODO")
        }

        // to test deleteSavingsAccountCharge
        should("test deleteSavingsAccountCharge") {
            // uncomment below to test deleteSavingsAccountCharge
            //val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
            //val savingsAccountChargeId : kotlin.Long = 789 // kotlin.Long | savingsAccountChargeId
            //val result : DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = apiInstance.deleteSavingsAccountCharge(savingsAccountId, savingsAccountChargeId)
            //result shouldBe ("TODO")
        }

        // to test payOrWaiveSavingsAccountCharge
        should("test payOrWaiveSavingsAccountCharge") {
            // uncomment below to test payOrWaiveSavingsAccountCharge
            //val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
            //val savingsAccountChargeId : kotlin.Long = 789 // kotlin.Long | savingsAccountChargeId
            //val postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest : PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest =  // PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest | 
            //val command : kotlin.String = command_example // kotlin.String | command
            //val result : PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = apiInstance.payOrWaiveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, postSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest, command)
            //result shouldBe ("TODO")
        }

        // to test retrieveAllSavingsAccountCharges
        should("test retrieveAllSavingsAccountCharges") {
            // uncomment below to test retrieveAllSavingsAccountCharges
            //val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
            //val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus
            //val result : kotlin.collections.List<GetSavingsAccountsSavingsAccountIdChargesResponse> = apiInstance.retrieveAllSavingsAccountCharges(savingsAccountId, chargeStatus)
            //result shouldBe ("TODO")
        }

        // to test retrieveSavingsAccountCharge
        should("test retrieveSavingsAccountCharge") {
            // uncomment below to test retrieveSavingsAccountCharge
            //val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
            //val savingsAccountChargeId : kotlin.Long = 789 // kotlin.Long | savingsAccountChargeId
            //val result : GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = apiInstance.retrieveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId)
            //result shouldBe ("TODO")
        }

        // to test retrieveTemplate18
        should("test retrieveTemplate18") {
            // uncomment below to test retrieveTemplate18
            //val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
            //val result : GetSavingsAccountsSavingsAccountIdChargesTemplateResponse = apiInstance.retrieveTemplate18(savingsAccountId)
            //result shouldBe ("TODO")
        }

        // to test updateSavingsAccountCharge
        should("test updateSavingsAccountCharge") {
            // uncomment below to test updateSavingsAccountCharge
            //val savingsAccountId : kotlin.Long = 789 // kotlin.Long | savingsAccountId
            //val savingsAccountChargeId : kotlin.Long = 789 // kotlin.Long | savingsAccountChargeId
            //val putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest : PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest =  // PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest | 
            //val result : PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = apiInstance.updateSavingsAccountCharge(savingsAccountId, savingsAccountChargeId, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest)
            //result shouldBe ("TODO")
        }

    }
}

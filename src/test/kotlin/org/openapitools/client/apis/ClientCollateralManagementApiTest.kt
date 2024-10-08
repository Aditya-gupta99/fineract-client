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

import org.openapitools.client.apis.ClientCollateralManagementApi
import org.openapitools.client.models.DeleteClientCollateralResponse
import org.openapitools.client.models.GetLoanCollateralManagementTemplate
import org.openapitools.client.models.PostClientCollateralRequest
import org.openapitools.client.models.PostClientCollateralResponse
import org.openapitools.client.models.PutClientCollateralRequest
import org.openapitools.client.models.PutClientCollateralResponse

class ClientCollateralManagementApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ClientCollateralManagementApi
        //val apiInstance = ClientCollateralManagementApi()

        // to test addCollateral
        should("test addCollateral") {
            // uncomment below to test addCollateral
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val postClientCollateralRequest : PostClientCollateralRequest =  // PostClientCollateralRequest | 
            //val result : PostClientCollateralResponse = apiInstance.addCollateral(clientId, postClientCollateralRequest)
            //result shouldBe ("TODO")
        }

        // to test deleteCollateral1
        should("test deleteCollateral1") {
            // uncomment below to test deleteCollateral1
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId
            //val result : DeleteClientCollateralResponse = apiInstance.deleteCollateral1(clientId, collateralId)
            //result shouldBe ("TODO")
        }

        // to test getClientCollateral
        should("test getClientCollateral") {
            // uncomment below to test getClientCollateral
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val prodId : kotlin.Long = 789 // kotlin.Long | prodId
            //val result : kotlin.collections.List<kotlin.Any> = apiInstance.getClientCollateral(clientId, prodId)
            //result shouldBe ("TODO")
        }

        // to test getClientCollateralData
        should("test getClientCollateralData") {
            // uncomment below to test getClientCollateralData
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val clientCollateralId : kotlin.Long = 789 // kotlin.Long | clientCollateralId
            //val result : kotlin.Any = apiInstance.getClientCollateralData(clientId, clientCollateralId)
            //result shouldBe ("TODO")
        }

        // to test getClientCollateralTemplate
        should("test getClientCollateralTemplate") {
            // uncomment below to test getClientCollateralTemplate
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val result : kotlin.collections.List<GetLoanCollateralManagementTemplate> = apiInstance.getClientCollateralTemplate(clientId)
            //result shouldBe ("TODO")
        }

        // to test updateCollateral1
        should("test updateCollateral1") {
            // uncomment below to test updateCollateral1
            //val clientId : kotlin.Long = 789 // kotlin.Long | clientId
            //val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId
            //val putClientCollateralRequest : PutClientCollateralRequest =  // PutClientCollateralRequest | 
            //val result : PutClientCollateralResponse = apiInstance.updateCollateral1(clientId, collateralId, putClientCollateralRequest)
            //result shouldBe ("TODO")
        }

    }
}

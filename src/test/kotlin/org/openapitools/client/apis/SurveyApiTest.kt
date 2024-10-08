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

import org.openapitools.client.apis.SurveyApi
import org.openapitools.client.models.GetSurveyResponse
import org.openapitools.client.models.PostSurveySurveyNameApptableIdRequest
import org.openapitools.client.models.PostSurveySurveyNameApptableIdResponse

class SurveyApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of SurveyApi
        //val apiInstance = SurveyApi()

        // to test createDatatableEntry1
        should("test createDatatableEntry1") {
            // uncomment below to test createDatatableEntry1
            //val surveyName : kotlin.String = surveyName_example // kotlin.String | surveyName
            //val apptableId : kotlin.Long = 789 // kotlin.Long | apptableId
            //val postSurveySurveyNameApptableIdRequest : PostSurveySurveyNameApptableIdRequest =  // PostSurveySurveyNameApptableIdRequest | 
            //val result : PostSurveySurveyNameApptableIdResponse = apiInstance.createDatatableEntry1(surveyName, apptableId, postSurveySurveyNameApptableIdRequest)
            //result shouldBe ("TODO")
        }

        // to test deleteDatatableEntries1
        should("test deleteDatatableEntries1") {
            // uncomment below to test deleteDatatableEntries1
            //val surveyName : kotlin.String = surveyName_example // kotlin.String | 
            //val clientId : kotlin.Long = 789 // kotlin.Long | 
            //val fulfilledId : kotlin.Long = 789 // kotlin.Long | 
            //val result : kotlin.String = apiInstance.deleteDatatableEntries1(surveyName, clientId, fulfilledId)
            //result shouldBe ("TODO")
        }

        // to test getClientSurveyOverview
        should("test getClientSurveyOverview") {
            // uncomment below to test getClientSurveyOverview
            //val surveyName : kotlin.String = surveyName_example // kotlin.String | 
            //val clientId : kotlin.Long = 789 // kotlin.Long | 
            //val result : kotlin.String = apiInstance.getClientSurveyOverview(surveyName, clientId)
            //result shouldBe ("TODO")
        }

        // to test getSurveyEntry
        should("test getSurveyEntry") {
            // uncomment below to test getSurveyEntry
            //val surveyName : kotlin.String = surveyName_example // kotlin.String | 
            //val clientId : kotlin.Long = 789 // kotlin.Long | 
            //val entryId : kotlin.Long = 789 // kotlin.Long | 
            //val result : kotlin.String = apiInstance.getSurveyEntry(surveyName, clientId, entryId)
            //result shouldBe ("TODO")
        }

        // to test register
        should("test register") {
            // uncomment below to test register
            //val surveyName : kotlin.String = surveyName_example // kotlin.String | 
            //val apptable : kotlin.String = apptable_example // kotlin.String | 
            //val body : kotlin.String = body_example // kotlin.String | 
            //val result : kotlin.String = apiInstance.register(surveyName, apptable, body)
            //result shouldBe ("TODO")
        }

        // to test retrieveSurvey
        should("test retrieveSurvey") {
            // uncomment below to test retrieveSurvey
            //val surveyName : kotlin.String = surveyName_example // kotlin.String | surveyName
            //val result : GetSurveyResponse = apiInstance.retrieveSurvey(surveyName)
            //result shouldBe ("TODO")
        }

        // to test retrieveSurveys
        should("test retrieveSurveys") {
            // uncomment below to test retrieveSurveys
            //val result : kotlin.collections.List<GetSurveyResponse> = apiInstance.retrieveSurveys()
            //result shouldBe ("TODO")
        }

    }
}

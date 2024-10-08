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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.GetRecurringDepositAccountsResponse
import org.openapitools.client.models.GetRecurringDepositAccountsCurrency
import org.openapitools.client.models.GetRecurringDepositAccountsDepositPeriodFrequency
import org.openapitools.client.models.GetRecurringDepositAccountsInterestCalculationDaysInYearType
import org.openapitools.client.models.GetRecurringDepositAccountsInterestCalculationType
import org.openapitools.client.models.GetRecurringDepositAccountsInterestCompoundingPeriodType
import org.openapitools.client.models.GetRecurringDepositAccountsInterestPostingPeriodType
import org.openapitools.client.models.GetRecurringDepositAccountsMaxDepositTermType
import org.openapitools.client.models.GetRecurringDepositAccountsMinDepositTermType
import org.openapitools.client.models.GetRecurringDepositAccountsRecurringDepositFrequencyType
import org.openapitools.client.models.GetRecurringDepositAccountsStatus
import org.openapitools.client.models.GetRecurringDepositAccountsSummary
import org.openapitools.client.models.GetRecurringDepositAccountsTimeline

class GetRecurringDepositAccountsResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetRecurringDepositAccountsResponse
        //val modelInstance = GetRecurringDepositAccountsResponse()

        // to test the property `accountNo`
        should("test accountNo") {
            // uncomment below to test the property
            //modelInstance.accountNo shouldBe ("TODO")
        }

        // to test the property `clientId`
        should("test clientId") {
            // uncomment below to test the property
            //modelInstance.clientId shouldBe ("TODO")
        }

        // to test the property `clientName`
        should("test clientName") {
            // uncomment below to test the property
            //modelInstance.clientName shouldBe ("TODO")
        }

        // to test the property `currency`
        should("test currency") {
            // uncomment below to test the property
            //modelInstance.currency shouldBe ("TODO")
        }

        // to test the property `depositAmount`
        should("test depositAmount") {
            // uncomment below to test the property
            //modelInstance.depositAmount shouldBe ("TODO")
        }

        // to test the property `depositPeriod`
        should("test depositPeriod") {
            // uncomment below to test the property
            //modelInstance.depositPeriod shouldBe ("TODO")
        }

        // to test the property `depositPeriodFrequency`
        should("test depositPeriodFrequency") {
            // uncomment below to test the property
            //modelInstance.depositPeriodFrequency shouldBe ("TODO")
        }

        // to test the property `fieldOfficerId`
        should("test fieldOfficerId") {
            // uncomment below to test the property
            //modelInstance.fieldOfficerId shouldBe ("TODO")
        }

        // to test the property `id`
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `interestCalculationDaysInYearType`
        should("test interestCalculationDaysInYearType") {
            // uncomment below to test the property
            //modelInstance.interestCalculationDaysInYearType shouldBe ("TODO")
        }

        // to test the property `interestCalculationType`
        should("test interestCalculationType") {
            // uncomment below to test the property
            //modelInstance.interestCalculationType shouldBe ("TODO")
        }

        // to test the property `interestCompoundingPeriodType`
        should("test interestCompoundingPeriodType") {
            // uncomment below to test the property
            //modelInstance.interestCompoundingPeriodType shouldBe ("TODO")
        }

        // to test the property `interestPostingPeriodType`
        should("test interestPostingPeriodType") {
            // uncomment below to test the property
            //modelInstance.interestPostingPeriodType shouldBe ("TODO")
        }

        // to test the property `maturityAmount`
        should("test maturityAmount") {
            // uncomment below to test the property
            //modelInstance.maturityAmount shouldBe ("TODO")
        }

        // to test the property `maturityDate`
        should("test maturityDate") {
            // uncomment below to test the property
            //modelInstance.maturityDate shouldBe ("TODO")
        }

        // to test the property `maxDepositTerm`
        should("test maxDepositTerm") {
            // uncomment below to test the property
            //modelInstance.maxDepositTerm shouldBe ("TODO")
        }

        // to test the property `maxDepositTermType`
        should("test maxDepositTermType") {
            // uncomment below to test the property
            //modelInstance.maxDepositTermType shouldBe ("TODO")
        }

        // to test the property `minDepositTerm`
        should("test minDepositTerm") {
            // uncomment below to test the property
            //modelInstance.minDepositTerm shouldBe ("TODO")
        }

        // to test the property `minDepositTermType`
        should("test minDepositTermType") {
            // uncomment below to test the property
            //modelInstance.minDepositTermType shouldBe ("TODO")
        }

        // to test the property `preClosurePenalApplicable`
        should("test preClosurePenalApplicable") {
            // uncomment below to test the property
            //modelInstance.preClosurePenalApplicable shouldBe ("TODO")
        }

        // to test the property `recurringDepositAmount`
        should("test recurringDepositAmount") {
            // uncomment below to test the property
            //modelInstance.recurringDepositAmount shouldBe ("TODO")
        }

        // to test the property `recurringDepositFrequency`
        should("test recurringDepositFrequency") {
            // uncomment below to test the property
            //modelInstance.recurringDepositFrequency shouldBe ("TODO")
        }

        // to test the property `recurringDepositFrequencyType`
        should("test recurringDepositFrequencyType") {
            // uncomment below to test the property
            //modelInstance.recurringDepositFrequencyType shouldBe ("TODO")
        }

        // to test the property `savingsProductId`
        should("test savingsProductId") {
            // uncomment below to test the property
            //modelInstance.savingsProductId shouldBe ("TODO")
        }

        // to test the property `savingsProductName`
        should("test savingsProductName") {
            // uncomment below to test the property
            //modelInstance.savingsProductName shouldBe ("TODO")
        }

        // to test the property `status`
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property `summary`
        should("test summary") {
            // uncomment below to test the property
            //modelInstance.summary shouldBe ("TODO")
        }

        // to test the property `timeline`
        should("test timeline") {
            // uncomment below to test the property
            //modelInstance.timeline shouldBe ("TODO")
        }

    }
}

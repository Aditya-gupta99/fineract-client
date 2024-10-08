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

import org.openapitools.client.models.GetLoanProductsResponse
import org.openapitools.client.models.GetLoanProductsAccountingRule
import org.openapitools.client.models.GetLoanProductsAmortizationType
import org.openapitools.client.models.GetLoanProductsCurrency
import org.openapitools.client.models.GetLoanProductsInterestRateFrequencyType
import org.openapitools.client.models.GetLoanProductsInterestRecalculationData
import org.openapitools.client.models.GetLoanProductsInterestType
import org.openapitools.client.models.GetLoanProductsRepaymentFrequencyType
import org.openapitools.client.models.GetLoanProductsRepaymentStartDateType
import org.openapitools.client.models.GetLoansProductsDaysInMonthType
import org.openapitools.client.models.GetLoansProductsDaysInYearType
import org.openapitools.client.models.GetLoansProductsInterestCalculationPeriodType

class GetLoanProductsResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetLoanProductsResponse
        //val modelInstance = GetLoanProductsResponse()

        // to test the property `accountingRule`
        should("test accountingRule") {
            // uncomment below to test the property
            //modelInstance.accountingRule shouldBe ("TODO")
        }

        // to test the property `amortizationType`
        should("test amortizationType") {
            // uncomment below to test the property
            //modelInstance.amortizationType shouldBe ("TODO")
        }

        // to test the property `annualInterestRate`
        should("test annualInterestRate") {
            // uncomment below to test the property
            //modelInstance.annualInterestRate shouldBe ("TODO")
        }

        // to test the property `currency`
        should("test currency") {
            // uncomment below to test the property
            //modelInstance.currency shouldBe ("TODO")
        }

        // to test the property `daysInMonthType`
        should("test daysInMonthType") {
            // uncomment below to test the property
            //modelInstance.daysInMonthType shouldBe ("TODO")
        }

        // to test the property `daysInYearType`
        should("test daysInYearType") {
            // uncomment below to test the property
            //modelInstance.daysInYearType shouldBe ("TODO")
        }

        // to test the property `endDate`
        should("test endDate") {
            // uncomment below to test the property
            //modelInstance.endDate shouldBe ("TODO")
        }

        // to test the property `fixedPrincipalPercentagePerInstallment`
        should("test fixedPrincipalPercentagePerInstallment") {
            // uncomment below to test the property
            //modelInstance.fixedPrincipalPercentagePerInstallment shouldBe ("TODO")
        }

        // to test the property `id`
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `includeInBorrowerCycle`
        should("test includeInBorrowerCycle") {
            // uncomment below to test the property
            //modelInstance.includeInBorrowerCycle shouldBe ("TODO")
        }

        // to test the property `interestCalculationPeriodType`
        should("test interestCalculationPeriodType") {
            // uncomment below to test the property
            //modelInstance.interestCalculationPeriodType shouldBe ("TODO")
        }

        // to test the property `interestRateFrequencyType`
        should("test interestRateFrequencyType") {
            // uncomment below to test the property
            //modelInstance.interestRateFrequencyType shouldBe ("TODO")
        }

        // to test the property `interestRatePerPeriod`
        should("test interestRatePerPeriod") {
            // uncomment below to test the property
            //modelInstance.interestRatePerPeriod shouldBe ("TODO")
        }

        // to test the property `interestRateVariationsForBorrowerCycle`
        should("test interestRateVariationsForBorrowerCycle") {
            // uncomment below to test the property
            //modelInstance.interestRateVariationsForBorrowerCycle shouldBe ("TODO")
        }

        // to test the property `interestRecalculationData`
        should("test interestRecalculationData") {
            // uncomment below to test the property
            //modelInstance.interestRecalculationData shouldBe ("TODO")
        }

        // to test the property `interestType`
        should("test interestType") {
            // uncomment below to test the property
            //modelInstance.interestType shouldBe ("TODO")
        }

        // to test the property `isInterestRecalculationEnabled`
        should("test isInterestRecalculationEnabled") {
            // uncomment below to test the property
            //modelInstance.isInterestRecalculationEnabled shouldBe ("TODO")
        }

        // to test the property `maxNumberOfRepayments`
        should("test maxNumberOfRepayments") {
            // uncomment below to test the property
            //modelInstance.maxNumberOfRepayments shouldBe ("TODO")
        }

        // to test the property `maxPrincipal`
        should("test maxPrincipal") {
            // uncomment below to test the property
            //modelInstance.maxPrincipal shouldBe ("TODO")
        }

        // to test the property `minNumberOfRepayments`
        should("test minNumberOfRepayments") {
            // uncomment below to test the property
            //modelInstance.minNumberOfRepayments shouldBe ("TODO")
        }

        // to test the property `minPrincipal`
        should("test minPrincipal") {
            // uncomment below to test the property
            //modelInstance.minPrincipal shouldBe ("TODO")
        }

        // to test the property `name`
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `numberOfRepaymentVariationsForBorrowerCycle`
        should("test numberOfRepaymentVariationsForBorrowerCycle") {
            // uncomment below to test the property
            //modelInstance.numberOfRepaymentVariationsForBorrowerCycle shouldBe ("TODO")
        }

        // to test the property `numberOfRepayments`
        should("test numberOfRepayments") {
            // uncomment below to test the property
            //modelInstance.numberOfRepayments shouldBe ("TODO")
        }

        // to test the property `principal`
        should("test principal") {
            // uncomment below to test the property
            //modelInstance.principal shouldBe ("TODO")
        }

        // to test the property `principalThresholdForLastInstalment`
        should("test principalThresholdForLastInstalment") {
            // uncomment below to test the property
            //modelInstance.principalThresholdForLastInstalment shouldBe ("TODO")
        }

        // to test the property `principalVariationsForBorrowerCycle`
        should("test principalVariationsForBorrowerCycle") {
            // uncomment below to test the property
            //modelInstance.principalVariationsForBorrowerCycle shouldBe ("TODO")
        }

        // to test the property `repaymentEvery`
        should("test repaymentEvery") {
            // uncomment below to test the property
            //modelInstance.repaymentEvery shouldBe ("TODO")
        }

        // to test the property `repaymentFrequencyType`
        should("test repaymentFrequencyType") {
            // uncomment below to test the property
            //modelInstance.repaymentFrequencyType shouldBe ("TODO")
        }

        // to test the property `repaymentStartDateType`
        should("test repaymentStartDateType") {
            // uncomment below to test the property
            //modelInstance.repaymentStartDateType shouldBe ("TODO")
        }

        // to test the property `shortName`
        should("test shortName") {
            // uncomment below to test the property
            //modelInstance.shortName shouldBe ("TODO")
        }

        // to test the property `startDate`
        should("test startDate") {
            // uncomment below to test the property
            //modelInstance.startDate shouldBe ("TODO")
        }

        // to test the property `status`
        should("test status") {
            // uncomment below to test the property
            //modelInstance.status shouldBe ("TODO")
        }

        // to test the property `transactionProcessingStrategy`
        should("test transactionProcessingStrategy") {
            // uncomment below to test the property
            //modelInstance.transactionProcessingStrategy shouldBe ("TODO")
        }

        // to test the property `transactionProcessingStrategyName`
        should("test transactionProcessingStrategyName") {
            // uncomment below to test the property
            //modelInstance.transactionProcessingStrategyName shouldBe ("TODO")
        }

        // to test the property `useBorrowerCycle`
        should("test useBorrowerCycle") {
            // uncomment below to test the property
            //modelInstance.useBorrowerCycle shouldBe ("TODO")
        }

    }
}

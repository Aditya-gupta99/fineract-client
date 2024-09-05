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

import org.openapitools.client.models.GetGroupsGroupIdAccountsResponse
import org.openapitools.client.models.GetGroupsGroupIdAccountsLoanAccounts
import org.openapitools.client.models.GetGroupsGroupIdAccountsMemberLoanAccounts
import org.openapitools.client.models.GetGroupsGroupIdAccountsMemberSavingsAccounts
import org.openapitools.client.models.GetGroupsGroupIdAccountsSavingAccounts

class GetGroupsGroupIdAccountsResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetGroupsGroupIdAccountsResponse
        //val modelInstance = GetGroupsGroupIdAccountsResponse()

        // to test the property `loanAccounts`
        should("test loanAccounts") {
            // uncomment below to test the property
            //modelInstance.loanAccounts shouldBe ("TODO")
        }

        // to test the property `memberLoanAccounts`
        should("test memberLoanAccounts") {
            // uncomment below to test the property
            //modelInstance.memberLoanAccounts shouldBe ("TODO")
        }

        // to test the property `memberSavingsAccounts`
        should("test memberSavingsAccounts") {
            // uncomment below to test the property
            //modelInstance.memberSavingsAccounts shouldBe ("TODO")
        }

        // to test the property `savingsAccounts`
        should("test savingsAccounts") {
            // uncomment below to test the property
            //modelInstance.savingsAccounts shouldBe ("TODO")
        }

    }
}

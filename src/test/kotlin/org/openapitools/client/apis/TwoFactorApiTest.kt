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

import org.openapitools.client.apis.TwoFactorApi

class TwoFactorApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of TwoFactorApi
        //val apiInstance = TwoFactorApi()

        // to test getOTPDeliveryMethods
        should("test getOTPDeliveryMethods") {
            // uncomment below to test getOTPDeliveryMethods
            //val result : kotlin.String = apiInstance.getOTPDeliveryMethods()
            //result shouldBe ("TODO")
        }

        // to test requestToken
        should("test requestToken") {
            // uncomment below to test requestToken
            //val deliveryMethod : kotlin.String = deliveryMethod_example // kotlin.String | 
            //val extendedToken : kotlin.Boolean = true // kotlin.Boolean | 
            //val result : kotlin.String = apiInstance.requestToken(deliveryMethod, extendedToken)
            //result shouldBe ("TODO")
        }

        // to test updateConfiguration2
        should("test updateConfiguration2") {
            // uncomment below to test updateConfiguration2
            //val body : kotlin.String = body_example // kotlin.String | 
            //val result : kotlin.String = apiInstance.updateConfiguration2(body)
            //result shouldBe ("TODO")
        }

        // to test validate
        should("test validate") {
            // uncomment below to test validate
            //val token : kotlin.String = token_example // kotlin.String | 
            //val result : kotlin.String = apiInstance.validate(token)
            //result shouldBe ("TODO")
        }

    }
}

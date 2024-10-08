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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * GetClientClientIdAddressesResponse
 *
 * @param addressId 
 * @param addressLine1 
 * @param addressLine2 
 * @param addressLine3 
 * @param addressType 
 * @param addressTypeId 
 * @param city 
 * @param clientId 
 * @param countryId 
 * @param countryName 
 * @param countyDistrict 
 * @param createdBy 
 * @param isActive 
 * @param postalCode 
 * @param stateName 
 * @param stateProvinceId 
 * @param street 
 * @param townVillage 
 * @param updatedBy 
 */


data class GetClientClientIdAddressesResponse (

    @Json(name = "addressId")
    val addressId: kotlin.Long? = null,

    @Json(name = "addressLine1")
    val addressLine1: kotlin.String? = null,

    @Json(name = "addressLine2")
    val addressLine2: kotlin.String? = null,

    @Json(name = "addressLine3")
    val addressLine3: kotlin.String? = null,

    @Json(name = "addressType")
    val addressType: kotlin.String? = null,

    @Json(name = "addressTypeId")
    val addressTypeId: kotlin.Long? = null,

    @Json(name = "city")
    val city: kotlin.String? = null,

    @Json(name = "client_id")
    val clientId: kotlin.Long? = null,

    @Json(name = "countryId")
    val countryId: kotlin.Long? = null,

    @Json(name = "countryName")
    val countryName: kotlin.String? = null,

    @Json(name = "countyDistrict")
    val countyDistrict: kotlin.String? = null,

    @Json(name = "createdBy")
    val createdBy: kotlin.String? = null,

    @Json(name = "isActive")
    val isActive: kotlin.Boolean? = null,

    @Json(name = "postalCode")
    val postalCode: kotlin.Long? = null,

    @Json(name = "stateName")
    val stateName: kotlin.String? = null,

    @Json(name = "stateProvinceId")
    val stateProvinceId: kotlin.Long? = null,

    @Json(name = "street")
    val street: kotlin.String? = null,

    @Json(name = "townVillage")
    val townVillage: kotlin.String? = null,

    @Json(name = "updatedBy")
    val updatedBy: kotlin.String? = null

) {


}


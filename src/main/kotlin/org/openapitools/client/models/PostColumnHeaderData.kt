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
 * 
 *
 * @param name 
 * @param type Any of them: Boolean | Date | DateTime | Decimal | Dropdown | Number | String | Text
 * @param code Used in Code Value fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned.
 * @param indexed Defaults to false
 * @param length Length of the text field. Mandatory if type String is used, otherwise an error is returned.
 * @param mandatory Defaults to false
 * @param unique Defaults to false
 */


data class PostColumnHeaderData (

    @Json(name = "name")
    val name: kotlin.String,

    /* Any of them: Boolean | Date | DateTime | Decimal | Dropdown | Number | String | Text */
    @Json(name = "type")
    val type: kotlin.String,

    /* Used in Code Value fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned. */
    @Json(name = "code")
    val code: kotlin.String? = null,

    /* Defaults to false */
    @Json(name = "indexed")
    val indexed: kotlin.Boolean? = null,

    /* Length of the text field. Mandatory if type String is used, otherwise an error is returned. */
    @Json(name = "length")
    val length: kotlin.Long? = null,

    /* Defaults to false */
    @Json(name = "mandatory")
    val mandatory: kotlin.Boolean? = null,

    /* Defaults to false */
    @Json(name = "unique")
    val unique: kotlin.Boolean? = null

) {


}


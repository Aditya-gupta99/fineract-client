package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path
import org.openapitools.client.models.ExternalServicesPropertiesData
import org.openapitools.client.models.PutExternalServiceRequest

interface ExternalServicesApi {
    /**
     * Retrieve External Services Configuration
     * Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP
     * Responses:
     *  - 200: OK
     *
     * @param servicename servicename
     * @return [ExternalServicesPropertiesData]
     */
    @GET("v1/externalservice/{servicename}")
    suspend fun retrieveOne2(@Path("servicename") servicename: String): ExternalServicesPropertiesData

    /**
     * Update External Service
     * Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3
     * Responses:
     *  - 200: OK
     *
     * @param servicename servicename
     * @param putExternalServiceRequest
     * @return [Unit]
     */
    @PUT("v1/externalservice/{servicename}")
    suspend fun updateExternalServiceProperties(
        @Path("servicename") servicename: String,
        @Body putExternalServiceRequest: PutExternalServiceRequest
    )

}

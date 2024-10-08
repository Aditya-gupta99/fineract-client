package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.Query


interface BulkLoansApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/loans/loanreassignment")
    suspend fun loanReassignment(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param fromLoanOfficerId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/loans/loanreassignment/template")
    suspend fun loanReassignmentTemplate(
        @Query("officeId") officeId: Long? = null,
        @Query("fromLoanOfficerId") fromLoanOfficerId: Long? = null
    ): String

}

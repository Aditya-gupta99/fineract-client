package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query


interface CashierJournalsApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param officeId  (optional)
     * @param tellerId  (optional)
     * @param cashierId  (optional)
     * @param dateRange  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/cashiersjournal")
    suspend fun getJournalData1(
        @Query("officeId") officeId: Long? = null,
        @Query("tellerId") tellerId: Long? = null,
        @Query("cashierId") cashierId: Long? = null,
        @Query("dateRange") dateRange: String? = null
    ): String

}

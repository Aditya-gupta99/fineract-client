package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.http.Body
import de.jensklingenberg.ktorfit.http.DELETE
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.HTTP
import de.jensklingenberg.ktorfit.http.POST
import de.jensklingenberg.ktorfit.http.PUT
import de.jensklingenberg.ktorfit.http.Path
import org.openapitools.client.models.DeleteDelinquencyBucketResponse
import org.openapitools.client.models.DeleteDelinquencyRangeResponse
import org.openapitools.client.models.GetDelinquencyBucketsResponse
import org.openapitools.client.models.GetDelinquencyRangesResponse
import org.openapitools.client.models.PostDelinquencyBucketRequest
import org.openapitools.client.models.PostDelinquencyBucketResponse
import org.openapitools.client.models.PostDelinquencyRangeRequest
import org.openapitools.client.models.PostDelinquencyRangeResponse
import org.openapitools.client.models.PutDelinquencyBucketResponse
import org.openapitools.client.models.PutDelinquencyRangeResponse

interface DelinquencyRangeAndBucketsManagementApi {
    /**
     * Create Delinquency Bucket
     *
     * Responses:
     *  - 200: OK
     *
     * @param postDelinquencyBucketRequest
     * @return [PostDelinquencyBucketResponse]
     */
    @POST("v1/delinquency/buckets")
    suspend fun createDelinquencyBucket(@Body postDelinquencyBucketRequest: PostDelinquencyBucketRequest): PostDelinquencyBucketResponse

    /**
     * Create Delinquency Range
     *
     * Responses:
     *  - 200: OK
     *
     * @param postDelinquencyRangeRequest
     * @return [PostDelinquencyRangeResponse]
     */
    @POST("v1/delinquency/ranges")
    suspend fun createDelinquencyRange(@Body postDelinquencyRangeRequest: PostDelinquencyRangeRequest): PostDelinquencyRangeResponse

    /**
     * Delete Delinquency Bucket based on the Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param delinquencyBucketId delinquencyBucketId
     * @param postDelinquencyBucketRequest
     * @return [DeleteDelinquencyBucketResponse]
     */
    @HTTP(method = "DELETE", path = "v1/delinquency/buckets/{delinquencyBucketId}", hasBody = true)
    suspend fun deleteDelinquencyBucket(
        @Path("delinquencyBucketId") delinquencyBucketId: Long,
        @Body postDelinquencyBucketRequest: PostDelinquencyBucketRequest
    ): DeleteDelinquencyBucketResponse

    /**
     * Update Delinquency Range based on the Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param delinquencyRangeId delinquencyRangeId
     * @param postDelinquencyRangeRequest
     * @return [DeleteDelinquencyRangeResponse]
     */
    @HTTP(method = "DELETE", path = "v1/delinquency/ranges/{delinquencyRangeId}", hasBody = true)
    suspend fun deleteDelinquencyRange(
        @Path("delinquencyRangeId") delinquencyRangeId: Long,
        @Body postDelinquencyRangeRequest: PostDelinquencyRangeRequest
    ): DeleteDelinquencyRangeResponse

    /**
     * Retrieve a specific Delinquency Bucket based on the Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param delinquencyBucketId delinquencyBucketId
     * @return [GetDelinquencyBucketsResponse]
     */
    @GET("v1/delinquency/buckets/{delinquencyBucketId}")
    suspend fun getDelinquencyBucket(@Path("delinquencyBucketId") delinquencyBucketId: Long): GetDelinquencyBucketsResponse

    /**
     * List all Delinquency Buckets
     *
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetDelinquencyBucketsResponse]
     */
    @GET("v1/delinquency/buckets")
    suspend fun getDelinquencyBuckets(): List<GetDelinquencyBucketsResponse>

    /**
     * Retrieve a specific Delinquency Range based on the Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param delinquencyRangeId delinquencyRangeId
     * @return [GetDelinquencyRangesResponse]
     */
    @GET("v1/delinquency/ranges/{delinquencyRangeId}")
    suspend fun getDelinquencyRange(@Path("delinquencyRangeId") delinquencyRangeId: Long): GetDelinquencyRangesResponse

    /**
     * List all Delinquency Ranges
     *
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetDelinquencyRangesResponse]
     */
    @GET("v1/delinquency/ranges")
    suspend fun getDelinquencyRanges(): List<GetDelinquencyRangesResponse>

    /**
     * Update Delinquency Bucket based on the Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param delinquencyBucketId delinquencyBucketId
     * @param postDelinquencyBucketRequest
     * @return [PutDelinquencyBucketResponse]
     */
    @PUT("v1/delinquency/buckets/{delinquencyBucketId}")
    suspend fun updateDelinquencyBucket(
        @Path("delinquencyBucketId") delinquencyBucketId: Long,
        @Body postDelinquencyBucketRequest: PostDelinquencyBucketRequest
    ): PutDelinquencyBucketResponse

    /**
     * Update Delinquency Range based on the Id
     *
     * Responses:
     *  - 200: OK
     *
     * @param delinquencyRangeId delinquencyRangeId
     * @param postDelinquencyRangeRequest
     * @return [PutDelinquencyRangeResponse]
     */
    @PUT("v1/delinquency/ranges/{delinquencyRangeId}")
    suspend fun updateDelinquencyRange(
        @Path("delinquencyRangeId") delinquencyRangeId: Long,
        @Body postDelinquencyRangeRequest: PostDelinquencyRangeRequest
    ): PutDelinquencyRangeResponse

}

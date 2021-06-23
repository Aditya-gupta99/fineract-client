/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.ExternalServicesPropertiesData;
import org.apache.fineract.client.models.PutExternalServiceRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExternalServicesApi {
  /**
   * Retrieve External Services Configuration
   * Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP
   * @param servicename servicename (required)
   * @return Observable&lt;ExternalServicesPropertiesData&gt;
   */
  @GET("externalservice/{servicename}")
  Observable<ExternalServicesPropertiesData> retrieveOne2(
    @retrofit2.http.Path("servicename") String servicename
  );

  /**
   * Update External Service
   * Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3
   * @param servicename servicename (required)
   * @param putExternalServiceRequest  (required)
   * @return Completable
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("externalservice/{servicename}")
  Completable updateExternalServiceProperties(
    @retrofit2.http.Path("servicename") String servicename, @retrofit2.http.Body PutExternalServiceRequest putExternalServiceRequest
  );

}

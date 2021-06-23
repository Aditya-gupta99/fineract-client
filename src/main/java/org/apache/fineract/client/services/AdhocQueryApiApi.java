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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AdhocQueryApiApi {
  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("adhocquery")
  Observable<String> createAdHocQuery(
    @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param adHocId adHocId (required)
   * @return Observable&lt;String&gt;
   */
  @DELETE("adhocquery/{adHocId}")
  Observable<String> deleteAdHocQuery(
    @retrofit2.http.Path("adHocId") Long adHocId
  );

  /**
   * 
   * 
   * @param adHocId adHocId (required)
   * @return Observable&lt;String&gt;
   */
  @GET("adhocquery/{adHocId}")
  Observable<String> retrieveAdHocQuery(
    @retrofit2.http.Path("adHocId") Long adHocId
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("adhocquery")
  Observable<String> retrieveAll2();
    

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("adhocquery/template")
  Observable<String> template();
    

  /**
   * 
   * 
   * @param adHocId adHocId (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("adhocquery/{adHocId}")
  Observable<String> update(
    @retrofit2.http.Path("adHocId") Long adHocId, @retrofit2.http.Body String body
  );

}

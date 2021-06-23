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

import org.apache.fineract.client.models.PostCollectionSheetRequest;
import org.apache.fineract.client.models.PostCollectionSheetResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CollectionSheetApi {
  /**
   * Generate Individual Collection Sheet | Save Collection Sheet
   * Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.
   * @param postCollectionSheetRequest  (required)
   * @param command command (optional)
   * @return Observable&lt;PostCollectionSheetResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("collectionsheet")
  Observable<PostCollectionSheetResponse> generateCollectionSheet(
    @retrofit2.http.Body PostCollectionSheetRequest postCollectionSheetRequest, @retrofit2.http.Query("command") String command
  );

}

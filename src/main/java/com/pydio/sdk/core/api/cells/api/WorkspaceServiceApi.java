/*
 * Pydio Cells Rest API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pydio.sdk.core.api.cells.api;

import com.pydio.sdk.core.api.cells.ApiCallback;
import com.pydio.sdk.core.api.cells.ApiClient;
import com.pydio.sdk.core.api.cells.ApiException;
import com.pydio.sdk.core.api.cells.ApiResponse;
import com.pydio.sdk.core.api.cells.Configuration;
import com.pydio.sdk.core.api.cells.Pair;
import com.pydio.sdk.core.api.cells.ProgressRequestBody;
import com.pydio.sdk.core.api.cells.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.pydio.sdk.core.api.cells.model.IdmWorkspace;
import com.pydio.sdk.core.api.cells.model.RestDeleteResponse;
import com.pydio.sdk.core.api.cells.model.RestSearchWorkspaceRequest;
import com.pydio.sdk.core.api.cells.model.RestWorkspaceCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkspaceServiceApi {
    private ApiClient apiClient;

    public WorkspaceServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkspaceServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteWorkspace
     * @param slug  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteWorkspaceCall(String slug, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspace/{Slug}"
            .replaceAll("\\{" + "Slug" + "\\}", apiClient.escapeString(slug.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteWorkspaceValidateBeforeCall(String slug, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'slug' is set
        if (slug == null) {
            throw new ApiException("Missing the required parameter 'slug' when calling deleteWorkspace(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteWorkspaceCall(slug, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete an existing workspace
     * 
     * @param slug  (required)
     * @return RestDeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestDeleteResponse deleteWorkspace(String slug) throws ApiException {
        ApiResponse<RestDeleteResponse> resp = deleteWorkspaceWithHttpInfo(slug);
        return resp.getData();
    }

    /**
     * Delete an existing workspace
     * 
     * @param slug  (required)
     * @return ApiResponse&lt;RestDeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestDeleteResponse> deleteWorkspaceWithHttpInfo(String slug) throws ApiException {
        com.squareup.okhttp.Call call = deleteWorkspaceValidateBeforeCall(slug, null, null);
        Type localVarReturnType = new TypeToken<RestDeleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete an existing workspace (asynchronously)
     * 
     * @param slug  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteWorkspaceAsync(String slug, final ApiCallback<RestDeleteResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteWorkspaceValidateBeforeCall(slug, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestDeleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putWorkspace
     * @param slug  (required)
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putWorkspaceCall(String slug, IdmWorkspace body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/workspace/{Slug}"
            .replaceAll("\\{" + "Slug" + "\\}", apiClient.escapeString(slug.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putWorkspaceValidateBeforeCall(String slug, IdmWorkspace body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'slug' is set
        if (slug == null) {
            throw new ApiException("Missing the required parameter 'slug' when calling putWorkspace(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling putWorkspace(Async)");
        }
        

        com.squareup.okhttp.Call call = putWorkspaceCall(slug, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create or update a workspace
     * 
     * @param slug  (required)
     * @param body  (required)
     * @return IdmWorkspace
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IdmWorkspace putWorkspace(String slug, IdmWorkspace body) throws ApiException {
        ApiResponse<IdmWorkspace> resp = putWorkspaceWithHttpInfo(slug, body);
        return resp.getData();
    }

    /**
     * Create or update a workspace
     * 
     * @param slug  (required)
     * @param body  (required)
     * @return ApiResponse&lt;IdmWorkspace&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IdmWorkspace> putWorkspaceWithHttpInfo(String slug, IdmWorkspace body) throws ApiException {
        com.squareup.okhttp.Call call = putWorkspaceValidateBeforeCall(slug, body, null, null);
        Type localVarReturnType = new TypeToken<IdmWorkspace>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create or update a workspace (asynchronously)
     * 
     * @param slug  (required)
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putWorkspaceAsync(String slug, IdmWorkspace body, final ApiCallback<IdmWorkspace> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putWorkspaceValidateBeforeCall(slug, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IdmWorkspace>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchWorkspaces
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchWorkspacesCall(RestSearchWorkspaceRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/workspace";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchWorkspacesValidateBeforeCall(RestSearchWorkspaceRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling searchWorkspaces(Async)");
        }
        

        com.squareup.okhttp.Call call = searchWorkspacesCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search workspaces on certain keys
     * 
     * @param body  (required)
     * @return RestWorkspaceCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestWorkspaceCollection searchWorkspaces(RestSearchWorkspaceRequest body) throws ApiException {
        ApiResponse<RestWorkspaceCollection> resp = searchWorkspacesWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Search workspaces on certain keys
     * 
     * @param body  (required)
     * @return ApiResponse&lt;RestWorkspaceCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestWorkspaceCollection> searchWorkspacesWithHttpInfo(RestSearchWorkspaceRequest body) throws ApiException {
        com.squareup.okhttp.Call call = searchWorkspacesValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<RestWorkspaceCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search workspaces on certain keys (asynchronously)
     * 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchWorkspacesAsync(RestSearchWorkspaceRequest body, final ApiCallback<RestWorkspaceCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchWorkspacesValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestWorkspaceCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

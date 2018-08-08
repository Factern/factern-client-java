/*
 * Factern API
 */


package com.factern.api;

import com.factern.ApiCallback;
import com.factern.ApiClient;
import com.factern.ApiException;
import com.factern.ApiResponse;
import com.factern.Configuration;
import com.factern.Pair;
import com.factern.ProgressRequestBody;
import com.factern.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.factern.model.AddLabelRequest;
import com.factern.model.AddLabelResponse;
import com.factern.model.AddStatementRequest;
import com.factern.model.AddStatementResponse;
import com.factern.model.CreateAliasRequest;
import com.factern.model.CreateAliasResponse;
import com.factern.model.CreateApplicationRequest;
import com.factern.model.CreateApplicationResponse;
import com.factern.model.CreateBidRequest;
import com.factern.model.CreateDomainRequest;
import com.factern.model.CreateDomainResponse;
import com.factern.model.CreateEntityRequest;
import com.factern.model.CreateEntityResponse;
import com.factern.model.CreateFieldRequest;
import com.factern.model.CreateFieldResponse;
import com.factern.model.CreateFilterRequest;
import com.factern.model.CreateFilterResponse;
import com.factern.model.CreateGroupRequest;
import com.factern.model.CreateGroupResponse;
import com.factern.model.CreateInformationRequest;
import com.factern.model.CreateInformationResponse;
import com.factern.model.CreateInterfaceRequest;
import com.factern.model.CreateInterfaceResponse;
import com.factern.model.CreateLabelListRequest;
import com.factern.model.CreateLabelListResponse;
import com.factern.model.CreateLoginRequest;
import com.factern.model.CreateLoginResponse;
import com.factern.model.CreateMemberRequest;
import com.factern.model.CreateMemberResponse;
import com.factern.model.CreateMirrorRequest;
import com.factern.model.CreateMirrorResponse;
import com.factern.model.CreatePermissionRequest;
import com.factern.model.CreatePermissionResponse;
import com.factern.model.CreatePriceRequest;
import com.factern.model.CreatePriceResponse;
import com.factern.model.CreateScopeRequest;
import com.factern.model.CreateScopeResponse;
import com.factern.model.CreateTemplateRequest;
import com.factern.model.CreateTemplateResponse;
import com.factern.model.CreateWatchRequest;
import com.factern.model.CreateWatchResponse;
import com.factern.model.DeleteRequest;
import com.factern.model.DeleteResponse;
import com.factern.model.DescribeRequest;
import com.factern.model.DescribeResponse;
import com.factern.model.EntityListResponse;
import com.factern.model.Information;
import com.factern.model.NodeIdRequest;
import com.factern.model.NodeListing;
import com.factern.model.ReadInformationRequest;
import com.factern.model.ReadInformationResponse;
import com.factern.model.ReadRequest;
import com.factern.model.ReadResponse;
import com.factern.model.ReplaceFieldRequest;
import com.factern.model.ResetLoginCredentialsRequest;
import com.factern.model.ResetLoginResponse;
import com.factern.model.SearchAliasRequest;
import com.factern.model.SearchAliasResponse;
import com.factern.model.SearchEntityRequest;
import com.factern.model.SettleAccountRequest;
import com.factern.model.SettleAccountResponse;
import com.factern.model.StandardNodeResponse;
import com.factern.model.UpdateApplicationRequest;
import com.factern.model.UpdateApplicationResponse;
import com.factern.model.UpdateStatusRequest;
import com.factern.model.WriteRequest;
import com.factern.model.WriteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactsApi {
    private ApiClient apiClient;

    public FactsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FactsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addMember
     * @param login  (optional)
     * @param representing  (optional)
     * @param createMemberRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addMemberCall(String login, String representing, CreateMemberRequest createMemberRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createMemberRequest;

        // create path and map variables
        String localVarPath = "/createmember";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addMemberValidateBeforeCall(String login, String representing, CreateMemberRequest createMemberRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = addMemberCall(login, representing, createMemberRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Member
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createMemberRequest  (optional)
     * @return CreateMemberResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateMemberResponse addMember(String login, String representing, CreateMemberRequest createMemberRequest) throws ApiException {
        ApiResponse<CreateMemberResponse> resp = addMemberWithHttpInfo(login, representing, createMemberRequest);
        return resp.getData();
    }

    /**
     * Create Member
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createMemberRequest  (optional)
     * @return ApiResponse&lt;CreateMemberResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateMemberResponse> addMemberWithHttpInfo(String login, String representing, CreateMemberRequest createMemberRequest) throws ApiException {
        com.squareup.okhttp.Call call = addMemberValidateBeforeCall(login, representing, createMemberRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateMemberResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Member (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createMemberRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMemberAsync(String login, String representing, CreateMemberRequest createMemberRequest, final ApiCallback<CreateMemberResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addMemberValidateBeforeCall(login, representing, createMemberRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateMemberResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for bid
     * @param login  (optional)
     * @param representing  (optional)
     * @param createBidRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call bidCall(String login, String representing, CreateBidRequest createBidRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createBidRequest;

        // create path and map variables
        String localVarPath = "/createbid";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call bidValidateBeforeCall(String login, String representing, CreateBidRequest createBidRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = bidCall(login, representing, createBidRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Bid
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createBidRequest  (optional)
     * @return StandardNodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardNodeResponse bid(String login, String representing, CreateBidRequest createBidRequest) throws ApiException {
        ApiResponse<StandardNodeResponse> resp = bidWithHttpInfo(login, representing, createBidRequest);
        return resp.getData();
    }

    /**
     * Create Bid
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createBidRequest  (optional)
     * @return ApiResponse&lt;StandardNodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardNodeResponse> bidWithHttpInfo(String login, String representing, CreateBidRequest createBidRequest) throws ApiException {
        com.squareup.okhttp.Call call = bidValidateBeforeCall(login, representing, createBidRequest, null, null);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Bid (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createBidRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bidAsync(String login, String representing, CreateBidRequest createBidRequest, final ApiCallback<StandardNodeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = bidValidateBeforeCall(login, representing, createBidRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createAlias
     * @param login  (optional)
     * @param representing  (optional)
     * @param createAliasRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAliasCall(String login, String representing, CreateAliasRequest createAliasRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createAliasRequest;

        // create path and map variables
        String localVarPath = "/createalias";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createAliasValidateBeforeCall(String login, String representing, CreateAliasRequest createAliasRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createAliasCall(login, representing, createAliasRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Alias
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createAliasRequest  (optional)
     * @return CreateAliasResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateAliasResponse createAlias(String login, String representing, CreateAliasRequest createAliasRequest) throws ApiException {
        ApiResponse<CreateAliasResponse> resp = createAliasWithHttpInfo(login, representing, createAliasRequest);
        return resp.getData();
    }

    /**
     * Create Alias
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createAliasRequest  (optional)
     * @return ApiResponse&lt;CreateAliasResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateAliasResponse> createAliasWithHttpInfo(String login, String representing, CreateAliasRequest createAliasRequest) throws ApiException {
        com.squareup.okhttp.Call call = createAliasValidateBeforeCall(login, representing, createAliasRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateAliasResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Alias (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createAliasRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAliasAsync(String login, String representing, CreateAliasRequest createAliasRequest, final ApiCallback<CreateAliasResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAliasValidateBeforeCall(login, representing, createAliasRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateAliasResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createApplication
     * @param login  (optional)
     * @param representing  (optional)
     * @param createApplicationRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createApplicationCall(String login, String representing, CreateApplicationRequest createApplicationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createApplicationRequest;

        // create path and map variables
        String localVarPath = "/createapplication";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createApplicationValidateBeforeCall(String login, String representing, CreateApplicationRequest createApplicationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createApplicationCall(login, representing, createApplicationRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Application
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createApplicationRequest  (optional)
     * @return CreateApplicationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateApplicationResponse createApplication(String login, String representing, CreateApplicationRequest createApplicationRequest) throws ApiException {
        ApiResponse<CreateApplicationResponse> resp = createApplicationWithHttpInfo(login, representing, createApplicationRequest);
        return resp.getData();
    }

    /**
     * Create Application
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createApplicationRequest  (optional)
     * @return ApiResponse&lt;CreateApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateApplicationResponse> createApplicationWithHttpInfo(String login, String representing, CreateApplicationRequest createApplicationRequest) throws ApiException {
        com.squareup.okhttp.Call call = createApplicationValidateBeforeCall(login, representing, createApplicationRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateApplicationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Application (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createApplicationRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createApplicationAsync(String login, String representing, CreateApplicationRequest createApplicationRequest, final ApiCallback<CreateApplicationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createApplicationValidateBeforeCall(login, representing, createApplicationRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateApplicationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createDomain
     * @param login  (optional)
     * @param representing  (optional)
     * @param createDomainRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDomainCall(String login, String representing, CreateDomainRequest createDomainRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createDomainRequest;

        // create path and map variables
        String localVarPath = "/createdomain";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createDomainValidateBeforeCall(String login, String representing, CreateDomainRequest createDomainRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createDomainCall(login, representing, createDomainRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Domain
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createDomainRequest  (optional)
     * @return CreateDomainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateDomainResponse createDomain(String login, String representing, CreateDomainRequest createDomainRequest) throws ApiException {
        ApiResponse<CreateDomainResponse> resp = createDomainWithHttpInfo(login, representing, createDomainRequest);
        return resp.getData();
    }

    /**
     * Create Domain
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createDomainRequest  (optional)
     * @return ApiResponse&lt;CreateDomainResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateDomainResponse> createDomainWithHttpInfo(String login, String representing, CreateDomainRequest createDomainRequest) throws ApiException {
        com.squareup.okhttp.Call call = createDomainValidateBeforeCall(login, representing, createDomainRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateDomainResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Domain (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createDomainRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDomainAsync(String login, String representing, CreateDomainRequest createDomainRequest, final ApiCallback<CreateDomainResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDomainValidateBeforeCall(login, representing, createDomainRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateDomainResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createEntity
     * @param login  (optional)
     * @param representing  (optional)
     * @param createEntityRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createEntityCall(String login, String representing, CreateEntityRequest createEntityRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createEntityRequest;

        // create path and map variables
        String localVarPath = "/createentity";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createEntityValidateBeforeCall(String login, String representing, CreateEntityRequest createEntityRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createEntityCall(login, representing, createEntityRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Entity
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createEntityRequest  (optional)
     * @return CreateEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateEntityResponse createEntity(String login, String representing, CreateEntityRequest createEntityRequest) throws ApiException {
        ApiResponse<CreateEntityResponse> resp = createEntityWithHttpInfo(login, representing, createEntityRequest);
        return resp.getData();
    }

    /**
     * Create Entity
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createEntityRequest  (optional)
     * @return ApiResponse&lt;CreateEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateEntityResponse> createEntityWithHttpInfo(String login, String representing, CreateEntityRequest createEntityRequest) throws ApiException {
        com.squareup.okhttp.Call call = createEntityValidateBeforeCall(login, representing, createEntityRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateEntityResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Entity (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createEntityRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createEntityAsync(String login, String representing, CreateEntityRequest createEntityRequest, final ApiCallback<CreateEntityResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createEntityValidateBeforeCall(login, representing, createEntityRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateEntityResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createField
     * @param login  (optional)
     * @param representing  (optional)
     * @param createFieldRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFieldCall(String login, String representing, CreateFieldRequest createFieldRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createFieldRequest;

        // create path and map variables
        String localVarPath = "/createfield";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createFieldValidateBeforeCall(String login, String representing, CreateFieldRequest createFieldRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createFieldCall(login, representing, createFieldRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Field
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createFieldRequest  (optional)
     * @return CreateFieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateFieldResponse createField(String login, String representing, CreateFieldRequest createFieldRequest) throws ApiException {
        ApiResponse<CreateFieldResponse> resp = createFieldWithHttpInfo(login, representing, createFieldRequest);
        return resp.getData();
    }

    /**
     * Create Field
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createFieldRequest  (optional)
     * @return ApiResponse&lt;CreateFieldResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateFieldResponse> createFieldWithHttpInfo(String login, String representing, CreateFieldRequest createFieldRequest) throws ApiException {
        com.squareup.okhttp.Call call = createFieldValidateBeforeCall(login, representing, createFieldRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateFieldResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Field (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createFieldRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFieldAsync(String login, String representing, CreateFieldRequest createFieldRequest, final ApiCallback<CreateFieldResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createFieldValidateBeforeCall(login, representing, createFieldRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateFieldResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createFilter
     * @param login  (optional)
     * @param representing  (optional)
     * @param createFilterRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFilterCall(String login, String representing, CreateFilterRequest createFilterRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createFilterRequest;

        // create path and map variables
        String localVarPath = "/createfilter";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createFilterValidateBeforeCall(String login, String representing, CreateFilterRequest createFilterRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createFilterCall(login, representing, createFilterRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Filter
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createFilterRequest  (optional)
     * @return CreateFilterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateFilterResponse createFilter(String login, String representing, CreateFilterRequest createFilterRequest) throws ApiException {
        ApiResponse<CreateFilterResponse> resp = createFilterWithHttpInfo(login, representing, createFilterRequest);
        return resp.getData();
    }

    /**
     * Create Filter
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createFilterRequest  (optional)
     * @return ApiResponse&lt;CreateFilterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateFilterResponse> createFilterWithHttpInfo(String login, String representing, CreateFilterRequest createFilterRequest) throws ApiException {
        com.squareup.okhttp.Call call = createFilterValidateBeforeCall(login, representing, createFilterRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateFilterResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Filter (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createFilterRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFilterAsync(String login, String representing, CreateFilterRequest createFilterRequest, final ApiCallback<CreateFilterResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createFilterValidateBeforeCall(login, representing, createFilterRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateFilterResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createGroup
     * @param login  (optional)
     * @param representing  (optional)
     * @param createGroupRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createGroupCall(String login, String representing, CreateGroupRequest createGroupRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createGroupRequest;

        // create path and map variables
        String localVarPath = "/creategroup";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createGroupValidateBeforeCall(String login, String representing, CreateGroupRequest createGroupRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createGroupCall(login, representing, createGroupRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Group
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createGroupRequest  (optional)
     * @return CreateGroupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateGroupResponse createGroup(String login, String representing, CreateGroupRequest createGroupRequest) throws ApiException {
        ApiResponse<CreateGroupResponse> resp = createGroupWithHttpInfo(login, representing, createGroupRequest);
        return resp.getData();
    }

    /**
     * Create Group
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createGroupRequest  (optional)
     * @return ApiResponse&lt;CreateGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateGroupResponse> createGroupWithHttpInfo(String login, String representing, CreateGroupRequest createGroupRequest) throws ApiException {
        com.squareup.okhttp.Call call = createGroupValidateBeforeCall(login, representing, createGroupRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateGroupResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Group (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createGroupRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createGroupAsync(String login, String representing, CreateGroupRequest createGroupRequest, final ApiCallback<CreateGroupResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createGroupValidateBeforeCall(login, representing, createGroupRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateGroupResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createInformation
     * @param login  (optional)
     * @param representing  (optional)
     * @param createInformationRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createInformationCall(String login, String representing, CreateInformationRequest createInformationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createInformationRequest;

        // create path and map variables
        String localVarPath = "/createinformation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createInformationValidateBeforeCall(String login, String representing, CreateInformationRequest createInformationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createInformationCall(login, representing, createInformationRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Information
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createInformationRequest  (optional)
     * @return CreateInformationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateInformationResponse createInformation(String login, String representing, CreateInformationRequest createInformationRequest) throws ApiException {
        ApiResponse<CreateInformationResponse> resp = createInformationWithHttpInfo(login, representing, createInformationRequest);
        return resp.getData();
    }

    /**
     * Create Information
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createInformationRequest  (optional)
     * @return ApiResponse&lt;CreateInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateInformationResponse> createInformationWithHttpInfo(String login, String representing, CreateInformationRequest createInformationRequest) throws ApiException {
        com.squareup.okhttp.Call call = createInformationValidateBeforeCall(login, representing, createInformationRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateInformationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Information (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createInformationRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createInformationAsync(String login, String representing, CreateInformationRequest createInformationRequest, final ApiCallback<CreateInformationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createInformationValidateBeforeCall(login, representing, createInformationRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateInformationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createInterface
     * @param login  (optional)
     * @param representing  (optional)
     * @param createInterfaceRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createInterfaceCall(String login, String representing, CreateInterfaceRequest createInterfaceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createInterfaceRequest;

        // create path and map variables
        String localVarPath = "/createinterface";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createInterfaceValidateBeforeCall(String login, String representing, CreateInterfaceRequest createInterfaceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createInterfaceCall(login, representing, createInterfaceRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Interface
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createInterfaceRequest  (optional)
     * @return CreateInterfaceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateInterfaceResponse createInterface(String login, String representing, CreateInterfaceRequest createInterfaceRequest) throws ApiException {
        ApiResponse<CreateInterfaceResponse> resp = createInterfaceWithHttpInfo(login, representing, createInterfaceRequest);
        return resp.getData();
    }

    /**
     * Create Interface
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createInterfaceRequest  (optional)
     * @return ApiResponse&lt;CreateInterfaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateInterfaceResponse> createInterfaceWithHttpInfo(String login, String representing, CreateInterfaceRequest createInterfaceRequest) throws ApiException {
        com.squareup.okhttp.Call call = createInterfaceValidateBeforeCall(login, representing, createInterfaceRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateInterfaceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Interface (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createInterfaceRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createInterfaceAsync(String login, String representing, CreateInterfaceRequest createInterfaceRequest, final ApiCallback<CreateInterfaceResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createInterfaceValidateBeforeCall(login, representing, createInterfaceRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateInterfaceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createLabelList
     * @param login  (optional)
     * @param representing  (optional)
     * @param createLabelListRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createLabelListCall(String login, String representing, CreateLabelListRequest createLabelListRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createLabelListRequest;

        // create path and map variables
        String localVarPath = "/createlabellist";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createLabelListValidateBeforeCall(String login, String representing, CreateLabelListRequest createLabelListRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createLabelListCall(login, representing, createLabelListRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Label List
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createLabelListRequest  (optional)
     * @return CreateLabelListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateLabelListResponse createLabelList(String login, String representing, CreateLabelListRequest createLabelListRequest) throws ApiException {
        ApiResponse<CreateLabelListResponse> resp = createLabelListWithHttpInfo(login, representing, createLabelListRequest);
        return resp.getData();
    }

    /**
     * Create Label List
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createLabelListRequest  (optional)
     * @return ApiResponse&lt;CreateLabelListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateLabelListResponse> createLabelListWithHttpInfo(String login, String representing, CreateLabelListRequest createLabelListRequest) throws ApiException {
        com.squareup.okhttp.Call call = createLabelListValidateBeforeCall(login, representing, createLabelListRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateLabelListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Label List (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createLabelListRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createLabelListAsync(String login, String representing, CreateLabelListRequest createLabelListRequest, final ApiCallback<CreateLabelListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createLabelListValidateBeforeCall(login, representing, createLabelListRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateLabelListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createLogin
     * @param login  (optional)
     * @param representing  (optional)
     * @param createLoginRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createLoginCall(String login, String representing, CreateLoginRequest createLoginRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createLoginRequest;

        // create path and map variables
        String localVarPath = "/createlogin";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createLoginValidateBeforeCall(String login, String representing, CreateLoginRequest createLoginRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createLoginCall(login, representing, createLoginRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Login
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createLoginRequest  (optional)
     * @return CreateLoginResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateLoginResponse createLogin(String login, String representing, CreateLoginRequest createLoginRequest) throws ApiException {
        ApiResponse<CreateLoginResponse> resp = createLoginWithHttpInfo(login, representing, createLoginRequest);
        return resp.getData();
    }

    /**
     * Create Login
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createLoginRequest  (optional)
     * @return ApiResponse&lt;CreateLoginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateLoginResponse> createLoginWithHttpInfo(String login, String representing, CreateLoginRequest createLoginRequest) throws ApiException {
        com.squareup.okhttp.Call call = createLoginValidateBeforeCall(login, representing, createLoginRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateLoginResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Login (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createLoginRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createLoginAsync(String login, String representing, CreateLoginRequest createLoginRequest, final ApiCallback<CreateLoginResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createLoginValidateBeforeCall(login, representing, createLoginRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateLoginResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createMirror
     * @param login  (optional)
     * @param representing  (optional)
     * @param createMirrorRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createMirrorCall(String login, String representing, CreateMirrorRequest createMirrorRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createMirrorRequest;

        // create path and map variables
        String localVarPath = "/createmirror";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createMirrorValidateBeforeCall(String login, String representing, CreateMirrorRequest createMirrorRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createMirrorCall(login, representing, createMirrorRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Mirror
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createMirrorRequest  (optional)
     * @return CreateMirrorResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateMirrorResponse createMirror(String login, String representing, CreateMirrorRequest createMirrorRequest) throws ApiException {
        ApiResponse<CreateMirrorResponse> resp = createMirrorWithHttpInfo(login, representing, createMirrorRequest);
        return resp.getData();
    }

    /**
     * Create Mirror
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createMirrorRequest  (optional)
     * @return ApiResponse&lt;CreateMirrorResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateMirrorResponse> createMirrorWithHttpInfo(String login, String representing, CreateMirrorRequest createMirrorRequest) throws ApiException {
        com.squareup.okhttp.Call call = createMirrorValidateBeforeCall(login, representing, createMirrorRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateMirrorResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Mirror (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createMirrorRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createMirrorAsync(String login, String representing, CreateMirrorRequest createMirrorRequest, final ApiCallback<CreateMirrorResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createMirrorValidateBeforeCall(login, representing, createMirrorRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateMirrorResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createPrice
     * @param login  (optional)
     * @param representing  (optional)
     * @param createPriceRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createPriceCall(String login, String representing, CreatePriceRequest createPriceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createPriceRequest;

        // create path and map variables
        String localVarPath = "/createprice";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createPriceValidateBeforeCall(String login, String representing, CreatePriceRequest createPriceRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createPriceCall(login, representing, createPriceRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Price
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createPriceRequest  (optional)
     * @return CreatePriceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreatePriceResponse createPrice(String login, String representing, CreatePriceRequest createPriceRequest) throws ApiException {
        ApiResponse<CreatePriceResponse> resp = createPriceWithHttpInfo(login, representing, createPriceRequest);
        return resp.getData();
    }

    /**
     * Create Price
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createPriceRequest  (optional)
     * @return ApiResponse&lt;CreatePriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreatePriceResponse> createPriceWithHttpInfo(String login, String representing, CreatePriceRequest createPriceRequest) throws ApiException {
        com.squareup.okhttp.Call call = createPriceValidateBeforeCall(login, representing, createPriceRequest, null, null);
        Type localVarReturnType = new TypeToken<CreatePriceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Price (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createPriceRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPriceAsync(String login, String representing, CreatePriceRequest createPriceRequest, final ApiCallback<CreatePriceResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createPriceValidateBeforeCall(login, representing, createPriceRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreatePriceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createScope
     * @param login  (optional)
     * @param representing  (optional)
     * @param createScopeRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createScopeCall(String login, String representing, CreateScopeRequest createScopeRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createScopeRequest;

        // create path and map variables
        String localVarPath = "/createscope";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createScopeValidateBeforeCall(String login, String representing, CreateScopeRequest createScopeRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createScopeCall(login, representing, createScopeRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Scope
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createScopeRequest  (optional)
     * @return CreateScopeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateScopeResponse createScope(String login, String representing, CreateScopeRequest createScopeRequest) throws ApiException {
        ApiResponse<CreateScopeResponse> resp = createScopeWithHttpInfo(login, representing, createScopeRequest);
        return resp.getData();
    }

    /**
     * Create Scope
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createScopeRequest  (optional)
     * @return ApiResponse&lt;CreateScopeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateScopeResponse> createScopeWithHttpInfo(String login, String representing, CreateScopeRequest createScopeRequest) throws ApiException {
        com.squareup.okhttp.Call call = createScopeValidateBeforeCall(login, representing, createScopeRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateScopeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Scope (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createScopeRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createScopeAsync(String login, String representing, CreateScopeRequest createScopeRequest, final ApiCallback<CreateScopeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createScopeValidateBeforeCall(login, representing, createScopeRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateScopeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createStatement
     * @param login  (optional)
     * @param representing  (optional)
     * @param addStatementRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createStatementCall(String login, String representing, AddStatementRequest addStatementRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = addStatementRequest;

        // create path and map variables
        String localVarPath = "/createstatement";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createStatementValidateBeforeCall(String login, String representing, AddStatementRequest addStatementRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createStatementCall(login, representing, addStatementRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Statement
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param addStatementRequest  (optional)
     * @return AddStatementResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddStatementResponse createStatement(String login, String representing, AddStatementRequest addStatementRequest) throws ApiException {
        ApiResponse<AddStatementResponse> resp = createStatementWithHttpInfo(login, representing, addStatementRequest);
        return resp.getData();
    }

    /**
     * Create Statement
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param addStatementRequest  (optional)
     * @return ApiResponse&lt;AddStatementResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddStatementResponse> createStatementWithHttpInfo(String login, String representing, AddStatementRequest addStatementRequest) throws ApiException {
        com.squareup.okhttp.Call call = createStatementValidateBeforeCall(login, representing, addStatementRequest, null, null);
        Type localVarReturnType = new TypeToken<AddStatementResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Statement (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param addStatementRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createStatementAsync(String login, String representing, AddStatementRequest addStatementRequest, final ApiCallback<AddStatementResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createStatementValidateBeforeCall(login, representing, addStatementRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddStatementResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createTemplate
     * @param login  (optional)
     * @param representing  (optional)
     * @param createTemplateRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createTemplateCall(String login, String representing, CreateTemplateRequest createTemplateRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createTemplateRequest;

        // create path and map variables
        String localVarPath = "/createtemplate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createTemplateValidateBeforeCall(String login, String representing, CreateTemplateRequest createTemplateRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createTemplateCall(login, representing, createTemplateRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Template
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createTemplateRequest  (optional)
     * @return CreateTemplateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateTemplateResponse createTemplate(String login, String representing, CreateTemplateRequest createTemplateRequest) throws ApiException {
        ApiResponse<CreateTemplateResponse> resp = createTemplateWithHttpInfo(login, representing, createTemplateRequest);
        return resp.getData();
    }

    /**
     * Create Template
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createTemplateRequest  (optional)
     * @return ApiResponse&lt;CreateTemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateTemplateResponse> createTemplateWithHttpInfo(String login, String representing, CreateTemplateRequest createTemplateRequest) throws ApiException {
        com.squareup.okhttp.Call call = createTemplateValidateBeforeCall(login, representing, createTemplateRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateTemplateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Template (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createTemplateRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTemplateAsync(String login, String representing, CreateTemplateRequest createTemplateRequest, final ApiCallback<CreateTemplateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createTemplateValidateBeforeCall(login, representing, createTemplateRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateTemplateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param login  (optional)
     * @param representing  (optional)
     * @param deleteRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(String login, String representing, DeleteRequest deleteRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deleteRequest;

        // create path and map variables
        String localVarPath = "/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteValidateBeforeCall(String login, String representing, DeleteRequest deleteRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = deleteCall(login, representing, deleteRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deleting
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param deleteRequest  (optional)
     * @return DeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteResponse delete(String login, String representing, DeleteRequest deleteRequest) throws ApiException {
        ApiResponse<DeleteResponse> resp = deleteWithHttpInfo(login, representing, deleteRequest);
        return resp.getData();
    }

    /**
     * Deleting
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param deleteRequest  (optional)
     * @return ApiResponse&lt;DeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteResponse> deleteWithHttpInfo(String login, String representing, DeleteRequest deleteRequest) throws ApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(login, representing, deleteRequest, null, null);
        Type localVarReturnType = new TypeToken<DeleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deleting (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param deleteRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(String login, String representing, DeleteRequest deleteRequest, final ApiCallback<DeleteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(login, representing, deleteRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteNode
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNodeCall(String login, String representing, NodeIdRequest nodeIdRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = nodeIdRequest;

        // create path and map variables
        String localVarPath = "/deletenode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteNodeValidateBeforeCall(String login, String representing, NodeIdRequest nodeIdRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = deleteNodeCall(login, representing, nodeIdRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete Node
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @return StandardNodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardNodeResponse deleteNode(String login, String representing, NodeIdRequest nodeIdRequest) throws ApiException {
        ApiResponse<StandardNodeResponse> resp = deleteNodeWithHttpInfo(login, representing, nodeIdRequest);
        return resp.getData();
    }

    /**
     * Delete Node
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @return ApiResponse&lt;StandardNodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardNodeResponse> deleteNodeWithHttpInfo(String login, String representing, NodeIdRequest nodeIdRequest) throws ApiException {
        com.squareup.okhttp.Call call = deleteNodeValidateBeforeCall(login, representing, nodeIdRequest, null, null);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Node (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNodeAsync(String login, String representing, NodeIdRequest nodeIdRequest, final ApiCallback<StandardNodeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteNodeValidateBeforeCall(login, representing, nodeIdRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for describe
     * @param login  (optional)
     * @param representing  (optional)
     * @param describeRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call describeCall(String login, String representing, DescribeRequest describeRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = describeRequest;

        // create path and map variables
        String localVarPath = "/describe";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call describeValidateBeforeCall(String login, String representing, DescribeRequest describeRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = describeCall(login, representing, describeRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Describe
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param describeRequest  (optional)
     * @return DescribeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DescribeResponse describe(String login, String representing, DescribeRequest describeRequest) throws ApiException {
        ApiResponse<DescribeResponse> resp = describeWithHttpInfo(login, representing, describeRequest);
        return resp.getData();
    }

    /**
     * Describe
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param describeRequest  (optional)
     * @return ApiResponse&lt;DescribeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DescribeResponse> describeWithHttpInfo(String login, String representing, DescribeRequest describeRequest) throws ApiException {
        com.squareup.okhttp.Call call = describeValidateBeforeCall(login, representing, describeRequest, null, null);
        Type localVarReturnType = new TypeToken<DescribeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Describe (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param describeRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call describeAsync(String login, String representing, DescribeRequest describeRequest, final ApiCallback<DescribeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = describeValidateBeforeCall(login, representing, describeRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DescribeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for history
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call historyCall(String login, String representing, NodeIdRequest nodeIdRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = nodeIdRequest;

        // create path and map variables
        String localVarPath = "/history";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call historyValidateBeforeCall(String login, String representing, NodeIdRequest nodeIdRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = historyCall(login, representing, nodeIdRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * History
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @return NodeListing
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NodeListing history(String login, String representing, NodeIdRequest nodeIdRequest) throws ApiException {
        ApiResponse<NodeListing> resp = historyWithHttpInfo(login, representing, nodeIdRequest);
        return resp.getData();
    }

    /**
     * History
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @return ApiResponse&lt;NodeListing&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NodeListing> historyWithHttpInfo(String login, String representing, NodeIdRequest nodeIdRequest) throws ApiException {
        com.squareup.okhttp.Call call = historyValidateBeforeCall(login, representing, nodeIdRequest, null, null);
        Type localVarReturnType = new TypeToken<NodeListing>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * History (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call historyAsync(String login, String representing, NodeIdRequest nodeIdRequest, final ApiCallback<NodeListing> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = historyValidateBeforeCall(login, representing, nodeIdRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NodeListing>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for label
     * @param login  (optional)
     * @param representing  (optional)
     * @param addLabelRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call labelCall(String login, String representing, AddLabelRequest addLabelRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = addLabelRequest;

        // create path and map variables
        String localVarPath = "/label";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call labelValidateBeforeCall(String login, String representing, AddLabelRequest addLabelRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = labelCall(login, representing, addLabelRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Label a Node
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param addLabelRequest  (optional)
     * @return AddLabelResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddLabelResponse label(String login, String representing, AddLabelRequest addLabelRequest) throws ApiException {
        ApiResponse<AddLabelResponse> resp = labelWithHttpInfo(login, representing, addLabelRequest);
        return resp.getData();
    }

    /**
     * Label a Node
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param addLabelRequest  (optional)
     * @return ApiResponse&lt;AddLabelResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddLabelResponse> labelWithHttpInfo(String login, String representing, AddLabelRequest addLabelRequest) throws ApiException {
        com.squareup.okhttp.Call call = labelValidateBeforeCall(login, representing, addLabelRequest, null, null);
        Type localVarReturnType = new TypeToken<AddLabelResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Label a Node (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param addLabelRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call labelAsync(String login, String representing, AddLabelRequest addLabelRequest, final ApiCallback<AddLabelResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = labelValidateBeforeCall(login, representing, addLabelRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddLabelResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for obliterate
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call obliterateCall(String login, String representing, NodeIdRequest nodeIdRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = nodeIdRequest;

        // create path and map variables
        String localVarPath = "/obliterate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call obliterateValidateBeforeCall(String login, String representing, NodeIdRequest nodeIdRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = obliterateCall(login, representing, nodeIdRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Obliterating Information Nodes
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @return StandardNodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardNodeResponse obliterate(String login, String representing, NodeIdRequest nodeIdRequest) throws ApiException {
        ApiResponse<StandardNodeResponse> resp = obliterateWithHttpInfo(login, representing, nodeIdRequest);
        return resp.getData();
    }

    /**
     * Obliterating Information Nodes
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @return ApiResponse&lt;StandardNodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardNodeResponse> obliterateWithHttpInfo(String login, String representing, NodeIdRequest nodeIdRequest) throws ApiException {
        com.squareup.okhttp.Call call = obliterateValidateBeforeCall(login, representing, nodeIdRequest, null, null);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obliterating Information Nodes (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call obliterateAsync(String login, String representing, NodeIdRequest nodeIdRequest, final ApiCallback<StandardNodeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = obliterateValidateBeforeCall(login, representing, nodeIdRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for permission
     * @param login  (optional)
     * @param representing  (optional)
     * @param createPermissionRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call permissionCall(String login, String representing, CreatePermissionRequest createPermissionRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createPermissionRequest;

        // create path and map variables
        String localVarPath = "/permission";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call permissionValidateBeforeCall(String login, String representing, CreatePermissionRequest createPermissionRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = permissionCall(login, representing, createPermissionRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Permission
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createPermissionRequest  (optional)
     * @return CreatePermissionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreatePermissionResponse permission(String login, String representing, CreatePermissionRequest createPermissionRequest) throws ApiException {
        ApiResponse<CreatePermissionResponse> resp = permissionWithHttpInfo(login, representing, createPermissionRequest);
        return resp.getData();
    }

    /**
     * Create Permission
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createPermissionRequest  (optional)
     * @return ApiResponse&lt;CreatePermissionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreatePermissionResponse> permissionWithHttpInfo(String login, String representing, CreatePermissionRequest createPermissionRequest) throws ApiException {
        com.squareup.okhttp.Call call = permissionValidateBeforeCall(login, representing, createPermissionRequest, null, null);
        Type localVarReturnType = new TypeToken<CreatePermissionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Permission (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createPermissionRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call permissionAsync(String login, String representing, CreatePermissionRequest createPermissionRequest, final ApiCallback<CreatePermissionResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = permissionValidateBeforeCall(login, representing, createPermissionRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreatePermissionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for read
     * @param login  (optional)
     * @param representing  (optional)
     * @param readRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readCall(String login, String representing, ReadRequest readRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = readRequest;

        // create path and map variables
        String localVarPath = "/read";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call readValidateBeforeCall(String login, String representing, ReadRequest readRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = readCall(login, representing, readRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Reading
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param readRequest  (optional)
     * @return ReadResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReadResponse read(String login, String representing, ReadRequest readRequest) throws ApiException {
        ApiResponse<ReadResponse> resp = readWithHttpInfo(login, representing, readRequest);
        return resp.getData();
    }

    /**
     * Reading
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param readRequest  (optional)
     * @return ApiResponse&lt;ReadResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReadResponse> readWithHttpInfo(String login, String representing, ReadRequest readRequest) throws ApiException {
        com.squareup.okhttp.Call call = readValidateBeforeCall(login, representing, readRequest, null, null);
        Type localVarReturnType = new TypeToken<ReadResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Reading (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param readRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readAsync(String login, String representing, ReadRequest readRequest, final ApiCallback<ReadResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readValidateBeforeCall(login, representing, readRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReadResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readInformation
     * @param login  (optional)
     * @param representing  (optional)
     * @param readInformationRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readInformationCall(String login, String representing, ReadInformationRequest readInformationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = readInformationRequest;

        // create path and map variables
        String localVarPath = "/readinformation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call readInformationValidateBeforeCall(String login, String representing, ReadInformationRequest readInformationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = readInformationCall(login, representing, readInformationRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read Information
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param readInformationRequest  (optional)
     * @return ReadInformationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReadInformationResponse readInformation(String login, String representing, ReadInformationRequest readInformationRequest) throws ApiException {
        ApiResponse<ReadInformationResponse> resp = readInformationWithHttpInfo(login, representing, readInformationRequest);
        return resp.getData();
    }

    /**
     * Read Information
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param readInformationRequest  (optional)
     * @return ApiResponse&lt;ReadInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReadInformationResponse> readInformationWithHttpInfo(String login, String representing, ReadInformationRequest readInformationRequest) throws ApiException {
        com.squareup.okhttp.Call call = readInformationValidateBeforeCall(login, representing, readInformationRequest, null, null);
        Type localVarReturnType = new TypeToken<ReadInformationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Information (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param readInformationRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readInformationAsync(String login, String representing, ReadInformationRequest readInformationRequest, final ApiCallback<ReadInformationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readInformationValidateBeforeCall(login, representing, readInformationRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReadInformationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for replaceInformation
     * @param login  (optional)
     * @param representing  (optional)
     * @param replaceFieldRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call replaceInformationCall(String login, String representing, ReplaceFieldRequest replaceFieldRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = replaceFieldRequest;

        // create path and map variables
        String localVarPath = "/replaceinformation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call replaceInformationValidateBeforeCall(String login, String representing, ReplaceFieldRequest replaceFieldRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = replaceInformationCall(login, representing, replaceFieldRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Replace
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param replaceFieldRequest  (optional)
     * @return Information
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Information replaceInformation(String login, String representing, ReplaceFieldRequest replaceFieldRequest) throws ApiException {
        ApiResponse<Information> resp = replaceInformationWithHttpInfo(login, representing, replaceFieldRequest);
        return resp.getData();
    }

    /**
     * Replace
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param replaceFieldRequest  (optional)
     * @return ApiResponse&lt;Information&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Information> replaceInformationWithHttpInfo(String login, String representing, ReplaceFieldRequest replaceFieldRequest) throws ApiException {
        com.squareup.okhttp.Call call = replaceInformationValidateBeforeCall(login, representing, replaceFieldRequest, null, null);
        Type localVarReturnType = new TypeToken<Information>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replace (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param replaceFieldRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call replaceInformationAsync(String login, String representing, ReplaceFieldRequest replaceFieldRequest, final ApiCallback<Information> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = replaceInformationValidateBeforeCall(login, representing, replaceFieldRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Information>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for requestPermission
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call requestPermissionCall(String login, String representing, NodeIdRequest nodeIdRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = nodeIdRequest;

        // create path and map variables
        String localVarPath = "/requestpermission";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call requestPermissionValidateBeforeCall(String login, String representing, NodeIdRequest nodeIdRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = requestPermissionCall(login, representing, nodeIdRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Request Permission
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @return StandardNodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardNodeResponse requestPermission(String login, String representing, NodeIdRequest nodeIdRequest) throws ApiException {
        ApiResponse<StandardNodeResponse> resp = requestPermissionWithHttpInfo(login, representing, nodeIdRequest);
        return resp.getData();
    }

    /**
     * Request Permission
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @return ApiResponse&lt;StandardNodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardNodeResponse> requestPermissionWithHttpInfo(String login, String representing, NodeIdRequest nodeIdRequest) throws ApiException {
        com.squareup.okhttp.Call call = requestPermissionValidateBeforeCall(login, representing, nodeIdRequest, null, null);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Request Permission (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param nodeIdRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call requestPermissionAsync(String login, String representing, NodeIdRequest nodeIdRequest, final ApiCallback<StandardNodeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = requestPermissionValidateBeforeCall(login, representing, nodeIdRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for resetLogin
     * @param login  (optional)
     * @param representing  (optional)
     * @param resetLoginCredentialsRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call resetLoginCall(String login, String representing, ResetLoginCredentialsRequest resetLoginCredentialsRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = resetLoginCredentialsRequest;

        // create path and map variables
        String localVarPath = "/resetlogin";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call resetLoginValidateBeforeCall(String login, String representing, ResetLoginCredentialsRequest resetLoginCredentialsRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = resetLoginCall(login, representing, resetLoginCredentialsRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Changing Login Password
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param resetLoginCredentialsRequest  (optional)
     * @return ResetLoginResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResetLoginResponse resetLogin(String login, String representing, ResetLoginCredentialsRequest resetLoginCredentialsRequest) throws ApiException {
        ApiResponse<ResetLoginResponse> resp = resetLoginWithHttpInfo(login, representing, resetLoginCredentialsRequest);
        return resp.getData();
    }

    /**
     * Changing Login Password
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param resetLoginCredentialsRequest  (optional)
     * @return ApiResponse&lt;ResetLoginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResetLoginResponse> resetLoginWithHttpInfo(String login, String representing, ResetLoginCredentialsRequest resetLoginCredentialsRequest) throws ApiException {
        com.squareup.okhttp.Call call = resetLoginValidateBeforeCall(login, representing, resetLoginCredentialsRequest, null, null);
        Type localVarReturnType = new TypeToken<ResetLoginResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Changing Login Password (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param resetLoginCredentialsRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resetLoginAsync(String login, String representing, ResetLoginCredentialsRequest resetLoginCredentialsRequest, final ApiCallback<ResetLoginResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = resetLoginValidateBeforeCall(login, representing, resetLoginCredentialsRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResetLoginResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchAlias
     * @param login  (optional)
     * @param representing  (optional)
     * @param searchAliasRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchAliasCall(String login, String representing, SearchAliasRequest searchAliasRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = searchAliasRequest;

        // create path and map variables
        String localVarPath = "/searchalias";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchAliasValidateBeforeCall(String login, String representing, SearchAliasRequest searchAliasRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = searchAliasCall(login, representing, searchAliasRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search For Alias
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param searchAliasRequest  (optional)
     * @return SearchAliasResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchAliasResponse searchAlias(String login, String representing, SearchAliasRequest searchAliasRequest) throws ApiException {
        ApiResponse<SearchAliasResponse> resp = searchAliasWithHttpInfo(login, representing, searchAliasRequest);
        return resp.getData();
    }

    /**
     * Search For Alias
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param searchAliasRequest  (optional)
     * @return ApiResponse&lt;SearchAliasResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchAliasResponse> searchAliasWithHttpInfo(String login, String representing, SearchAliasRequest searchAliasRequest) throws ApiException {
        com.squareup.okhttp.Call call = searchAliasValidateBeforeCall(login, representing, searchAliasRequest, null, null);
        Type localVarReturnType = new TypeToken<SearchAliasResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search For Alias (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param searchAliasRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchAliasAsync(String login, String representing, SearchAliasRequest searchAliasRequest, final ApiCallback<SearchAliasResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchAliasValidateBeforeCall(login, representing, searchAliasRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchAliasResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchEntity
     * @param login  (optional)
     * @param representing  (optional)
     * @param searchEntityRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchEntityCall(String login, String representing, SearchEntityRequest searchEntityRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = searchEntityRequest;

        // create path and map variables
        String localVarPath = "/searchentity";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchEntityValidateBeforeCall(String login, String representing, SearchEntityRequest searchEntityRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = searchEntityCall(login, representing, searchEntityRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search For Entity
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param searchEntityRequest  (optional)
     * @return EntityListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EntityListResponse searchEntity(String login, String representing, SearchEntityRequest searchEntityRequest) throws ApiException {
        ApiResponse<EntityListResponse> resp = searchEntityWithHttpInfo(login, representing, searchEntityRequest);
        return resp.getData();
    }

    /**
     * Search For Entity
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param searchEntityRequest  (optional)
     * @return ApiResponse&lt;EntityListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EntityListResponse> searchEntityWithHttpInfo(String login, String representing, SearchEntityRequest searchEntityRequest) throws ApiException {
        com.squareup.okhttp.Call call = searchEntityValidateBeforeCall(login, representing, searchEntityRequest, null, null);
        Type localVarReturnType = new TypeToken<EntityListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search For Entity (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param searchEntityRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchEntityAsync(String login, String representing, SearchEntityRequest searchEntityRequest, final ApiCallback<EntityListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchEntityValidateBeforeCall(login, representing, searchEntityRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EntityListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for settleAccount
     * @param login  (optional)
     * @param representing  (optional)
     * @param settleAccountRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call settleAccountCall(String login, String representing, SettleAccountRequest settleAccountRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = settleAccountRequest;

        // create path and map variables
        String localVarPath = "/settleaccount";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call settleAccountValidateBeforeCall(String login, String representing, SettleAccountRequest settleAccountRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = settleAccountCall(login, representing, settleAccountRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Settle Account
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param settleAccountRequest  (optional)
     * @return SettleAccountResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SettleAccountResponse settleAccount(String login, String representing, SettleAccountRequest settleAccountRequest) throws ApiException {
        ApiResponse<SettleAccountResponse> resp = settleAccountWithHttpInfo(login, representing, settleAccountRequest);
        return resp.getData();
    }

    /**
     * Settle Account
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param settleAccountRequest  (optional)
     * @return ApiResponse&lt;SettleAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SettleAccountResponse> settleAccountWithHttpInfo(String login, String representing, SettleAccountRequest settleAccountRequest) throws ApiException {
        com.squareup.okhttp.Call call = settleAccountValidateBeforeCall(login, representing, settleAccountRequest, null, null);
        Type localVarReturnType = new TypeToken<SettleAccountResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Settle Account (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param settleAccountRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call settleAccountAsync(String login, String representing, SettleAccountRequest settleAccountRequest, final ApiCallback<SettleAccountResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = settleAccountValidateBeforeCall(login, representing, settleAccountRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SettleAccountResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateApplication
     * @param login  (optional)
     * @param representing  (optional)
     * @param updateApplicationRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateApplicationCall(String login, String representing, UpdateApplicationRequest updateApplicationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateApplicationRequest;

        // create path and map variables
        String localVarPath = "/updateapplication";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateApplicationValidateBeforeCall(String login, String representing, UpdateApplicationRequest updateApplicationRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = updateApplicationCall(login, representing, updateApplicationRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Resetting Application Secret
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param updateApplicationRequest  (optional)
     * @return UpdateApplicationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateApplicationResponse updateApplication(String login, String representing, UpdateApplicationRequest updateApplicationRequest) throws ApiException {
        ApiResponse<UpdateApplicationResponse> resp = updateApplicationWithHttpInfo(login, representing, updateApplicationRequest);
        return resp.getData();
    }

    /**
     * Resetting Application Secret
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param updateApplicationRequest  (optional)
     * @return ApiResponse&lt;UpdateApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateApplicationResponse> updateApplicationWithHttpInfo(String login, String representing, UpdateApplicationRequest updateApplicationRequest) throws ApiException {
        com.squareup.okhttp.Call call = updateApplicationValidateBeforeCall(login, representing, updateApplicationRequest, null, null);
        Type localVarReturnType = new TypeToken<UpdateApplicationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Resetting Application Secret (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param updateApplicationRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateApplicationAsync(String login, String representing, UpdateApplicationRequest updateApplicationRequest, final ApiCallback<UpdateApplicationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateApplicationValidateBeforeCall(login, representing, updateApplicationRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateApplicationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateStatus
     * @param login  (optional)
     * @param representing  (optional)
     * @param updateStatusRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateStatusCall(String login, String representing, UpdateStatusRequest updateStatusRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateStatusRequest;

        // create path and map variables
        String localVarPath = "/updatestatus";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateStatusValidateBeforeCall(String login, String representing, UpdateStatusRequest updateStatusRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = updateStatusCall(login, representing, updateStatusRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Enabling/Disabling Nodes
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param updateStatusRequest  (optional)
     * @return StandardNodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardNodeResponse updateStatus(String login, String representing, UpdateStatusRequest updateStatusRequest) throws ApiException {
        ApiResponse<StandardNodeResponse> resp = updateStatusWithHttpInfo(login, representing, updateStatusRequest);
        return resp.getData();
    }

    /**
     * Enabling/Disabling Nodes
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param updateStatusRequest  (optional)
     * @return ApiResponse&lt;StandardNodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardNodeResponse> updateStatusWithHttpInfo(String login, String representing, UpdateStatusRequest updateStatusRequest) throws ApiException {
        com.squareup.okhttp.Call call = updateStatusValidateBeforeCall(login, representing, updateStatusRequest, null, null);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Enabling/Disabling Nodes (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param updateStatusRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateStatusAsync(String login, String representing, UpdateStatusRequest updateStatusRequest, final ApiCallback<StandardNodeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateStatusValidateBeforeCall(login, representing, updateStatusRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for watch
     * @param login  (optional)
     * @param representing  (optional)
     * @param createWatchRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call watchCall(String login, String representing, CreateWatchRequest createWatchRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createWatchRequest;

        // create path and map variables
        String localVarPath = "/watch";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call watchValidateBeforeCall(String login, String representing, CreateWatchRequest createWatchRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = watchCall(login, representing, createWatchRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Watch Trigger
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createWatchRequest  (optional)
     * @return CreateWatchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateWatchResponse watch(String login, String representing, CreateWatchRequest createWatchRequest) throws ApiException {
        ApiResponse<CreateWatchResponse> resp = watchWithHttpInfo(login, representing, createWatchRequest);
        return resp.getData();
    }

    /**
     * Create Watch Trigger
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createWatchRequest  (optional)
     * @return ApiResponse&lt;CreateWatchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateWatchResponse> watchWithHttpInfo(String login, String representing, CreateWatchRequest createWatchRequest) throws ApiException {
        com.squareup.okhttp.Call call = watchValidateBeforeCall(login, representing, createWatchRequest, null, null);
        Type localVarReturnType = new TypeToken<CreateWatchResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Watch Trigger (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param createWatchRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call watchAsync(String login, String representing, CreateWatchRequest createWatchRequest, final ApiCallback<CreateWatchResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = watchValidateBeforeCall(login, representing, createWatchRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateWatchResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for write
     * @param login  (optional)
     * @param representing  (optional)
     * @param writeRequest  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call writeCall(String login, String representing, WriteRequest writeRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = writeRequest;

        // create path and map variables
        String localVarPath = "/write";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (login != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("login", login));
        if (representing != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("representing", representing));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call writeValidateBeforeCall(String login, String representing, WriteRequest writeRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = writeCall(login, representing, writeRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Writing by Template
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param writeRequest  (optional)
     * @return WriteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WriteResponse write(String login, String representing, WriteRequest writeRequest) throws ApiException {
        ApiResponse<WriteResponse> resp = writeWithHttpInfo(login, representing, writeRequest);
        return resp.getData();
    }

    /**
     * Writing by Template
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param writeRequest  (optional)
     * @return ApiResponse&lt;WriteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WriteResponse> writeWithHttpInfo(String login, String representing, WriteRequest writeRequest) throws ApiException {
        com.squareup.okhttp.Call call = writeValidateBeforeCall(login, representing, writeRequest, null, null);
        Type localVarReturnType = new TypeToken<WriteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Writing by Template (asynchronously)
     * 
     * @param login  (optional)
     * @param representing  (optional)
     * @param writeRequest  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call writeAsync(String login, String representing, WriteRequest writeRequest, final ApiCallback<WriteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = writeValidateBeforeCall(login, representing, writeRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WriteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

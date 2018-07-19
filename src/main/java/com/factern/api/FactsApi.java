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
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addMemberCall(CreateMemberRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call addMemberValidateBeforeCall(CreateMemberRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addMember(Async)");
        }
        

        com.squareup.okhttp.Call call = addMemberCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Member
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateMemberResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateMemberResponse addMember(CreateMemberRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateMemberResponse> resp = addMemberWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Member
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateMemberResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateMemberResponse> addMemberWithHttpInfo(CreateMemberRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = addMemberValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateMemberResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Member (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMemberAsync(CreateMemberRequest body, String login, String representing, final ApiCallback<CreateMemberResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addMemberValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateMemberResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for bid
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call bidCall(CreateBidRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call bidValidateBeforeCall(CreateBidRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling bid(Async)");
        }
        

        com.squareup.okhttp.Call call = bidCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Bid
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return StandardNodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardNodeResponse bid(CreateBidRequest body, String login, String representing) throws ApiException {
        ApiResponse<StandardNodeResponse> resp = bidWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Bid
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;StandardNodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardNodeResponse> bidWithHttpInfo(CreateBidRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = bidValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Bid (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bidAsync(CreateBidRequest body, String login, String representing, final ApiCallback<StandardNodeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = bidValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createAlias
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAliasCall(CreateAliasRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createAliasValidateBeforeCall(CreateAliasRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createAlias(Async)");
        }
        

        com.squareup.okhttp.Call call = createAliasCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Alias
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateAliasResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateAliasResponse createAlias(CreateAliasRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateAliasResponse> resp = createAliasWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Alias
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateAliasResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateAliasResponse> createAliasWithHttpInfo(CreateAliasRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createAliasValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateAliasResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Alias (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAliasAsync(CreateAliasRequest body, String login, String representing, final ApiCallback<CreateAliasResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAliasValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateAliasResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createApplication
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createApplicationCall(CreateApplicationRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createApplicationValidateBeforeCall(CreateApplicationRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createApplication(Async)");
        }
        

        com.squareup.okhttp.Call call = createApplicationCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Application
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateApplicationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateApplicationResponse> resp = createApplicationWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Application
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateApplicationResponse> createApplicationWithHttpInfo(CreateApplicationRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createApplicationValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateApplicationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Application (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createApplicationAsync(CreateApplicationRequest body, String login, String representing, final ApiCallback<CreateApplicationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createApplicationValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateApplicationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createDomain
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDomainCall(CreateDomainRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createDomainValidateBeforeCall(CreateDomainRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createDomain(Async)");
        }
        

        com.squareup.okhttp.Call call = createDomainCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Domain
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateDomainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateDomainResponse createDomain(CreateDomainRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateDomainResponse> resp = createDomainWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Domain
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateDomainResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateDomainResponse> createDomainWithHttpInfo(CreateDomainRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createDomainValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateDomainResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Domain (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDomainAsync(CreateDomainRequest body, String login, String representing, final ApiCallback<CreateDomainResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDomainValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateDomainResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createEntity
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createEntityCall(CreateEntityRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createEntityValidateBeforeCall(CreateEntityRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createEntity(Async)");
        }
        

        com.squareup.okhttp.Call call = createEntityCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Entity
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateEntityResponse createEntity(CreateEntityRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateEntityResponse> resp = createEntityWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Entity
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateEntityResponse> createEntityWithHttpInfo(CreateEntityRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createEntityValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateEntityResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Entity (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createEntityAsync(CreateEntityRequest body, String login, String representing, final ApiCallback<CreateEntityResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createEntityValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateEntityResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createField
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFieldCall(CreateFieldRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createFieldValidateBeforeCall(CreateFieldRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createField(Async)");
        }
        

        com.squareup.okhttp.Call call = createFieldCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Field
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateFieldResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateFieldResponse createField(CreateFieldRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateFieldResponse> resp = createFieldWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Field
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateFieldResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateFieldResponse> createFieldWithHttpInfo(CreateFieldRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createFieldValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateFieldResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Field (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFieldAsync(CreateFieldRequest body, String login, String representing, final ApiCallback<CreateFieldResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createFieldValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateFieldResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createFilter
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createFilterCall(CreateFilterRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createFilterValidateBeforeCall(CreateFilterRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createFilter(Async)");
        }
        

        com.squareup.okhttp.Call call = createFilterCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Filter
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateFilterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateFilterResponse createFilter(CreateFilterRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateFilterResponse> resp = createFilterWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Filter
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateFilterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateFilterResponse> createFilterWithHttpInfo(CreateFilterRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createFilterValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateFilterResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Filter (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFilterAsync(CreateFilterRequest body, String login, String representing, final ApiCallback<CreateFilterResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createFilterValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateFilterResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createGroup
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createGroupCall(CreateGroupRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createGroupValidateBeforeCall(CreateGroupRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createGroup(Async)");
        }
        

        com.squareup.okhttp.Call call = createGroupCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Group
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateGroupResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateGroupResponse createGroup(CreateGroupRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateGroupResponse> resp = createGroupWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Group
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateGroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateGroupResponse> createGroupWithHttpInfo(CreateGroupRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createGroupValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateGroupResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Group (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createGroupAsync(CreateGroupRequest body, String login, String representing, final ApiCallback<CreateGroupResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createGroupValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateGroupResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createInformation
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createInformationCall(CreateInformationRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createInformationValidateBeforeCall(CreateInformationRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createInformation(Async)");
        }
        

        com.squareup.okhttp.Call call = createInformationCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Information
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateInformationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateInformationResponse createInformation(CreateInformationRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateInformationResponse> resp = createInformationWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Information
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateInformationResponse> createInformationWithHttpInfo(CreateInformationRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createInformationValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateInformationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Information (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createInformationAsync(CreateInformationRequest body, String login, String representing, final ApiCallback<CreateInformationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createInformationValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateInformationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createInterface
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createInterfaceCall(CreateInterfaceRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createInterfaceValidateBeforeCall(CreateInterfaceRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createInterface(Async)");
        }
        

        com.squareup.okhttp.Call call = createInterfaceCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Interface
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateInterfaceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateInterfaceResponse createInterface(CreateInterfaceRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateInterfaceResponse> resp = createInterfaceWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Interface
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateInterfaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateInterfaceResponse> createInterfaceWithHttpInfo(CreateInterfaceRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createInterfaceValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateInterfaceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Interface (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createInterfaceAsync(CreateInterfaceRequest body, String login, String representing, final ApiCallback<CreateInterfaceResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createInterfaceValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateInterfaceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createLabelList
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createLabelListCall(CreateLabelListRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createLabelListValidateBeforeCall(CreateLabelListRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createLabelList(Async)");
        }
        

        com.squareup.okhttp.Call call = createLabelListCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Label List
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateLabelListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateLabelListResponse createLabelList(CreateLabelListRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateLabelListResponse> resp = createLabelListWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Label List
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateLabelListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateLabelListResponse> createLabelListWithHttpInfo(CreateLabelListRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createLabelListValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateLabelListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Label List (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createLabelListAsync(CreateLabelListRequest body, String login, String representing, final ApiCallback<CreateLabelListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createLabelListValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateLabelListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createLogin
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createLoginCall(CreateLoginRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createLoginValidateBeforeCall(CreateLoginRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createLogin(Async)");
        }
        

        com.squareup.okhttp.Call call = createLoginCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Login
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateLoginResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateLoginResponse createLogin(CreateLoginRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateLoginResponse> resp = createLoginWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Login
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateLoginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateLoginResponse> createLoginWithHttpInfo(CreateLoginRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createLoginValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateLoginResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Login (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createLoginAsync(CreateLoginRequest body, String login, String representing, final ApiCallback<CreateLoginResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createLoginValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateLoginResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createMirror
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createMirrorCall(CreateMirrorRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createMirrorValidateBeforeCall(CreateMirrorRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createMirror(Async)");
        }
        

        com.squareup.okhttp.Call call = createMirrorCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Mirror
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateMirrorResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateMirrorResponse createMirror(CreateMirrorRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateMirrorResponse> resp = createMirrorWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Mirror
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateMirrorResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateMirrorResponse> createMirrorWithHttpInfo(CreateMirrorRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createMirrorValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateMirrorResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Mirror (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createMirrorAsync(CreateMirrorRequest body, String login, String representing, final ApiCallback<CreateMirrorResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createMirrorValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateMirrorResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createPrice
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createPriceCall(CreatePriceRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createPriceValidateBeforeCall(CreatePriceRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createPrice(Async)");
        }
        

        com.squareup.okhttp.Call call = createPriceCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Price
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreatePriceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreatePriceResponse createPrice(CreatePriceRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreatePriceResponse> resp = createPriceWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Price
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreatePriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreatePriceResponse> createPriceWithHttpInfo(CreatePriceRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createPriceValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreatePriceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Price (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPriceAsync(CreatePriceRequest body, String login, String representing, final ApiCallback<CreatePriceResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createPriceValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreatePriceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createScope
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createScopeCall(CreateScopeRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createScopeValidateBeforeCall(CreateScopeRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createScope(Async)");
        }
        

        com.squareup.okhttp.Call call = createScopeCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Scope
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateScopeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateScopeResponse createScope(CreateScopeRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateScopeResponse> resp = createScopeWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Scope
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateScopeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateScopeResponse> createScopeWithHttpInfo(CreateScopeRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createScopeValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateScopeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Scope (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createScopeAsync(CreateScopeRequest body, String login, String representing, final ApiCallback<CreateScopeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createScopeValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateScopeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createStatement
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createStatementCall(AddStatementRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createStatementValidateBeforeCall(AddStatementRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createStatement(Async)");
        }
        

        com.squareup.okhttp.Call call = createStatementCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Statement
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return AddStatementResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddStatementResponse createStatement(AddStatementRequest body, String login, String representing) throws ApiException {
        ApiResponse<AddStatementResponse> resp = createStatementWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Statement
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;AddStatementResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddStatementResponse> createStatementWithHttpInfo(AddStatementRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createStatementValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<AddStatementResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Statement (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createStatementAsync(AddStatementRequest body, String login, String representing, final ApiCallback<AddStatementResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createStatementValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddStatementResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createTemplate
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createTemplateCall(CreateTemplateRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call createTemplateValidateBeforeCall(CreateTemplateRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createTemplate(Async)");
        }
        

        com.squareup.okhttp.Call call = createTemplateCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Template
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateTemplateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateTemplateResponse> resp = createTemplateWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Template
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateTemplateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateTemplateResponse> createTemplateWithHttpInfo(CreateTemplateRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = createTemplateValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateTemplateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Template (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTemplateAsync(CreateTemplateRequest body, String login, String representing, final ApiCallback<CreateTemplateResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createTemplateValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateTemplateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(DeleteRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call deleteValidateBeforeCall(DeleteRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling delete(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Deleting
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return DeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteResponse delete(DeleteRequest body, String login, String representing) throws ApiException {
        ApiResponse<DeleteResponse> resp = deleteWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Deleting
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;DeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteResponse> deleteWithHttpInfo(DeleteRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<DeleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Deleting (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(DeleteRequest body, String login, String representing, final ApiCallback<DeleteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteNode
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNodeCall(NodeIdRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call deleteNodeValidateBeforeCall(NodeIdRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deleteNode(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteNodeCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete Node
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return StandardNodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardNodeResponse deleteNode(NodeIdRequest body, String login, String representing) throws ApiException {
        ApiResponse<StandardNodeResponse> resp = deleteNodeWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Delete Node
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;StandardNodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardNodeResponse> deleteNodeWithHttpInfo(NodeIdRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = deleteNodeValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Node (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNodeAsync(NodeIdRequest body, String login, String representing, final ApiCallback<StandardNodeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteNodeValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for describe
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call describeCall(DescribeRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call describeValidateBeforeCall(DescribeRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling describe(Async)");
        }
        

        com.squareup.okhttp.Call call = describeCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Describe
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return DescribeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DescribeResponse describe(DescribeRequest body, String login, String representing) throws ApiException {
        ApiResponse<DescribeResponse> resp = describeWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Describe
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;DescribeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DescribeResponse> describeWithHttpInfo(DescribeRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = describeValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<DescribeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Describe (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call describeAsync(DescribeRequest body, String login, String representing, final ApiCallback<DescribeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = describeValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DescribeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for history
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call historyCall(NodeIdRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call historyValidateBeforeCall(NodeIdRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling history(Async)");
        }
        

        com.squareup.okhttp.Call call = historyCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * History
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return NodeListing
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NodeListing history(NodeIdRequest body, String login, String representing) throws ApiException {
        ApiResponse<NodeListing> resp = historyWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * History
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;NodeListing&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NodeListing> historyWithHttpInfo(NodeIdRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = historyValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<NodeListing>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * History (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call historyAsync(NodeIdRequest body, String login, String representing, final ApiCallback<NodeListing> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = historyValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NodeListing>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for label
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call labelCall(AddLabelRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call labelValidateBeforeCall(AddLabelRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling label(Async)");
        }
        

        com.squareup.okhttp.Call call = labelCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Label a Node
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return AddLabelResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddLabelResponse label(AddLabelRequest body, String login, String representing) throws ApiException {
        ApiResponse<AddLabelResponse> resp = labelWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Label a Node
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;AddLabelResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddLabelResponse> labelWithHttpInfo(AddLabelRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = labelValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<AddLabelResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Label a Node (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call labelAsync(AddLabelRequest body, String login, String representing, final ApiCallback<AddLabelResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = labelValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddLabelResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for obliterate
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call obliterateCall(NodeIdRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call obliterateValidateBeforeCall(NodeIdRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling obliterate(Async)");
        }
        

        com.squareup.okhttp.Call call = obliterateCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Obliterating Information Nodes
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return StandardNodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardNodeResponse obliterate(NodeIdRequest body, String login, String representing) throws ApiException {
        ApiResponse<StandardNodeResponse> resp = obliterateWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Obliterating Information Nodes
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;StandardNodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardNodeResponse> obliterateWithHttpInfo(NodeIdRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = obliterateValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Obliterating Information Nodes (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call obliterateAsync(NodeIdRequest body, String login, String representing, final ApiCallback<StandardNodeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = obliterateValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for permission
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call permissionCall(CreatePermissionRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call permissionValidateBeforeCall(CreatePermissionRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling permission(Async)");
        }
        

        com.squareup.okhttp.Call call = permissionCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Permission
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreatePermissionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreatePermissionResponse permission(CreatePermissionRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreatePermissionResponse> resp = permissionWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Permission
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreatePermissionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreatePermissionResponse> permissionWithHttpInfo(CreatePermissionRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = permissionValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreatePermissionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Permission (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call permissionAsync(CreatePermissionRequest body, String login, String representing, final ApiCallback<CreatePermissionResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = permissionValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreatePermissionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for read
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readCall(ReadRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call readValidateBeforeCall(ReadRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling read(Async)");
        }
        

        com.squareup.okhttp.Call call = readCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Reading
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ReadResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReadResponse read(ReadRequest body, String login, String representing) throws ApiException {
        ApiResponse<ReadResponse> resp = readWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Reading
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;ReadResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReadResponse> readWithHttpInfo(ReadRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = readValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<ReadResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Reading (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readAsync(ReadRequest body, String login, String representing, final ApiCallback<ReadResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReadResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for readInformation
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call readInformationCall(ReadInformationRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call readInformationValidateBeforeCall(ReadInformationRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling readInformation(Async)");
        }
        

        com.squareup.okhttp.Call call = readInformationCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read Information
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ReadInformationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReadInformationResponse readInformation(ReadInformationRequest body, String login, String representing) throws ApiException {
        ApiResponse<ReadInformationResponse> resp = readInformationWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Read Information
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;ReadInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReadInformationResponse> readInformationWithHttpInfo(ReadInformationRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = readInformationValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<ReadInformationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read Information (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call readInformationAsync(ReadInformationRequest body, String login, String representing, final ApiCallback<ReadInformationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readInformationValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReadInformationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for replaceInformation
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call replaceInformationCall(ReplaceFieldRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call replaceInformationValidateBeforeCall(ReplaceFieldRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceInformation(Async)");
        }
        

        com.squareup.okhttp.Call call = replaceInformationCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Replace
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return Information
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Information replaceInformation(ReplaceFieldRequest body, String login, String representing) throws ApiException {
        ApiResponse<Information> resp = replaceInformationWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Replace
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;Information&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Information> replaceInformationWithHttpInfo(ReplaceFieldRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = replaceInformationValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<Information>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Replace (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call replaceInformationAsync(ReplaceFieldRequest body, String login, String representing, final ApiCallback<Information> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = replaceInformationValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Information>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for requestPermission
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call requestPermissionCall(NodeIdRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call requestPermissionValidateBeforeCall(NodeIdRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling requestPermission(Async)");
        }
        

        com.squareup.okhttp.Call call = requestPermissionCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Request Permission
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return StandardNodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardNodeResponse requestPermission(NodeIdRequest body, String login, String representing) throws ApiException {
        ApiResponse<StandardNodeResponse> resp = requestPermissionWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Request Permission
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;StandardNodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardNodeResponse> requestPermissionWithHttpInfo(NodeIdRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = requestPermissionValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Request Permission (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call requestPermissionAsync(NodeIdRequest body, String login, String representing, final ApiCallback<StandardNodeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = requestPermissionValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for resetLogin
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call resetLoginCall(ResetLoginCredentialsRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call resetLoginValidateBeforeCall(ResetLoginCredentialsRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling resetLogin(Async)");
        }
        

        com.squareup.okhttp.Call call = resetLoginCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Changing Login Password
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ResetLoginResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResetLoginResponse resetLogin(ResetLoginCredentialsRequest body, String login, String representing) throws ApiException {
        ApiResponse<ResetLoginResponse> resp = resetLoginWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Changing Login Password
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;ResetLoginResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResetLoginResponse> resetLoginWithHttpInfo(ResetLoginCredentialsRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = resetLoginValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<ResetLoginResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Changing Login Password (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resetLoginAsync(ResetLoginCredentialsRequest body, String login, String representing, final ApiCallback<ResetLoginResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = resetLoginValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResetLoginResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchAlias
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchAliasCall(SearchAliasRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call searchAliasValidateBeforeCall(SearchAliasRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling searchAlias(Async)");
        }
        

        com.squareup.okhttp.Call call = searchAliasCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search For Alias
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return SearchAliasResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SearchAliasResponse searchAlias(SearchAliasRequest body, String login, String representing) throws ApiException {
        ApiResponse<SearchAliasResponse> resp = searchAliasWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Search For Alias
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;SearchAliasResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SearchAliasResponse> searchAliasWithHttpInfo(SearchAliasRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = searchAliasValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<SearchAliasResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search For Alias (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchAliasAsync(SearchAliasRequest body, String login, String representing, final ApiCallback<SearchAliasResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchAliasValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SearchAliasResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchEntity
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchEntityCall(SearchEntityRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call searchEntityValidateBeforeCall(SearchEntityRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling searchEntity(Async)");
        }
        

        com.squareup.okhttp.Call call = searchEntityCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search For Entity
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return EntityListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EntityListResponse searchEntity(SearchEntityRequest body, String login, String representing) throws ApiException {
        ApiResponse<EntityListResponse> resp = searchEntityWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Search For Entity
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;EntityListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EntityListResponse> searchEntityWithHttpInfo(SearchEntityRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = searchEntityValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<EntityListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search For Entity (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchEntityAsync(SearchEntityRequest body, String login, String representing, final ApiCallback<EntityListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchEntityValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EntityListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for settleAccount
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call settleAccountCall(SettleAccountRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call settleAccountValidateBeforeCall(SettleAccountRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling settleAccount(Async)");
        }
        

        com.squareup.okhttp.Call call = settleAccountCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Settle Account
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return SettleAccountResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SettleAccountResponse settleAccount(SettleAccountRequest body, String login, String representing) throws ApiException {
        ApiResponse<SettleAccountResponse> resp = settleAccountWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Settle Account
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;SettleAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SettleAccountResponse> settleAccountWithHttpInfo(SettleAccountRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = settleAccountValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<SettleAccountResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Settle Account (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call settleAccountAsync(SettleAccountRequest body, String login, String representing, final ApiCallback<SettleAccountResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = settleAccountValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SettleAccountResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateApplication
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateApplicationCall(UpdateApplicationRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call updateApplicationValidateBeforeCall(UpdateApplicationRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateApplication(Async)");
        }
        

        com.squareup.okhttp.Call call = updateApplicationCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Resetting Application Secret
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return UpdateApplicationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest body, String login, String representing) throws ApiException {
        ApiResponse<UpdateApplicationResponse> resp = updateApplicationWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Resetting Application Secret
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;UpdateApplicationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateApplicationResponse> updateApplicationWithHttpInfo(UpdateApplicationRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = updateApplicationValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<UpdateApplicationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Resetting Application Secret (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateApplicationAsync(UpdateApplicationRequest body, String login, String representing, final ApiCallback<UpdateApplicationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateApplicationValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateApplicationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateStatus
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateStatusCall(UpdateStatusRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call updateStatusValidateBeforeCall(UpdateStatusRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = updateStatusCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Enabling/Disabling Nodes
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return StandardNodeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StandardNodeResponse updateStatus(UpdateStatusRequest body, String login, String representing) throws ApiException {
        ApiResponse<StandardNodeResponse> resp = updateStatusWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Enabling/Disabling Nodes
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;StandardNodeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StandardNodeResponse> updateStatusWithHttpInfo(UpdateStatusRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = updateStatusValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Enabling/Disabling Nodes (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateStatusAsync(UpdateStatusRequest body, String login, String representing, final ApiCallback<StandardNodeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateStatusValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StandardNodeResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for watch
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call watchCall(CreateWatchRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call watchValidateBeforeCall(CreateWatchRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling watch(Async)");
        }
        

        com.squareup.okhttp.Call call = watchCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Watch Trigger
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return CreateWatchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateWatchResponse watch(CreateWatchRequest body, String login, String representing) throws ApiException {
        ApiResponse<CreateWatchResponse> resp = watchWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Create Watch Trigger
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;CreateWatchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateWatchResponse> watchWithHttpInfo(CreateWatchRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = watchValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<CreateWatchResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Watch Trigger (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call watchAsync(CreateWatchRequest body, String login, String representing, final ApiCallback<CreateWatchResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = watchValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateWatchResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for write
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call writeCall(WriteRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

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
    private com.squareup.okhttp.Call writeValidateBeforeCall(WriteRequest body, String login, String representing, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling write(Async)");
        }
        

        com.squareup.okhttp.Call call = writeCall(body, login, representing, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Writing by Template
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return WriteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WriteResponse write(WriteRequest body, String login, String representing) throws ApiException {
        ApiResponse<WriteResponse> resp = writeWithHttpInfo(body, login, representing);
        return resp.getData();
    }

    /**
     * Writing by Template
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @return ApiResponse&lt;WriteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WriteResponse> writeWithHttpInfo(WriteRequest body, String login, String representing) throws ApiException {
        com.squareup.okhttp.Call call = writeValidateBeforeCall(body, login, representing, null, null);
        Type localVarReturnType = new TypeToken<WriteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Writing by Template (asynchronously)
     * 
     * @param body  (required)
     * @param login  (optional)
     * @param representing  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call writeAsync(WriteRequest body, String login, String representing, final ApiCallback<WriteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = writeValidateBeforeCall(body, login, representing, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WriteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

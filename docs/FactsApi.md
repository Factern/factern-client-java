# FactsApi

All URIs are relative to *https://api.factern.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMember**](FactsApi.md#addMember) | **POST** /createmember | Create Member
[**bid**](FactsApi.md#bid) | **POST** /createbid | Create Bid
[**createAlias**](FactsApi.md#createAlias) | **POST** /createalias | Create Alias
[**createApplication**](FactsApi.md#createApplication) | **POST** /createapplication | Create Application
[**createDomain**](FactsApi.md#createDomain) | **POST** /createdomain | Create Domain
[**createEntity**](FactsApi.md#createEntity) | **POST** /createentity | Create Entity
[**createField**](FactsApi.md#createField) | **POST** /createfield | Create Field
[**createFilter**](FactsApi.md#createFilter) | **POST** /createfilter | Create Filter
[**createGroup**](FactsApi.md#createGroup) | **POST** /creategroup | Create Group
[**createInformation**](FactsApi.md#createInformation) | **POST** /createinformation | Create Information
[**createInterface**](FactsApi.md#createInterface) | **POST** /createinterface | Create Interface
[**createLabelList**](FactsApi.md#createLabelList) | **POST** /createlabellist | Create Label List
[**createLogin**](FactsApi.md#createLogin) | **POST** /createlogin | Create Login
[**createMirror**](FactsApi.md#createMirror) | **POST** /createmirror | Create Mirror
[**createPrice**](FactsApi.md#createPrice) | **POST** /createprice | Create Price
[**createScope**](FactsApi.md#createScope) | **POST** /createscope | Create Scope
[**createStatement**](FactsApi.md#createStatement) | **POST** /createstatement | Create Statement
[**createTemplate**](FactsApi.md#createTemplate) | **POST** /createtemplate | Create Template
[**delete**](FactsApi.md#delete) | **POST** /delete | Deleting
[**deleteNode**](FactsApi.md#deleteNode) | **POST** /deletenode | Delete Node
[**describe**](FactsApi.md#describe) | **POST** /describe | Describe
[**history**](FactsApi.md#history) | **POST** /history | History
[**label**](FactsApi.md#label) | **POST** /label | Label a Node
[**obliterate**](FactsApi.md#obliterate) | **POST** /obliterate | Obliterating Information Nodes
[**permission**](FactsApi.md#permission) | **POST** /permission | Create Permission
[**read**](FactsApi.md#read) | **POST** /read | Reading
[**readInformation**](FactsApi.md#readInformation) | **POST** /readinformation | Read Information
[**replaceInformation**](FactsApi.md#replaceInformation) | **POST** /replaceinformation | Replace
[**requestPermission**](FactsApi.md#requestPermission) | **POST** /requestpermission | Request Permission
[**resetLogin**](FactsApi.md#resetLogin) | **POST** /resetlogin | Changing Login Password
[**searchAlias**](FactsApi.md#searchAlias) | **POST** /searchalias | Search For Alias
[**searchEntity**](FactsApi.md#searchEntity) | **POST** /searchentity | Search For Entity
[**settleAccount**](FactsApi.md#settleAccount) | **POST** /settleaccount | Settle Account
[**updateApplication**](FactsApi.md#updateApplication) | **POST** /updateapplication | Resetting Application Secret
[**updateStatus**](FactsApi.md#updateStatus) | **POST** /updatestatus | Enabling/Disabling Nodes
[**watch**](FactsApi.md#watch) | **POST** /watch | Create Watch Trigger
[**write**](FactsApi.md#write) | **POST** /write | Writing by Template


<a name="addMember"></a>
# **addMember**
> CreateMemberResponse addMember(login, representing, createMemberRequest)

Create Member

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateMemberRequest createMemberRequest = new CreateMemberRequest(); // CreateMemberRequest | 
try {
    CreateMemberResponse result = apiInstance.addMember(login, representing, createMemberRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#addMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createMemberRequest** | [**CreateMemberRequest**](CreateMemberRequest.md)|  | [optional]

### Return type

[**CreateMemberResponse**](CreateMemberResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="bid"></a>
# **bid**
> StandardNodeResponse bid(login, representing, createBidRequest)

Create Bid

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateBidRequest createBidRequest = new CreateBidRequest(); // CreateBidRequest | 
try {
    StandardNodeResponse result = apiInstance.bid(login, representing, createBidRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#bid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createBidRequest** | [**CreateBidRequest**](CreateBidRequest.md)|  | [optional]

### Return type

[**StandardNodeResponse**](StandardNodeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAlias"></a>
# **createAlias**
> CreateAliasResponse createAlias(login, representing, createAliasRequest)

Create Alias

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateAliasRequest createAliasRequest = new CreateAliasRequest(); // CreateAliasRequest | 
try {
    CreateAliasResponse result = apiInstance.createAlias(login, representing, createAliasRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createAliasRequest** | [**CreateAliasRequest**](CreateAliasRequest.md)|  | [optional]

### Return type

[**CreateAliasResponse**](CreateAliasResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createApplication"></a>
# **createApplication**
> CreateApplicationResponse createApplication(login, representing, createApplicationRequest)

Create Application

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateApplicationRequest createApplicationRequest = new CreateApplicationRequest(); // CreateApplicationRequest | 
try {
    CreateApplicationResponse result = apiInstance.createApplication(login, representing, createApplicationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createApplicationRequest** | [**CreateApplicationRequest**](CreateApplicationRequest.md)|  | [optional]

### Return type

[**CreateApplicationResponse**](CreateApplicationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDomain"></a>
# **createDomain**
> CreateDomainResponse createDomain(login, representing, createDomainRequest)

Create Domain

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateDomainRequest createDomainRequest = new CreateDomainRequest(); // CreateDomainRequest | 
try {
    CreateDomainResponse result = apiInstance.createDomain(login, representing, createDomainRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createDomainRequest** | [**CreateDomainRequest**](CreateDomainRequest.md)|  | [optional]

### Return type

[**CreateDomainResponse**](CreateDomainResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEntity"></a>
# **createEntity**
> CreateEntityResponse createEntity(login, representing, createEntityRequest)

Create Entity

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateEntityRequest createEntityRequest = new CreateEntityRequest(); // CreateEntityRequest | 
try {
    CreateEntityResponse result = apiInstance.createEntity(login, representing, createEntityRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createEntityRequest** | [**CreateEntityRequest**](CreateEntityRequest.md)|  | [optional]

### Return type

[**CreateEntityResponse**](CreateEntityResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createField"></a>
# **createField**
> CreateFieldResponse createField(login, representing, createFieldRequest)

Create Field

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateFieldRequest createFieldRequest = new CreateFieldRequest(); // CreateFieldRequest | 
try {
    CreateFieldResponse result = apiInstance.createField(login, representing, createFieldRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createFieldRequest** | [**CreateFieldRequest**](CreateFieldRequest.md)|  | [optional]

### Return type

[**CreateFieldResponse**](CreateFieldResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFilter"></a>
# **createFilter**
> CreateFilterResponse createFilter(login, representing, createFilterRequest)

Create Filter

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateFilterRequest createFilterRequest = new CreateFilterRequest(); // CreateFilterRequest | 
try {
    CreateFilterResponse result = apiInstance.createFilter(login, representing, createFilterRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createFilterRequest** | [**CreateFilterRequest**](CreateFilterRequest.md)|  | [optional]

### Return type

[**CreateFilterResponse**](CreateFilterResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGroup"></a>
# **createGroup**
> CreateGroupResponse createGroup(login, representing, createGroupRequest)

Create Group

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateGroupRequest createGroupRequest = new CreateGroupRequest(); // CreateGroupRequest | 
try {
    CreateGroupResponse result = apiInstance.createGroup(login, representing, createGroupRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createGroupRequest** | [**CreateGroupRequest**](CreateGroupRequest.md)|  | [optional]

### Return type

[**CreateGroupResponse**](CreateGroupResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createInformation"></a>
# **createInformation**
> CreateInformationResponse createInformation(login, representing, createInformationRequest)

Create Information

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateInformationRequest createInformationRequest = new CreateInformationRequest(); // CreateInformationRequest | 
try {
    CreateInformationResponse result = apiInstance.createInformation(login, representing, createInformationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createInformationRequest** | [**CreateInformationRequest**](CreateInformationRequest.md)|  | [optional]

### Return type

[**CreateInformationResponse**](CreateInformationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createInterface"></a>
# **createInterface**
> CreateInterfaceResponse createInterface(login, representing, createInterfaceRequest)

Create Interface

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateInterfaceRequest createInterfaceRequest = new CreateInterfaceRequest(); // CreateInterfaceRequest | 
try {
    CreateInterfaceResponse result = apiInstance.createInterface(login, representing, createInterfaceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createInterface");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createInterfaceRequest** | [**CreateInterfaceRequest**](CreateInterfaceRequest.md)|  | [optional]

### Return type

[**CreateInterfaceResponse**](CreateInterfaceResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLabelList"></a>
# **createLabelList**
> CreateLabelListResponse createLabelList(login, representing, createLabelListRequest)

Create Label List

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateLabelListRequest createLabelListRequest = new CreateLabelListRequest(); // CreateLabelListRequest | 
try {
    CreateLabelListResponse result = apiInstance.createLabelList(login, representing, createLabelListRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createLabelList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createLabelListRequest** | [**CreateLabelListRequest**](CreateLabelListRequest.md)|  | [optional]

### Return type

[**CreateLabelListResponse**](CreateLabelListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLogin"></a>
# **createLogin**
> CreateLoginResponse createLogin(login, representing, createLoginRequest)

Create Login

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateLoginRequest createLoginRequest = new CreateLoginRequest(); // CreateLoginRequest | 
try {
    CreateLoginResponse result = apiInstance.createLogin(login, representing, createLoginRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createLoginRequest** | [**CreateLoginRequest**](CreateLoginRequest.md)|  | [optional]

### Return type

[**CreateLoginResponse**](CreateLoginResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMirror"></a>
# **createMirror**
> CreateMirrorResponse createMirror(login, representing, createMirrorRequest)

Create Mirror

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateMirrorRequest createMirrorRequest = new CreateMirrorRequest(); // CreateMirrorRequest | 
try {
    CreateMirrorResponse result = apiInstance.createMirror(login, representing, createMirrorRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createMirror");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createMirrorRequest** | [**CreateMirrorRequest**](CreateMirrorRequest.md)|  | [optional]

### Return type

[**CreateMirrorResponse**](CreateMirrorResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPrice"></a>
# **createPrice**
> CreatePriceResponse createPrice(login, representing, createPriceRequest)

Create Price

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreatePriceRequest createPriceRequest = new CreatePriceRequest(); // CreatePriceRequest | 
try {
    CreatePriceResponse result = apiInstance.createPrice(login, representing, createPriceRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createPrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createPriceRequest** | [**CreatePriceRequest**](CreatePriceRequest.md)|  | [optional]

### Return type

[**CreatePriceResponse**](CreatePriceResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createScope"></a>
# **createScope**
> CreateScopeResponse createScope(login, representing, createScopeRequest)

Create Scope

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateScopeRequest createScopeRequest = new CreateScopeRequest(); // CreateScopeRequest | 
try {
    CreateScopeResponse result = apiInstance.createScope(login, representing, createScopeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createScope");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createScopeRequest** | [**CreateScopeRequest**](CreateScopeRequest.md)|  | [optional]

### Return type

[**CreateScopeResponse**](CreateScopeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStatement"></a>
# **createStatement**
> AddStatementResponse createStatement(login, representing, addStatementRequest)

Create Statement

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
AddStatementRequest addStatementRequest = new AddStatementRequest(); // AddStatementRequest | 
try {
    AddStatementResponse result = apiInstance.createStatement(login, representing, addStatementRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createStatement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **addStatementRequest** | [**AddStatementRequest**](AddStatementRequest.md)|  | [optional]

### Return type

[**AddStatementResponse**](AddStatementResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTemplate"></a>
# **createTemplate**
> CreateTemplateResponse createTemplate(login, representing, createTemplateRequest)

Create Template

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateTemplateRequest createTemplateRequest = new CreateTemplateRequest(); // CreateTemplateRequest | 
try {
    CreateTemplateResponse result = apiInstance.createTemplate(login, representing, createTemplateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createTemplateRequest** | [**CreateTemplateRequest**](CreateTemplateRequest.md)|  | [optional]

### Return type

[**CreateTemplateResponse**](CreateTemplateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteResponse delete(login, representing, deleteRequest)

Deleting

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
DeleteRequest deleteRequest = new DeleteRequest(); // DeleteRequest | 
try {
    DeleteResponse result = apiInstance.delete(login, representing, deleteRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **deleteRequest** | [**DeleteRequest**](DeleteRequest.md)|  | [optional]

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNode"></a>
# **deleteNode**
> StandardNodeResponse deleteNode(login, representing, nodeIdRequest)

Delete Node

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
NodeIdRequest nodeIdRequest = new NodeIdRequest(); // NodeIdRequest | 
try {
    StandardNodeResponse result = apiInstance.deleteNode(login, representing, nodeIdRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#deleteNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **nodeIdRequest** | [**NodeIdRequest**](NodeIdRequest.md)|  | [optional]

### Return type

[**StandardNodeResponse**](StandardNodeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="describe"></a>
# **describe**
> DescribeResponse describe(login, representing, describeRequest)

Describe

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
DescribeRequest describeRequest = new DescribeRequest(); // DescribeRequest | 
try {
    DescribeResponse result = apiInstance.describe(login, representing, describeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#describe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **describeRequest** | [**DescribeRequest**](DescribeRequest.md)|  | [optional]

### Return type

[**DescribeResponse**](DescribeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="history"></a>
# **history**
> NodeListing history(login, representing, nodeIdRequest)

History

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
NodeIdRequest nodeIdRequest = new NodeIdRequest(); // NodeIdRequest | 
try {
    NodeListing result = apiInstance.history(login, representing, nodeIdRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#history");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **nodeIdRequest** | [**NodeIdRequest**](NodeIdRequest.md)|  | [optional]

### Return type

[**NodeListing**](NodeListing.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="label"></a>
# **label**
> AddLabelResponse label(login, representing, addLabelRequest)

Label a Node

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
AddLabelRequest addLabelRequest = new AddLabelRequest(); // AddLabelRequest | 
try {
    AddLabelResponse result = apiInstance.label(login, representing, addLabelRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#label");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **addLabelRequest** | [**AddLabelRequest**](AddLabelRequest.md)|  | [optional]

### Return type

[**AddLabelResponse**](AddLabelResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obliterate"></a>
# **obliterate**
> StandardNodeResponse obliterate(login, representing, nodeIdRequest)

Obliterating Information Nodes

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
NodeIdRequest nodeIdRequest = new NodeIdRequest(); // NodeIdRequest | 
try {
    StandardNodeResponse result = apiInstance.obliterate(login, representing, nodeIdRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#obliterate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **nodeIdRequest** | [**NodeIdRequest**](NodeIdRequest.md)|  | [optional]

### Return type

[**StandardNodeResponse**](StandardNodeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="permission"></a>
# **permission**
> CreatePermissionResponse permission(login, representing, createPermissionRequest)

Create Permission

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreatePermissionRequest createPermissionRequest = new CreatePermissionRequest(); // CreatePermissionRequest | 
try {
    CreatePermissionResponse result = apiInstance.permission(login, representing, createPermissionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#permission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createPermissionRequest** | [**CreatePermissionRequest**](CreatePermissionRequest.md)|  | [optional]

### Return type

[**CreatePermissionResponse**](CreatePermissionResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="read"></a>
# **read**
> ReadResponse read(login, representing, readRequest)

Reading

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
ReadRequest readRequest = new ReadRequest(); // ReadRequest | 
try {
    ReadResponse result = apiInstance.read(login, representing, readRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **readRequest** | [**ReadRequest**](ReadRequest.md)|  | [optional]

### Return type

[**ReadResponse**](ReadResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="readInformation"></a>
# **readInformation**
> ReadInformationResponse readInformation(login, representing, readInformationRequest)

Read Information

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
ReadInformationRequest readInformationRequest = new ReadInformationRequest(); // ReadInformationRequest | 
try {
    ReadInformationResponse result = apiInstance.readInformation(login, representing, readInformationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#readInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **readInformationRequest** | [**ReadInformationRequest**](ReadInformationRequest.md)|  | [optional]

### Return type

[**ReadInformationResponse**](ReadInformationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="replaceInformation"></a>
# **replaceInformation**
> Information replaceInformation(login, representing, replaceFieldRequest)

Replace

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
ReplaceFieldRequest replaceFieldRequest = new ReplaceFieldRequest(); // ReplaceFieldRequest | 
try {
    Information result = apiInstance.replaceInformation(login, representing, replaceFieldRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#replaceInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **replaceFieldRequest** | [**ReplaceFieldRequest**](ReplaceFieldRequest.md)|  | [optional]

### Return type

[**Information**](Information.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestPermission"></a>
# **requestPermission**
> StandardNodeResponse requestPermission(login, representing, nodeIdRequest)

Request Permission

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
NodeIdRequest nodeIdRequest = new NodeIdRequest(); // NodeIdRequest | 
try {
    StandardNodeResponse result = apiInstance.requestPermission(login, representing, nodeIdRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#requestPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **nodeIdRequest** | [**NodeIdRequest**](NodeIdRequest.md)|  | [optional]

### Return type

[**StandardNodeResponse**](StandardNodeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetLogin"></a>
# **resetLogin**
> ResetLoginResponse resetLogin(login, representing, resetLoginCredentialsRequest)

Changing Login Password

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
ResetLoginCredentialsRequest resetLoginCredentialsRequest = new ResetLoginCredentialsRequest(); // ResetLoginCredentialsRequest | 
try {
    ResetLoginResponse result = apiInstance.resetLogin(login, representing, resetLoginCredentialsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#resetLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **resetLoginCredentialsRequest** | [**ResetLoginCredentialsRequest**](ResetLoginCredentialsRequest.md)|  | [optional]

### Return type

[**ResetLoginResponse**](ResetLoginResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchAlias"></a>
# **searchAlias**
> SearchAliasResponse searchAlias(login, representing, searchAliasRequest)

Search For Alias

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
SearchAliasRequest searchAliasRequest = new SearchAliasRequest(); // SearchAliasRequest | 
try {
    SearchAliasResponse result = apiInstance.searchAlias(login, representing, searchAliasRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#searchAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **searchAliasRequest** | [**SearchAliasRequest**](SearchAliasRequest.md)|  | [optional]

### Return type

[**SearchAliasResponse**](SearchAliasResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchEntity"></a>
# **searchEntity**
> EntityListResponse searchEntity(login, representing, searchEntityRequest)

Search For Entity

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
SearchEntityRequest searchEntityRequest = new SearchEntityRequest(); // SearchEntityRequest | 
try {
    EntityListResponse result = apiInstance.searchEntity(login, representing, searchEntityRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#searchEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **searchEntityRequest** | [**SearchEntityRequest**](SearchEntityRequest.md)|  | [optional]

### Return type

[**EntityListResponse**](EntityListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="settleAccount"></a>
# **settleAccount**
> SettleAccountResponse settleAccount(login, representing, settleAccountRequest)

Settle Account

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
SettleAccountRequest settleAccountRequest = new SettleAccountRequest(); // SettleAccountRequest | 
try {
    SettleAccountResponse result = apiInstance.settleAccount(login, representing, settleAccountRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#settleAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **settleAccountRequest** | [**SettleAccountRequest**](SettleAccountRequest.md)|  | [optional]

### Return type

[**SettleAccountResponse**](SettleAccountResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateApplication"></a>
# **updateApplication**
> UpdateApplicationResponse updateApplication(login, representing, updateApplicationRequest)

Resetting Application Secret

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
UpdateApplicationRequest updateApplicationRequest = new UpdateApplicationRequest(); // UpdateApplicationRequest | 
try {
    UpdateApplicationResponse result = apiInstance.updateApplication(login, representing, updateApplicationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#updateApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **updateApplicationRequest** | [**UpdateApplicationRequest**](UpdateApplicationRequest.md)|  | [optional]

### Return type

[**UpdateApplicationResponse**](UpdateApplicationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStatus"></a>
# **updateStatus**
> StandardNodeResponse updateStatus(login, representing, updateStatusRequest)

Enabling/Disabling Nodes

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
UpdateStatusRequest updateStatusRequest = new UpdateStatusRequest(); // UpdateStatusRequest | 
try {
    StandardNodeResponse result = apiInstance.updateStatus(login, representing, updateStatusRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#updateStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **updateStatusRequest** | [**UpdateStatusRequest**](UpdateStatusRequest.md)|  | [optional]

### Return type

[**StandardNodeResponse**](StandardNodeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="watch"></a>
# **watch**
> CreateWatchResponse watch(login, representing, createWatchRequest)

Create Watch Trigger

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
CreateWatchRequest createWatchRequest = new CreateWatchRequest(); // CreateWatchRequest | 
try {
    CreateWatchResponse result = apiInstance.watch(login, representing, createWatchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#watch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **createWatchRequest** | [**CreateWatchRequest**](CreateWatchRequest.md)|  | [optional]

### Return type

[**CreateWatchResponse**](CreateWatchResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="write"></a>
# **write**
> WriteResponse write(login, representing, writeRequest)

Writing by Template

### Example
```java
// Import classes:
//import com.factern.ApiClient;
//import com.factern.ApiException;
//import com.factern.Configuration;
//import com.factern.auth.*;
//import com.factern.api.FactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

FactsApi apiInstance = new FactsApi();
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
WriteRequest writeRequest = new WriteRequest(); // WriteRequest | 
try {
    WriteResponse result = apiInstance.write(login, representing, writeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#write");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]
 **writeRequest** | [**WriteRequest**](WriteRequest.md)|  | [optional]

### Return type

[**WriteResponse**](WriteResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


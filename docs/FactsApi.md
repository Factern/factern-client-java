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
> CreateMemberResponse addMember(body, login, representing)

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
CreateMemberRequest body = new CreateMemberRequest(); // CreateMemberRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateMemberResponse result = apiInstance.addMember(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#addMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateMemberRequest**](CreateMemberRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateMemberResponse**](CreateMemberResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bid"></a>
# **bid**
> StandardNodeResponse bid(body, login, representing)

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
CreateBidRequest body = new CreateBidRequest(); // CreateBidRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    StandardNodeResponse result = apiInstance.bid(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#bid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateBidRequest**](CreateBidRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**StandardNodeResponse**](StandardNodeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAlias"></a>
# **createAlias**
> CreateAliasResponse createAlias(body, login, representing)

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
CreateAliasRequest body = new CreateAliasRequest(); // CreateAliasRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateAliasResponse result = apiInstance.createAlias(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAliasRequest**](CreateAliasRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateAliasResponse**](CreateAliasResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createApplication"></a>
# **createApplication**
> CreateApplicationResponse createApplication(body, login, representing)

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
CreateApplicationRequest body = new CreateApplicationRequest(); // CreateApplicationRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateApplicationResponse result = apiInstance.createApplication(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateApplicationRequest**](CreateApplicationRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateApplicationResponse**](CreateApplicationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDomain"></a>
# **createDomain**
> CreateDomainResponse createDomain(body, login, representing)

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
CreateDomainRequest body = new CreateDomainRequest(); // CreateDomainRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateDomainResponse result = apiInstance.createDomain(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateDomainRequest**](CreateDomainRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateDomainResponse**](CreateDomainResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createEntity"></a>
# **createEntity**
> CreateEntityResponse createEntity(body, login, representing)

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
CreateEntityRequest body = new CreateEntityRequest(); // CreateEntityRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateEntityResponse result = apiInstance.createEntity(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateEntityRequest**](CreateEntityRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateEntityResponse**](CreateEntityResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createField"></a>
# **createField**
> CreateFieldResponse createField(body, login, representing)

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
CreateFieldRequest body = new CreateFieldRequest(); // CreateFieldRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateFieldResponse result = apiInstance.createField(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFieldRequest**](CreateFieldRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateFieldResponse**](CreateFieldResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFilter"></a>
# **createFilter**
> CreateFilterResponse createFilter(body, login, representing)

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
CreateFilterRequest body = new CreateFilterRequest(); // CreateFilterRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateFilterResponse result = apiInstance.createFilter(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFilterRequest**](CreateFilterRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateFilterResponse**](CreateFilterResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGroup"></a>
# **createGroup**
> CreateGroupResponse createGroup(body, login, representing)

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
CreateGroupRequest body = new CreateGroupRequest(); // CreateGroupRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateGroupResponse result = apiInstance.createGroup(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateGroupRequest**](CreateGroupRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateGroupResponse**](CreateGroupResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInformation"></a>
# **createInformation**
> CreateInformationResponse createInformation(body, login, representing)

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
CreateInformationRequest body = new CreateInformationRequest(); // CreateInformationRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateInformationResponse result = apiInstance.createInformation(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateInformationRequest**](CreateInformationRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateInformationResponse**](CreateInformationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createInterface"></a>
# **createInterface**
> CreateInterfaceResponse createInterface(body, login, representing)

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
CreateInterfaceRequest body = new CreateInterfaceRequest(); // CreateInterfaceRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateInterfaceResponse result = apiInstance.createInterface(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createInterface");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateInterfaceRequest**](CreateInterfaceRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateInterfaceResponse**](CreateInterfaceResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLabelList"></a>
# **createLabelList**
> CreateLabelListResponse createLabelList(body, login, representing)

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
CreateLabelListRequest body = new CreateLabelListRequest(); // CreateLabelListRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateLabelListResponse result = apiInstance.createLabelList(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createLabelList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateLabelListRequest**](CreateLabelListRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateLabelListResponse**](CreateLabelListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLogin"></a>
# **createLogin**
> CreateLoginResponse createLogin(body, login, representing)

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
CreateLoginRequest body = new CreateLoginRequest(); // CreateLoginRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateLoginResponse result = apiInstance.createLogin(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateLoginRequest**](CreateLoginRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateLoginResponse**](CreateLoginResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createMirror"></a>
# **createMirror**
> CreateMirrorResponse createMirror(body, login, representing)

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
CreateMirrorRequest body = new CreateMirrorRequest(); // CreateMirrorRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateMirrorResponse result = apiInstance.createMirror(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createMirror");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateMirrorRequest**](CreateMirrorRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateMirrorResponse**](CreateMirrorResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPrice"></a>
# **createPrice**
> CreatePriceResponse createPrice(body, login, representing)

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
CreatePriceRequest body = new CreatePriceRequest(); // CreatePriceRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreatePriceResponse result = apiInstance.createPrice(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createPrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreatePriceRequest**](CreatePriceRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreatePriceResponse**](CreatePriceResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createScope"></a>
# **createScope**
> CreateScopeResponse createScope(body, login, representing)

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
CreateScopeRequest body = new CreateScopeRequest(); // CreateScopeRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateScopeResponse result = apiInstance.createScope(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createScope");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateScopeRequest**](CreateScopeRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateScopeResponse**](CreateScopeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createStatement"></a>
# **createStatement**
> AddStatementResponse createStatement(body, login, representing)

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
AddStatementRequest body = new AddStatementRequest(); // AddStatementRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    AddStatementResponse result = apiInstance.createStatement(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createStatement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddStatementRequest**](AddStatementRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**AddStatementResponse**](AddStatementResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createTemplate"></a>
# **createTemplate**
> CreateTemplateResponse createTemplate(body, login, representing)

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
CreateTemplateRequest body = new CreateTemplateRequest(); // CreateTemplateRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateTemplateResponse result = apiInstance.createTemplate(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#createTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTemplateRequest**](CreateTemplateRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateTemplateResponse**](CreateTemplateResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteResponse delete(body, login, representing)

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
DeleteRequest body = new DeleteRequest(); // DeleteRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    DeleteResponse result = apiInstance.delete(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteRequest**](DeleteRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteNode"></a>
# **deleteNode**
> StandardNodeResponse deleteNode(body, login, representing)

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
NodeIdRequest body = new NodeIdRequest(); // NodeIdRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    StandardNodeResponse result = apiInstance.deleteNode(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#deleteNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeIdRequest**](NodeIdRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**StandardNodeResponse**](StandardNodeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="describe"></a>
# **describe**
> DescribeResponse describe(body, login, representing)

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
DescribeRequest body = new DescribeRequest(); // DescribeRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    DescribeResponse result = apiInstance.describe(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#describe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DescribeRequest**](DescribeRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**DescribeResponse**](DescribeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="history"></a>
# **history**
> NodeListing history(body, login, representing)

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
NodeIdRequest body = new NodeIdRequest(); // NodeIdRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    NodeListing result = apiInstance.history(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#history");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeIdRequest**](NodeIdRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**NodeListing**](NodeListing.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="label"></a>
# **label**
> AddLabelResponse label(body, login, representing)

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
AddLabelRequest body = new AddLabelRequest(); // AddLabelRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    AddLabelResponse result = apiInstance.label(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#label");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AddLabelRequest**](AddLabelRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**AddLabelResponse**](AddLabelResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="obliterate"></a>
# **obliterate**
> StandardNodeResponse obliterate(body, login, representing)

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
NodeIdRequest body = new NodeIdRequest(); // NodeIdRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    StandardNodeResponse result = apiInstance.obliterate(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#obliterate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeIdRequest**](NodeIdRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**StandardNodeResponse**](StandardNodeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="permission"></a>
# **permission**
> CreatePermissionResponse permission(body, login, representing)

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
CreatePermissionRequest body = new CreatePermissionRequest(); // CreatePermissionRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreatePermissionResponse result = apiInstance.permission(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#permission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreatePermissionRequest**](CreatePermissionRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreatePermissionResponse**](CreatePermissionResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="read"></a>
# **read**
> ReadResponse read(body, login, representing)

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
ReadRequest body = new ReadRequest(); // ReadRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    ReadResponse result = apiInstance.read(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#read");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReadRequest**](ReadRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**ReadResponse**](ReadResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readInformation"></a>
# **readInformation**
> ReadInformationResponse readInformation(body, login, representing)

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
ReadInformationRequest body = new ReadInformationRequest(); // ReadInformationRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    ReadInformationResponse result = apiInstance.readInformation(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#readInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReadInformationRequest**](ReadInformationRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**ReadInformationResponse**](ReadInformationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceInformation"></a>
# **replaceInformation**
> Information replaceInformation(body, login, representing)

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
ReplaceFieldRequest body = new ReplaceFieldRequest(); // ReplaceFieldRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    Information result = apiInstance.replaceInformation(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#replaceInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReplaceFieldRequest**](ReplaceFieldRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**Information**](Information.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestPermission"></a>
# **requestPermission**
> StandardNodeResponse requestPermission(body, login, representing)

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
NodeIdRequest body = new NodeIdRequest(); // NodeIdRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    StandardNodeResponse result = apiInstance.requestPermission(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#requestPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeIdRequest**](NodeIdRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**StandardNodeResponse**](StandardNodeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetLogin"></a>
# **resetLogin**
> ResetLoginResponse resetLogin(body, login, representing)

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
ResetLoginCredentialsRequest body = new ResetLoginCredentialsRequest(); // ResetLoginCredentialsRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    ResetLoginResponse result = apiInstance.resetLogin(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#resetLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResetLoginCredentialsRequest**](ResetLoginCredentialsRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**ResetLoginResponse**](ResetLoginResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchAlias"></a>
# **searchAlias**
> SearchAliasResponse searchAlias(body, login, representing)

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
SearchAliasRequest body = new SearchAliasRequest(); // SearchAliasRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    SearchAliasResponse result = apiInstance.searchAlias(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#searchAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchAliasRequest**](SearchAliasRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**SearchAliasResponse**](SearchAliasResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchEntity"></a>
# **searchEntity**
> EntityListResponse searchEntity(body, login, representing)

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
SearchEntityRequest body = new SearchEntityRequest(); // SearchEntityRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    EntityListResponse result = apiInstance.searchEntity(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#searchEntity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SearchEntityRequest**](SearchEntityRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**EntityListResponse**](EntityListResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="settleAccount"></a>
# **settleAccount**
> SettleAccountResponse settleAccount(body, login, representing)

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
SettleAccountRequest body = new SettleAccountRequest(); // SettleAccountRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    SettleAccountResponse result = apiInstance.settleAccount(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#settleAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SettleAccountRequest**](SettleAccountRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**SettleAccountResponse**](SettleAccountResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateApplication"></a>
# **updateApplication**
> UpdateApplicationResponse updateApplication(body, login, representing)

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
UpdateApplicationRequest body = new UpdateApplicationRequest(); // UpdateApplicationRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    UpdateApplicationResponse result = apiInstance.updateApplication(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#updateApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateApplicationRequest**](UpdateApplicationRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**UpdateApplicationResponse**](UpdateApplicationResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStatus"></a>
# **updateStatus**
> StandardNodeResponse updateStatus(body, login, representing)

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
UpdateStatusRequest body = new UpdateStatusRequest(); // UpdateStatusRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    StandardNodeResponse result = apiInstance.updateStatus(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#updateStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateStatusRequest**](UpdateStatusRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**StandardNodeResponse**](StandardNodeResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="watch"></a>
# **watch**
> CreateWatchResponse watch(body, login, representing)

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
CreateWatchRequest body = new CreateWatchRequest(); // CreateWatchRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    CreateWatchResponse result = apiInstance.watch(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#watch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateWatchRequest**](CreateWatchRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**CreateWatchResponse**](CreateWatchResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="write"></a>
# **write**
> WriteResponse write(body, login, representing)

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
WriteRequest body = new WriteRequest(); // WriteRequest | 
String login = "login_example"; // String | 
String representing = "representing_example"; // String | 
try {
    WriteResponse result = apiInstance.write(body, login, representing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactsApi#write");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WriteRequest**](WriteRequest.md)|  |
 **login** | **String**|  | [optional]
 **representing** | **String**|  | [optional]

### Return type

[**WriteResponse**](WriteResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


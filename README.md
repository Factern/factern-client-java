# factern-java-client

For more information, please visit [https://next.factern.com/company/contact](https://next.factern.com/company/contact)

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.factern</groupId>
  <artifactId>factern-java-client</artifactId>
  <version>1.0.40</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.factern:factern-java-client:1.0.40"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/factern-java-client-1.0.SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.factern.*;
import com.factern.auth.*;
import com.factern.model.*;
import com.factern.api.FactsApi;

import java.io.File;
import java.util.*;

public class FactsApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.factern.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FactsApi* | [**addMember**](docs/FactsApi.md#addMember) | **POST** /createmember | Create Member
*FactsApi* | [**bid**](docs/FactsApi.md#bid) | **POST** /createbid | Create Bid
*FactsApi* | [**createAlias**](docs/FactsApi.md#createAlias) | **POST** /createalias | Create Alias
*FactsApi* | [**createApplication**](docs/FactsApi.md#createApplication) | **POST** /createapplication | Create Application
*FactsApi* | [**createDomain**](docs/FactsApi.md#createDomain) | **POST** /createdomain | Create Domain
*FactsApi* | [**createEntity**](docs/FactsApi.md#createEntity) | **POST** /createentity | Create Entity
*FactsApi* | [**createField**](docs/FactsApi.md#createField) | **POST** /createfield | Create Field
*FactsApi* | [**createFilter**](docs/FactsApi.md#createFilter) | **POST** /createfilter | Create Filter
*FactsApi* | [**createGroup**](docs/FactsApi.md#createGroup) | **POST** /creategroup | Create Group
*FactsApi* | [**createInformation**](docs/FactsApi.md#createInformation) | **POST** /createinformation | Create Information
*FactsApi* | [**createInterface**](docs/FactsApi.md#createInterface) | **POST** /createinterface | Create Interface
*FactsApi* | [**createLabelList**](docs/FactsApi.md#createLabelList) | **POST** /createlabellist | Create Label List
*FactsApi* | [**createLogin**](docs/FactsApi.md#createLogin) | **POST** /createlogin | Create Login
*FactsApi* | [**createMirror**](docs/FactsApi.md#createMirror) | **POST** /createmirror | Create Mirror
*FactsApi* | [**createPrice**](docs/FactsApi.md#createPrice) | **POST** /createprice | Create Price
*FactsApi* | [**createScope**](docs/FactsApi.md#createScope) | **POST** /createscope | Create Scope
*FactsApi* | [**createStatement**](docs/FactsApi.md#createStatement) | **POST** /createstatement | Create Statement
*FactsApi* | [**createTemplate**](docs/FactsApi.md#createTemplate) | **POST** /createtemplate | Create Template
*FactsApi* | [**delete**](docs/FactsApi.md#delete) | **POST** /delete | Deleting
*FactsApi* | [**deleteNode**](docs/FactsApi.md#deleteNode) | **POST** /deletenode | Delete Node
*FactsApi* | [**describe**](docs/FactsApi.md#describe) | **POST** /describe | Describe
*FactsApi* | [**history**](docs/FactsApi.md#history) | **POST** /history | History
*FactsApi* | [**label**](docs/FactsApi.md#label) | **POST** /label | Label a Node
*FactsApi* | [**obliterate**](docs/FactsApi.md#obliterate) | **POST** /obliterate | Obliterating Information Nodes
*FactsApi* | [**permission**](docs/FactsApi.md#permission) | **POST** /permission | Create Permission
*FactsApi* | [**read**](docs/FactsApi.md#read) | **POST** /read | Reading
*FactsApi* | [**readInformation**](docs/FactsApi.md#readInformation) | **POST** /readinformation | Read Information
*FactsApi* | [**replaceInformation**](docs/FactsApi.md#replaceInformation) | **POST** /replaceinformation | Replace
*FactsApi* | [**requestPermission**](docs/FactsApi.md#requestPermission) | **POST** /requestpermission | Request Permission
*FactsApi* | [**resetLogin**](docs/FactsApi.md#resetLogin) | **POST** /resetlogin | Changing Login Password
*FactsApi* | [**searchAlias**](docs/FactsApi.md#searchAlias) | **POST** /searchalias | Search For Alias
*FactsApi* | [**searchEntity**](docs/FactsApi.md#searchEntity) | **POST** /searchentity | Search For Entity
*FactsApi* | [**settleAccount**](docs/FactsApi.md#settleAccount) | **POST** /settleaccount | Settle Account
*FactsApi* | [**updateApplication**](docs/FactsApi.md#updateApplication) | **POST** /updateapplication | Resetting Application Secret
*FactsApi* | [**updateStatus**](docs/FactsApi.md#updateStatus) | **POST** /updatestatus | Enabling/Disabling Nodes
*FactsApi* | [**watch**](docs/FactsApi.md#watch) | **POST** /watch | Create Watch Trigger
*FactsApi* | [**write**](docs/FactsApi.md#write) | **POST** /write | Writing by Template


## Documentation for Models

 - [Account](docs/Account.md)
 - [AddLabelRequest](docs/AddLabelRequest.md)
 - [AddLabelResponse](docs/AddLabelResponse.md)
 - [AddStatementRequest](docs/AddStatementRequest.md)
 - [AddStatementResponse](docs/AddStatementResponse.md)
 - [Agent](docs/Agent.md)
 - [Alias](docs/Alias.md)
 - [AliasNode](docs/AliasNode.md)
 - [ApiEndpoint](docs/ApiEndpoint.md)
 - [Application](docs/Application.md)
 - [ApplicationNode](docs/ApplicationNode.md)
 - [BaseRequest](docs/BaseRequest.md)
 - [BaseResponse](docs/BaseResponse.md)
 - [Bid](docs/Bid.md)
 - [BidNode](docs/BidNode.md)
 - [Cost](docs/Cost.md)
 - [CreateAliasRequest](docs/CreateAliasRequest.md)
 - [CreateAliasResponse](docs/CreateAliasResponse.md)
 - [CreateApplicationRequest](docs/CreateApplicationRequest.md)
 - [CreateApplicationResponse](docs/CreateApplicationResponse.md)
 - [CreateBidRequest](docs/CreateBidRequest.md)
 - [CreateBidResponse](docs/CreateBidResponse.md)
 - [CreateChildRequest](docs/CreateChildRequest.md)
 - [CreateDomainRequest](docs/CreateDomainRequest.md)
 - [CreateDomainResponse](docs/CreateDomainResponse.md)
 - [CreateEntityRequest](docs/CreateEntityRequest.md)
 - [CreateEntityResponse](docs/CreateEntityResponse.md)
 - [CreateFieldRequest](docs/CreateFieldRequest.md)
 - [CreateFieldResponse](docs/CreateFieldResponse.md)
 - [CreateFilterRequest](docs/CreateFilterRequest.md)
 - [CreateFilterResponse](docs/CreateFilterResponse.md)
 - [CreateGroupRequest](docs/CreateGroupRequest.md)
 - [CreateGroupResponse](docs/CreateGroupResponse.md)
 - [CreateInformationRequest](docs/CreateInformationRequest.md)
 - [CreateInformationResponse](docs/CreateInformationResponse.md)
 - [CreateInterfaceRequest](docs/CreateInterfaceRequest.md)
 - [CreateInterfaceResponse](docs/CreateInterfaceResponse.md)
 - [CreateLabelListRequest](docs/CreateLabelListRequest.md)
 - [CreateLabelListResponse](docs/CreateLabelListResponse.md)
 - [CreateLoginRequest](docs/CreateLoginRequest.md)
 - [CreateLoginResponse](docs/CreateLoginResponse.md)
 - [CreateMemberRequest](docs/CreateMemberRequest.md)
 - [CreateMemberResponse](docs/CreateMemberResponse.md)
 - [CreateMirrorRequest](docs/CreateMirrorRequest.md)
 - [CreateMirrorResponse](docs/CreateMirrorResponse.md)
 - [CreateNamedRequest](docs/CreateNamedRequest.md)
 - [CreatePermissionRequest](docs/CreatePermissionRequest.md)
 - [CreatePermissionResponse](docs/CreatePermissionResponse.md)
 - [CreatePriceRequest](docs/CreatePriceRequest.md)
 - [CreatePriceResponse](docs/CreatePriceResponse.md)
 - [CreateScopeRequest](docs/CreateScopeRequest.md)
 - [CreateScopeResponse](docs/CreateScopeResponse.md)
 - [CreateTemplateRequest](docs/CreateTemplateRequest.md)
 - [CreateTemplateResponse](docs/CreateTemplateResponse.md)
 - [CreateWatchRequest](docs/CreateWatchRequest.md)
 - [CreateWatchResponse](docs/CreateWatchResponse.md)
 - [DeleteRequest](docs/DeleteRequest.md)
 - [DeleteResponse](docs/DeleteResponse.md)
 - [DeletedItem](docs/DeletedItem.md)
 - [DeletedStatusItem](docs/DeletedStatusItem.md)
 - [DescribeRequest](docs/DescribeRequest.md)
 - [DescribeResponse](docs/DescribeResponse.md)
 - [Domain](docs/Domain.md)
 - [DomainNode](docs/DomainNode.md)
 - [Entity](docs/Entity.md)
 - [EntityListResponse](docs/EntityListResponse.md)
 - [EntityNode](docs/EntityNode.md)
 - [ExternalDataUsage](docs/ExternalDataUsage.md)
 - [FactCount](docs/FactCount.md)
 - [Field](docs/Field.md)
 - [FieldNode](docs/FieldNode.md)
 - [FieldStoreValues](docs/FieldStoreValues.md)
 - [Filter](docs/Filter.md)
 - [FilterNode](docs/FilterNode.md)
 - [FilterStatement](docs/FilterStatement.md)
 - [GasCost](docs/GasCost.md)
 - [Group](docs/Group.md)
 - [GroupNode](docs/GroupNode.md)
 - [HttpHeader](docs/HttpHeader.md)
 - [Information](docs/Information.md)
 - [InformationListResponse](docs/InformationListResponse.md)
 - [InformationNode](docs/InformationNode.md)
 - [InterfaceNode](docs/InterfaceNode.md)
 - [Label](docs/Label.md)
 - [LabelList](docs/LabelList.md)
 - [LabelListMember](docs/LabelListMember.md)
 - [LabelListMemberNode](docs/LabelListMemberNode.md)
 - [LabelListNode](docs/LabelListNode.md)
 - [LabelStatement](docs/LabelStatement.md)
 - [ListCriteria](docs/ListCriteria.md)
 - [Login](docs/Login.md)
 - [LoginNode](docs/LoginNode.md)
 - [Member](docs/Member.md)
 - [MemberNode](docs/MemberNode.md)
 - [Mirror](docs/Mirror.md)
 - [MirrorNode](docs/MirrorNode.md)
 - [ModelInterface](docs/ModelInterface.md)
 - [NamedNode](docs/NamedNode.md)
 - [NodeIdRequest](docs/NodeIdRequest.md)
 - [NodeListing](docs/NodeListing.md)
 - [Permission](docs/Permission.md)
 - [PermissionAction](docs/PermissionAction.md)
 - [PermissionEffect](docs/PermissionEffect.md)
 - [PermissionNode](docs/PermissionNode.md)
 - [PermissionPolicyDocument](docs/PermissionPolicyDocument.md)
 - [Price](docs/Price.md)
 - [PriceDetails](docs/PriceDetails.md)
 - [PriceNode](docs/PriceNode.md)
 - [ReadInformationRequest](docs/ReadInformationRequest.md)
 - [ReadInformationResponse](docs/ReadInformationResponse.md)
 - [ReadItem](docs/ReadItem.md)
 - [ReadRequest](docs/ReadRequest.md)
 - [ReadResponse](docs/ReadResponse.md)
 - [ReadStatusItem](docs/ReadStatusItem.md)
 - [ReplaceFieldRequest](docs/ReplaceFieldRequest.md)
 - [ResetLoginCredentialsRequest](docs/ResetLoginCredentialsRequest.md)
 - [ResetLoginResponse](docs/ResetLoginResponse.md)
 - [Scope](docs/Scope.md)
 - [ScopeNode](docs/ScopeNode.md)
 - [SearchAliasRequest](docs/SearchAliasRequest.md)
 - [SearchAliasResponse](docs/SearchAliasResponse.md)
 - [SearchEntityRequest](docs/SearchEntityRequest.md)
 - [Searches](docs/Searches.md)
 - [SettleAccountRequest](docs/SettleAccountRequest.md)
 - [SettleAccountResponse](docs/SettleAccountResponse.md)
 - [StandardNode](docs/StandardNode.md)
 - [StandardNodeResponse](docs/StandardNodeResponse.md)
 - [Statement](docs/Statement.md)
 - [StatementStatement](docs/StatementStatement.md)
 - [Summary](docs/Summary.md)
 - [Template](docs/Template.md)
 - [TemplateNode](docs/TemplateNode.md)
 - [TokenPayment](docs/TokenPayment.md)
 - [TransformElement](docs/TransformElement.md)
 - [UpdateApplicationRequest](docs/UpdateApplicationRequest.md)
 - [UpdateApplicationResponse](docs/UpdateApplicationResponse.md)
 - [UpdateStatusRequest](docs/UpdateStatusRequest.md)
 - [Watch](docs/Watch.md)
 - [WatchEvent](docs/WatchEvent.md)
 - [WatchEventNode](docs/WatchEventNode.md)
 - [WatchNode](docs/WatchNode.md)
 - [WriteItem](docs/WriteItem.md)
 - [WriteRequest](docs/WriteRequest.md)
 - [WriteResponse](docs/WriteResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://factern-test.eu.auth0.com/oauth/token
- **Scopes**: 
  - profile: Grants read and write access to administrative information
  - openid: Grants read and write access to administrative information
  - email: Grants read and write access to administrative information
  - phone: Grants write access
  - address: Grants read access


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

mailto:support@factern.com


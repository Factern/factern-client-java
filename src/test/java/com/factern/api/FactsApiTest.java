package com.factern.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.factern.ApiClient;
import com.factern.ApiException;
import com.factern.model.AddLabelRequest;
import com.factern.model.AddStatementRequest;
import com.factern.model.ApiEndpoint;
import com.factern.model.CreateAliasRequest;
import com.factern.model.CreateApplicationRequest;
import com.factern.model.CreateBidRequest;
import com.factern.model.CreateDomainRequest;
import com.factern.model.CreateEntityResponse;
import com.factern.model.CreateFieldRequest;
import com.factern.model.CreateFieldResponse;
import com.factern.model.CreateFilterRequest;
import com.factern.model.CreateGroupRequest;
import com.factern.model.CreateEntityRequest;
import com.factern.model.CreateInformationRequest;
import com.factern.model.CreateInformationResponse;
import com.factern.model.CreateInterfaceRequest;
import com.factern.model.CreateLabelListRequest;
import com.factern.model.CreateLoginRequest;
import com.factern.model.CreateMemberRequest;
import com.factern.model.CreateMirrorRequest;
import com.factern.model.CreatePermissionRequest;
import com.factern.model.CreatePriceRequest;
import com.factern.model.CreatePriceResponse;
import com.factern.model.CreateScopeRequest;
import com.factern.model.CreateTemplateRequest;
import com.factern.model.CreateWatchRequest;
import com.factern.model.DeleteRequest;
import com.factern.model.DescribeRequest;
import com.factern.model.DescribeResponse;
import com.factern.model.Entity;
import com.factern.model.FilterStatement;
import com.factern.model.LabelListMember;
import com.factern.model.NodeIdRequest;
import com.factern.model.NodeListing;
import com.factern.model.PermissionAction;
import com.factern.model.PermissionEffect;
import com.factern.model.PermissionPolicyDocument;
import com.factern.model.PriceDetails;
import com.factern.model.ReadRequest;
import com.factern.model.ReplaceFieldRequest;
import com.factern.model.ResetLoginCredentialsRequest;
import com.factern.model.SearchAliasRequest;
import com.factern.model.SearchEntityRequest;
import com.factern.model.SettleAccountRequest;
import com.factern.model.StandardNode;
import com.factern.model.TokenPayment;
import com.factern.model.UpdateApplicationRequest;
import com.factern.model.UpdateStatusRequest;
import com.factern.model.WriteRequest;
import com.google.gson.JsonObject;

/**
 * API tests for FactsApi
 */
public class FactsApiTest {

    private static final String loginId = "00000000ADD8EE62EAC53F925FD09407AB2AD1DF6E55BFF4";

    private FactsApi api;

    @Before
    public void setup() {
        final OAuthUtils oauthUtils = new OAuthUtils();
        final ApiClient apiClient = new ApiClient();
        apiClient.setDebugging(true);
        try {
            oauthUtils.setSecurity(apiClient);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
        api = new FactsApi();
        api.setApiClient(apiClient);
    }

    /**
     * Create Member
     */
    @Test
    public void addMemberTest() throws ApiException {
        final String entityId1 = createEntity().getNodeId();
        final String entityId2 = createEntity().getNodeId();

        final CreateGroupRequest createGroupRequest = new CreateGroupRequest()
            .addMemberIdsItem(entityId1)
            .addMemberIdsItem(entityId2)
            .memberFactType("Entity")
            .name("grp" + new Random().nextInt(Integer.MAX_VALUE));
        final String groupId = api.createGroup(createGroupRequest, loginId, loginId).getNodeId();

        final String entityId3 = createEntity().getNodeId();

        final CreateMemberRequest createMemberRequest = new CreateMemberRequest()
            .parentId(groupId)
            .memberId(entityId3);
        assertNotNull(api.addMember(createMemberRequest, loginId, loginId));
    }

    /**
     * Create Bid
     */
    @Test
    public void bidTest() throws ApiException {
        final String entityId = createEntity().getNodeId();

        final CreatePriceRequest createPriceRequest = new CreatePriceRequest()
            .targetNodeId(entityId)
            .type(CreatePriceRequest.TypeEnum.FIXED)
            .policy(new PermissionPolicyDocument()
                .addActionsItem(PermissionAction.READ))
            .priceDetails(new PriceDetails().value(new BigDecimal(100)));

        final CreatePriceResponse createPriceResponse = api.createPrice(createPriceRequest, loginId, loginId);

        final CreateBidRequest createBidRequest = new CreateBidRequest()
            .priceId(createPriceResponse.getNodeId());
        assertNotNull(api.bid(createBidRequest, loginId, loginId));
    }

    /**
     * Create Alias
     */
    @Test
    public void createAliasTest() throws ApiException {
        final String entityId = createEntity().getNodeId();
        assertNotNull(api.createAlias(new CreateAliasRequest()
            .local(false)
            .name("alias" + new Random().nextInt(Integer.MAX_VALUE))
            .targetNodeId(entityId), loginId, loginId));
    }

    /**
     * Create Application
     */
    @Test
    public void createApplicationTest() throws ApiException {
        final CreateApplicationRequest createApplicationRequest = new CreateApplicationRequest()
            .name("app" + new Random().nextInt(Integer.MAX_VALUE));

        assertNotNull(api.createApplication(createApplicationRequest, loginId, loginId));
    }

    /**
     * Create Domain
     */
    @Test
    public void createDomainTest() throws ApiException {
        final CreateDomainRequest createDomainRequest = new CreateDomainRequest()
            .addFact(new ApiEndpoint().url("https://example.com/add"))
            .getFact(new ApiEndpoint().url("https://example.com/get"))
            .queryFacts(new ApiEndpoint().url("https://example.com/query"))
            .name("domain" + new Random().nextInt(Integer.MAX_VALUE));

        assertNotNull(api.createDomain(createDomainRequest, loginId, loginId));
    }

    /**
     * Create Entity
     */
    @Test
    public void createEntityTest() throws ApiException, MalformedURLException, IOException {
        assertNotNull(createEntity());
    }

    /**
     * Create Field
     */
    @Test
    public void createFieldTest() throws ApiException {
        assertNotNull(createField());
    }

    /**
     * Create Filter
     */
    @Test
    public void createFilterTest() throws ApiException {
        final String entityId = createEntity().getNodeId();
        final CreateFilterRequest createFilterRequest = new CreateFilterRequest()
            .name("filter" + new Random().nextInt(Integer.MAX_VALUE))
            .addStatementsItem(new FilterStatement()
                .field(FilterStatement.FieldEnum.ACTIONQUALIFIER)
                .addArgumentsItem(entityId));

        assertNotNull(api.createFilter(createFilterRequest, loginId, loginId));
    }

    /**
     * Create Group
     */
    @Test
    public void createGroupTest() throws ApiException {
        final String entityId1 = createEntity().getNodeId();
        final String entityId2 = createEntity().getNodeId();

        final CreateGroupRequest request = new CreateGroupRequest()
            .addMemberIdsItem(entityId1)
            .addMemberIdsItem(entityId2)
            .memberFactType("Entity")
            .name("grp" + new Random().nextInt(Integer.MAX_VALUE));
        assertNotNull(api.createGroup(request, loginId, loginId));
    }

    /**
     * Create Information
     */
    @Test
    public void createInformationTest() throws ApiException {

        final String entityId = createEntity().getNodeId();
        final String fieldId = createField().getNodeId();
        final String data = "data" + new Random().nextInt(Integer.MAX_VALUE);

        final CreateInformationRequest createInfoRequest = new CreateInformationRequest()
            .parentId(entityId)
            .fieldId(fieldId)
            .data(data);

        assertNotNull(api.createInformation(createInfoRequest, loginId, loginId));
    }

    /**
     * Create Interface
     */
    @Test
    public void createInterfaceTest() throws ApiException {
        final CreateInterfaceRequest createInterfaceRequest = new CreateInterfaceRequest()
            .addData(new ApiEndpoint().url("https://example.com/add"))
            .getData(new ApiEndpoint().url("https://example.com/get"))
            .deleteData(new ApiEndpoint().url("https://example.com/delete"))
            .name("interface" + new Random().nextInt(Integer.MAX_VALUE));

        assertNotNull(api.createInterface(createInterfaceRequest, loginId, loginId));
    }

    /**
     * Create Label List
     */
    @Test
    public void createLabelListTest() throws ApiException {
        final CreateLabelListRequest createLabelListRequest = new CreateLabelListRequest()
            .name("labellist" + new Random().nextInt(Integer.MAX_VALUE))
            .addMembersItem("abc")
            .addMembersItem("def");

        assertNotNull(api.createLabelList(createLabelListRequest, loginId, loginId));
    }

    /**
     * Create Login. Ignored because creates a login
     */
    @Test
    @Ignore
    public void createLoginTest() throws ApiException {
        final CreateLoginRequest createLoginRequest = new CreateLoginRequest()
            .email("swhite+" + new Random().nextInt(Integer.MAX_VALUE) + "@finovertech.com");

        assertNotNull(api.createLogin(createLoginRequest, loginId, loginId));
    }

    /**
     * Create Mirror
     */
    @Test
    public void createMirrorTest() throws ApiException {
        final String srcEntityId = createEntity().getNodeId();
        final String targetEntityId = createEntity().getNodeId();
        final String fieldId = createField("field" + new Random().nextInt(Integer.MAX_VALUE), true).getNodeId();
        final String data = "data" + new Random().nextInt(Integer.MAX_VALUE);

        final CreateInformationRequest createInfoRequest = new CreateInformationRequest()
            .parentId(srcEntityId)
            .fieldId(fieldId)
            .data(data);

        final CreateTemplateRequest createTemplateRequest = new CreateTemplateRequest()
            .name("template" + new Random().nextInt(Integer.MAX_VALUE))
            .addMemberIdsItem(fieldId);
        final String templateId = api.createTemplate(createTemplateRequest, loginId, loginId).getNodeId();

        api.createInformation(createInfoRequest, loginId, loginId);

        final CreateMirrorRequest createMirrorRequest = new CreateMirrorRequest()
            .sourceNodeId(srcEntityId)
            .destinationNodeId(targetEntityId)
            .templateId(templateId);

        assertNotNull(api.createMirror(createMirrorRequest, loginId, loginId));
    }

    /**
     * Create Price
     */
    @Test
    public void createPriceTest() throws ApiException {
        final String entityId = createEntity().getNodeId();

        final CreatePriceRequest createPriceRequest = new CreatePriceRequest()
            .targetNodeId(entityId)
            .type(CreatePriceRequest.TypeEnum.FIXED)
            .policy(new PermissionPolicyDocument()
                .addActionsItem(PermissionAction.READ))
            .priceDetails(new PriceDetails().value(new BigDecimal(100)));

        assertNotNull(api.createPrice(createPriceRequest, loginId, loginId));
    }

    /**
     * Create Scope
     */
    @Test
    public void createScopeTest() throws ApiException {
        final String fieldId1 = createField().getNodeId();
        final String fieldId2 = createField().getNodeId();
        final CreateTemplateRequest createTemplateRequest = new CreateTemplateRequest()
            .name("template" + new Random().nextInt(Integer.MAX_VALUE))
            .addMemberIdsItem(fieldId1)
            .addMemberIdsItem(fieldId2);
        final String templateId = api.createTemplate(createTemplateRequest, loginId, loginId).getNodeId();

        final CreateScopeRequest createScopeRequest = new CreateScopeRequest()
            .name("scope" + new Random().nextInt(Integer.MAX_VALUE))
            .addTemplateIdsItem(templateId);
        assertNotNull(api.createScope(createScopeRequest, loginId, loginId));
    }

    /**
     * Create Statement
     */
    @Test
    public void createStatementTest() throws ApiException {
        final CreateApplicationRequest createApplicationRequest = new CreateApplicationRequest()
            .name("app" + new Random().nextInt(Integer.MAX_VALUE));

        final String appId = api.createApplication(createApplicationRequest, loginId, loginId).getNodeId();

        final String fieldId1 = createField().getNodeId();
        final String fieldId2 = createField().getNodeId();
        final CreateTemplateRequest createTemplateRequest = new CreateTemplateRequest()
            .name("template" + new Random().nextInt(Integer.MAX_VALUE))
            .addMemberIdsItem(fieldId1)
            .addMemberIdsItem(fieldId2);
        final String templateId = api.createTemplate(createTemplateRequest, loginId, loginId).getNodeId();

        final CreateScopeRequest createScopeRequest = new CreateScopeRequest()
            .name("scope" + new Random().nextInt(Integer.MAX_VALUE))
            .addTemplateIdsItem(templateId);
        final String scopeId = api.createScope(createScopeRequest, loginId, loginId).getNodeId();

        final AddStatementRequest addStatementRequest = new AddStatementRequest()
            .targetNodeId(appId)
            .actionId("frn:predicate:factern:requiresScope")
            .actionQualifierId(scopeId);
        assertNotNull(api.createStatement(addStatementRequest, loginId, loginId));
    }

    /**
     * Create Template
     */
    @Test
    public void createTemplateTest() throws ApiException {
        final String fieldId1 = createField().getNodeId();
        final String fieldId2 = createField().getNodeId();
        final CreateTemplateRequest createTemplateRequest = new CreateTemplateRequest()
            .name("template" + new Random().nextInt(Integer.MAX_VALUE))
            .addMemberIdsItem(fieldId1)
            .addMemberIdsItem(fieldId2);
        assertNotNull(api.createTemplate(createTemplateRequest, loginId, loginId));
    }

    /**
     * Delete Node
     */
    @Test
    public void deleteNodeTest() throws ApiException {
        final String entityId = createEntity().getNodeId();

        assertNotNull(api.deleteNode(new NodeIdRequest().nodeId(entityId), loginId, loginId));
    }

    /**
     * Delete
     */
    @Test
    public void deleteTest() throws ApiException {
        final String entityId = createEntity().getNodeId();
        final String fieldId = createField().getNodeId();
        final String data = "data" + new Random().nextInt(Integer.MAX_VALUE);

        final CreateInformationRequest createInfoRequest = new CreateInformationRequest()
            .parentId(entityId)
            .fieldId(fieldId)
            .data(data);

        final CreateInformationResponse createInfoResponse = api.createInformation(createInfoRequest, loginId, loginId);

        assertNotNull(api.delete(new DeleteRequest().nodeId(entityId).addTemplateItem(fieldId), loginId, loginId));
    }

    /**
     * Describe
     */
    @Test
    public void describeTest() throws ApiException {
        final String entityId = createEntity().getNodeId();

        final DescribeResponse resp = api.describe(new DescribeRequest().nodeId(entityId), loginId, loginId);
        final NodeListing nl = resp.getChildren();
        assertNotNull(nl);
        final List<StandardNode> l = nl.getNodes();
        assertNotNull(l);
        assertEquals(0, l.size());

        final StandardNode node = resp.getNode();

        assertNotNull(node);

        assertTrue(node instanceof Entity);
    }

    /**
     * History
     */
    @Test
    public void historyTest() throws ApiException {
        final String entityId = createEntity().getNodeId();

        assertNotNull(api.history(new NodeIdRequest().nodeId(entityId), loginId, loginId));
    }

    /**
     * Label a Node
     */
    @Test
    public void labelTest() throws ApiException {
        final CreateLabelListRequest createLabelListRequest = new CreateLabelListRequest()
            .name("labellist" + new Random().nextInt(Integer.MAX_VALUE))
            .addMembersItem("abc")
            .addMembersItem("def");

        final LabelListMember labelNode = api.createLabelList(createLabelListRequest, loginId, loginId).getMembers()
            .get(0);

        final String entityId = createEntity().getNodeId();

        final AddLabelRequest addLabelRequest = new AddLabelRequest()
            .targetNodeId(entityId)
            .labelId(labelNode.getNodeId());

        assertNotNull(api.label(addLabelRequest, loginId, loginId));
    }

    /**
     * Obliterating Information Nodes
     */
    @Test
    public void obliterateTest() throws ApiException {
        final String entityId = createEntity().getNodeId();
        final String fieldId = createField().getNodeId();
        final String data = "data" + new Random().nextInt(Integer.MAX_VALUE);

        final CreateInformationRequest createInfoRequest = new CreateInformationRequest()
            .parentId(entityId)
            .fieldId(fieldId)
            .data(data);

        final CreateInformationResponse createInfoResponse = api.createInformation(createInfoRequest, loginId, loginId);

        assertNotNull(api.obliterate(new NodeIdRequest().nodeId(createInfoResponse.getNodeId()), loginId, loginId));
    }

    /**
     * Create Permission
     */
    @Test
    public void permissionTest() throws ApiException {
        final String entityId = createEntity().getNodeId();

        final CreatePermissionRequest createPermissionRequest = new CreatePermissionRequest()
            .targetNodeId(entityId)
            .policy(new PermissionPolicyDocument()
                .effect(PermissionEffect.ALLOW)
                .addActionsItem(PermissionAction.READ));
        assertNotNull(api.permission(createPermissionRequest, loginId, loginId));
    }

    /**
     * Reading
     */
    @Test
    public void readTest() throws ApiException {
        final String entityId = createEntity().getNodeId();
        final String fieldId = createField().getNodeId();
        final String data = "data" + new Random().nextInt(Integer.MAX_VALUE);

        final CreateInformationRequest createInfoRequest = new CreateInformationRequest()
            .parentId(entityId)
            .fieldId(fieldId)
            .data(data);

        final CreateInformationResponse createInfoResponse = api.createInformation(createInfoRequest, loginId, loginId);

        assertNotNull(api.read(new ReadRequest().nodeId(entityId).addTemplateItem(fieldId), loginId, loginId));
    }

    /**
     * Replace
     */
    @Test
    public void replaceInformationTest() throws ApiException {
        final String entityId = createEntity().getNodeId();
        final String fieldId = createField().getNodeId();
        final String data = "data" + new Random().nextInt(Integer.MAX_VALUE);

        final CreateInformationRequest createInfoRequest = new CreateInformationRequest()
            .parentId(entityId)
            .fieldId(fieldId)
            .data(data);

        final CreateInformationResponse createInfoResponse = api.createInformation(createInfoRequest, loginId, loginId);

        assertNotNull(api.replaceInformation(new ReplaceFieldRequest()
            .nodeId(createInfoResponse.getNodeId())
            .data("data" + new Random().nextInt(Integer.MAX_VALUE)), loginId, loginId));
    }

    /**
     * Request Permission. Ignored because needs a valid interface.
     */
    @Test
    @Ignore
    public void requestPermissionTest() throws ApiException {
        final String entityId = createEntity().getNodeId();

        final CreateInterfaceRequest createInterfaceRequest = new CreateInterfaceRequest()
            .addData(new ApiEndpoint().url("https://example.com/add"))
            .name("interface" + new Random().nextInt(Integer.MAX_VALUE));

        final String interfaceId = api.createInterface(createInterfaceRequest, loginId, loginId).getNodeId();

        final CreatePermissionRequest createPermissionRequest = new CreatePermissionRequest()
            .targetNodeId(entityId)
            .policy(new PermissionPolicyDocument()
                .requestInterfaceId(interfaceId)
                .effect(PermissionEffect.ALLOW)
                .addActionsItem(PermissionAction.READ));
        assertNotNull(api.permission(createPermissionRequest, loginId, loginId));

        final NodeIdRequest nodeIdRequest = new NodeIdRequest()
            .nodeId(entityId);
        assertNotNull(api.requestPermission(nodeIdRequest, loginId, loginId));
    }

    /**
     * Updating Application
     */
    @Test
    public void updateApplicationTest() throws ApiException {
        final CreateApplicationRequest createApplicationRequest = new CreateApplicationRequest()
            .name("app" + new Random().nextInt(Integer.MAX_VALUE));

        final String appId = api.createApplication(createApplicationRequest, loginId, loginId).getNodeId();

        final UpdateApplicationRequest updateApplicationRequest = new UpdateApplicationRequest()
            .nodeId(appId);
        assertNotNull(api.updateApplication(updateApplicationRequest, loginId, loginId));
    }

    /**
     * Changing Login Password. Ignored because requires creation of a login.
     */
    @Test
    @Ignore
    public void resetLoginTest() throws ApiException {
        final String pwd = "pwd" + new Random().nextInt(Integer.MAX_VALUE);
        final CreateLoginRequest createLoginRequest = new CreateLoginRequest()
            .password(pwd)
            .email("swhite+" + new Random().nextInt(Integer.MAX_VALUE) + "@finovertech.com");

        final String createLoginId = api.createLogin(createLoginRequest, loginId, loginId)
            .getNodeId();

        final String newPwd = "pwd" + new Random().nextInt(Integer.MAX_VALUE);
        final ResetLoginCredentialsRequest resetLoginCredentialsRequest = new ResetLoginCredentialsRequest()
            .nodeId(createLoginId)
            .oldPassword(pwd)
            .newPassword(newPwd);
        assertNotNull(api.resetLogin(resetLoginCredentialsRequest, loginId, loginId));
    }

    /**
     * Search For Alias
     */
    @Test
    public void searchAliasTest() throws ApiException {
        final String entityId = createEntity().getNodeId();
        assertNotNull(api.createAlias(new CreateAliasRequest()
            .local(false)
            .name("alias" + new Random().nextInt(Integer.MAX_VALUE))
            .targetNodeId(entityId), loginId, loginId));
        assertNotNull(api.searchAlias(new SearchAliasRequest()
            .name("alias" + new Random().nextInt(Integer.MAX_VALUE)), loginId, loginId));
    }

    /**
     * Search For Entity
     */
    @Test
    public void searchEntityTest() throws ApiException {
        final String entityId = createEntity().getNodeId();
        final String fieldId = createField().getNodeId();
        final String data = "data" + new Random().nextInt(Integer.MAX_VALUE);

        final CreateInformationRequest createInfoRequest = new CreateInformationRequest()
            .parentId(entityId)
            .fieldId(fieldId)
            .data(data);

        assertNotNull(api.createInformation(createInfoRequest, loginId, loginId));

        assertNotNull(api.searchEntity(new SearchEntityRequest()
            .operator(SearchEntityRequest.OperatorEnum.EQUALS)
            .term(data)
            .fieldId(fieldId), loginId, loginId));


        // search entity with elasticsearch
        final JsonObject match_phrase = new JsonObject();
        match_phrase.addProperty("fields.value", data);

        final JsonObject must = new JsonObject();
        must.add("match_phrase", match_phrase);

        final JsonObject bool = new JsonObject();
        bool.add("must", must);

        final JsonObject query = new JsonObject();
        query.add("bool", bool);

        assertNotNull(api.searchEntity(new SearchEntityRequest()
            .operator(SearchEntityRequest.OperatorEnum.ELASTICSEARCH)
            .query(query), loginId, loginId));

    }

    /**
     * Settle Account. Ignored because needs ethereum support.
     */
    @Test
    @Ignore
    public void settleAccountTest() throws ApiException {
        final SettleAccountRequest settleAccountRequest = new SettleAccountRequest()
            .tokenPayment(new TokenPayment().value("123"));
        assertNotNull(api.settleAccount(settleAccountRequest, loginId, loginId));
    }

    /**
     * Enabling/Disabling Nodes
     */
    @Test
    public void updateStatusTest() throws ApiException {
        final String srcEntityId = createEntity().getNodeId();
        final String targetEntityId = createEntity().getNodeId();
        final String fieldId = createField("field" + new Random().nextInt(Integer.MAX_VALUE), true).getNodeId();
        final String data = "data" + new Random().nextInt(Integer.MAX_VALUE);

        final CreateInformationRequest createInfoRequest = new CreateInformationRequest()
            .parentId(srcEntityId)
            .fieldId(fieldId)
            .data(data);

        final CreateTemplateRequest createTemplateRequest = new CreateTemplateRequest()
            .name("template" + new Random().nextInt(Integer.MAX_VALUE))
            .addMemberIdsItem(fieldId);
        final String templateId = api.createTemplate(createTemplateRequest, loginId, loginId).getNodeId();

        api.createInformation(createInfoRequest, loginId, loginId);

        final CreateMirrorRequest createMirrorRequest = new CreateMirrorRequest()
            .sourceNodeId(srcEntityId)
            .destinationNodeId(targetEntityId)
            .templateId(templateId);

        final String mirrorId = api.createMirror(createMirrorRequest, loginId, loginId).getNodeId();

        final UpdateStatusRequest updateStatusRequest = new UpdateStatusRequest()
            .status(UpdateStatusRequest.StatusEnum.DISABLED)
            .nodeId(mirrorId);
        assertNotNull(api.updateStatus(updateStatusRequest, loginId, loginId));
    }

    /**
     * Create Watch Trigger
     */
    @Test
    public void watchTest() throws ApiException {
        final String entityId = createEntity().getNodeId();

        final CreateWatchRequest createWatchRequest = new CreateWatchRequest()
            .targetNodeId(entityId);

        assertNotNull(api.watch(createWatchRequest, loginId, loginId));
    }

    /**
     * Writing by Template
     */
    @Test
    public void writeTest() throws ApiException {
        final String entityId = createEntity().getNodeId();
        final String fieldId = createField().getNodeId();
        final String data = "data" + new Random().nextInt(Integer.MAX_VALUE);

        final WriteRequest writeRequest = new WriteRequest()
            .nodeId(entityId)
            .addTemplateItem(fieldId)
            .addValuesItem(data);

        assertNotNull(api.write(writeRequest, loginId, loginId));
    }

    private CreateFieldResponse createField() throws ApiException {
        return createField("field" + new Random().nextInt(Integer.MAX_VALUE));
    }

    private CreateFieldResponse createField(final String name) throws ApiException {
        final CreateFieldRequest request = new CreateFieldRequest()
            .name(name);

        return createField(name, false);
    }

    private CreateFieldResponse createField(final String name, final boolean uniqueByParent) throws ApiException {
        final CreateFieldRequest request = new CreateFieldRequest()
            .uniqueByParent(uniqueByParent)
            .name(name);

        return api.createField(request, loginId, loginId);
    }

    private CreateEntityResponse createEntity() throws ApiException {
        return createEntity("en" + new Random().nextInt(Integer.MAX_VALUE));
    }

    private CreateEntityResponse createEntity(final String name) throws ApiException {
        final CreateEntityRequest request = new CreateEntityRequest()
            .name(name);

        return api.createEntity(request, loginId, loginId);
    }
}

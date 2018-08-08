

# CreateLoginResponse

## Properties

Name | Type | Required
-------- | -------- | --------
dataRootNode | String | required
status | [StatusEnum](#StatusEnum) | required
timestamp | [BigDecimal](BigDecimal.md) | optional
nodeId | String | optional
agent | [Agent](Agent.md) | optional
summary | [Summary](Summary.md) | optional
batchId | String | optional
factType | String | optional
parentId | String | optional




## Enums


<a name="StatusEnum"></a>
### StatusEnum

Name | Value
---- | -----
PENDING_CONFIRMATION | &quot;PENDING_CONFIRMATION&quot;
FAILED_TO_SEND_EMAIL | &quot;FAILED_TO_SEND_EMAIL&quot;






## Inheritance hierarchy


* [CreateLoginResponse](CreateLoginResponse.md)
    * [BaseResponse](BaseResponse.md)



# CreatePriceRequest

## Properties

Name | Type | Required
-------- | -------- | --------
policy | [PermissionPolicyDocument](PermissionPolicyDocument.md) | required
targetNodeId | String | required
priceDetails | [PriceDetails](PriceDetails.md) | required
type | [TypeEnum](#TypeEnum) | required
includeSummary | Boolean | optional




## Enums


<a name="TypeEnum"></a>
### TypeEnum

Name | Value
---- | -----
FIXED | &quot;Fixed&quot;






## Inheritance heirarchy


* [CreatePriceRequest](CreatePriceRequest.md)
    * [BaseRequest](BaseRequest.md)

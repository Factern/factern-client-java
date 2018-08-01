

# ApiEndpoint

## Properties

Name | Type | Required
-------- | -------- | --------
body | String | optional
url | String | required
responseTransform | [List&lt;TransformElement&gt;](TransformElement.md) | optional
headers | [List&lt;HttpHeader&gt;](HttpHeader.md) | optional
type | [TypeEnum](#TypeEnum) | optional
method | [MethodEnum](#MethodEnum) | optional




## Enums


<a name="TypeEnum"></a>
### TypeEnum

Name | Value
---- | -----
DIRECT | &quot;Direct&quot;
INDIRECT | &quot;Indirect&quot;



<a name="MethodEnum"></a>
### MethodEnum

Name | Value
---- | -----
GET | &quot;GET&quot;
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;






## Inheritance heirarchy


* [ApiEndpoint](ApiEndpoint.md)

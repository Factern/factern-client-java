

# SearchEntityRequest

## Properties

Name | Type | Required
-------- | -------- | --------
term | String | optional
maxResults | [BigDecimal](BigDecimal.md) | optional
restrictTo | String | optional
operator | [OperatorEnum](#OperatorEnum) | optional
query | Object | optional
nextToken | String | optional
fieldId | String | optional
includeSummary | Boolean | optional




## Enums


<a name="OperatorEnum"></a>
### OperatorEnum

Name | Value
---- | -----
EQUALS | &quot;equals&quot;
STARTSWITH | &quot;startsWith&quot;
CONTAINS | &quot;contains&quot;
ELASTICSEARCH | &quot;elasticsearch&quot;






## Inheritance heirarchy


* [SearchEntityRequest](SearchEntityRequest.md)
    * [BaseRequest](BaseRequest.md)

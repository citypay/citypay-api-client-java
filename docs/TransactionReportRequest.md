

# TransactionReportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fields** | **List&lt;String&gt;** |  |  [optional] |
|**from** | **OffsetDateTime** | The date and time of transactions from. |  |
|**includeAuthorised** | **Boolean** | Include transactions fully authorised in the results. |  [optional] |
|**includeCancelled** | **Boolean** | Include transactions that were cancelled in the results. |  [optional] |
|**includeDeclined** | **Boolean** | Include transactions that were declined or not honoured in the results. |  [optional] |
|**includeRejected** | **Boolean** | Include transactions that were rejected due to validation issues. |  [optional] |
|**includeUnfulfilled** | **Boolean** | Includes transactions that were initiated but not completed—e.g. those pending authentication or challenge responses that were never fulfilled. |  [optional] |
|**maxResults** | **Integer** | The maximum number of results to return in a single response. This value is used to limit the size of data returned by the API, enhancing performance and manageability. Values should be between 5 and 250. |  [optional] |
|**merchantid** | **Integer** | The merchant id of the transactions to review. |  |
|**mode** | **String** | Defines a preset profile for the level of detail in the returned fields. This simplifies response formatting for common use cases. Available values:  - &#x60;basic&#x60; (default): Returns a minimal, high-level view with key fields for reporting or dashboards.  - &#x60;extended&#x60;: Adds fields useful for customer support, settlement analysis, or more in-depth tracking, while still omitting sensitive personal or low-level fields.  - &#x60;full&#x60;: Returns all available transaction fields, including internal flags, personal data (where applicable), and detailed metadata. Use with care.  |  [optional] |
|**nextToken** | **String** | A token that identifies the starting point of the page of results to be returned. An empty value indicates the start of the dataset. When supplied, it is validated and used to fetch the subsequent page of results. This token is typically obtained from the response of a previous pagination request. |  [optional] |
|**orderBy** | **String** | Specifies the field by which results are ordered. Available fields are [trans_no,date_when,amount]. By default, fields are ordered by OrderByExpression(trans_no,ASC). To order in descending order, prefix with &#39;-&#39; or suffix with &#39; DESC&#39;. |  [optional] |
|**piiMasked** | **Boolean** | Defines whether personal identifiable information is masked which it is by default. |  [optional] |
|**typeRefund** | **Boolean** | Include refunds in the results. |  [optional] |
|**typeSale** | **Boolean** | Include sales in the results. |  [optional] |
|**typeVerify** | **Boolean** | Include verifications in the results. |  [optional] |
|**until** | **OffsetDateTime** | The date and time of transactions until. |  |




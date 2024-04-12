

# RemittedClientData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batches** | [**List&lt;MerchantBatchResponse&gt;**](MerchantBatchResponse.md) |  |  |
|**clientid** | **String** | The client id that the remittance data is for. |  [optional] |
|**date** | **LocalDate** | The date of the remittance. |  [optional] |
|**dateCreated** | **OffsetDateTime** | The date time that the remittance was created. |  [optional] |
|**netAmount** | **Integer** | Represents the net amount after accounting for refunds. This is calculated as SalesAmount - RefundAmount and expressed in the smallest currency unit. |  [optional] |
|**processedAmount** | **Integer** | The total monetary amount processed consisting of sale and refund transactions. |  [optional] |
|**processedCount** | **Integer** | Indicates the total number of sales and refund transactions that occurred. This count provides insight into the volume of processing. |  [optional] |
|**refundAmount** | **Integer** | The total amount refunded to customers. |  [optional] |
|**refundCount** | **Integer** | The total number of refund transactions processed. This figure helps in understanding the frequency of refunds relative to sales. |  [optional] |
|**remittances** | [**List&lt;RemittanceData&gt;**](RemittanceData.md) |  |  |
|**salesAmount** | **Integer** | The total monetary amount of sales transactions. |  [optional] |
|**salesCount** | **Integer** | Indicates the total number of sales transactions that occurred. This count provides insight into the volume of sales. |  [optional] |
|**settlementImplementation** | **String** | The name of the implementation. |  [optional] |
|**uuid** | **UUID** | The uuid of the settlement file processed on. |  [optional] |






# RemittanceData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateCreated** | **OffsetDateTime** | Represents the date and time when the remittance was processed. This timestamp follows the ISO 8601 format for datetime representation. |  [optional] |
|**netAmount** | **Integer** | Represents the net amount after accounting for refunds. This is calculated as SalesAmount - RefundAmount and expressed in the smallest currency unit. |  [optional] |
|**refundAmount** | **Integer** | The total amount refunded to customers. |  [optional] |
|**refundCount** | **Integer** | The total number of refund transactions processed. This figure helps in understanding the frequency of refunds relative to sales. |  [optional] |
|**salesAmount** | **Integer** | The total monetary amount of sales transactions. |  [optional] |
|**salesCount** | **Integer** | Indicates the total number of sales transactions that occurred. This count provides insight into the volume of sales. |  [optional] |




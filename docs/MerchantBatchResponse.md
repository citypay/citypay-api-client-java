

# MerchantBatchResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**batchClosed** | **OffsetDateTime** | The date and time when the batch was closed. This is represented in ISO 8601 format (e.g., YYYY-MM-DDTHH:MM:SSZ) and indicates when the batch processing was completed. |  [optional] |
|**batchNo** | **String** | The incremental identifier of the batch. This number is used to track and reference the batch in subsequent operations or inquiries. |  [optional] |
|**batchStatus** | **String** | A descriptive string detailing the current status of the batch. This status provides a human-readable explanation of the batch&#39;s processing state. |  [optional] |
|**batchStatusCode** | **String** | A batch status code that represents the processing state of the batch. Batches will be one of  - &#39;O&#39; defining the batch is open for settlement and not yet settled  - &#39;X&#39; defines that the batch is external to our systems and managed elsewhere  - &#39;C&#39; defines that the batch is cancelled and not settled  - &#39;S&#39; defines that the batch has been settled and remitted.  |  [optional] |
|**currency** | **String** | The currency of the batch. |  [optional] |
|**merchantid** | **Integer** | The Merchant ID (MID) associated with the batch. This identifier specifies which merchant account the batch was processed for, linking transactions to the merchant. |  [optional] |
|**netSummary** | [**NetSummaryResponse**](NetSummaryResponse.md) |  |  [optional] |




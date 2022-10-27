# .com.citypay.client.api.BatchProcessingApiApi

All URIs are relative to *https://api.citypay.com*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**batchProcessRequest**](BatchProcessingApiApi.md#batchprocessrequest) | **POST** /v6/batch/process | Batch Process Request |
| [**batchReportRequest**](BatchProcessingApiApi.md#batchreportrequest) | **POST** /v6/batch/retrieve | BatchReportRequest |
| [**checkBatchStatusRequest**](BatchProcessingApiApi.md#checkbatchstatusrequest) | **POST** /v6/batch/status | CheckBatchStatus |

<a name="batchprocessrequest"></a>
# **batchProcessRequest**
> ProcessBatchResponse batchProcessRequest (ProcessBatchRequest processBatchRequest)

Batch Process Request

A batch process request is used to start the batch process workflow by uploading batch
data and initialising a new batch for processing. Once validated the batch will be queued
for processing and further updates can be received by a subsequent call to retrieve the batch
status.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class batchProcessRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.citypay.com";
            // Configure API key authorization: cp-api-key
            config.AddApiKey("cp-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("cp-api-key", "Bearer");

            var apiInstance = new BatchProcessingApiApi(config);
            var processBatchRequest = new ProcessBatchRequest(); // ProcessBatchRequest | 

            try
            {
                // Batch Process Request
                ProcessBatchResponse result = apiInstance.batchProcessRequest(processBatchRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BatchProcessingApiApi.batchProcessRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the batchProcessRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Batch Process Request
    ApiResponse<ProcessBatchResponse> response = apiInstance.batchProcessRequestWithHttpInfo(processBatchRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BatchProcessingApiApi.batchProcessRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **processBatchRequest** | [**ProcessBatchRequest**](ProcessBatchRequest.md) |  |  |

### Return type

[**ProcessBatchResponse**](ProcessBatchResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: application/json, text/xml
 - **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request to process a batch provided in the request. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="batchreportrequest"></a>
# **batchReportRequest**
> BatchReportResponseModel batchReportRequest (BatchReportRequest batchReportRequest)

BatchReportRequest

The operation is used to retrieve a report of the result of a batch process.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class batchReportRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.citypay.com";
            // Configure API key authorization: cp-api-key
            config.AddApiKey("cp-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("cp-api-key", "Bearer");

            var apiInstance = new BatchProcessingApiApi(config);
            var batchReportRequest = new BatchReportRequest(); // BatchReportRequest | 

            try
            {
                // BatchReportRequest
                BatchReportResponseModel result = apiInstance.batchReportRequest(batchReportRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BatchProcessingApiApi.batchReportRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the batchReportRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // BatchReportRequest
    ApiResponse<BatchReportResponseModel> response = apiInstance.batchReportRequestWithHttpInfo(batchReportRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BatchProcessingApiApi.batchReportRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **batchReportRequest** | [**BatchReportRequest**](BatchReportRequest.md) |  |  |

### Return type

[**BatchReportResponseModel**](BatchReportResponseModel.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: application/json, text/xml
 - **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The report for a given batch. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="checkbatchstatusrequest"></a>
# **checkBatchStatusRequest**
> CheckBatchStatusResponse checkBatchStatusRequest (CheckBatchStatus checkBatchStatus)

CheckBatchStatus

The operation is used to retrieve the status of a batch process.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class checkBatchStatusRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.citypay.com";
            // Configure API key authorization: cp-api-key
            config.AddApiKey("cp-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("cp-api-key", "Bearer");

            var apiInstance = new BatchProcessingApiApi(config);
            var checkBatchStatus = new CheckBatchStatus(); // CheckBatchStatus | 

            try
            {
                // CheckBatchStatus
                CheckBatchStatusResponse result = apiInstance.checkBatchStatusRequest(checkBatchStatus);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BatchProcessingApiApi.checkBatchStatusRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the checkBatchStatusRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // CheckBatchStatus
    ApiResponse<CheckBatchStatusResponse> response = apiInstance.checkBatchStatusRequestWithHttpInfo(checkBatchStatus);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BatchProcessingApiApi.checkBatchStatusRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **checkBatchStatus** | [**CheckBatchStatus**](CheckBatchStatus.md) |  |  |

### Return type

[**CheckBatchStatusResponse**](CheckBatchStatusResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: application/json, text/xml
 - **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The status of batches provided in the request. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


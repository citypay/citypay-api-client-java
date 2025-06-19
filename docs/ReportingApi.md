# ReportingApi

All URIs are relative to *https://api.citypay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchedTransactionReportRequest**](ReportingApi.md#batchedTransactionReportRequest) | **POST** /v6/merchant-batch/{merchantid}/{batch_no}/transactions | Batch Transaction Report Request |
| [**merchantBatchReportRequest**](ReportingApi.md#merchantBatchReportRequest) | **POST** /v6/merchant-batch/report | Merchant Batch Report Request |
| [**merchantBatchRequest**](ReportingApi.md#merchantBatchRequest) | **GET** /v6/merchant-batch/{merchantid}/{batch_no} | Merchant Batch Request |
| [**remittanceRangeReport**](ReportingApi.md#remittanceRangeReport) | **POST** /v6/remittance/report/{clientid} | Remittance Report Request |
| [**remittanceReportRequest**](ReportingApi.md#remittanceReportRequest) | **GET** /v6/remittance/report/{clientid}/{date} | Remittance Date Report Request |
| [**transactionReportRequest**](ReportingApi.md#transactionReportRequest) | **POST** /v6/transactions | Transaction Report Request |



## batchedTransactionReportRequest

> BatchTransactionReportResponse batchedTransactionReportRequest(merchantid, batchNo, batchTransactionReportRequest)

Batch Transaction Report Request

Retrieves transactions available on a given batch.

### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.model.*;
import com.citypay.client.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        Integer merchantid = 56; // Integer | A merchant ID (MID) for which data is requested. This field allows for filtering of the request by a specific merchant account.
        String batchNo = "batchNo_example"; // String | The batch number that is being requested.
        BatchTransactionReportRequest batchTransactionReportRequest = new BatchTransactionReportRequest(); // BatchTransactionReportRequest | 
        try {
            BatchTransactionReportResponse result = apiInstance.batchedTransactionReportRequest(merchantid, batchNo, batchTransactionReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#batchedTransactionReportRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantid** | **Integer**| A merchant ID (MID) for which data is requested. This field allows for filtering of the request by a specific merchant account. | |
| **batchNo** | **String**| The batch number that is being requested. | |
| **batchTransactionReportRequest** | [**BatchTransactionReportRequest**](BatchTransactionReportRequest.md)|  | |

### Return type

[**BatchTransactionReportResponse**](BatchTransactionReportResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: application/json, text/xml
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A report of the transactions listed on batches. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


## merchantBatchReportRequest

> MerchantBatchReportResponse merchantBatchReportRequest(merchantBatchReportRequest)

Merchant Batch Report Request

Retrieves a report of merchant batches within a specified date range. 
Batches, which aggregate daily processing activities, are typically generated at `00:00` each day. 
These batches play a crucial role in the settlement of funds by summarising daily transactions.


### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.model.*;
import com.citypay.client.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        MerchantBatchReportRequest merchantBatchReportRequest = new MerchantBatchReportRequest(); // MerchantBatchReportRequest | 
        try {
            MerchantBatchReportResponse result = apiInstance.merchantBatchReportRequest(merchantBatchReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#merchantBatchReportRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantBatchReportRequest** | [**MerchantBatchReportRequest**](MerchantBatchReportRequest.md)|  | |

### Return type

[**MerchantBatchReportResponse**](MerchantBatchReportResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: application/json, text/xml
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A report of the batches generated. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


## merchantBatchRequest

> MerchantBatchResponse merchantBatchRequest(merchantid, batchNo)

Merchant Batch Request

Retrieves a report of merchant a merchant batch for a specified batch number.

### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.model.*;
import com.citypay.client.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        Integer merchantid = 56; // Integer | A merchant ID (MID) for which data is requested. This field allows for filtering of the request by a specific merchant account.
        String batchNo = "batchNo_example"; // String | The batch number that is being requested.
        try {
            MerchantBatchResponse result = apiInstance.merchantBatchRequest(merchantid, batchNo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#merchantBatchRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantid** | **Integer**| A merchant ID (MID) for which data is requested. This field allows for filtering of the request by a specific merchant account. | |
| **batchNo** | **String**| The batch number that is being requested. | |

### Return type

[**MerchantBatchResponse**](MerchantBatchResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A report of a single batch. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


## remittanceRangeReport

> RemittanceReportResponse remittanceRangeReport(clientid, remittanceReportRequest)

Remittance Report Request

Fetches remittance reports for financial transactions within a specified date range,
covering all client-related activities. This report consolidates all batches disbursed to a
client, with each remittance summarising the aggregation of batches leading up to settlement.
Additionally, the net remittance amount presented in the final settlement will reflect any
deductions made by the acquirer.


### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.model.*;
import com.citypay.client.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String clientid = "clientid_example"; // String | A client Id for which data is requested.
        RemittanceReportRequest remittanceReportRequest = new RemittanceReportRequest(); // RemittanceReportRequest | 
        try {
            RemittanceReportResponse result = apiInstance.remittanceRangeReport(clientid, remittanceReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#remittanceRangeReport");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientid** | **String**| A client Id for which data is requested. | |
| **remittanceReportRequest** | [**RemittanceReportRequest**](RemittanceReportRequest.md)|  | |

### Return type

[**RemittanceReportResponse**](RemittanceReportResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: application/json, text/xml
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A report of financial remittance data for a range of dates. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


## remittanceReportRequest

> RemittedClientData remittanceReportRequest(clientid, date)

Remittance Date Report Request

Fetches remittance reports for financial transactions for a given date, 
covering all client-related activities. This report consolidates all batches disbursed to a 
client, with each remittance summarising the aggregation of batches leading up to settlement. 
Additionally, the net remittance amount presented in the final settlement will reflect any 
deductions made by the acquirer.

The process also supports the notion of *today* deferring the date to today's date or *latest* reflecting the
latest remittance date available.


### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.model.*;
import com.citypay.client.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        String clientid = "clientid_example"; // String | A client Id for which data is requested.
        String date = "date_example"; // String | Date (YYYY-MM-DD) to filter the request for.
        try {
            RemittedClientData result = apiInstance.remittanceReportRequest(clientid, date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#remittanceReportRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientid** | **String**| A client Id for which data is requested. | |
| **date** | **String**| Date (YYYY-MM-DD) to filter the request for. | |

### Return type

[**RemittedClientData**](RemittedClientData.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A report of the financial remittance data for a given date. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


## transactionReportRequest

> BatchTransactionReportResponse transactionReportRequest(transactionReportRequest)

Transaction Report Request

Retrieve a paginated report of transaction activity within a specified time range. Supports filters by transaction type, 
result state, merchant ID, and allows field selection or predefined response modes for optimal data handling.


### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.model.*;
import com.citypay.client.api.ReportingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        ReportingApi apiInstance = new ReportingApi(defaultClient);
        TransactionReportRequest transactionReportRequest = new TransactionReportRequest(); // TransactionReportRequest | 
        try {
            BatchTransactionReportResponse result = apiInstance.transactionReportRequest(transactionReportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportingApi#transactionReportRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionReportRequest** | [**TransactionReportRequest**](TransactionReportRequest.md)|  | |

### Return type

[**BatchTransactionReportResponse**](BatchTransactionReportResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: application/json, text/xml
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A report of the transactions processed. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


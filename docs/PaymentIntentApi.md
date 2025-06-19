# PaymentIntentApi

All URIs are relative to *https://api.citypay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPaymentIntent**](PaymentIntentApi.md#createPaymentIntent) | **POST** /v6/intent/create | Create a Payment Intent |
| [**getPaymentIntent**](PaymentIntentApi.md#getPaymentIntent) | **POST** /v6/intent/retrieve | Retrieves a Payment Intent |



## createPaymentIntent

> PaymentIntentReference createPaymentIntent(paymentIntentRequestModel)

Create a Payment Intent

This endpoint initiates the creation of a payment intent, which is a precursor to processing a payment. A payment intent
captures the details of a prospective payment transaction, including the payment amount, currency, and associated
billing and shipping information.


### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.model.*;
import com.citypay.client.api.PaymentIntentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        PaymentIntentApi apiInstance = new PaymentIntentApi(defaultClient);
        PaymentIntentRequestModel paymentIntentRequestModel = new PaymentIntentRequestModel(); // PaymentIntentRequestModel | 
        try {
            PaymentIntentReference result = apiInstance.createPaymentIntent(paymentIntentRequestModel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentIntentApi#createPaymentIntent");
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
| **paymentIntentRequestModel** | [**PaymentIntentRequestModel**](PaymentIntentRequestModel.md)|  | |

### Return type

[**PaymentIntentReference**](PaymentIntentReference.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: application/json, text/xml
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the id of the payment intent. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


## getPaymentIntent

> PaymentIntentResponseModel getPaymentIntent(findPaymentIntentRequest)

Retrieves a Payment Intent

Obtains a payment intent.

### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.model.*;
import com.citypay.client.api.PaymentIntentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        PaymentIntentApi apiInstance = new PaymentIntentApi(defaultClient);
        FindPaymentIntentRequest findPaymentIntentRequest = new FindPaymentIntentRequest(); // FindPaymentIntentRequest | 
        try {
            PaymentIntentResponseModel result = apiInstance.getPaymentIntent(findPaymentIntentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentIntentApi#getPaymentIntent");
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
| **findPaymentIntentRequest** | [**FindPaymentIntentRequest**](FindPaymentIntentRequest.md)|  | |

### Return type

[**PaymentIntentResponseModel**](PaymentIntentResponseModel.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: application/json, text/xml
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a payment intent and optionally any transactions associated to the intent. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


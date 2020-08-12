# OperationalApi

All URIs are relative to *https://api.citypay.com/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listMerchantsRequest**](OperationalApi.md#listMerchantsRequest) | **GET** /merchants/{clientid} | List Merchants Request
[**pingRequest**](OperationalApi.md#pingRequest) | **POST** /ping | Ping Request


<a name="listMerchantsRequest"></a>
# **listMerchantsRequest**
> ListMerchantsResponse listMerchantsRequest(clientid)

List Merchants Request

An operational request to list current merchants for a client.  ### Sorting  Sorting can be performed by include a query parameter i.e. &#x60;/merchants/?sort&#x3D;merchantid&#x60;  Fields that can be sorted are &#x60;merchantid&#x60; or &#x60;name&#x60;. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.OperationalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    OperationalApi apiInstance = new OperationalApi(defaultClient);
    String clientid = "clientid_example"; // String | The client id to return merchants for, specifying \"default\" will use the value in your api key.
    try {
      ListMerchantsResponse result = apiInstance.listMerchantsRequest(clientid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationalApi#listMerchantsRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientid** | **String**| The client id to return merchants for, specifying \&quot;default\&quot; will use the value in your api key. |

### Return type

[**ListMerchantsResponse**](ListMerchantsResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
**401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
**422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
**400** | Bad Request. Should the incoming data not be validly determined. |  -  |
**200** | A list of merchants that are configured against the client id. |  -  |

<a name="pingRequest"></a>
# **pingRequest**
> Acknowledgement pingRequest(ping)

Ping Request

A ping request which performs a connection and authentication test to the CityPay API server. The request will return a standard Acknowledgement with a response code &#x60;044&#x60; to signify a successful ping.  The ping call is useful to confirm that you will be able to access  the API from behind any firewalls and that the permission model is granting access from your source. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.OperationalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    OperationalApi apiInstance = new OperationalApi(defaultClient);
    Ping ping = new Ping(); // Ping | 
    try {
      Acknowledgement result = apiInstance.pingRequest(ping);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationalApi#pingRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ping** | [**Ping**](Ping.md)|  |

### Return type

[**Acknowledgement**](Acknowledgement.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: application/json, text/xml
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
**401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
**422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
**400** | Bad Request. Should the incoming data not be validly determined. |  -  |
**200** | A result of the ping request. |  -  |


# OperationalFunctionsApi

All URIs are relative to *https://api.citypay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aclCheckRequest**](OperationalFunctionsApi.md#aclCheckRequest) | **POST** /v6/acl/check | ACL Check Request |
| [**domainKeyCheckRequest**](OperationalFunctionsApi.md#domainKeyCheckRequest) | **POST** /dk/check | Domain Key Check Request |
| [**domainKeyGenRequest**](OperationalFunctionsApi.md#domainKeyGenRequest) | **POST** /dk/gen | Domain Key Generation Request |
| [**listMerchantsRequest**](OperationalFunctionsApi.md#listMerchantsRequest) | **GET** /v6/merchants/{clientid} | List Merchants Request |
| [**pingRequest**](OperationalFunctionsApi.md#pingRequest) | **POST** /v6/ping | Ping Request |



## aclCheckRequest

> AclCheckResponseModel aclCheckRequest(aclCheckRequest)

ACL Check Request

Allows the checking of IP addresses against configured ACLs. Requests can perform a lookup of addresses in subnets and
services such as AWS or Azure to check that those addresses are listed in the ACLs.


### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.OperationalFunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        OperationalFunctionsApi apiInstance = new OperationalFunctionsApi(defaultClient);
        AclCheckRequest aclCheckRequest = new AclCheckRequest(); // AclCheckRequest | 
        try {
            AclCheckResponseModel result = apiInstance.aclCheckRequest(aclCheckRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationalFunctionsApi#aclCheckRequest");
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
| **aclCheckRequest** | [**AclCheckRequest**](AclCheckRequest.md)|  | |

### Return type

[**AclCheckResponseModel**](AclCheckResponseModel.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: application/json, text/xml
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response to the ACL Check request. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


## domainKeyCheckRequest

> DomainKeyResponse domainKeyCheckRequest(domainKeyCheckRequest)

Domain Key Check Request

Checks the contents of a `domain key`. Can be used for operational processes to ensure that the properties of a 
domain key meet their expectations.


### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.OperationalFunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        OperationalFunctionsApi apiInstance = new OperationalFunctionsApi(defaultClient);
        DomainKeyCheckRequest domainKeyCheckRequest = new DomainKeyCheckRequest(); // DomainKeyCheckRequest | 
        try {
            DomainKeyResponse result = apiInstance.domainKeyCheckRequest(domainKeyCheckRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationalFunctionsApi#domainKeyCheckRequest");
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
| **domainKeyCheckRequest** | [**DomainKeyCheckRequest**](DomainKeyCheckRequest.md)|  | |

### Return type

[**DomainKeyResponse**](DomainKeyResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: application/json, text/xml
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A checked domain key. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


## domainKeyGenRequest

> DomainKeyResponse domainKeyGenRequest(domainKeyRequest)

Domain Key Generation Request

Generates a domain key based on the permissions of the calling `api-key`. Domain keys can be used in _Direct Post_ and
`XHR` calls to the API services.


### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.OperationalFunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        OperationalFunctionsApi apiInstance = new OperationalFunctionsApi(defaultClient);
        DomainKeyRequest domainKeyRequest = new DomainKeyRequest(); // DomainKeyRequest | 
        try {
            DomainKeyResponse result = apiInstance.domainKeyGenRequest(domainKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationalFunctionsApi#domainKeyGenRequest");
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
| **domainKeyRequest** | [**DomainKeyRequest**](DomainKeyRequest.md)|  | |

### Return type

[**DomainKeyResponse**](DomainKeyResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: application/json, text/xml
- **Accept**: application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A generated domain key. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


## listMerchantsRequest

> ListMerchantsResponse listMerchantsRequest(clientid)

List Merchants Request

An operational request to list current merchants for a client.

### Sorting

Sorting can be performed by include a query parameter i.e. `/merchants/?sort=merchantid`

Fields that can be sorted are `merchantid` or `name`.


### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.OperationalFunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        OperationalFunctionsApi apiInstance = new OperationalFunctionsApi(defaultClient);
        String clientid = "clientid_example"; // String | The client id to return merchants for, specifying \"default\" will use the value in your api key.
        try {
            ListMerchantsResponse result = apiInstance.listMerchantsRequest(clientid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationalFunctionsApi#listMerchantsRequest");
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
| **clientid** | **String**| The client id to return merchants for, specifying \&quot;default\&quot; will use the value in your api key. | |

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
| **200** | A list of merchants that are configured against the client id. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


## pingRequest

> Acknowledgement pingRequest(ping)

Ping Request

A ping request which performs a connection and authentication test to the CityPay API server. The request
will return a standard Acknowledgement with a response code `044` to signify a successful
ping.

The ping call is useful to confirm that you will be able to access 
the API from behind any firewalls and that the permission
model is granting access from your source.


### Example

```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.OperationalFunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com");
        
        // Configure API key authorization: cp-domain-key
        ApiKeyAuth cp-domain-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-domain-key");
        cp-domain-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-domain-key.setApiKeyPrefix("Token");

        // Configure API key authorization: cp-api-key
        ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cp-api-key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cp-api-key.setApiKeyPrefix("Token");

        OperationalFunctionsApi apiInstance = new OperationalFunctionsApi(defaultClient);
        Ping ping = new Ping(); // Ping | 
        try {
            Acknowledgement result = apiInstance.pingRequest(ping);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OperationalFunctionsApi#pingRequest");
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
| **ping** | [**Ping**](Ping.md)|  | |

### Return type

[**Acknowledgement**](Acknowledgement.md)

### Authorization

[cp-domain-key](../README.md#cp-domain-key), [cp-api-key](../README.md#cp-api-key)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, text/xml
- **Accept**: application/x-www-form-urlencoded, application/json, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A result of the ping request, returning on 044 response code on successful receipt of the ping request. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


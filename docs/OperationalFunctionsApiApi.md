# .com.citypay.client.api.OperationalFunctionsApiApi

All URIs are relative to *https://api.citypay.com*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**aclCheckRequest**](OperationalFunctionsApiApi.md#aclcheckrequest) | **POST** /v6/acl/check | ACL Check Request |
| [**domainKeyCheckRequest**](OperationalFunctionsApiApi.md#domainkeycheckrequest) | **POST** /dk/check | Domain Key Check Request |
| [**domainKeyGenRequest**](OperationalFunctionsApiApi.md#domainkeygenrequest) | **POST** /dk/gen | Domain Key Generation Request |
| [**listMerchantsRequest**](OperationalFunctionsApiApi.md#listmerchantsrequest) | **GET** /v6/merchants/{clientid} | List Merchants Request |
| [**pingRequest**](OperationalFunctionsApiApi.md#pingrequest) | **POST** /v6/ping | Ping Request |

<a name="aclcheckrequest"></a>
# **aclCheckRequest**
> AclCheckResponseModel aclCheckRequest (AclCheckRequest aclCheckRequest)

ACL Check Request

Allows the checking of IP addresses against configured ACLs. Requests can perform a lookup of addresses in subnets and
services such as AWS or Azure to check that those addresses are listed in the ACLs.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class aclCheckRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.citypay.com";
            // Configure API key authorization: cp-api-key
            config.AddApiKey("cp-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("cp-api-key", "Bearer");

            var apiInstance = new OperationalFunctionsApiApi(config);
            var aclCheckRequest = new AclCheckRequest(); // AclCheckRequest | 

            try
            {
                // ACL Check Request
                AclCheckResponseModel result = apiInstance.aclCheckRequest(aclCheckRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OperationalFunctionsApiApi.aclCheckRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the aclCheckRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // ACL Check Request
    ApiResponse<AclCheckResponseModel> response = apiInstance.aclCheckRequestWithHttpInfo(aclCheckRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OperationalFunctionsApiApi.aclCheckRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **aclCheckRequest** | [**AclCheckRequest**](AclCheckRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="domainkeycheckrequest"></a>
# **domainKeyCheckRequest**
> DomainKeyResponse domainKeyCheckRequest (DomainKeyCheckRequest domainKeyCheckRequest)

Domain Key Check Request

Checks the contents of a `domain key`. Can be used for operational processes to ensure that the properties of a 
domain key meet their expectations.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class domainKeyCheckRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.citypay.com";
            // Configure API key authorization: cp-api-key
            config.AddApiKey("cp-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("cp-api-key", "Bearer");

            var apiInstance = new OperationalFunctionsApiApi(config);
            var domainKeyCheckRequest = new DomainKeyCheckRequest(); // DomainKeyCheckRequest | 

            try
            {
                // Domain Key Check Request
                DomainKeyResponse result = apiInstance.domainKeyCheckRequest(domainKeyCheckRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OperationalFunctionsApiApi.domainKeyCheckRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the domainKeyCheckRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Domain Key Check Request
    ApiResponse<DomainKeyResponse> response = apiInstance.domainKeyCheckRequestWithHttpInfo(domainKeyCheckRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OperationalFunctionsApiApi.domainKeyCheckRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **domainKeyCheckRequest** | [**DomainKeyCheckRequest**](DomainKeyCheckRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="domainkeygenrequest"></a>
# **domainKeyGenRequest**
> DomainKeyResponse domainKeyGenRequest (DomainKeyRequest domainKeyRequest)

Domain Key Generation Request

Generates a domain key based on the permissions of the calling `api-key`. Domain keys can be used in _Direct Post_ and
`XHR` calls to the API services.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class domainKeyGenRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.citypay.com";
            // Configure API key authorization: cp-api-key
            config.AddApiKey("cp-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("cp-api-key", "Bearer");

            var apiInstance = new OperationalFunctionsApiApi(config);
            var domainKeyRequest = new DomainKeyRequest(); // DomainKeyRequest | 

            try
            {
                // Domain Key Generation Request
                DomainKeyResponse result = apiInstance.domainKeyGenRequest(domainKeyRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OperationalFunctionsApiApi.domainKeyGenRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the domainKeyGenRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Domain Key Generation Request
    ApiResponse<DomainKeyResponse> response = apiInstance.domainKeyGenRequestWithHttpInfo(domainKeyRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OperationalFunctionsApiApi.domainKeyGenRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **domainKeyRequest** | [**DomainKeyRequest**](DomainKeyRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="listmerchantsrequest"></a>
# **listMerchantsRequest**
> ListMerchantsResponse listMerchantsRequest (String clientid)

List Merchants Request

An operational request to list current merchants for a client.

### Sorting

Sorting can be performed by include a query parameter i.e. `/merchants/?sort=merchantid`

Fields that can be sorted are `merchantid` or `name`.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class listMerchantsRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.citypay.com";
            // Configure API key authorization: cp-api-key
            config.AddApiKey("cp-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("cp-api-key", "Bearer");

            var apiInstance = new OperationalFunctionsApiApi(config);
            var clientid = "clientid_example";  // String | The client id to return merchants for, specifying \"default\" will use the value in your api key.

            try
            {
                // List Merchants Request
                ListMerchantsResponse result = apiInstance.listMerchantsRequest(clientid);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OperationalFunctionsApiApi.listMerchantsRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the listMerchantsRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List Merchants Request
    ApiResponse<ListMerchantsResponse> response = apiInstance.listMerchantsRequestWithHttpInfo(clientid);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OperationalFunctionsApiApi.listMerchantsRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **clientid** | **String** | The client id to return merchants for, specifying \&quot;default\&quot; will use the value in your api key. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pingrequest"></a>
# **pingRequest**
> Acknowledgement pingRequest (Ping ping)

Ping Request

A ping request which performs a connection and authentication test to the CityPay API server. The request
will return a standard Acknowledgement with a response code `044` to signify a successful
ping.

The ping call is useful to confirm that you will be able to access 
the API from behind any firewalls and that the permission
model is granting access from your source.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class pingRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.citypay.com";
            // Configure API key authorization: cp-api-key
            config.AddApiKey("cp-api-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("cp-api-key", "Bearer");
            // Configure API key authorization: cp-domain-key
            config.AddApiKey("cp-domain-key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("cp-domain-key", "Bearer");

            var apiInstance = new OperationalFunctionsApiApi(config);
            var ping = new Ping(); // Ping | 

            try
            {
                // Ping Request
                Acknowledgement result = apiInstance.pingRequest(ping);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OperationalFunctionsApiApi.pingRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the pingRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Ping Request
    ApiResponse<Acknowledgement> response = apiInstance.pingRequestWithHttpInfo(ping);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OperationalFunctionsApiApi.pingRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ping** | [**Ping**](Ping.md) |  |  |

### Return type

[**Acknowledgement**](Acknowledgement.md)

### Authorization

[cp-api-key](../README.md#cp-api-key), [cp-domain-key](../README.md#cp-domain-key)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


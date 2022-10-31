# .com.citypay.client.api.DirectPostApi

All URIs are relative to *https://api.citypay.com*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**directCResAuthRequest**](DirectPostApi.md#directcresauthrequest) | **POST** /direct/cres/auth/{uuid} | Handles a CRes response from ACS, returning back the result of authorisation |
| [**directCResTokeniseRequest**](DirectPostApi.md#directcrestokeniserequest) | **POST** /direct/cres/tokenise/{uuid} | Handles a CRes response from ACS, returning back a token for future authorisation |
| [**directPostAuthRequest**](DirectPostApi.md#directpostauthrequest) | **POST** /direct/auth | Direct Post Auth Request |
| [**directPostTokeniseRequest**](DirectPostApi.md#directposttokeniserequest) | **POST** /direct/tokenise | Direct Post Tokenise Request |
| [**tokenRequest**](DirectPostApi.md#tokenrequest) | **POST** /direct/token | Direct Post Token Request |

<a name="directcresauthrequest"></a>
# **directCResAuthRequest**
> AuthResponse directCResAuthRequest (String uuid, String cres, String threeDSSessionData)

Handles a CRes response from ACS, returning back the result of authorisation

Used to post from an ACS during a ThreeDSecure direct flow process. The endpoint requires a valid `threeDSSessionData`
value which defines the unique transaction through its workflow. This endpoint may be used by merchants wishing to
perform a `Direct Post` integration who wish to handle the challenge flow themselves.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class directCResAuthRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.citypay.com";
            var apiInstance = new DirectPostApi(config);
            var uuid = "uuid_example";  // String | An identifier used to track the CReq/CRes cycle.
            var cres = "cres_example";  // String | The CRES from the ACS. (optional) 
            var threeDSSessionData = "threeDSSessionData_example";  // String | The session data from the ACS. (optional) 

            try
            {
                // Handles a CRes response from ACS, returning back the result of authorisation
                AuthResponse result = apiInstance.directCResAuthRequest(uuid, cres, threeDSSessionData);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DirectPostApi.directCResAuthRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the directCResAuthRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Handles a CRes response from ACS, returning back the result of authorisation
    ApiResponse<AuthResponse> response = apiInstance.directCResAuthRequestWithHttpInfo(uuid, cres, threeDSSessionData);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DirectPostApi.directCResAuthRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **uuid** | **String** | An identifier used to track the CReq/CRes cycle. |  |
| **cres** | **String** | The CRES from the ACS. | [optional]  |
| **threeDSSessionData** | **String** | The session data from the ACS. | [optional]  |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, application/x-www-form-urlencoded


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A result of a successful tokenisation or authorisation process if called via an XHR method. |  -  |
| **303** | Redirect. A result of a successful tokenisation or authorisation process, redirecting to the success URL. |  -  |
| **307** | Redirect. A result of a non-successful tokenisation or authorisation process, redirecting to the failure URL. |  -  |
| **401** | Unauthorized. No domain key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The domain key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **406** | Not Acceptable. Should the incoming data not be validly determined. |  -  |
| **412** | Bad Request. Should the incoming data not be validly determined and an error code results. |  -  |
| **500** | Server Error. Server Error. The server was unable to complete the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="directcrestokeniserequest"></a>
# **directCResTokeniseRequest**
> TokenisationResponseModel directCResTokeniseRequest (String uuid, String cres, String threeDSSessionData)

Handles a CRes response from ACS, returning back a token for future authorisation

Used to post from an ACS during a ThreeDSecure direct flow process. The endpoint requires a valid `threeDSSessionData`
value which defines the unique transaction through its workflow. This endpoint may be used by merchants wishing to
perform a `Direct Post` integration who wish to handle the challenge flow themselves.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class directCResTokeniseRequestExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.citypay.com";
            var apiInstance = new DirectPostApi(config);
            var uuid = "uuid_example";  // String | An identifier used to track the CReq/CRes cycle.
            var cres = "cres_example";  // String | The CRES from the ACS. (optional) 
            var threeDSSessionData = "threeDSSessionData_example";  // String | The session data from the ACS. (optional) 

            try
            {
                // Handles a CRes response from ACS, returning back a token for future authorisation
                TokenisationResponseModel result = apiInstance.directCResTokeniseRequest(uuid, cres, threeDSSessionData);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DirectPostApi.directCResTokeniseRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the directCResTokeniseRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Handles a CRes response from ACS, returning back a token for future authorisation
    ApiResponse<TokenisationResponseModel> response = apiInstance.directCResTokeniseRequestWithHttpInfo(uuid, cres, threeDSSessionData);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DirectPostApi.directCResTokeniseRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **uuid** | **String** | An identifier used to track the CReq/CRes cycle. |  |
| **cres** | **String** | The CRES from the ACS. | [optional]  |
| **threeDSSessionData** | **String** | The session data from the ACS. | [optional]  |

### Return type

[**TokenisationResponseModel**](TokenisationResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml, application/x-www-form-urlencoded


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A result of a successful tokenisation or authorisation process if called via an XHR method. |  -  |
| **303** | Redirect. A result of a successful tokenisation or authorisation process, redirecting to the success URL. |  -  |
| **307** | Redirect. A result of a non-successful tokenisation or authorisation process, redirecting to the failure URL. |  -  |
| **401** | Unauthorized. No domain key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The domain key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **406** | Not Acceptable. Should the incoming data not be validly determined. |  -  |
| **412** | Bad Request. Should the incoming data not be validly determined and an error code results. |  -  |
| **500** | Server Error. Server Error. The server was unable to complete the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="directpostauthrequest"></a>
# **directPostAuthRequest**
> AuthResponse directPostAuthRequest (DirectPostRequest directPostRequest)

Direct Post Auth Request

Used to initiate a direct post request transaction flow.

<pre class="inline-code language-bash">
<code>
curl https://api.citypay.com/v6/direct?cp-domain-key=n834ytqp84y... \
 -d "amount=7500&identifier=example_trans&cardnumber=4000000000000002&expmonth=9&expyear=2028&bill_to_postcode=L1+7ZW
</code>
</pre>.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class directPostAuthRequestExample
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

            var apiInstance = new DirectPostApi(config);
            var directPostRequest = new DirectPostRequest(); // DirectPostRequest | 

            try
            {
                // Direct Post Auth Request
                AuthResponse result = apiInstance.directPostAuthRequest(directPostRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DirectPostApi.directPostAuthRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the directPostAuthRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Direct Post Auth Request
    ApiResponse<AuthResponse> response = apiInstance.directPostAuthRequestWithHttpInfo(directPostRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DirectPostApi.directPostAuthRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **directPostRequest** | [**DirectPostRequest**](DirectPostRequest.md) |  |  |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key), [cp-domain-key](../README.md#cp-domain-key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, text/xml
 - **Accept**: application/json, application/xml, application/x-www-form-urlencoded, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A result of a successful tokenisation or authorisation process if called via an XHR method. |  -  |
| **303** | Redirect. A result of a successful tokenisation or authorisation process, redirecting to the success URL. |  -  |
| **307** | Redirect. A result of a non-successful tokenisation or authorisation process, redirecting to the failure URL. |  -  |
| **401** | Unauthorized. No domain key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The domain key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **406** | Not Acceptable. Should the incoming data not be validly determined. |  -  |
| **412** | Bad Request. Should the incoming data not be validly determined and an error code results. |  -  |
| **500** | Server Error. Server Error. The server was unable to complete the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="directposttokeniserequest"></a>
# **directPostTokeniseRequest**
> AuthResponse directPostTokeniseRequest (DirectPostRequest directPostRequest)

Direct Post Tokenise Request

Used to initiate a direct post request transaction flow.

<pre class="inline-code language-bash">
<code>
curl https://api.citypay.com/v6/direct?cp-domain-key=n834ytqp84y... \
 -d "amount=7500&identifier=example_trans&cardnumber=4000000000000002&expmonth=9&expyear=2028&bill_to_postcode=L1+7ZW
</code>
</pre>.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class directPostTokeniseRequestExample
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

            var apiInstance = new DirectPostApi(config);
            var directPostRequest = new DirectPostRequest(); // DirectPostRequest | 

            try
            {
                // Direct Post Tokenise Request
                AuthResponse result = apiInstance.directPostTokeniseRequest(directPostRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DirectPostApi.directPostTokeniseRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the directPostTokeniseRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Direct Post Tokenise Request
    ApiResponse<AuthResponse> response = apiInstance.directPostTokeniseRequestWithHttpInfo(directPostRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DirectPostApi.directPostTokeniseRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **directPostRequest** | [**DirectPostRequest**](DirectPostRequest.md) |  |  |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key), [cp-domain-key](../README.md#cp-domain-key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, text/xml
 - **Accept**: application/json, application/xml, application/x-www-form-urlencoded, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A result of a successful tokenisation or authorisation process if called via an XHR method. |  -  |
| **303** | Redirect. A result of a successful tokenisation or authorisation process, redirecting to the success URL. |  -  |
| **307** | Redirect. A result of a non-successful tokenisation or authorisation process, redirecting to the failure URL. |  -  |
| **401** | Unauthorized. No domain key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The domain key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **406** | Not Acceptable. Should the incoming data not be validly determined. |  -  |
| **412** | Bad Request. Should the incoming data not be validly determined and an error code results. |  -  |
| **500** | Server Error. Server Error. The server was unable to complete the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="tokenrequest"></a>
# **tokenRequest**
> AuthResponse tokenRequest (DirectTokenAuthRequest directTokenAuthRequest)

Direct Post Token Request

Perform a request for authorisation for a previously generated token. This flow will return an authorisation
response stating that the transaction was approved or declined.


### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using .com.citypay.client.api;
using .Client;
using .com.citypay.client.model;

namespace Example
{
    public class tokenRequestExample
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

            var apiInstance = new DirectPostApi(config);
            var directTokenAuthRequest = new DirectTokenAuthRequest(); // DirectTokenAuthRequest | 

            try
            {
                // Direct Post Token Request
                AuthResponse result = apiInstance.tokenRequest(directTokenAuthRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DirectPostApi.tokenRequest: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the tokenRequestWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Direct Post Token Request
    ApiResponse<AuthResponse> response = apiInstance.tokenRequestWithHttpInfo(directTokenAuthRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DirectPostApi.tokenRequestWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **directTokenAuthRequest** | [**DirectTokenAuthRequest**](DirectTokenAuthRequest.md) |  |  |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key), [cp-domain-key](../README.md#cp-domain-key)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, text/xml
 - **Accept**: application/json, application/xml, application/x-www-form-urlencoded, text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A result of an authorisation process if called via an XHR method. |  -  |
| **303** | Redirect. A result of a successful tokenisation or authorisation process, redirecting to the success URL. |  -  |
| **307** | Redirect. A result of a non-successful tokenisation or authorisation process, redirecting to the failure URL. |  -  |
| **401** | Unauthorized. No domain key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The domain key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **406** | Not Acceptable. Should the incoming data not be validly determined. |  -  |
| **412** | Bad Request. Should the incoming data not be validly determined and an error code results. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


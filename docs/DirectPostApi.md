# DirectPostApi

All URIs are relative to *https://api.citypay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**directCResAuthRequest**](DirectPostApi.md#directCResAuthRequest) | **POST** /direct/cres/auth/{uuid} | Handles a CRes response from ACS, returning back the result of authorisation |
| [**directCResTokeniseRequest**](DirectPostApi.md#directCResTokeniseRequest) | **POST** /direct/cres/tokenise/{uuid} | Handles a CRes response from ACS, returning back a token for future authorisation |
| [**directPostAuthRequest**](DirectPostApi.md#directPostAuthRequest) | **POST** /direct/auth | Direct Post Auth Request |
| [**directPostTokeniseRequest**](DirectPostApi.md#directPostTokeniseRequest) | **POST** /direct/tokenise | Direct Post Tokenise Request |
| [**tokenRequest**](DirectPostApi.md#tokenRequest) | **POST** /direct/token | Direct Post Token Request |


<a id="directCResAuthRequest"></a>
# **directCResAuthRequest**
> AuthResponse directCResAuthRequest(uuid, cres, threeDSSessionData)

Handles a CRes response from ACS, returning back the result of authorisation

Used to post from an ACS during a ThreeDSecure direct flow process. The endpoint requires a valid &#x60;threeDSSessionData&#x60; value which defines the unique transaction through its workflow. This endpoint may be used by merchants wishing to perform a &#x60;Direct Post&#x60; integration who wish to handle the challenge flow themselves. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.models.*;
import com.citypay.client.api.DirectPostApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");

    DirectPostApi apiInstance = new DirectPostApi(defaultClient);
    String uuid = "uuid_example"; // String | An identifier used to track the CReq/CRes cycle.
    String cres = "cres_example"; // String | The CRES from the ACS.
    String threeDSSessionData = "threeDSSessionData_example"; // String | The session data from the ACS.
    try {
      AuthResponse result = apiInstance.directCResAuthRequest(uuid, cres, threeDSSessionData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectPostApi#directCResAuthRequest");
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
| **uuid** | **String**| An identifier used to track the CReq/CRes cycle. | |
| **cres** | **String**| The CRES from the ACS. | [optional] |
| **threeDSSessionData** | **String**| The session data from the ACS. | [optional] |

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

<a id="directCResTokeniseRequest"></a>
# **directCResTokeniseRequest**
> TokenisationResponseModel directCResTokeniseRequest(uuid, cres, threeDSSessionData)

Handles a CRes response from ACS, returning back a token for future authorisation

Used to post from an ACS during a ThreeDSecure direct flow process. The endpoint requires a valid &#x60;threeDSSessionData&#x60; value which defines the unique transaction through its workflow. This endpoint may be used by merchants wishing to perform a &#x60;Direct Post&#x60; integration who wish to handle the challenge flow themselves. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.models.*;
import com.citypay.client.api.DirectPostApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");

    DirectPostApi apiInstance = new DirectPostApi(defaultClient);
    String uuid = "uuid_example"; // String | An identifier used to track the CReq/CRes cycle.
    String cres = "cres_example"; // String | The CRES from the ACS.
    String threeDSSessionData = "threeDSSessionData_example"; // String | The session data from the ACS.
    try {
      TokenisationResponseModel result = apiInstance.directCResTokeniseRequest(uuid, cres, threeDSSessionData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectPostApi#directCResTokeniseRequest");
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
| **uuid** | **String**| An identifier used to track the CReq/CRes cycle. | |
| **cres** | **String**| The CRES from the ACS. | [optional] |
| **threeDSSessionData** | **String**| The session data from the ACS. | [optional] |

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

<a id="directPostAuthRequest"></a>
# **directPostAuthRequest**
> AuthResponse directPostAuthRequest(directPostRequest)

Direct Post Auth Request

Used to initiate a direct post request transaction flow. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.DirectPostApi;

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

    DirectPostApi apiInstance = new DirectPostApi(defaultClient);
    DirectPostRequest directPostRequest = new DirectPostRequest(); // DirectPostRequest | 
    try {
      AuthResponse result = apiInstance.directPostAuthRequest(directPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectPostApi#directPostAuthRequest");
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
| **directPostRequest** | [**DirectPostRequest**](DirectPostRequest.md)|  | |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[cp-domain-key](../README.md#cp-domain-key), [cp-api-key](../README.md#cp-api-key)

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

<a id="directPostTokeniseRequest"></a>
# **directPostTokeniseRequest**
> AuthResponse directPostTokeniseRequest(directPostRequest)

Direct Post Tokenise Request

Used to initiate a direct post request transaction flow. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.DirectPostApi;

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

    DirectPostApi apiInstance = new DirectPostApi(defaultClient);
    DirectPostRequest directPostRequest = new DirectPostRequest(); // DirectPostRequest | 
    try {
      AuthResponse result = apiInstance.directPostTokeniseRequest(directPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectPostApi#directPostTokeniseRequest");
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
| **directPostRequest** | [**DirectPostRequest**](DirectPostRequest.md)|  | |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[cp-domain-key](../README.md#cp-domain-key), [cp-api-key](../README.md#cp-api-key)

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

<a id="tokenRequest"></a>
# **tokenRequest**
> AuthResponse tokenRequest(directTokenAuthRequest)

Direct Post Token Request

Perform a request for authorisation for a previously generated token. This flow will return an authorisation response stating that the transaction was approved or declined. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.DirectPostApi;

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

    DirectPostApi apiInstance = new DirectPostApi(defaultClient);
    DirectTokenAuthRequest directTokenAuthRequest = new DirectTokenAuthRequest(); // DirectTokenAuthRequest | 
    try {
      AuthResponse result = apiInstance.tokenRequest(directTokenAuthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectPostApi#tokenRequest");
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
| **directTokenAuthRequest** | [**DirectTokenAuthRequest**](DirectTokenAuthRequest.md)|  | |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[cp-domain-key](../README.md#cp-domain-key), [cp-api-key](../README.md#cp-api-key)

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


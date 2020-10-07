# PaymentProcessingApi

All URIs are relative to *https://api.citypay.com/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorisationRequest**](PaymentProcessingApi.md#authorisationRequest) | **POST** /authorise | Authorisation
[**cResRequest**](PaymentProcessingApi.md#cResRequest) | **POST** /cres | CRes
[**captureRequest**](PaymentProcessingApi.md#captureRequest) | **POST** /capture | Capture
[**paResRequest**](PaymentProcessingApi.md#paResRequest) | **POST** /pares | PaRes
[**refundRequest**](PaymentProcessingApi.md#refundRequest) | **POST** /refund | Refund
[**retrievalRequest**](PaymentProcessingApi.md#retrievalRequest) | **POST** /retrieve | Retrieval
[**voidRequest**](PaymentProcessingApi.md#voidRequest) | **POST** /void | Void


<a name="authorisationRequest"></a>
# **authorisationRequest**
> Decision authorisationRequest(authRequest)

Authorisation

An authorisation process performs a standard transaction authorisation based on the provided parameters of its request. The CityPay gateway will route your transaction via an Acquiring bank for subsequent authorisation to the appropriate card  schemes such as Visa or MasterCard.  The authorisation API should be used for server environments to process transactions on demand and in realtime.   The authorisation API can be used for multiple types of transactions including E-commerce, mail order, telephone order, customer present (keyed), continuous authority, pre-authorisation and others. CityPay will configure your account for  the appropriate coding and this will perform transparently by the gateway.   Data properties that are required, may depend on the environment you are conducting payment for. Our API aims to be  flexible enough to cater for these structures. Our integration team will aid you in providing the necessary data to   transact.      ### E-commerce workflows   For E-commerce transactions requiring 3DSv1 and 3DSv2 transactions, the API contains a fully accredited in built mechanism to handle authentication.  The gateway has been accredited extensively with both Acquirers and Card Schemes and simplifies the nature of these calls into a simple structure for authentication, preventing integrators from performing lengthy and a costly accreditation with Visa and MasterCard.  3D-secure has been around for a number of years and aims to shift the liability of a transaction away from a merchant back to the card holder. A *liability shift* determines whether a card holder can charge back a transaction as unknown. Effectively the process asks for a card holder to authenticate the transaction prior to authorisation producing a Cardholder  verification value (CAVV) as evidence of authorisation.   #### 3DSv1  &#x60;&#x60;&#x60;json {    \&quot;AuthenticationRequired\&quot;: {     \&quot;acsurl\&quot;: \&quot;https://bank.com/3DS/ACS\&quot;,     \&quot;pareq\&quot;: \&quot;SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN00...\&quot;,     \&quot;md\&quot;: \&quot;WQgZXZlcnl0aGluZyBiZW\&quot;   }                } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60;xml &lt;AuthenticationRequired&gt;  &lt;acsurl&gt;https://bank.com/3DS/ACS&lt;/acsurl&gt;  &lt;pareq&gt;SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN00...&lt;/pareq&gt;  &lt;md&gt;WQgZXZlcnl0aGluZyBiZW&lt;/md&gt; &lt;/AuthenticationRequired&gt; &#x60;&#x60;&#x60;  For E-commerce transactions requiring 3DSv1, the API contains a built in MPI which will be called to check whether the  card is participating in 3DSv1 with Verified by Visa or MasterCard SecureCode. We only support Amex SafeKey with 3DSv2. Should the card be enrolled, a payer  request (PAReq) value will be created and returned back as an [authentication required](#authenticationrequired) response object.   Your system will need to process this authentication packet and forward the user&#39;s browser to an authentication server (ACS)  to gain the user&#39;s authentication. Once complete, the ACS will produce a HTTP &#x60;POST&#x60; call back to the URL supplied in   the authentication request as &#x60;merchant_termurl&#x60;. This URL should behave as a controller and handle the post data from the   ACS and on a forked server to server HTTP request, forward this data to the [pares authentication url](#pares) for    subsequent authorisation processing. You may prefer to provide a processing page whilst this is being processed.   Processing with our systems should be relatively quick and be between 500ms - 3000ms however it is desirable to let   the user see that something is happening rather than a pending browser.      The main reason for ensuring that this controller is two fold:      1. We are never in control of the user&#39;s browser in a server API call   2. The controller is actioned on your site to ensure that any post actions from authorisation can be executed in real time    To forward the user to the ACS, we recommend a simple auto submit HTML form.  &#x60;&#x60;&#x60;html &lt;html lang&#x3D;\&quot;en\&quot;&gt;  &lt;head&gt;         &lt;title&gt;Forward to ACS&lt;/title&gt;   &lt;script type&#x3D;\&quot;text/javascript\&quot;&gt;         function onLoadEvent() {              document.acs.submit();          }         &lt;/script&gt;         &lt;noscript&gt;You will require JavaScript to be enabled to complete this transaction&lt;/noscript&gt;     &lt;/head&gt;     &lt;body onload&#x3D;\&quot;onLoadEvent();\&quot;&gt;         &lt;form name&#x3D;\&quot;acs\&quot; action&#x3D;\&quot;{{ACSURL from Response}}\&quot; method&#x3D;\&quot;POST\&quot;&gt;             &lt;input type&#x3D;\&quot;hidden\&quot; name&#x3D;\&quot;PaReq\&quot; value&#x3D;\&quot;{{PaReq Packet from Response}}\&quot; /&gt;             &lt;input type&#x3D;\&quot;hidden\&quot; name&#x3D;\&quot;TermUrl\&quot; value&#x3D;\&quot;{{Your Controller}}\&quot; /&gt;             &lt;input type&#x3D;\&quot;hidden\&quot; name&#x3D;\&quot;MD\&quot; value&#x3D;\&quot;{{MD From Response}}\&quot; /&gt;         &lt;/form&gt;     &lt;/body&gt; &lt;/html&gt; &#x60;&#x60;&#x60;  Please note that 3DSv1 is being phased out due to changes to strong customer authentication mechanisms. 3DSv2 addresses this and will solidify the authorisation and confirmation process.  We provide a Test ACS for full 3DSv1 integration testing that simulates an ACS.    #### 3DSv2  &#x60;&#x60;&#x60;json {    \&quot;RequestChallenged\&quot;: {     \&quot;acsurl\&quot;: \&quot;https://bank.com/3DS/ACS\&quot;,     \&quot;creq\&quot;: \&quot;SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN00...\&quot;   }                } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60;xml &lt;RequestChallenged&gt;  &lt;acsurl&gt;https://bank.com/3DS/ACS&lt;/acsurl&gt;  &lt;creq&gt;SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN00...&lt;/creq&gt; &lt;/RequestChallenged&gt; &#x60;&#x60;&#x60;  All merchants in the EEC will require to migrate their E-commerce transactions to a secure customer authentication  model (SCA) throughout 2020. This has been adopted by the payment&#39;s industry as a progressive move alongside the European  Unions payments service directive.  CityPay support 3DSv2 for Verified by Visa, MasterCard Identity Check and American Express SafeKey 2.0 and will be rolling out acquirers on the new platform from Q4 2020. The new enhancement to 3DSv2 will allow for CityPay to seamlessly authenticate transactions in a \&quot;frictionless\&quot; flowed method which will authenticate low risk transactions with minimal impact to a  standard authorisation flow. Our API simply performs this on behalf of the merchant and cardholder. For these transactions you will not be required to change anything.  However, should a transaction be \&quot;challenged\&quot; the API will return a [request challenge](#requestchallenged) which will  require your integration to forward the cardholder&#39;s browser to the given [ACS url](#acsurl) by posting the [creq](#creq) value. Once complete, the ACS will have already been in touch with our servers by sending us a result of the authentication known as &#x60;RReq&#x60;.  Our servers however will await confirmation that the authorisation should continue and on receipt of a [cres](#cres) value, the flow will perform full authorisation processing.   Please note that the CRes returned to us is purely a mechanism of acknowledging that transactions should be committed for authorisation. The ACS by this point will have sent us the verification value (CAVV) to perform a liability shift. The CRes value will be validated for receipt of the CAVV and subsequently may return back response codes illustrating this.   To forward the user to the ACS, we recommend a simple auto submit HTML form.  &#x60;&#x60;&#x60;html &lt;html lang&#x3D;\&quot;en\&quot;&gt;  &lt;head&gt;         &lt;title&gt;Forward to ACS&lt;/title&gt;   &lt;script type&#x3D;\&quot;text/javascript\&quot;&gt;         function onLoadEvent() {              document.acs.submit();          }         &lt;/script&gt;         &lt;noscript&gt;You will require JavaScript to be enabled to complete this transaction&lt;/noscript&gt;     &lt;/head&gt;     &lt;body onload&#x3D;\&quot;onLoadEvent();\&quot;&gt;         &lt;form name&#x3D;\&quot;acs\&quot; action&#x3D;\&quot;{{ACSURL from Response}}\&quot; method&#x3D;\&quot;POST\&quot;&gt;             &lt;input type&#x3D;\&quot;hidden\&quot; name&#x3D;\&quot;creq\&quot; value&#x3D;\&quot;{{CReq Packet from Response}}\&quot; /&gt;         &lt;/form&gt;     &lt;/body&gt; &lt;/html&gt; &#x60;&#x60;&#x60;  We are currently working on an integration test suite for 3DSv2 which will mock the ACS challenge process.          ### Testing 3DSv2 Integrations  The API provides a mock 3dsV2 handler which performs a number of scenarios based on the value of the CSC in the request.  | CSC Value | Behaviour | |-----------|-----------| | 731       | Frictionless processing - Not authenticated | | 732       | Frictionless processing - Account verification count not be performed |         | 733       | Frictionless processing - Verification Rejected |         | 741       | Frictionless processing - Attempts Processing |         | 750       | Frictionless processing - Authenticated  |         | 761       | Triggers an error message |   | Any       | Challenge Request | 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaymentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaymentProcessingApi apiInstance = new PaymentProcessingApi(defaultClient);
    AuthRequest authRequest = new AuthRequest(); // AuthRequest | 
    try {
      Decision result = apiInstance.authorisationRequest(authRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProcessingApi#authorisationRequest");
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
 **authRequest** | [**AuthRequest**](AuthRequest.md)|  |

### Return type

[**Decision**](Decision.md)

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
**200** | A decision made by the result of processing. |  -  |

<a name="cResRequest"></a>
# **cResRequest**
> AuthResponse cResRequest(cresAuthRequest)

CRes

The CRes request performs authorisation processing once a challenge request has been completed with an Authentication Server (ACS). This challenge response contains confirmation that will allow the API systems to return an authorisation response based on the result. Our systems will  know out of band via an &#x60;RReq&#x60; call by the ACS to notify us if the liability shift has been issued.  Any call to the CRes operation will require a previous authorisation request and cannot be called  on its own without a previous [request challenge](#requestchallenged) being obtained. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaymentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaymentProcessingApi apiInstance = new PaymentProcessingApi(defaultClient);
    CResAuthRequest cresAuthRequest = new CResAuthRequest(); // CResAuthRequest | 
    try {
      AuthResponse result = apiInstance.cResRequest(cresAuthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProcessingApi#cResRequest");
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
 **cresAuthRequest** | [**CResAuthRequest**](CResAuthRequest.md)|  |

### Return type

[**AuthResponse**](AuthResponse.md)

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
**200** | A result of processing the 3DSv2 authorisation data. |  -  |

<a name="captureRequest"></a>
# **captureRequest**
> Acknowledgement captureRequest(captureRequest)

Capture

_The capture process only applies to transactions which have been pre-authorised only._   The capture process will ensure that a transaction will now settle. It is expected that a capture call will be provided within 3 days or a maximum of 7 days.  A capture request is provided to confirm that you wish the transaction to be settled. This request can contain a final amount for the transaction which is different to the original authorisation amount. This may be useful in a delayed system process such as waiting for stock to be ordered, confirmed, or services provided before the final cost is known.  When a transaction is completed, a new authorisation code may be created and a new confirmation can be sent online to the acquiring bank.  Once the transaction has been processed. A standard [&#x60;Acknowledgement&#x60;](#acknowledgement) will be returned, outlining the result of the transaction. On a successful completion process, the transaction will be available for the settlement and completed at the end of the day. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaymentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaymentProcessingApi apiInstance = new PaymentProcessingApi(defaultClient);
    CaptureRequest captureRequest = new CaptureRequest(); // CaptureRequest | 
    try {
      Acknowledgement result = apiInstance.captureRequest(captureRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProcessingApi#captureRequest");
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
 **captureRequest** | [**CaptureRequest**](CaptureRequest.md)|  |

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
**200** | A result and acknowledgement of the capture request. The response will return a &#x60;000|001&#x60; response on a successful capture otherwise an error code response explaining the error. |  -  |

<a name="paResRequest"></a>
# **paResRequest**
> AuthResponse paResRequest(paResAuthRequest)

PaRes

The Payer Authentication Response (PaRes) is an operation after the result of authentication   being performed. The request uses an encoded packet of authentication data to  notify us of the completion of the liability shift. Once this value has been unpacked and its signature is checked, our systems will proceed to authorisation processing.    Any call to the PaRes operation will require a previous authorisation request and cannot be called  on its own without a previous [authentication required](#authenticationrequired)  being obtained. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaymentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaymentProcessingApi apiInstance = new PaymentProcessingApi(defaultClient);
    PaResAuthRequest paResAuthRequest = new PaResAuthRequest(); // PaResAuthRequest | 
    try {
      AuthResponse result = apiInstance.paResRequest(paResAuthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProcessingApi#paResRequest");
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
 **paResAuthRequest** | [**PaResAuthRequest**](PaResAuthRequest.md)|  |

### Return type

[**AuthResponse**](AuthResponse.md)

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
**200** | A result of processing the 3DSv1 authorisation data. |  -  |

<a name="refundRequest"></a>
# **refundRequest**
> AuthResponse refundRequest(refundRequest)

Refund

A refund request which allows for the refunding of a previous transaction up  and to the amount of the original sale. A refund will be performed against the  original card used to process the transaction. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaymentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaymentProcessingApi apiInstance = new PaymentProcessingApi(defaultClient);
    RefundRequest refundRequest = new RefundRequest(); // RefundRequest | 
    try {
      AuthResponse result = apiInstance.refundRequest(refundRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProcessingApi#refundRequest");
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
 **refundRequest** | [**RefundRequest**](RefundRequest.md)|  |

### Return type

[**AuthResponse**](AuthResponse.md)

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
**200** | A result of the refund of sale processing. |  -  |

<a name="retrievalRequest"></a>
# **retrievalRequest**
> AuthReferences retrievalRequest(retrieveRequest)

Retrieval

A retrieval request which allows an integration to obtain the result of a transaction processed in the last 90 days. The request allows for retrieval based on the identifier or transaction  number.   The process may return multiple results in particular where a transaction was processed multiple times against the same identifier. This can happen if errors were first received. The API therefore returns up to the first 5 transactions in the latest date time order.  It is not intended for this operation to be a replacement for reporting and only allows for base transaction information to be returned. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaymentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaymentProcessingApi apiInstance = new PaymentProcessingApi(defaultClient);
    RetrieveRequest retrieveRequest = new RetrieveRequest(); // RetrieveRequest | 
    try {
      AuthReferences result = apiInstance.retrievalRequest(retrieveRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProcessingApi#retrievalRequest");
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
 **retrieveRequest** | [**RetrieveRequest**](RetrieveRequest.md)|  |

### Return type

[**AuthReferences**](AuthReferences.md)

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
**200** | A result of the retrieval request. |  -  |

<a name="voidRequest"></a>
# **voidRequest**
> Acknowledgement voidRequest(voidRequest)

Void

_The void process generally applies to transactions which have been pre-authorised only however voids can occur  on the same day if performed before batching and settlement._   The void process will ensure that a transaction will now settle. It is expected that a void call will be  provided on the same day before batching and settlement or within 3 days or within a maximum of 7 days.  Once the transaction has been processed as a void, an [&#x60;Acknowledgement&#x60;](#acknowledgement) will be returned, outlining the result of the transaction. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaymentProcessingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaymentProcessingApi apiInstance = new PaymentProcessingApi(defaultClient);
    VoidRequest voidRequest = new VoidRequest(); // VoidRequest | 
    try {
      Acknowledgement result = apiInstance.voidRequest(voidRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentProcessingApi#voidRequest");
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
 **voidRequest** | [**VoidRequest**](VoidRequest.md)|  |

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
**200** | A result and acknowledgement of the void request, returning an &#x60;080|003&#x60; response code on successful void/cancellation of the transaction. If an error occurs an error code will be returned explaining the failure.  |  -  |


# PaylinkApi

All URIs are relative to *https://api.citypay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tokenAdjustmentRequest**](PaylinkApi.md#tokenAdjustmentRequest) | **POST** /paylink/{token}/adjustment | Paylink Token Adjustment |
| [**tokenCancelRequest**](PaylinkApi.md#tokenCancelRequest) | **PUT** /paylink/{token}/cancel | Cancel a Paylink Token |
| [**tokenChangesRequest**](PaylinkApi.md#tokenChangesRequest) | **POST** /paylink/token/changes | Paylink Token Audit |
| [**tokenCloseRequest**](PaylinkApi.md#tokenCloseRequest) | **PUT** /paylink/{token}/close | Close Paylink Token |
| [**tokenCreateBillPaymentRequest**](PaylinkApi.md#tokenCreateBillPaymentRequest) | **POST** /paylink/bill-payment | Create Bill Payment Paylink Token |
| [**tokenCreateRequest**](PaylinkApi.md#tokenCreateRequest) | **POST** /paylink/create | Create Paylink Token |
| [**tokenPurgeAttachmentsRequest**](PaylinkApi.md#tokenPurgeAttachmentsRequest) | **PUT** /paylink/{token}/purge-attachments | Purges any attachments for a Paylink Token |
| [**tokenReconciledRequest**](PaylinkApi.md#tokenReconciledRequest) | **PUT** /paylink/{token}/reconciled | Reconcile Paylink Token |
| [**tokenReopenRequest**](PaylinkApi.md#tokenReopenRequest) | **PUT** /paylink/{token}/reopen | Reopen Paylink Token |
| [**tokenResendNotificationRequest**](PaylinkApi.md#tokenResendNotificationRequest) | **POST** /paylink/{token}/resend-notification | Resend a notification for Paylink Token |
| [**tokenStatusRequest**](PaylinkApi.md#tokenStatusRequest) | **GET** /paylink/{token}/status | Paylink Token Status |


<a id="tokenAdjustmentRequest"></a>
# **tokenAdjustmentRequest**
> Acknowledgement tokenAdjustmentRequest(token, paylinkAdjustmentRequest)

Paylink Token Adjustment

Adjusts a TokenRequest&#39;s amount value when for instance   1. a Token is created and the shopping cart is updated 2. an invoice is adjusted either due to part payment or due to increased incurred costs. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    String token = "token_example"; // String | The token returned by the create token process.
    PaylinkAdjustmentRequest paylinkAdjustmentRequest = new PaylinkAdjustmentRequest(); // PaylinkAdjustmentRequest | 
    try {
      Acknowledgement result = apiInstance.tokenAdjustmentRequest(token, paylinkAdjustmentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenAdjustmentRequest");
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
| **token** | **String**| The token returned by the create token process. | |
| **paylinkAdjustmentRequest** | [**PaylinkAdjustmentRequest**](PaylinkAdjustmentRequest.md)|  | |

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
| **200** | Response defining the result of the token request. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

<a id="tokenCancelRequest"></a>
# **tokenCancelRequest**
> Acknowledgement tokenCancelRequest(token)

Cancel a Paylink Token

Marks a Paylink Token as cancelled. This cancels the Token for any future request for processing.

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    String token = "token_example"; // String | The token returned by the create token process.
    try {
      Acknowledgement result = apiInstance.tokenCancelRequest(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenCancelRequest");
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
| **token** | **String**| The token returned by the create token process. | |

### Return type

[**Acknowledgement**](Acknowledgement.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirms that the token was marked as cancelled. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

<a id="tokenChangesRequest"></a>
# **tokenChangesRequest**
> PaylinkTokenStatusChangeResponse tokenChangesRequest(paylinkTokenStatusChangeRequest)

Paylink Token Audit

Allows for the changes to a pre-existing token.

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    PaylinkTokenStatusChangeRequest paylinkTokenStatusChangeRequest = new PaylinkTokenStatusChangeRequest(); // PaylinkTokenStatusChangeRequest | 
    try {
      PaylinkTokenStatusChangeResponse result = apiInstance.tokenChangesRequest(paylinkTokenStatusChangeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenChangesRequest");
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
| **paylinkTokenStatusChangeRequest** | [**PaylinkTokenStatusChangeRequest**](PaylinkTokenStatusChangeRequest.md)|  | |

### Return type

[**PaylinkTokenStatusChangeResponse**](PaylinkTokenStatusChangeResponse.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: application/json, text/xml
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Changes from tokens actioned after the pivotal date provided in the request. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

<a id="tokenCloseRequest"></a>
# **tokenCloseRequest**
> Acknowledgement tokenCloseRequest(token)

Close Paylink Token

Marks a Paylink Token as closed. This closes the Token for any future action and the Token will not appear in any status request calls. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    String token = "token_example"; // String | The token returned by the create token process.
    try {
      Acknowledgement result = apiInstance.tokenCloseRequest(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenCloseRequest");
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
| **token** | **String**| The token returned by the create token process. | |

### Return type

[**Acknowledgement**](Acknowledgement.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirms that the token was marked for closure. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

<a id="tokenCreateBillPaymentRequest"></a>
# **tokenCreateBillPaymentRequest**
> PaylinkTokenCreated tokenCreateBillPaymentRequest(paylinkBillPaymentTokenRequest)

Create Bill Payment Paylink Token

CityPay Paylink supports invoice and bill payment services by allowing merchants to raise an invoice in their systems and associate the invoice with a Paylink checkout token. CityPay will co-ordinate the checkout flow in relationship with your customer. Our bill payment solution may be used to streamline the payment flow with cardholders to allow your invoice to be paid promptly and via multiple payment channels such as Card Payment, Apple Pay or Google Pay.  The bill payment service allows  1. setting up notification paths to an end customer, such as SMS or Email 2. enabling attachments to be included with Paylink tokens 3. produce chaser notifications for unpaid invoices 4. provide callbacks for notification of the payment of an invoice 5. support part payments against an invoice 6. support of field guards to protect the payment screen 7. support of status reporting on tokens 8. URL short codes for SMS notifications  &lt;img src&#x3D;\&quot;images/merchant-BPS-workflow.png\&quot; alt&#x3D;\&quot;Paylink BPSv2 Overview\&quot; width&#x3D;\&quot;50%\&quot;/&gt;    ### Notification Paths  Notification paths can be provided which identify the channels for communication of the invoice availability. Up to 3 notification paths may be provided per request.  Each notification uses a template to generate the body of the message. This allows for variable text to be sent out and customised for each call.  SMS messages use URL Short Codes (USC) as a payment link to the invoice payment page. This allows for a standard payment URL to be shortened for optimised usage in SMS. For instance a URL of &#x60;https://checkout.citypay.com/PL1234/s348yb8yna4a48n2f8nq2f3msgyng-psn348ynaw8ynaw/en&#x60; becomes &#x60;citypay.com/Za48na3x&#x60;. Each USC is unique however it is a requirement that each USC generated is protected with Field Guards to ensure that sensitive data (such as customer contact details and GDPR) is protected.  To send a notification path, append a &#x60;notification-path&#x60; property to the request.  &#x60;&#x60;&#x60;json  {   \&quot;sms_notification_path\&quot;: {       \&quot;to\&quot;: \&quot;+441534884000\&quot;   },   \&quot;email_notification_path\&quot;: {       \&quot;to\&quot;: [\&quot;help-desk@citypay.com\&quot;],       \&quot;cc\&quot;: [\&quot;third-party@citypay.com\&quot;],       \&quot;reply\&quot;: [\&quot;help@my-company.com\&quot;]   } } &#x60;&#x60;&#x60;  Notification paths trigger a number of events which are stored as part of the timeline of events of a Paylink token  - &#x60;BillPaymentSmsNotificationQueued&#x60; - identifies when an SMS notification has been queued for delivery - &#x60;BillPaymentSmsNotificationSent&#x60; - identifies when an SMS notification has been sent to the upstream network - &#x60;BillPaymentSmsNotificationDelivered&#x60; - identifies when an SMS notification has been delivered as notified by the upstream network - &#x60;BillPaymentSmsNotificationUndelivered&#x60; - identifies when an SMS notification has undelivered notification is provided by the upstream network - &#x60;BillPaymentSmsNotificationFailure&#x60; - identifies when an SMS notification has failed - &#x60;BillPaymentEmailNotificationQueued&#x60; -  identifies when an email notification has been queued for delivery - &#x60;BillPaymentEmailNotificationSent&#x60; -  identifies when an email notification has been accepted by our SMS forwarder - &#x60;BillPaymentEmailNotificationFailure&#x60; - identifies when an email notification has failed delivery   #### SMS Notification Path  SMS originated from a CityPay pool of numbers and by default only sends to country codes where the service is registered. SMSs may contain a From field which is configured as part of you onboarding and have a name associated to identify the service origin. For example if your business is titled &#x60;Health Surgery Ltd&#x60; the SMS may be sent to originate from &#x60;Health Surgery&#x60;.   SMS is also configured for a \&quot;polite mode\&quot;. This mode ensures that SMSs aren&#39;t sent in the middle of the night when backend services ordinarily run. SMSs will be queued until the time range is deemed as polite. Normally this is between 8am and 9pm.  | Field    | Type     | Usage    | Description                                                                                     | |----------|----------|----------|-------------------------------------------------------------------------------------------------| | template | string   | Reserved | An optional template name to use a template other than the default.                             | | to       | string   | Reserved | The phone number in [E.164](https://en.wikipedia.org/wiki/E.164) format to send the message to. |  #### Email Notification Paths  | Field    | Type     | Usage    | Description                                                                                     | |----------|----------|----------|-------------------------------------------------------------------------------------------------| | template | string   | Reserved | An optional template name to use a template other than the default.                             | | to       | string[] | Required | An array of email addresses to be used for delivery. A maximum of 5 addresses can be added.     | | cc       | string[] | Required | An array of email addresses to be used for cc delivery. A maximum of 5 addresses can be added.  | | bcc      | string[] | Required | An array of email addresses to be used for bcc delivery. A maximum of 5 addresses can be added. | | reply_to | string[] | Required | An array of email addresses to be used for the Reply-To header of an email.     |   ### Field Guards  To ensure that invoices are paid by the intended recipient, Paylink supports the addition of Field Guards.  A Field Guard is an intended field which is to be used as a form of guarded authentication. More than 1 field can be requested.  &lt;img src&#x3D;\&quot;images/paylink-field-guards.png\&quot; alt&#x3D;\&quot;Paylink Field Guards\&quot; width&#x3D;\&quot;50%\&quot;/&gt;  To determine the source value of the field, each field name is searched in the order of  - identifier - cardholder data such as name - custom parameters - pass through data  If no field values are found, the token request returns a D041 validation error.  #### Authentication and Validation  When values are entered by the user, resultant comparisons are performed by  1. Transliteration of both the source value and entered value. For example, names with accents (e.g. é will become e) 2. Only Alphanumeric values are retained any whitespace or special characters are ignored 3. Case is ignored  Should all values match, the user is authenticated and can continue to the payment form rendered by the Paylink server.  On successful login, an event will be added to include that the access guard validated access.  #### Access-Key  To ensure that a user does not need to re-enter these values multiple times, a cookie is pushed to the user’s browser with an access-key digest value. This value will be presented to the server on each refresh therefore allowing the guard to accept the call. Each value is uniquely stored per merchant account and cannot be shared cross merchant. The lifetime of the cookie is set to 24 hours.  #### Brute Force Prevention  To prevent multiple calls hitting the server, attempting a brute force attack, the login process  1. is fronted by a contemporary web application firewall 2. creates an event for each token when access was denied 3. should the number of failed events breach more than 5 in 30 minutes, the token is locked for an hour 4. should the number of events breach more than 20 the token is fully locked  ### Attachments  Attachments can be included in the request in 2 ways  1. Via a data element direct in the request 2. Via a URL upload to a provided pre-signed URL  The decision of which option is dependent on the size of the attachments. Should the attachment size be greater than 32kb a URL upload is required. Small attachments can be included in the JSON request. This is to prevent our web firewall from blocking your request and to also ensure efficiency of larger file uploads.  There is a maximum of 3 attachments that can be added to a request.  &#x60;&#x60;&#x60;json     [{       \&quot;filename\&quot;: \&quot;invoice1.pdf\&quot;,       \&quot;mime-type\&quot;: \&quot;application/pdf\&quot;     },{       \&quot;filename\&quot;: \&quot;invoice2.pdf\&quot;,       \&quot;data\&quot;: \&quot;b4sE64Enc0dEd...&#x3D;\&quot;,       \&quot;mime-type\&quot;: \&quot;application/pdf\&quot;     }] &#x60;&#x60;&#x60;  | Field     | Type   | Usage    | Description                                                                                                                                          | |-----------|--------|----------|------------------------------------------------------------------------------------------------------------------------------------------------------| | filename  | string | Required | The name of the attachment normally taken from the filename. You should not include the filename path as appropriate                                 | | data      | string | Optional | base64 encoding of the file if less than 32kb in size                                                                                                | | mime-type | string | Required | The mime type of the attachment as defined in [RFC 9110](https://www.rfc-editor.org/rfc/rfc9110.html). Currently only &#x60;application/pdf&#x60; is supported |   #### Attachment Result  A result of an attachment specifies whether the attachment was successfully added or whether a further upload is requried  | Field  | Type   | Usage    | Description                                                                                                                                       | |--------|--------|----------|---------------------------------------------------------------------------------------------------------------------------------------------------| | result | string | Required | &#x60;OK&#x60; should the file have uploaded or &#x60;UPLOAD&#x60; if the file is required to be uploaded.                                                            | | name   | string | Required | The filename that was specified in the upload process                                                                                             | | url    | string | Optional | Should an upload be required, this URL is available for an upload to be issued. The URL is only available for uploads for 24 hours from creation. | 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    PaylinkBillPaymentTokenRequest paylinkBillPaymentTokenRequest = new PaylinkBillPaymentTokenRequest(); // PaylinkBillPaymentTokenRequest | 
    try {
      PaylinkTokenCreated result = apiInstance.tokenCreateBillPaymentRequest(paylinkBillPaymentTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenCreateBillPaymentRequest");
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
| **paylinkBillPaymentTokenRequest** | [**PaylinkBillPaymentTokenRequest**](PaylinkBillPaymentTokenRequest.md)|  | |

### Return type

[**PaylinkTokenCreated**](PaylinkTokenCreated.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: application/json, text/xml
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response defining the result of the token request. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

<a id="tokenCreateRequest"></a>
# **tokenCreateRequest**
> PaylinkTokenCreated tokenCreateRequest(paylinkTokenRequestModel)

Create Paylink Token

Creates a Paylink token from the CityPay API.

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    PaylinkTokenRequestModel paylinkTokenRequestModel = new PaylinkTokenRequestModel(); // PaylinkTokenRequestModel | 
    try {
      PaylinkTokenCreated result = apiInstance.tokenCreateRequest(paylinkTokenRequestModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenCreateRequest");
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
| **paylinkTokenRequestModel** | [**PaylinkTokenRequestModel**](PaylinkTokenRequestModel.md)|  | |

### Return type

[**PaylinkTokenCreated**](PaylinkTokenCreated.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: application/json, text/xml
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response defining the result of the token request. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

<a id="tokenPurgeAttachmentsRequest"></a>
# **tokenPurgeAttachmentsRequest**
> Acknowledgement tokenPurgeAttachmentsRequest(token)

Purges any attachments for a Paylink Token

Purges any attachments for a token for GDPR or DP reasons.

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    String token = "token_example"; // String | The token returned by the create token process.
    try {
      Acknowledgement result = apiInstance.tokenPurgeAttachmentsRequest(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenPurgeAttachmentsRequest");
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
| **token** | **String**| The token returned by the create token process. | |

### Return type

[**Acknowledgement**](Acknowledgement.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirms that the attachments either did not exist or were purged. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

<a id="tokenReconciledRequest"></a>
# **tokenReconciledRequest**
> Acknowledgement tokenReconciledRequest(token)

Reconcile Paylink Token

Marks a Paylink Token as reconciled when reconciliation is performed on the merchant&#39;s side.

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    String token = "token_example"; // String | The token returned by the create token process.
    try {
      Acknowledgement result = apiInstance.tokenReconciledRequest(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenReconciledRequest");
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
| **token** | **String**| The token returned by the create token process. | |

### Return type

[**Acknowledgement**](Acknowledgement.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirms that the token was marked as reconciled. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

<a id="tokenReopenRequest"></a>
# **tokenReopenRequest**
> Acknowledgement tokenReopenRequest(token)

Reopen Paylink Token

Allows for a Paylink Token to be reopened if a Token has been previously closed and payment has not yet been made.

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    String token = "token_example"; // String | The token returned by the create token process.
    try {
      Acknowledgement result = apiInstance.tokenReopenRequest(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenReopenRequest");
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
| **token** | **String**| The token returned by the create token process. | |

### Return type

[**Acknowledgement**](Acknowledgement.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirms that the token was reopened. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

<a id="tokenResendNotificationRequest"></a>
# **tokenResendNotificationRequest**
> Acknowledgement tokenResendNotificationRequest(token, paylinkResendNotificationRequest)

Resend a notification for Paylink Token

Resend a notification for Paylink Token.

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    String token = "token_example"; // String | The token returned by the create token process.
    PaylinkResendNotificationRequest paylinkResendNotificationRequest = new PaylinkResendNotificationRequest(); // PaylinkResendNotificationRequest | 
    try {
      Acknowledgement result = apiInstance.tokenResendNotificationRequest(token, paylinkResendNotificationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenResendNotificationRequest");
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
| **token** | **String**| The token returned by the create token process. | |
| **paylinkResendNotificationRequest** | [**PaylinkResendNotificationRequest**](PaylinkResendNotificationRequest.md)|  | |

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
| **200** | Confirms that the notification was sent. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |

<a id="tokenStatusRequest"></a>
# **tokenStatusRequest**
> PaylinkTokenStatus tokenStatusRequest(token)

Paylink Token Status

Obtains the full status of a given Paylink Token.

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.PaylinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    PaylinkApi apiInstance = new PaylinkApi(defaultClient);
    String token = "token_example"; // String | The token returned by the create token process.
    try {
      PaylinkTokenStatus result = apiInstance.tokenStatusRequest(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaylinkApi#tokenStatusRequest");
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
| **token** | **String**| The token returned by the create token process. | |

### Return type

[**PaylinkTokenStatus**](PaylinkTokenStatus.md)

### Authorization

[cp-api-key](../README.md#cp-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The current status of the token. |  -  |
| **400** | Bad Request. Should the incoming data not be validly determined. |  -  |
| **401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
| **403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
| **422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
| **500** | Server Error. The server was unable to complete the request. |  -  |


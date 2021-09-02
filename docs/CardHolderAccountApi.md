# CardHolderAccountApi

All URIs are relative to *https://api.citypay.com/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountCardDeleteRequest**](CardHolderAccountApi.md#accountCardDeleteRequest) | **DELETE** /account/{accountid}/card/{cardId} | Card Deletion
[**accountCardRegisterRequest**](CardHolderAccountApi.md#accountCardRegisterRequest) | **POST** /account/{accountid}/register | Card Registration
[**accountCardStatusRequest**](CardHolderAccountApi.md#accountCardStatusRequest) | **POST** /account/{accountid}/card/{cardId}/status | Card Status
[**accountChangeContactRequest**](CardHolderAccountApi.md#accountChangeContactRequest) | **POST** /account/{accountid}/contact | Contact Details Update
[**accountCreate**](CardHolderAccountApi.md#accountCreate) | **POST** /account/create | Account Create
[**accountDeleteRequest**](CardHolderAccountApi.md#accountDeleteRequest) | **DELETE** /account/{accountid} | Account Deletion
[**accountExistsRequest**](CardHolderAccountApi.md#accountExistsRequest) | **GET** /account-exists/{accountid} | Account Exists
[**accountRetrieveRequest**](CardHolderAccountApi.md#accountRetrieveRequest) | **GET** /account/{accountid} | Account Retrieval
[**accountStatusRequest**](CardHolderAccountApi.md#accountStatusRequest) | **POST** /account/{accountid}/status | Account Status
[**chargeRequest**](CardHolderAccountApi.md#chargeRequest) | **POST** /charge | Charge


<a name="accountCardDeleteRequest"></a>
# **accountCardDeleteRequest**
> Acknowledgement accountCardDeleteRequest(accountid, cardId)

Card Deletion

Deletes a card from the account. The card will be marked for deletion before a subsequent purge will clear the card permanently. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.CardHolderAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
    String accountid = "accountid_example"; // String | The account id that refers to the customer's account no. This value will have been provided when setting up the card holder account.
    String cardId = "cardId_example"; // String | The id of the card that is presented by a call to retrieve a card holder account.
    try {
      Acknowledgement result = apiInstance.accountCardDeleteRequest(accountid, cardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardHolderAccountApi#accountCardDeleteRequest");
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
 **accountid** | **String**| The account id that refers to the customer&#39;s account no. This value will have been provided when setting up the card holder account. |
 **cardId** | **String**| The id of the card that is presented by a call to retrieve a card holder account. |

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
**403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
**401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
**422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
**400** | Bad Request. Should the incoming data not be validly determined. |  -  |
**200** | Acknowledges the card has been requested for deletion. A response code of &#x60;001&#x60; is returned if the account is available for deletion otherwise an error code is returned. |  -  |

<a name="accountCardRegisterRequest"></a>
# **accountCardRegisterRequest**
> CardHolderAccount accountCardRegisterRequest(accountid, registerCard)

Card Registration

Allows for a card to be registered for the account. The card will be added for future  processing and will be available as a tokenised value for future processing.  The card will be validated for  0. Being a valid card number (luhn check) 0. Having a valid expiry date 0. Being a valid bin value. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.CardHolderAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
    String accountid = "accountid_example"; // String | The account id that refers to the customer's account no. This value will have been provided when setting up the card holder account.
    RegisterCard registerCard = new RegisterCard(); // RegisterCard | 
    try {
      CardHolderAccount result = apiInstance.accountCardRegisterRequest(accountid, registerCard);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardHolderAccountApi#accountCardRegisterRequest");
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
 **accountid** | **String**| The account id that refers to the customer&#39;s account no. This value will have been provided when setting up the card holder account. |
 **registerCard** | [**RegisterCard**](RegisterCard.md)|  |

### Return type

[**CardHolderAccount**](CardHolderAccount.md)

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
**200** | A successfully registered card provides a reload of the account including the new card. |  -  |

<a name="accountCardStatusRequest"></a>
# **accountCardStatusRequest**
> Acknowledgement accountCardStatusRequest(accountid, cardId, cardStatus)

Card Status

Updates the status of a card for processing. The following values are available  | Status | Description |  |--------|-------------| | Active | The card is active for processing and can be used for charging against with a valid token | | Inactive | The card is inactive for processing and cannot be used for processing, it will require reactivation before being used to charge | | Expired | The card has expired either due to the expiry date no longer being valid or due to a replacement card being issued | 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.CardHolderAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
    String accountid = "accountid_example"; // String | The account id that refers to the customer's account no. This value will have been provided when setting up the card holder account.
    String cardId = "cardId_example"; // String | The id of the card that is presented by a call to retrieve a card holder account.
    CardStatus cardStatus = new CardStatus(); // CardStatus | 
    try {
      Acknowledgement result = apiInstance.accountCardStatusRequest(accountid, cardId, cardStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardHolderAccountApi#accountCardStatusRequest");
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
 **accountid** | **String**| The account id that refers to the customer&#39;s account no. This value will have been provided when setting up the card holder account. |
 **cardId** | **String**| The id of the card that is presented by a call to retrieve a card holder account. |
 **cardStatus** | [**CardStatus**](CardStatus.md)|  |

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
**200** | &lt;/br&gt;Acknowledges the card status has changed, returning a response code of &#x60;001&#x60; for a valid change or &#x60;000&#x60; for a non valid change. |  -  |

<a name="accountChangeContactRequest"></a>
# **accountChangeContactRequest**
> CardHolderAccount accountChangeContactRequest(accountid, contactDetails)

Contact Details Update

Allows for the ability to change the contact details for an account.

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.CardHolderAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
    String accountid = "accountid_example"; // String | The account id that refers to the customer's account no. This value will have been provided when setting up the card holder account.
    ContactDetails contactDetails = new ContactDetails(); // ContactDetails | 
    try {
      CardHolderAccount result = apiInstance.accountChangeContactRequest(accountid, contactDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardHolderAccountApi#accountChangeContactRequest");
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
 **accountid** | **String**| The account id that refers to the customer&#39;s account no. This value will have been provided when setting up the card holder account. |
 **contactDetails** | [**ContactDetails**](ContactDetails.md)|  |

### Return type

[**CardHolderAccount**](CardHolderAccount.md)

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
**200** | A revised account with the new details set. |  -  |

<a name="accountCreate"></a>
# **accountCreate**
> CardHolderAccount accountCreate(accountCreate)

Account Create

Creates a new card holder account and initialises the account ready for adding cards.

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.CardHolderAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
    AccountCreate accountCreate = new AccountCreate(); // AccountCreate | 
    try {
      CardHolderAccount result = apiInstance.accountCreate(accountCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardHolderAccountApi#accountCreate");
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
 **accountCreate** | [**AccountCreate**](AccountCreate.md)|  |

### Return type

[**CardHolderAccount**](CardHolderAccount.md)

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
**200** | Provides an initialised account. |  -  |

<a name="accountDeleteRequest"></a>
# **accountDeleteRequest**
> Acknowledgement accountDeleteRequest(accountid)

Account Deletion

Allows for the deletion of an account. The account will marked for deletion and subsequent purging. No further transactions will be alowed to be processed or actioned against this account. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.CardHolderAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
    String accountid = "accountid_example"; // String | The account id that refers to the customer's account no. This value will have been provided when setting up the card holder account.
    try {
      Acknowledgement result = apiInstance.accountDeleteRequest(accountid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardHolderAccountApi#accountDeleteRequest");
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
 **accountid** | **String**| The account id that refers to the customer&#39;s account no. This value will have been provided when setting up the card holder account. |

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
**403** | Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. |  -  |
**401** | Unauthorized. No api key has been provided and is required for this operation. |  -  |
**422** | Unprocessable Entity. Should a failure occur that prevents processing of the API call. |  -  |
**400** | Bad Request. Should the incoming data not be validly determined. |  -  |
**200** | An acknowledgment code of &#x60;001&#x60; that the card holder account has been marked for deletion. |  -  |

<a name="accountExistsRequest"></a>
# **accountExistsRequest**
> Exists accountExistsRequest(accountid)

Account Exists

Checks that an account exists and is active by providing the account id as a url parameter  Checks that an account exists and is active by providing the account id as a url parameter. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.CardHolderAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
    String accountid = "accountid_example"; // String | The account id that refers to the customer's account no. This value will have been provided when setting up the card holder account.
    try {
      Exists result = apiInstance.accountExistsRequest(accountid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardHolderAccountApi#accountExistsRequest");
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
 **accountid** | **String**| The account id that refers to the customer&#39;s account no. This value will have been provided when setting up the card holder account. |

### Return type

[**Exists**](Exists.md)

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
**200** | A response model determining whether the account exists, if exists is true, a last modified date of the account is also provided. |  -  |

<a name="accountRetrieveRequest"></a>
# **accountRetrieveRequest**
> CardHolderAccount accountRetrieveRequest(accountid)

Account Retrieval

Allows for the retrieval of a card holder account for the given &#x60;id&#x60;. Should duplicate accounts exist for the same &#x60;id&#x60;, the first account created with that &#x60;id&#x60; will be returned.  The account can be used for tokenisation processing by listing all cards assigned to the account. The returned cards will include all &#x60;active&#x60;, &#x60;inactive&#x60; and &#x60;expired&#x60; cards. This can be used to  enable a card holder to view their wallet and make constructive choices on which card to use. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.CardHolderAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
    String accountid = "accountid_example"; // String | The account id that refers to the customer's account no. This value will have been provided when setting up the card holder account.
    try {
      CardHolderAccount result = apiInstance.accountRetrieveRequest(accountid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardHolderAccountApi#accountRetrieveRequest");
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
 **accountid** | **String**| The account id that refers to the customer&#39;s account no. This value will have been provided when setting up the card holder account. |

### Return type

[**CardHolderAccount**](CardHolderAccount.md)

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
**200** | A card holder account that matches the account id provided in the request. |  -  |

<a name="accountStatusRequest"></a>
# **accountStatusRequest**
> Acknowledgement accountStatusRequest(accountid, accountStatus)

Account Status

Updates the status of an account. An account can have the following statuses applied  | Status | Description | |--------|-------------| | Active | The account is active for processing | | Disabled | The account has been disabled and cannot be used for processing. The account will require reactivation to continue procesing | 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.CardHolderAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
    String accountid = "accountid_example"; // String | The account id that refers to the customer's account no. This value will have been provided when setting up the card holder account.
    AccountStatus accountStatus = new AccountStatus(); // AccountStatus | 
    try {
      Acknowledgement result = apiInstance.accountStatusRequest(accountid, accountStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardHolderAccountApi#accountStatusRequest");
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
 **accountid** | **String**| The account id that refers to the customer&#39;s account no. This value will have been provided when setting up the card holder account. |
 **accountStatus** | [**AccountStatus**](AccountStatus.md)|  |

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
**200** | An acknowledgment that the card holder account status has been updated.&lt;/br&gt;&lt;/br&gt;A response code of &#x60;001&#x60; is returned if the request was accepted or no change required.&lt;/br&gt;&lt;/br&gt;A response code of &#x60;000&#x60; is returned if the request contains invalid data. |  -  |

<a name="chargeRequest"></a>
# **chargeRequest**
> Decision chargeRequest(chargeRequest)

Charge

A charge process obtains an authorisation using a tokenised value which represents a stored card  on a card holder account.  A card must previously be registered by calling &#x60;/account-register-card&#x60; with the card details  or retrieved using &#x60;/account-retrieve&#x60;  Tokens are generated whenever a previously registered list of cards are retrieved. Each token has, by design a  relatively short time to live of 30 minutes. This is both to safe guard the merchant and card holder from  replay attacks. Tokens are also restricted to your account, preventing malicious actors from stealing details for use elsewhere.    If a token is reused after it has expired it will be rejected and a new token will be required.   Tokenisation can be used for   - repeat authorisations on a previously stored card - easy authorisations just requiring CSC values to be entered - can be used for credential on file style payments - can require full 3-D Secure authentication to retain the liability shift - wallet style usage. 

### Example
```java
// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.models.*;
import com.citypay.client.api.CardHolderAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com/v6");
    
    // Configure API key authorization: cp-api-key
    ApiKeyAuth cp-api-key = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
    cp-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cp-api-key.setApiKeyPrefix("Token");

    CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
    ChargeRequest chargeRequest = new ChargeRequest(); // ChargeRequest | 
    try {
      Decision result = apiInstance.chargeRequest(chargeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardHolderAccountApi#chargeRequest");
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
 **chargeRequest** | [**ChargeRequest**](ChargeRequest.md)|  |

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
**200** | A decision met by the result of the charge. |  -  |


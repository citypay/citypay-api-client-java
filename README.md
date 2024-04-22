# CityPay API Client for Java

[![Build Status](https://github.com/citypay/citypay-api-client-java/actions/workflows/maven.yml/badge.svg)](https://github.com/citypay/citypay-api-client-java/actions/workflows/maven.yml)
CityPay Payment API
- API version: 6.6.40
  - Build date: 2024-04-22T13:59:31.520907161Z[Etc/UTC]


Welcome to the CityPay API, a robust HTTP API payment solution designed for seamless server-to-server 
transactional processing. Our API facilitates a wide array of payment operations, catering to diverse business needs. 
Whether you're integrating Internet payments, handling Mail Order/Telephone Order (MOTO) transactions, managing 
Subscriptions with Recurring and Continuous Authority payments, or navigating the complexities of 3-D Secure 
authentication, our API is equipped to support your requirements. Additionally, we offer functionalities for 
Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids, and Completion processing, alongside the capability 
for tokenised payments.

## Compliance and Security Overview
<aside class=\"notice\">
  Ensuring the security of payment transactions and compliance with industry standards is paramount. Our API is 
  designed with stringent security measures and compliance protocols to safeguard sensitive information and meet 
  the rigorous requirements of Visa, MasterCard, and the PCI Security Standards Council.
</aside>

### Key Compliance and Security Measures

* **TLS Encryption**: All data transmissions must utilise TLS version 1.2 or higher, employing [strong cryptography](#enabled-tls-ciphers). Our infrastructure strictly enforces this requirement to maintain the integrity and confidentiality of data in transit. We conduct regular scans and assessments of our TLS endpoints to identify and mitigate vulnerabilities.
* **Data Storage Prohibitions**: Storing sensitive cardholder data (CHD), such as the card security code (CSC) or primary account number (PAN), is strictly prohibited. Our API is designed to minimize your exposure to sensitive data, thereby reducing your compliance burden.
* **Data Masking**: For consumer protection and compliance, full card numbers must not be displayed on receipts or any customer-facing materials. Our API automatically masks PANs, displaying only the last four digits to facilitate safe receipt generation.
* **Network Scans**: If your application is web-based, regular scans of your hosting environment are mandatory to identify and rectify potential vulnerabilities. This proactive measure is crucial for maintaining a secure and compliant online presence.
* **PCI Compliance**: Adherence to PCI DSS standards is not optional; it's a requirement for operating securely and legally in the payments ecosystem. For detailed information on compliance requirements and resources, please visit the PCI Security Standards Council website [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/).
* **Request Validation**: Our API includes mechanisms to verify the legitimacy of each request, ensuring it pertains to a valid account and originates from a trusted source. We leverage remote IP address verification alongside sophisticated application firewall technologies to thwart a wide array of common security threats.

## Getting Started
Before integrating with the CityPay API, ensure your application and development practices align with the outlined compliance and security measures. This preparatory step is crucial for a smooth integration process and the long-term success of your payment processing operations.

For further details on API endpoints, request/response formats, and code examples, proceed to the subsequent sections of our documentation. Our aim is to provide you with all the necessary tools and information to integrate our payment processing capabilities seamlessly into your application.

Thank you for choosing CityPay API. We look forward to supporting your payment processing needs with our secure, compliant, and versatile API solution.


  For more information, please visit [https://www.citypay.com/contacts/](https://www.citypay.com/contacts/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.citypay</groupId>
  <artifactId>citypay-api-client-java</artifactId>
  <version>1.1.4</version>
  <scope>compile</scope>
</dependency>
```


At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/citypay-api-client-java-1.1.4.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.auth.*;
import com.citypay.client.model.*;
import com.citypay.client.api.AuthorisationAndPaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.citypay.com");
    

    AuthorisationAndPaymentApi apiInstance = new AuthorisationAndPaymentApi(defaultClient);
    AuthRequest authRequest = new AuthRequest(); // AuthRequest | 
    try {
      Decision result = apiInstance.authorisationRequest(authRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorisationAndPaymentApi#authorisationRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.citypay.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthorisationAndPaymentApi* | [**authorisationRequest**](docs/AuthorisationAndPaymentApi.md#authorisationRequest) | **POST** /v6/authorise | Authorisation
*AuthorisationAndPaymentApi* | [**binRangeLookupRequest**](docs/AuthorisationAndPaymentApi.md#binRangeLookupRequest) | **POST** /v6/bin | Bin Lookup
*AuthorisationAndPaymentApi* | [**cResRequest**](docs/AuthorisationAndPaymentApi.md#cResRequest) | **POST** /v6/cres | CRes
*AuthorisationAndPaymentApi* | [**captureRequest**](docs/AuthorisationAndPaymentApi.md#captureRequest) | **POST** /v6/capture | Capture
*AuthorisationAndPaymentApi* | [**createPaymentIntent**](docs/AuthorisationAndPaymentApi.md#createPaymentIntent) | **POST** /v6/intent/create | Create a Payment Intent
*AuthorisationAndPaymentApi* | [**paResRequest**](docs/AuthorisationAndPaymentApi.md#paResRequest) | **POST** /v6/pares | PaRes
*AuthorisationAndPaymentApi* | [**refundRequest**](docs/AuthorisationAndPaymentApi.md#refundRequest) | **POST** /v6/refund | Refund
*AuthorisationAndPaymentApi* | [**retrievalRequest**](docs/AuthorisationAndPaymentApi.md#retrievalRequest) | **POST** /v6/retrieve | Retrieval
*AuthorisationAndPaymentApi* | [**voidRequest**](docs/AuthorisationAndPaymentApi.md#voidRequest) | **POST** /v6/void | Void
*BatchProcessingApi* | [**batchProcessRequest**](docs/BatchProcessingApi.md#batchProcessRequest) | **POST** /v6/batch/process | Batch Process Request
*BatchProcessingApi* | [**batchRetrieveRequest**](docs/BatchProcessingApi.md#batchRetrieveRequest) | **POST** /v6/batch/retrieve | Batch Retrieve Request
*BatchProcessingApi* | [**checkBatchStatusRequest**](docs/BatchProcessingApi.md#checkBatchStatusRequest) | **POST** /v6/batch/status | Check Batch Status
*CardHolderAccountApi* | [**accountCardDeleteRequest**](docs/CardHolderAccountApi.md#accountCardDeleteRequest) | **DELETE** /v6/account/{accountid}/card/{cardId} | Card Deletion
*CardHolderAccountApi* | [**accountCardRegisterRequest**](docs/CardHolderAccountApi.md#accountCardRegisterRequest) | **POST** /v6/account/{accountid}/register | Card Registration
*CardHolderAccountApi* | [**accountCardStatusRequest**](docs/CardHolderAccountApi.md#accountCardStatusRequest) | **POST** /v6/account/{accountid}/card/{cardId}/status | Card Status
*CardHolderAccountApi* | [**accountChangeContactRequest**](docs/CardHolderAccountApi.md#accountChangeContactRequest) | **POST** /v6/account/{accountid}/contact | Contact Details Update
*CardHolderAccountApi* | [**accountCreate**](docs/CardHolderAccountApi.md#accountCreate) | **POST** /v6/account/create | Account Create
*CardHolderAccountApi* | [**accountDeleteRequest**](docs/CardHolderAccountApi.md#accountDeleteRequest) | **DELETE** /v6/account/{accountid} | Account Deletion
*CardHolderAccountApi* | [**accountExistsRequest**](docs/CardHolderAccountApi.md#accountExistsRequest) | **GET** /v6/account-exists/{accountid} | Account Exists
*CardHolderAccountApi* | [**accountRetrieveRequest**](docs/CardHolderAccountApi.md#accountRetrieveRequest) | **GET** /v6/account/{accountid} | Account Retrieval
*CardHolderAccountApi* | [**accountStatusRequest**](docs/CardHolderAccountApi.md#accountStatusRequest) | **POST** /v6/account/{accountid}/status | Account Status
*CardHolderAccountApi* | [**chargeRequest**](docs/CardHolderAccountApi.md#chargeRequest) | **POST** /v6/charge | Charge
*DirectPostApi* | [**directCResAuthRequest**](docs/DirectPostApi.md#directCResAuthRequest) | **POST** /direct/cres/auth/{uuid} | Handles a CRes response from ACS, returning back the result of authorisation
*DirectPostApi* | [**directCResTokeniseRequest**](docs/DirectPostApi.md#directCResTokeniseRequest) | **POST** /direct/cres/tokenise/{uuid} | Handles a CRes response from ACS, returning back a token for future authorisation
*DirectPostApi* | [**directPostAuthRequest**](docs/DirectPostApi.md#directPostAuthRequest) | **POST** /direct/auth | Direct Post Auth Request
*DirectPostApi* | [**directPostTokeniseRequest**](docs/DirectPostApi.md#directPostTokeniseRequest) | **POST** /direct/tokenise | Direct Post Tokenise Request
*DirectPostApi* | [**tokenRequest**](docs/DirectPostApi.md#tokenRequest) | **POST** /direct/token | Direct Post Token Request
*OperationalFunctionsApi* | [**aclCheckRequest**](docs/OperationalFunctionsApi.md#aclCheckRequest) | **POST** /v6/acl/check | ACL Check Request
*OperationalFunctionsApi* | [**domainKeyCheckRequest**](docs/OperationalFunctionsApi.md#domainKeyCheckRequest) | **POST** /dk/check | Domain Key Check Request
*OperationalFunctionsApi* | [**domainKeyGenRequest**](docs/OperationalFunctionsApi.md#domainKeyGenRequest) | **POST** /dk/gen | Domain Key Generation Request
*OperationalFunctionsApi* | [**listMerchantsRequest**](docs/OperationalFunctionsApi.md#listMerchantsRequest) | **GET** /v6/merchants/{clientid} | List Merchants Request
*OperationalFunctionsApi* | [**pingRequest**](docs/OperationalFunctionsApi.md#pingRequest) | **POST** /v6/ping | Ping Request
*PaylinkApi* | [**tokenAdjustmentRequest**](docs/PaylinkApi.md#tokenAdjustmentRequest) | **POST** /paylink/{token}/adjustment | Paylink Token Adjustment
*PaylinkApi* | [**tokenCancelRequest**](docs/PaylinkApi.md#tokenCancelRequest) | **PUT** /paylink/{token}/cancel | Cancel a Paylink Token
*PaylinkApi* | [**tokenChangesRequest**](docs/PaylinkApi.md#tokenChangesRequest) | **POST** /paylink/token/changes | Paylink Token Audit
*PaylinkApi* | [**tokenCloseRequest**](docs/PaylinkApi.md#tokenCloseRequest) | **PUT** /paylink/{token}/close | Close Paylink Token
*PaylinkApi* | [**tokenCreateBillPaymentRequest**](docs/PaylinkApi.md#tokenCreateBillPaymentRequest) | **POST** /paylink/bill-payment | Create Bill Payment Paylink Token
*PaylinkApi* | [**tokenCreateRequest**](docs/PaylinkApi.md#tokenCreateRequest) | **POST** /paylink/create | Create Paylink Token
*PaylinkApi* | [**tokenPurgeAttachmentsRequest**](docs/PaylinkApi.md#tokenPurgeAttachmentsRequest) | **PUT** /paylink/{token}/purge-attachments | Purges any attachments for a Paylink Token
*PaylinkApi* | [**tokenReconciledRequest**](docs/PaylinkApi.md#tokenReconciledRequest) | **PUT** /paylink/{token}/reconciled | Reconcile Paylink Token
*PaylinkApi* | [**tokenReopenRequest**](docs/PaylinkApi.md#tokenReopenRequest) | **PUT** /paylink/{token}/reopen | Reopen Paylink Token
*PaylinkApi* | [**tokenResendNotificationRequest**](docs/PaylinkApi.md#tokenResendNotificationRequest) | **POST** /paylink/{token}/resend-notification | Resend a notification for Paylink Token
*PaylinkApi* | [**tokenStatusRequest**](docs/PaylinkApi.md#tokenStatusRequest) | **GET** /paylink/{token}/status | Paylink Token Status
*ReportingApi* | [**batchedTransactionReportRequest**](docs/ReportingApi.md#batchedTransactionReportRequest) | **POST** /v6/merchant-batch/{merchantid}/{batch_no}/transactions | Batch Transaction Report Request
*ReportingApi* | [**merchantBatchReportRequest**](docs/ReportingApi.md#merchantBatchReportRequest) | **POST** /v6/merchant-batch/report | Merchant Batch Report Request
*ReportingApi* | [**merchantBatchRequest**](docs/ReportingApi.md#merchantBatchRequest) | **GET** /v6/merchant-batch/{merchantid}/{batch_no} | Merchant Batch Request
*ReportingApi* | [**remittanceRangeReport**](docs/ReportingApi.md#remittanceRangeReport) | **POST** /v6/remittance/report/{clientid} | Remittance Report Request
*ReportingApi* | [**remittanceReportRequest**](docs/ReportingApi.md#remittanceReportRequest) | **GET** /v6/remittance/report/{clientid}/{date} | Remittance Date Report Request


## Documentation for Models

 - [AccountCreate](docs/AccountCreate.md)
 - [AccountStatus](docs/AccountStatus.md)
 - [Acknowledgement](docs/Acknowledgement.md)
 - [AclCheckRequest](docs/AclCheckRequest.md)
 - [AclCheckResponseModel](docs/AclCheckResponseModel.md)
 - [AirlineAdvice](docs/AirlineAdvice.md)
 - [AirlineSegment](docs/AirlineSegment.md)
 - [AuthReference](docs/AuthReference.md)
 - [AuthReferences](docs/AuthReferences.md)
 - [AuthRequest](docs/AuthRequest.md)
 - [AuthResponse](docs/AuthResponse.md)
 - [Batch](docs/Batch.md)
 - [BatchReportRequest](docs/BatchReportRequest.md)
 - [BatchReportResponseModel](docs/BatchReportResponseModel.md)
 - [BatchTransaction](docs/BatchTransaction.md)
 - [BatchTransactionReportRequest](docs/BatchTransactionReportRequest.md)
 - [BatchTransactionReportResponse](docs/BatchTransactionReportResponse.md)
 - [BatchTransactionResultModel](docs/BatchTransactionResultModel.md)
 - [Bin](docs/Bin.md)
 - [BinLookup](docs/BinLookup.md)
 - [CResAuthRequest](docs/CResAuthRequest.md)
 - [CaptureRequest](docs/CaptureRequest.md)
 - [Card](docs/Card.md)
 - [CardHolderAccount](docs/CardHolderAccount.md)
 - [CardStatus](docs/CardStatus.md)
 - [ChargeRequest](docs/ChargeRequest.md)
 - [CheckBatchStatus](docs/CheckBatchStatus.md)
 - [CheckBatchStatusResponse](docs/CheckBatchStatusResponse.md)
 - [ContactDetails](docs/ContactDetails.md)
 - [Decision](docs/Decision.md)
 - [DirectPostRequest](docs/DirectPostRequest.md)
 - [DirectTokenAuthRequest](docs/DirectTokenAuthRequest.md)
 - [DomainKeyCheckRequest](docs/DomainKeyCheckRequest.md)
 - [DomainKeyRequest](docs/DomainKeyRequest.md)
 - [DomainKeyResponse](docs/DomainKeyResponse.md)
 - [Error](docs/Error.md)
 - [EventDataModel](docs/EventDataModel.md)
 - [Exists](docs/Exists.md)
 - [ExternalMPI](docs/ExternalMPI.md)
 - [ListMerchantsResponse](docs/ListMerchantsResponse.md)
 - [MCC6012](docs/MCC6012.md)
 - [Merchant](docs/Merchant.md)
 - [MerchantBatchReportRequest](docs/MerchantBatchReportRequest.md)
 - [MerchantBatchReportResponse](docs/MerchantBatchReportResponse.md)
 - [MerchantBatchResponse](docs/MerchantBatchResponse.md)
 - [NetSummaryResponse](docs/NetSummaryResponse.md)
 - [PaResAuthRequest](docs/PaResAuthRequest.md)
 - [PaylinkAddress](docs/PaylinkAddress.md)
 - [PaylinkAdjustmentRequest](docs/PaylinkAdjustmentRequest.md)
 - [PaylinkAttachmentRequest](docs/PaylinkAttachmentRequest.md)
 - [PaylinkAttachmentResult](docs/PaylinkAttachmentResult.md)
 - [PaylinkBillPaymentTokenRequest](docs/PaylinkBillPaymentTokenRequest.md)
 - [PaylinkCardHolder](docs/PaylinkCardHolder.md)
 - [PaylinkCart](docs/PaylinkCart.md)
 - [PaylinkCartItemModel](docs/PaylinkCartItemModel.md)
 - [PaylinkConfig](docs/PaylinkConfig.md)
 - [PaylinkCustomParam](docs/PaylinkCustomParam.md)
 - [PaylinkEmailNotificationPath](docs/PaylinkEmailNotificationPath.md)
 - [PaylinkErrorCode](docs/PaylinkErrorCode.md)
 - [PaylinkFieldGuardModel](docs/PaylinkFieldGuardModel.md)
 - [PaylinkPartPayments](docs/PaylinkPartPayments.md)
 - [PaylinkResendNotificationRequest](docs/PaylinkResendNotificationRequest.md)
 - [PaylinkSMSNotificationPath](docs/PaylinkSMSNotificationPath.md)
 - [PaylinkStateEvent](docs/PaylinkStateEvent.md)
 - [PaylinkTokenCreated](docs/PaylinkTokenCreated.md)
 - [PaylinkTokenRequestModel](docs/PaylinkTokenRequestModel.md)
 - [PaylinkTokenStatus](docs/PaylinkTokenStatus.md)
 - [PaylinkTokenStatusChangeRequest](docs/PaylinkTokenStatusChangeRequest.md)
 - [PaylinkTokenStatusChangeResponse](docs/PaylinkTokenStatusChangeResponse.md)
 - [PaylinkUI](docs/PaylinkUI.md)
 - [PaymentIntent](docs/PaymentIntent.md)
 - [PaymentIntentReference](docs/PaymentIntentReference.md)
 - [Ping](docs/Ping.md)
 - [ProcessBatchRequest](docs/ProcessBatchRequest.md)
 - [ProcessBatchResponse](docs/ProcessBatchResponse.md)
 - [RefundRequest](docs/RefundRequest.md)
 - [RegisterCard](docs/RegisterCard.md)
 - [RemittanceData](docs/RemittanceData.md)
 - [RemittanceReportRequest](docs/RemittanceReportRequest.md)
 - [RemittanceReportResponse](docs/RemittanceReportResponse.md)
 - [RemittedClientData](docs/RemittedClientData.md)
 - [RequestChallenged](docs/RequestChallenged.md)
 - [RetrieveRequest](docs/RetrieveRequest.md)
 - [ThreeDSecure](docs/ThreeDSecure.md)
 - [TokenisationResponseModel](docs/TokenisationResponseModel.md)
 - [VoidRequest](docs/VoidRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="cp-api-key"></a>
### cp-api-key

- **Type**: API key
- **API key parameter name**: cp-api-key
- **Location**: HTTP header

<a id="cp-domain-key"></a>
### cp-domain-key

- **Type**: API key
- **API key parameter name**: cp-domain-key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@citypay.com


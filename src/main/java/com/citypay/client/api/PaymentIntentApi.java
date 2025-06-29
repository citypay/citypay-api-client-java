/*
 * CityPay Payment API
 *  Welcome to the CityPay API, a robust HTTP API payment solution designed for seamless server-to-server  transactional processing. Our API facilitates a wide array of payment operations, catering to diverse business needs.  Whether you're integrating Internet payments, handling Mail Order/Telephone Order (MOTO) transactions, managing  Subscriptions with Recurring and Continuous Authority payments, or navigating the complexities of 3-D Secure  authentication, our API is equipped to support your requirements. Additionally, we offer functionalities for  Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids, and Completion processing, alongside the capability  for tokenised payments.  ## Compliance and Security Overview <aside class=\"notice\">   Ensuring the security of payment transactions and compliance with industry standards is paramount. Our API is    designed with stringent security measures and compliance protocols to safeguard sensitive information and meet    the rigorous requirements of Visa, MasterCard, and the PCI Security Standards Council. </aside>  ### Key Compliance and Security Measures  * **TLS Encryption**: All data transmissions must utilise TLS version 1.2 or higher, employing [strong cryptography](#enabled-tls-ciphers). Our infrastructure strictly enforces this requirement to maintain the integrity and confidentiality of data in transit. We conduct regular scans and assessments of our TLS endpoints to identify and mitigate vulnerabilities. * **Data Storage Prohibitions**: Storing sensitive cardholder data (CHD), such as the card security code (CSC) or primary account number (PAN), is strictly prohibited. Our API is designed to minimize your exposure to sensitive data, thereby reducing your compliance burden. * **Data Masking**: For consumer protection and compliance, full card numbers must not be displayed on receipts or any customer-facing materials. Our API automatically masks PANs, displaying only the last four digits to facilitate safe receipt generation. * **Network Scans**: If your application is web-based, regular scans of your hosting environment are mandatory to identify and rectify potential vulnerabilities. This proactive measure is crucial for maintaining a secure and compliant online presence. * **PCI Compliance**: Adherence to PCI DSS standards is not optional; it's a requirement for operating securely and legally in the payments ecosystem. For detailed information on compliance requirements and resources, please visit the PCI Security Standards Council website [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/). * **Request Validation**: Our API includes mechanisms to verify the legitimacy of each request, ensuring it pertains to a valid account and originates from a trusted source. We leverage remote IP address verification alongside sophisticated application firewall technologies to thwart a wide array of common security threats.  ## Getting Started Before integrating with the CityPay API, ensure your application and development practices align with the outlined compliance and security measures. This preparatory step is crucial for a smooth integration process and the long-term success of your payment processing operations.  For further details on API endpoints, request/response formats, and code examples, proceed to the subsequent sections of our documentation. Our aim is to provide you with all the necessary tools and information to integrate our payment processing capabilities seamlessly into your application.  Thank you for choosing CityPay API. We look forward to supporting your payment processing needs with our secure, compliant, and versatile API solution. 
 *
 * Contact: support@citypay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.citypay.client.api;

import com.citypay.client.ApiCallback;
import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.ApiResponse;
import com.citypay.client.Configuration;
import com.citypay.client.Pair;
import com.citypay.client.ProgressRequestBody;
import com.citypay.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.citypay.client.model.Error;
import com.citypay.client.model.FindPaymentIntentRequest;
import com.citypay.client.model.PaymentIntentReference;
import com.citypay.client.model.PaymentIntentRequestModel;
import com.citypay.client.model.PaymentIntentResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentIntentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentIntentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentIntentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createPaymentIntent
     * @param paymentIntentRequestModel  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the id of the payment intent. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Should the incoming data not be validly determined. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. No api key has been provided and is required for this operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity. Should a failure occur that prevents processing of the API call. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error. The server was unable to complete the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPaymentIntentCall(@javax.annotation.Nonnull PaymentIntentRequestModel paymentIntentRequestModel, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = paymentIntentRequestModel;

        // create path and map variables
        String localVarPath = "/v6/intent/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "text/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "cp-api-key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPaymentIntentValidateBeforeCall(@javax.annotation.Nonnull PaymentIntentRequestModel paymentIntentRequestModel, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'paymentIntentRequestModel' is set
        if (paymentIntentRequestModel == null) {
            throw new ApiException("Missing the required parameter 'paymentIntentRequestModel' when calling createPaymentIntent(Async)");
        }

        return createPaymentIntentCall(paymentIntentRequestModel, _callback);

    }

    /**
     * Create a Payment Intent
     * This endpoint initiates the creation of a payment intent, which is a precursor to processing a payment. A payment intent captures the details of a prospective payment transaction, including the payment amount, currency, and associated billing and shipping information. 
     * @param paymentIntentRequestModel  (required)
     * @return PaymentIntentReference
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the id of the payment intent. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Should the incoming data not be validly determined. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. No api key has been provided and is required for this operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity. Should a failure occur that prevents processing of the API call. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error. The server was unable to complete the request. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentIntentReference createPaymentIntent(@javax.annotation.Nonnull PaymentIntentRequestModel paymentIntentRequestModel) throws ApiException {
        ApiResponse<PaymentIntentReference> localVarResp = createPaymentIntentWithHttpInfo(paymentIntentRequestModel);
        return localVarResp.getData();
    }

    /**
     * Create a Payment Intent
     * This endpoint initiates the creation of a payment intent, which is a precursor to processing a payment. A payment intent captures the details of a prospective payment transaction, including the payment amount, currency, and associated billing and shipping information. 
     * @param paymentIntentRequestModel  (required)
     * @return ApiResponse&lt;PaymentIntentReference&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the id of the payment intent. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Should the incoming data not be validly determined. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. No api key has been provided and is required for this operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity. Should a failure occur that prevents processing of the API call. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error. The server was unable to complete the request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentIntentReference> createPaymentIntentWithHttpInfo(@javax.annotation.Nonnull PaymentIntentRequestModel paymentIntentRequestModel) throws ApiException {
        okhttp3.Call localVarCall = createPaymentIntentValidateBeforeCall(paymentIntentRequestModel, null);
        Type localVarReturnType = new TypeToken<PaymentIntentReference>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a Payment Intent (asynchronously)
     * This endpoint initiates the creation of a payment intent, which is a precursor to processing a payment. A payment intent captures the details of a prospective payment transaction, including the payment amount, currency, and associated billing and shipping information. 
     * @param paymentIntentRequestModel  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the id of the payment intent. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Should the incoming data not be validly determined. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. No api key has been provided and is required for this operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity. Should a failure occur that prevents processing of the API call. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error. The server was unable to complete the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPaymentIntentAsync(@javax.annotation.Nonnull PaymentIntentRequestModel paymentIntentRequestModel, final ApiCallback<PaymentIntentReference> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPaymentIntentValidateBeforeCall(paymentIntentRequestModel, _callback);
        Type localVarReturnType = new TypeToken<PaymentIntentReference>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPaymentIntent
     * @param findPaymentIntentRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment intent and optionally any transactions associated to the intent. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Should the incoming data not be validly determined. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. No api key has been provided and is required for this operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity. Should a failure occur that prevents processing of the API call. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error. The server was unable to complete the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentIntentCall(@javax.annotation.Nonnull FindPaymentIntentRequest findPaymentIntentRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = findPaymentIntentRequest;

        // create path and map variables
        String localVarPath = "/v6/intent/retrieve";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "text/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "cp-api-key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPaymentIntentValidateBeforeCall(@javax.annotation.Nonnull FindPaymentIntentRequest findPaymentIntentRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'findPaymentIntentRequest' is set
        if (findPaymentIntentRequest == null) {
            throw new ApiException("Missing the required parameter 'findPaymentIntentRequest' when calling getPaymentIntent(Async)");
        }

        return getPaymentIntentCall(findPaymentIntentRequest, _callback);

    }

    /**
     * Retrieves a Payment Intent
     * Obtains a payment intent.
     * @param findPaymentIntentRequest  (required)
     * @return PaymentIntentResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment intent and optionally any transactions associated to the intent. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Should the incoming data not be validly determined. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. No api key has been provided and is required for this operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity. Should a failure occur that prevents processing of the API call. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error. The server was unable to complete the request. </td><td>  -  </td></tr>
     </table>
     */
    public PaymentIntentResponseModel getPaymentIntent(@javax.annotation.Nonnull FindPaymentIntentRequest findPaymentIntentRequest) throws ApiException {
        ApiResponse<PaymentIntentResponseModel> localVarResp = getPaymentIntentWithHttpInfo(findPaymentIntentRequest);
        return localVarResp.getData();
    }

    /**
     * Retrieves a Payment Intent
     * Obtains a payment intent.
     * @param findPaymentIntentRequest  (required)
     * @return ApiResponse&lt;PaymentIntentResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment intent and optionally any transactions associated to the intent. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Should the incoming data not be validly determined. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. No api key has been provided and is required for this operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity. Should a failure occur that prevents processing of the API call. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error. The server was unable to complete the request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PaymentIntentResponseModel> getPaymentIntentWithHttpInfo(@javax.annotation.Nonnull FindPaymentIntentRequest findPaymentIntentRequest) throws ApiException {
        okhttp3.Call localVarCall = getPaymentIntentValidateBeforeCall(findPaymentIntentRequest, null);
        Type localVarReturnType = new TypeToken<PaymentIntentResponseModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieves a Payment Intent (asynchronously)
     * Obtains a payment intent.
     * @param findPaymentIntentRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a payment intent and optionally any transactions associated to the intent. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request. Should the incoming data not be validly determined. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized. No api key has been provided and is required for this operation. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden. The api key was provided and understood but is either incorrect or does not have permission to access the account provided on the request. </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity. Should a failure occur that prevents processing of the API call. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error. The server was unable to complete the request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPaymentIntentAsync(@javax.annotation.Nonnull FindPaymentIntentRequest findPaymentIntentRequest, final ApiCallback<PaymentIntentResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPaymentIntentValidateBeforeCall(findPaymentIntentRequest, _callback);
        Type localVarReturnType = new TypeToken<PaymentIntentResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

/*
 * CityPay Payment API
 *  This CityPay API is a HTTP RESTful payment API used for direct server to server transactional processing. It provides a number of payment mechanisms including: Internet, MOTO, Continuous Authority transaction processing, 3-D Secure decision handling using RFA Secure, Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids and Completion processing. The API is also capable of tokinsed payments using Card Holder Accounts.  ## Compliance and Security Your application will need to adhere to PCI-DSS standards to operate safely and to meet requirements set out by  Visa and MasterCard and the PCI Security Standards Council. These include  * Data must be collected using TLS version 1.2 using [strong cryptography](#enabled-tls-ciphers). We will not accept calls to our API at   lower grade encryption levels. We regularly scan our TLS endpoints for vulnerabilities and perform TLS assessments   as part of our compliance program. * The application must not store sensitive card holder data (CHD) such as the card security code (CSC) or   primary access number (PAN) * The application must not display the full card number on receipts, it is recommended to mask the PAN   and show the last 4 digits. The API will return this for you for ease of receipt creation * If you are developing a website, you will be required to perform regular scans on the network where you host the   application to meet your compliance obligations * You will be required to be PCI Compliant and the application must adhere to the security standard. Further information   is available from [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/) * The API verifies that the request is for a valid account and originates from a trusted source using the remote IP   address. Our application firewalls analyse data that may be an attempt to break a large number of security common   security vulnerabilities. 
 *
 * Contact: support@citypay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.citypay.client.api;

import com.citypay.client.ApiException;
import com.citypay.client.model.AuthResponse;
import com.citypay.client.model.DirectPostRequest;
import com.citypay.client.model.DirectTokenAuthRequest;
import com.citypay.client.model.TokenisationResponseModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

/**
 * API tests for DirectPostApi
 */
@Disabled
public class DirectPostApiTest {

    private final DirectPostApi api = new DirectPostApi();

    
    /**
     * Handles a CRes response from ACS, returning back the result of authorisation
     *
     * Used to post from an ACS during a ThreeDSecure direct flow process. The endpoint requires a valid &#x60;threeDSSessionData&#x60; value which defines the unique transaction through its workflow. This endpoint may be used by merchants wishing to perform a &#x60;Direct Post&#x60; integration who wish to handle the challenge flow themselves. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void directCResAuthRequestTest() throws ApiException {
        String uuid = null;
        String cres = null;
        String threeDSSessionData = null;
        AuthResponse response = api.directCResAuthRequest(uuid, cres, threeDSSessionData);

        // TODO: test validations
    }
    
    /**
     * Handles a CRes response from ACS, returning back a token for future authorisation
     *
     * Used to post from an ACS during a ThreeDSecure direct flow process. The endpoint requires a valid &#x60;threeDSSessionData&#x60; value which defines the unique transaction through its workflow. This endpoint may be used by merchants wishing to perform a &#x60;Direct Post&#x60; integration who wish to handle the challenge flow themselves. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void directCResTokeniseRequestTest() throws ApiException {
        String uuid = null;
        String cres = null;
        String threeDSSessionData = null;
        TokenisationResponseModel response = api.directCResTokeniseRequest(uuid, cres, threeDSSessionData);

        // TODO: test validations
    }
    
    /**
     * Direct Post Auth Request
     *
     * Used to initiate a direct post request transaction flow.  &lt;pre class&#x3D;\&quot;inline-code language-bash\&quot;&gt; &lt;code&gt; curl https://api.citypay.com/v6/direct?cp-domain-key&#x3D;n834ytqp84y... \\  -d \&quot;amount&#x3D;7500&amp;identifier&#x3D;example_trans&amp;cardnumber&#x3D;4000000000000002&amp;expmonth&#x3D;9&amp;expyear&#x3D;2028&amp;bill_to_postcode&#x3D;L1+7ZW &lt;/code&gt; &lt;/pre&gt;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void directPostAuthRequestTest() throws ApiException {
        DirectPostRequest directPostRequest = null;
        AuthResponse response = api.directPostAuthRequest(directPostRequest);

        // TODO: test validations
    }
    
    /**
     * Direct Post Tokenise Request
     *
     * Used to initiate a direct post request transaction flow.  &lt;pre class&#x3D;\&quot;inline-code language-bash\&quot;&gt; &lt;code&gt; curl https://api.citypay.com/v6/direct?cp-domain-key&#x3D;n834ytqp84y... \\  -d \&quot;amount&#x3D;7500&amp;identifier&#x3D;example_trans&amp;cardnumber&#x3D;4000000000000002&amp;expmonth&#x3D;9&amp;expyear&#x3D;2028&amp;bill_to_postcode&#x3D;L1+7ZW &lt;/code&gt; &lt;/pre&gt;. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void directPostTokeniseRequestTest() throws ApiException {
        DirectPostRequest directPostRequest = null;
        AuthResponse response = api.directPostTokeniseRequest(directPostRequest);

        // TODO: test validations
    }
    
    /**
     * Direct Post Token Request
     *
     * Perform a request for authorisation for a previously generated token. This flow will return an authorisation response stating that the transaction was approved or declined. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tokenRequestTest() throws ApiException {
        DirectTokenAuthRequest directTokenAuthRequest = null;
        AuthResponse response = api.tokenRequest(directTokenAuthRequest);

        // TODO: test validations
    }
    
}

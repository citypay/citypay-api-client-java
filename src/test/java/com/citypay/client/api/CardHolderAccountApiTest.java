/*
 * CityPay Payment API
 *  This CityPay API is a HTTP RESTful payment API used for direct server to server transactional processing. It provides a number of payment mechanisms including: Internet, MOTO, Continuous Authority transaction processing, 3-D Secure decision handling using RFA Secure, Authorisation, Refunding, Pre-Authorisation, Cancellation/Voids and Completion processing. The API is also capable of tokinsed payments using Card Holder Accounts.  ## Compliance and Security <aside class=\"notice\">   Before we begin a reminder that your application will need to adhere to PCI-DSS standards to operate safely   and to meet requirements set out by Visa and MasterCard and the PCI Security Standards Council including: </aside>  * Data must be collected using TLS version 1.2 using [strong cryptography](#enabled-tls-ciphers). We will not accept calls to our API at   lower grade encryption levels. We regularly scan our TLS endpoints for vulnerabilities and perform TLS assessments   as part of our compliance program. * The application must not store sensitive card holder data (CHD) such as the card security code (CSC) or   primary access number (PAN) * The application must not display the full card number on receipts, it is recommended to mask the PAN   and show the last 4 digits. The API will return this for you for ease of receipt creation * If you are developing a website, you will be required to perform regular scans on the network where you host the   application to meet your compliance obligations * You will be required to be PCI Compliant and the application must adhere to the security standard. Further information   is available from [https://www.pcisecuritystandards.org/](https://www.pcisecuritystandards.org/) * The API verifies that the request is for a valid account and originates from a trusted source using the remote IP   address. Our application firewalls analyse data that may be an attempt to break a large number of security common   security vulnerabilities. 
 *
 * Contact: support@citypay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.citypay.client.api;

import com.citypay.client.ApiException;
import com.citypay.client.model.AccountCreate;
import com.citypay.client.model.AccountStatus;
import com.citypay.client.model.Acknowledgement;
import com.citypay.client.model.CardHolderAccount;
import com.citypay.client.model.CardStatus;
import com.citypay.client.model.ChargeRequest;
import com.citypay.client.model.ContactDetails;
import com.citypay.client.model.Decision;
import com.citypay.client.model.Error;
import com.citypay.client.model.RegisterCard;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CardHolderAccountApi
 */
@Ignore
public class CardHolderAccountApiTest {

    private final CardHolderAccountApi api = new CardHolderAccountApi();

    
    /**
     * Card Deletion
     *
     * Deletes a card from the account. The card will be marked for deletion before a subsequent purge will clear the card permanently. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountCardDeleteRequestTest() throws ApiException {
        String accountid = null;
        String cardId = null;
        Acknowledgement response = api.accountCardDeleteRequest(accountid, cardId, null);

        // TODO: test validations
    }
    
    /**
     * Card Registration
     *
     * Allows for a card to be registered for the account. The card will be added for future  processing and will be available as a tokenised value for future processing.  The card will be validated for  0. Being a valid card number (luhn check) 0. Having a valid expiry date 0. Being a valid bin value. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountCardRegisterRequestTest() throws ApiException {
        String accountid = null;
        RegisterCard registerCard = null;
        CardHolderAccount response = api.accountCardRegisterRequest(accountid, registerCard);

        // TODO: test validations
    }
    
    /**
     * Card Status
     *
     * Updates the status of a card for processing. The following values are available  | Status | Description |  |--------|-------------| | Active | The card is active for processing and can be used for charging against with a valid token | | Inactive | The card is inactive for processing and cannot be used for processing, it will require reactivation before being used to charge | | Expired | The card has expired either due to the expiry date no longer being valid or due to a replacement card being issued | 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountCardStatusRequestTest() throws ApiException {
        String accountid = null;
        String cardId = null;
        CardStatus cardStatus = null;
        Acknowledgement response = api.accountCardStatusRequest(accountid, cardId, cardStatus);

        // TODO: test validations
    }
    
    /**
     * Contact Details Update
     *
     * Allows for the ability to change the contact details for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountChangeContactRequestTest() throws ApiException {
        String accountid = null;
        ContactDetails contactDetails = null;
        CardHolderAccount response = api.accountChangeContactRequest(accountid, contactDetails);

        // TODO: test validations
    }
    
    /**
     * Account Create
     *
     * Creates a new card holder account and initialises the account ready for adding cards.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountCreateTest() throws ApiException {
        AccountCreate accountCreate = null;
        CardHolderAccount response = api.accountCreate(accountCreate);

        // TODO: test validations
    }
    
    /**
     * Account Deletion
     *
     * Allows for the deletion of an account. The account will marked for deletion and subsequent purging. No further transactions will be alowed to be processed or actioned against this account. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountDeleteRequestTest() throws ApiException {
        String accountid = null;
        Acknowledgement response = api.accountDeleteRequest(accountid);

        // TODO: test validations
    }
    
    /**
     * Account Retrieval
     *
     * Allows for the retrieval of a card holder account for the given &#x60;id&#x60;. Should duplicate accounts exist for the same &#x60;id&#x60;, the first account created with that &#x60;id&#x60; will be returned.  The account can be used for tokenisation processing by listing all cards assigned to the account. The returned cards will include all &#x60;active&#x60;, &#x60;inactive&#x60; and &#x60;expired&#x60; cards. This can be used to  enable a card holder to view their wallet and make constructive choices on which card to use. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountRetrieveRequestTest() throws ApiException {
        String accountid = null;
        CardHolderAccount response = api.accountRetrieveRequest(accountid);

        // TODO: test validations
    }
    
    /**
     * Account Status
     *
     * Updates the status of an account. An account can have the following statuses applied  | Status | Description | |--------|-------------| | Active | The account is active for processing | | Disabled | The account has been disabled and cannot be used for processing. The account will require reactivation to continue procesing | 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountStatusRequestTest() throws ApiException {
        String accountid = null;
        AccountStatus accountStatus = null;
        Acknowledgement response = api.accountStatusRequest(accountid, accountStatus);

        // TODO: test validations
    }
    
    /**
     * Charge
     *
     * A charge process obtains an authorisation using a tokenised value which represents a stored card  on a card holder account.  A card must previously be registered by calling &#x60;/account-register-card&#x60; with the card details  or retrieved using &#x60;/account-retrieve&#x60;  Tokens are generated whenever a previously registered list of cards are retrieved. Each token has, by design a  relatively short time to live of 30 minutes. This is both to safe guard the merchant and card holder from  replay attacks. Tokens are also restricted to your account, preventing malicious actors from stealing details for use elsewhere.    If a token is reused after it has expired it will be rejected and a new token will be required.   Tokenisation can be used for   - repeat authorisations on a previously stored card - easy authorisations just requiring CSC values to be entered - can be used for credential on file style payments - can require full 3-D Secure authentication to retain the liability shift - wallet style usage. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void chargeRequestTest() throws ApiException {
        ChargeRequest chargeRequest = null;
        Decision response = api.chargeRequest(chargeRequest);

        // TODO: test validations
    }
    
}

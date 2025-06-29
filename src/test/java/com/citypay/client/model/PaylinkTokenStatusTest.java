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


package com.citypay.client.model;

import org.junit.jupiter.api.Test;


/**
 * Model tests for PaylinkTokenStatus
 */
public class PaylinkTokenStatusTest {
    private final PaylinkTokenStatus model = new PaylinkTokenStatus();

    /**
     * Model tests for PaylinkTokenStatus
     */
    @Test
    public void testPaylinkTokenStatus() {
        // TODO: test PaylinkTokenStatus
    }

    /**
     * Test the property 'amountPaid'
     */
    @Test
    public void amountPaidTest() {
        // TODO: test amountPaid
    }

    /**
     * Test the property 'authCode'
     */
    @Test
    public void authCodeTest() {
        // TODO: test authCode
    }

    /**
     * Test the property 'card'
     */
    @Test
    public void cardTest() {
        // TODO: test card
    }

    /**
     * Test the property 'created'
     */
    @Test
    public void createdTest() {
        // TODO: test created
    }

    /**
     * Test the property 'datetime'
     */
    @Test
    public void datetimeTest() {
        // TODO: test datetime
    }

    /**
     * Test the property 'identifier'
     */
    @Test
    public void identifierTest() {
        // TODO: test identifier
    }

    /**
     * Test the property 'isAttachment'
     */
    @Test
    public void isAttachmentTest() {
        // TODO: test isAttachment
    }

    /**
     * Test the property 'isCancelled'
     */
    @Test
    public void isCancelledTest() {
        // TODO: test isCancelled
    }

    /**
     * Test the property 'isClosed'
     */
    @Test
    public void isClosedTest() {
        // TODO: test isClosed
    }

    /**
     * Test the property 'isCustomerReceiptEmailSent'
     */
    @Test
    public void isCustomerReceiptEmailSentTest() {
        // TODO: test isCustomerReceiptEmailSent
    }

    /**
     * Test the property 'isEmailSent'
     */
    @Test
    public void isEmailSentTest() {
        // TODO: test isEmailSent
    }

    /**
     * Test the property 'isExpired'
     */
    @Test
    public void isExpiredTest() {
        // TODO: test isExpired
    }

    /**
     * Test the property 'isFormViewed'
     */
    @Test
    public void isFormViewedTest() {
        // TODO: test isFormViewed
    }

    /**
     * Test the property 'isMerchantNotificationEmailSent'
     */
    @Test
    public void isMerchantNotificationEmailSentTest() {
        // TODO: test isMerchantNotificationEmailSent
    }

    /**
     * Test the property 'isOpenForPayment'
     */
    @Test
    public void isOpenForPaymentTest() {
        // TODO: test isOpenForPayment
    }

    /**
     * Test the property 'isPaid'
     */
    @Test
    public void isPaidTest() {
        // TODO: test isPaid
    }

    /**
     * Test the property 'isPaymentAttempted'
     */
    @Test
    public void isPaymentAttemptedTest() {
        // TODO: test isPaymentAttempted
    }

    /**
     * Test the property 'isPostbackOk'
     */
    @Test
    public void isPostbackOkTest() {
        // TODO: test isPostbackOk
    }

    /**
     * Test the property 'isRequestChallenged'
     */
    @Test
    public void isRequestChallengedTest() {
        // TODO: test isRequestChallenged
    }

    /**
     * Test the property 'isSmsSent'
     */
    @Test
    public void isSmsSentTest() {
        // TODO: test isSmsSent
    }

    /**
     * Test the property 'isValidated'
     */
    @Test
    public void isValidatedTest() {
        // TODO: test isValidated
    }

    /**
     * Test the property 'lastEventDateTime'
     */
    @Test
    public void lastEventDateTimeTest() {
        // TODO: test lastEventDateTime
    }

    /**
     * Test the property 'lastPaymentResult'
     */
    @Test
    public void lastPaymentResultTest() {
        // TODO: test lastPaymentResult
    }

    /**
     * Test the property 'mid'
     */
    @Test
    public void midTest() {
        // TODO: test mid
    }

    /**
     * Test the property 'paymentAttemptsCount'
     */
    @Test
    public void paymentAttemptsCountTest() {
        // TODO: test paymentAttemptsCount
    }

    /**
     * Test the property 'stateHistory'
     */
    @Test
    public void stateHistoryTest() {
        // TODO: test stateHistory
    }

    /**
     * Test the property 'token'
     */
    @Test
    public void tokenTest() {
        // TODO: test token
    }

    /**
     * Test the property 'transNo'
     */
    @Test
    public void transNoTest() {
        // TODO: test transNo
    }

}

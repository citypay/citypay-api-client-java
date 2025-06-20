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


package com.citypay.client.model;

import com.citypay.client.JSON;
import com.google.gson.reflect.TypeToken;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


/**
 * Model tests for AuthResponse
 */
public class AuthResponseTest {
    private final AuthResponse authResponse = new JSON().deserialize("{\n" +
                    "          \"amount\": 5500,\n" +
                    "          \"atrn\": \"atrn1\",\n" +
                    "          \"atsd\": \"a\",\n" +
                    "          \"authcode\": \"12345\",\n" +
                    "          \"authen_result\": \"R\",\n" +
                    "          \"authorised\": true,\n" +
                    "          \"avs_result\": \"G\",\n" +
                    "          \"bin_commercial\": false,\n" +
                    "          \"bin_debit\": false,\n" +
                    "          \"bin_description\": \"bin_desc\",\n" +
                    "          \"cavv\": \"cavvvvvvvvvvvvv\",\n" +
                    "          \"context\": \"20200812075906AAAGV4\",\n" +
                    "          \"csc_result\": \"C\",\n" +
                    "          \"currency\": \"GBP\",\n" +
                    "          \"datetime\": \"2020-08-12T07:59:11Z\",\n" +
                    "          \"eci\": \"0\",\n" +
                    "          \"identifier\": \"ident1\",\n" +
                    "          \"live\": true,\n" +
                    "          \"maskedpan\": \"400000******0002\",\n" +
                    "          \"merchantid\": 12345,\n" +
                    "          \"result\": 1,\n" +
                    "          \"result_code\": \"000\",\n" +
                    "          \"result_message\": \"System: Accepted Transaction\",\n" +
                    "          \"scheme\": \"VISA_BUSINESS\",\n" +
                    "          \"sha256\": \"abcdefg\",\n" +
                    "          \"trans_status\": \"P\",\n" +
                    "          \"transno\": 74875\n" +
                    "        }",
            new TypeToken<AuthResponse>() {
            }.getType());

    private final AuthResponse authResponseWithNoIdent = new JSON().deserialize("{\n" +
                    "          \"amount\": 0,\n" +
                    "          \"atrn\": \"\",\n" +
                    "          \"atsd\": \"\",\n" +
                    "          \"authcode\": \"\",\n" +
                    "          \"authen_result\": \"\",\n" +
                    "          \"authorised\": false,\n" +
                    "          \"avs_result\": \" \",\n" +
                    "          \"bin_commercial\": false,\n" +
                    "          \"bin_debit\": false,\n" +
                    "          \"bin_description\": \"\",\n" +
                    "          \"cavv\": \"\",\n" +
                    "          \"context\": \"PC.0.A5298ef695b\",\n" +
                    "          \"csc_result\": \" \",\n" +
                    "          \"currency\": \"___\",\n" +
                    "          \"datetime\": \"1969-12-31T23:59:59Z\",\n" +
                    "          \"eci\": \"0\",\n" +
                    "          \"identifier\": \"\",\n" +
                    "          \"live\": true,\n" +
                    "          \"maskedpan\": \"N/A\",\n" +
                    "          \"merchantid\": 0,\n" +
                    "          \"result\": 3,\n" +
                    "          \"result_code\": \"P030\",\n" +
                    "          \"result_message\": \"Request Error: Authorisation invalid (203: Data element not in the required format or value is invalid as defined in Table A.1. threeDSSessionData)\",\n" +
                    "          \"scheme\": \"\",\n" +
                    "          \"sha256\": \"\",\n" +
                    "          \"trans_status\": \"_\",\n" +
                    "          \"transno\": -1\n" +
                    "        }",
            new TypeToken<AuthResponse>() {
            }.getType());

    /**
     * Model tests for AuthResponse
     */
    @Test
    public void testAuthResponse() {
        assert authResponse != null;
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        assertEquals(Integer.valueOf(5500), authResponse.getAmount());
    }

    /**
     * Test the property 'atrn'
     */
    @Test
    public void atrnTest() {
        assertEquals("atrn1", authResponse.getAtrn());
    }

    /**
     * Test the property 'atsd'
     */
    @Test
    public void atsdTest() {
        assertEquals("a", authResponse.getAtsd());
    }

    /**
     * Test the property 'authcode'
     */
    @Test
    public void authcodeTest() {
        assertEquals("12345", authResponse.getAuthcode());
    }

    /**
     * Test the property 'authenResult'
     */
    @Test
    public void authenResultTest() {
        assertEquals("R", authResponse.getAuthenResult());
    }

    /**
     * Test the property 'authorised'
     */
    @Test
    public void authorisedTest() {
        assertTrue(authResponse.isAuthorised());
    }

    /**
     * Test the property 'avsResult'
     */
    @Test
    public void avsResultTest() {
        assertEquals("G", authResponse.getAvsResult());
    }

    /**
     * Test the property 'binCommercial'
     */
    @Test
    public void binCommercialTest() {
        assertFalse(authResponse.isBinCommercial());
    }

    /**
     * Test the property 'binDebit'
     */
    @Test
    public void binDebitTest() {
        assertFalse(authResponse.isBinDebit());
    }

    /**
     * Test the property 'binDescription'
     */
    @Test
    public void binDescriptionTest() {
        assertEquals("bin_desc", authResponse.getBinDescription());
    }

    /**
     * Test the property 'cavv'
     */
    @Test
    public void cavvTest() {
        assertEquals("cavvvvvvvvvvvvv", authResponse.getCavv());
    }

    /**
     * Test the property 'context'
     */
    @Test
    public void contextTest() {
        assertEquals("20200812075906AAAGV4", authResponse.getContext());
    }

    /**
     * Test the property 'cscResult'
     */
    @Test
    public void cscResultTest() {
        assertEquals("C", authResponse.getCscResult());
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        assertEquals("GBP", authResponse.getCurrency());
    }

    /**
     * Test the property 'datetime'
     */
    @Test
    public void datetimeTest() {
        assertEquals(OffsetDateTime.parse("2020-08-12T07:59:11Z"), authResponse.getDatetime());
    }

    /**
     * Test the property 'eci'
     */
    @Test
    public void eciTest() {
        assertEquals("0", authResponse.getEci());
    }

    /**
     * Test the property 'identifier'
     */
    @Test
    public void identifierTest() {
        assertEquals("ident1", authResponse.getIdentifier());
    }

    /**
     * Test the property 'live'
     */
    @Test
    public void liveTest() {
        assertTrue(authResponse.isLive());
    }

    /**
     * Test the property 'maskedpan'
     */
    @Test
    public void maskedpanTest() {
        assertEquals("400000******0002", authResponse.getMaskedpan());
    }

    /**
     * Test the property 'merchantid'
     */
    @Test
    public void merchantidTest() {
        assertEquals(Integer.valueOf(12345), authResponse.getMerchantid());
    }

    /**
     * Test the property 'result'
     */
    @Test
    public void resultTest() {
        assertEquals(Integer.valueOf(1), authResponse.getResult());
    }

    /**
     * Test the property 'resultCode'
     */
    @Test
    public void resultCodeTest() {
        assertEquals("000", authResponse.getResultCode());
    }

    /**
     * Test the property 'resultMessage'
     */
    @Test
    public void resultMessageTest() {
        assertEquals("System: Accepted Transaction", authResponse.getResultMessage());
    }

    /**
     * Test the property 'scheme'
     */
    @Test
    public void schemeTest() {
        assertEquals("VISA_BUSINESS", authResponse.getScheme());
    }

    /**
     * Test the property 'sha256'
     */
    @Test
    public void sha256Test() {
        assertEquals("abcdefg", authResponse.getSha256());
    }

    /**
     * Test the property 'transStatus'
     */
    @Test
    public void transStatusTest() {
        assertEquals("P", authResponse.getTransStatus());
    }

    /**
     * Test the property 'transno'
     */
    @Test
    public void transnoTest() {
        assertEquals(Integer.valueOf(74875), authResponse.getTransno());
    }

    /**
     * Test the property 'resultCode' when identifier is empty
     */
    @Test
    public void resultCodeWithNoIdentTest() {
        assertEquals("P030", authResponseWithNoIdent.getResultCode());
    }

    /**
     * Test the property 'result' when identifier is empty
     */
    @Test
    public void resultWithNoIdentTest() {
        assertEquals(Integer.valueOf(3), authResponseWithNoIdent.getResult());
    }

}
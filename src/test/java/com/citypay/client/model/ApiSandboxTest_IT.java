package com.citypay.client.model;

import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;
import com.citypay.client.api.CardHolderAccountApi;
import com.citypay.client.api.OperationalApi;
import com.citypay.client.api.PaymentProcessingApi;
import com.citypay.client.auth.ApiKeyAuth;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import static org.junit.Assert.*;

public class ApiSandboxTest_IT {

    public static String clientId = System.getenv("CP_CLIENT_ID");
    public static String licenceKey = System.getenv("CP_LICENCE_KEY");
    public static String merchantId = System.getenv("CP_MERCHANT_ID");

    public static ApiClient defaultClient;
    public static String key;

    @Before
    public void setupConfig() {
        {

            if (clientId == null) {
                throw new IllegalStateException("No CP_CLIENT_ID Env variable found");
            }

            if (licenceKey == null) {
                throw new IllegalStateException("No CP_LICENCE_KEY Env variable found");
            }

            if (merchantId == null) {
                throw new IllegalStateException("No CP_MERCHANT_ID Env variable found");
            }

            try {
                key = ApiKey.create(clientId, licenceKey);
            } catch (InvalidKeyException | NoSuchAlgorithmException | IOException e) {
                e.printStackTrace();
            }
        }
        defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.citypay.com/v6");

        // Configure API key authorization: cp-api-key
        ApiKeyAuth cpApiKey = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cpApiKey.setApiKey(key);
    }

    @Test
    public void testPing() {
        OperationalApi apiInstance = new OperationalApi(defaultClient);
        Ping ping = new Ping().identifier("it_test"); // Ping |
        Acknowledgement result = null;
        try {
            result = apiInstance.pingRequest(ping);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        assert result != null;
        assertEquals("044", result.getCode());
        assertEquals("it_test", result.getIdentifier());
        assertEquals("Ping OK", result.getMessage());
        assertNotNull(result.getContext());
    }

    @Test
    public void testListMerchants() {
        OperationalApi apiInstance = new OperationalApi(defaultClient);
        ListMerchantsResponse result = null;
        try {
            result = apiInstance.listMerchantsRequest(clientId);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        assert result != null;
        assertEquals(clientId, result.getClientid());
    }

    @Test
    public void testAuthorise() {
        String id = String.valueOf(UUID.randomUUID());
        PaymentProcessingApi apiInstance = new PaymentProcessingApi(defaultClient);
        AuthRequest authRequest = new AuthRequest()
                .amount(1395)
                .cardnumber("4000 0000 0000 0002")
                .expmonth(12)
                .expyear(2030)
                .csc("012")
                .identifier(id)
                .merchantid(Integer.valueOf(merchantId));
        Decision result = null;
        try {
            result = apiInstance.authorisationRequest(authRequest);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        assert result != null;
        assertNull(result.getAuthenRequired());
        assertNull(result.getRequestChallenged());
        assertNotNull(result.getAuthResponse());

        assertEquals("001", result.getAuthResponse().getResultCode());
        assertEquals(id, result.getAuthResponse().getIdentifier());
        assertEquals("A12345", result.getAuthResponse().getAuthcode());
        assertEquals(Integer.valueOf(1395), result.getAuthResponse().getAmount());

    }

    @Test
    public void testCardHolderAccounts() {
        //CREATE CARDHOLDER ACCOUNT
        String chaId = String.valueOf(UUID.randomUUID());
        ContactDetails chaContact = new ContactDetails()
                .address1("7 Esplanade")
                .area("St Helier")
                .company("CityPay Limited")
                .country("JE")
                .email("dev@citypay.com")
                .firstname("Integration")
                .lastname("Test")
                .postcode("JE2 3QA");

        CardHolderAccountApi apiInstance = new CardHolderAccountApi(defaultClient);
        AccountCreate accountCreate = new AccountCreate()
                .accountId(chaId)
                .contact(chaContact); // AccountCreate |
        CardHolderAccount result = null;
        try {
            result = apiInstance.accountCreate(accountCreate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardHolderAccountApi#accountCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        assert result != null;
        assertEquals(chaId, result.getAccountId());
        assertEquals("7 Esplanade", result.getContact().getAddress1());

        //REGISTER CARD TO CARDHOLDER ACCOUNT
        RegisterCard registerCard = new RegisterCard()
                .cardnumber("4000 0000 0000 0002")
                .expmonth(12)
                .expyear(2030); // RegisterCard |
        try {
            result = apiInstance.accountCardRegisterRequest(chaId, registerCard);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardHolderAccountApi#accountCardRegisterRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        assert result != null;
        assertEquals(chaId, result.getAccountId());
        assert result.getCards() != null;
        assertEquals(1, result.getCards().size());
        assertEquals(Integer.valueOf(12), result.getCards().get(0).getExpmonth());
        assertEquals(Integer.valueOf(2030), result.getCards().get(0).getExpyear());

        //RETRIEVE CARDHOLDER ACCOUNT
        try {
            result = apiInstance.accountRetrieveRequest(chaId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardHolderAccountApi#accountRetrieveRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        assert result != null;
        assertEquals(chaId, result.getAccountId());
        assertEquals("7 Esplanade", result.getContact().getAddress1());
        assert result.getCards() != null;
        assertEquals(1, result.getCards().size());
        assertEquals(Integer.valueOf(12), result.getCards().get(0).getExpmonth());
        assertEquals(Integer.valueOf(2030), result.getCards().get(0).getExpyear());

        //CHARGE REQUEST AGAINST CHA
        String id = String.valueOf(UUID.randomUUID());
        ChargeRequest chargeRequest = new ChargeRequest()
                .amount(7801)
                .identifier(id)
                .merchantid(Integer.valueOf(merchantId))
                .token(result.getCards().get(0).getToken())
                .csc("012"); // ChargeRequest |

        Decision decision = null;
        try {
            decision = apiInstance.chargeRequest(chargeRequest);
            System.out.println(decision);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardHolderAccountApi#chargeRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        assert decision != null;
        assertNotNull(decision.getAuthResponse());
        assertNull(decision.getAuthenRequired());
        assertNull(decision.getRequestChallenged());
        AuthResponse response = decision.getAuthResponse();
        assertEquals("001", response.getResultCode());
        assertEquals(id, response.getIdentifier());
        assertEquals("A12345", response.getAuthcode());
        assertEquals(Integer.valueOf(7801), response.getAmount());

        //DELETE CARDHOLDER ACCOUNT
        Acknowledgement deleteCha = null;
        try {
            deleteCha = apiInstance.accountDeleteRequest(chaId);
            System.out.println(deleteCha);
        } catch (ApiException e) {
            System.err.println("Exception when calling CardHolderAccountApi#accountDeleteRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
        assert deleteCha != null;
        assertEquals("001", deleteCha.getCode());
    }
}

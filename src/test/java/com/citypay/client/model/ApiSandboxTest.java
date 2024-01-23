package com.citypay.client.model;

import com.citypay.client.ApiClient;
import com.citypay.client.ApiException;
import com.citypay.client.Configuration;

import com.citypay.client.api.AuthorisationAndPaymentApi;
import com.citypay.client.api.CardHolderAccountApi;
import com.citypay.client.api.OperationalFunctionsApi;
import com.citypay.client.auth.ApiKeyAuth;

import com.citypay.client.utils.Digest;
import okhttp3.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;
import java.util.UUID;

import static org.junit.Assert.*;

public class ApiSandboxTest {

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
        defaultClient.setBasePath("https://sandbox.citypay.com");

        // Configure API key authorization: cp-api-key
        ApiKeyAuth cpApiKey = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
        cpApiKey.setApiKey(key);
    }

    @Test
    public void testPing() {
        OperationalFunctionsApi apiInstance = new OperationalFunctionsApi(defaultClient);
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
        OperationalFunctionsApi apiInstance = new OperationalFunctionsApi(defaultClient);
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
        AuthorisationAndPaymentApi apiInstance = new AuthorisationAndPaymentApi(defaultClient);
        AuthRequest authRequest = new AuthRequest()
                .amount(1395)
                .cardnumber("4000 0000 0000 0002")
                .expmonth(12)
                .expyear(2030)
                .csc("012")
                .identifier(id)
                .merchantid(Integer.valueOf(merchantId))
                .threedsecure(new ThreeDSecure()
                        .tdsPolicy("2")
                );

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
        AuthResponse authResponse = result.getAuthResponse();
        assertEquals("001", authResponse.getResultCode());
        assertEquals(id, authResponse.getIdentifier());
        assertEquals("A12345", authResponse.getAuthcode());
        assertEquals(Integer.valueOf(1395), authResponse.getAmount());
        assertTrue(Digest.ValidateDigest(authResponse, licenceKey));
    }

    class Cres implements java.io.Serializable
    {
        public String acsTransID;
        public String messageType;
        public String messageVersion;
        public String threeDSServerTransID;
        public String transStatus;

        // Default constructor
        public Cres(String acsTransID, String messageType, String messageVersion, String threeDSServerTransID, String transStatus)
        {
            this.acsTransID  = acsTransID;
            this.messageType = messageType;
            this.messageVersion = messageVersion;
            this.threeDSServerTransID = threeDSServerTransID;
            this.transStatus = transStatus;
        }
    }

    @Test
    public void testAuthorise3DSv2Test() throws IOException {
        String id = String.valueOf(UUID.randomUUID());
        AuthorisationAndPaymentApi apiInstance = new AuthorisationAndPaymentApi(defaultClient);
        AuthRequest authRequest = new AuthRequest()
                .amount(1396)
                .cardnumber("4000 0000 0000 0002")
                .expmonth(12)
                .expyear(2030)
                .csc("123")
                .identifier(id)
                .merchantid(Integer.valueOf(merchantId))
                .transType("A")
                .threedsecure(new ThreeDSecure()
                        .merchantTermurl("https://citypay.com/acs/return")
                        .cpBx("eyJhIjoiRkFwSCIsImMiOjI0LCJpIjoid3dIOTExTlBKSkdBRVhVZCIsImoiOmZhbHNlLCJsIjoiZW4tVVMiLCJoIjoxNDQwLCJ3IjoyNTYwLCJ0IjowLCJ1IjoiTW96aWxsYS81LjAgKE1hY2ludG9zaDsgSW50ZWwgTWFjIE9TIFggMTFfMl8zKSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvODkuMC40Mzg5LjgyIFNhZmFyaS81MzcuMzYiLCJ2IjoiMS4wLjAifQ")
                );

        Decision result = null;

        try {
            result = apiInstance.authorisationRequest(authRequest);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        assert result != null;
        assertNull(result.getAuthenRequired());
        assertNotNull(result.getRequestChallenged());
        assertNull(result.getAuthResponse());

        assertNotNull(result.getRequestChallenged().getCreq());
        assertNotNull(result.getRequestChallenged().getAcsUrl());
        assertNotNull(result.getRequestChallenged().getThreedserverTransId());

        OkHttpClient httpClient = new OkHttpClient();

        String string = String.format("{\"creq\":\"%s\",\"threeDSSessionData\":\"%s\"}", result.getRequestChallenged().getCreq(),  result.getRequestChallenged().getThreedserverTransId());
        MediaType JSON = MediaType.get("application/json");
        RequestBody body = RequestBody.create(String.valueOf(string), JSON);

        Request request = new Request.Builder()
                .url("https://sandbox.citypay.com/3dsv2/acs")
                .addHeader("Content-Type", "application/json")
                .post(body)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {

            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            //deserialize string to Cres object
            CResAuthRequest cResAuthRequest = new CResAuthRequest().cres(Base64.getEncoder().encodeToString(Objects.requireNonNull(response.body()).string().getBytes()));

            AuthResponse cResRequestResponse = apiInstance.cResRequest(cResAuthRequest);

            assertEquals(Integer.valueOf(1396), cResRequestResponse.getAmount());
            assertEquals("A12345", cResRequestResponse.getAuthcode());
            assertEquals("Y", cResRequestResponse.getAuthenResult());
            assertEquals(Boolean.TRUE, cResRequestResponse.isAuthorised());

        } catch (ApiException e) {
            e.printStackTrace();
        }
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
                .csc("012")
                .threedsecure(new ThreeDSecure()
                        .tdsPolicy("2")); // ChargeRequest |

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
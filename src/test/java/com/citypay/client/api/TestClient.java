package com.citypay.client.api;

import com.citypay.client.ApiClient;
import com.citypay.client.Configuration;
import com.citypay.client.auth.ApiKeyAuth;
import com.citypay.client.model.ApiKey;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class TestClient {

    public static String TEST_CLIENT_ID =   System.getenv("CP_CLIENT_ID");
    public static String TEST_LICENCE_KEY = System.getenv("CP_LICENCE_KEY");
    public static Integer TEST_MERCHANT_ID = Integer.parseInt(System.getenv("CP_MERCHANT_ID"));

    public static ApiClient defaultClient;
    public static String key;

    static {
        if (TEST_CLIENT_ID == null) {
            throw new IllegalStateException("No CP_CLIENT_ID Env variable found");
        }

        if (TEST_LICENCE_KEY == null) {
            throw new IllegalStateException("No CP_LICENCE_KEY Env variable found");
        }

        if (TEST_MERCHANT_ID == null) {
            throw new IllegalStateException("No CP_MERCHANT_ID Env variable found");
        }

        try {

            key = ApiKey.create(TEST_CLIENT_ID, TEST_LICENCE_KEY);
            defaultClient = Configuration.getDefaultApiClient();
            defaultClient.setBasePath("https://sandbox.citypay.com");
            ApiKeyAuth cpApiKey = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
            cpApiKey.setApiKey(key);

        } catch (InvalidKeyException | NoSuchAlgorithmException | IOException e) {
            throw new RuntimeException(e);
        }

    }


}

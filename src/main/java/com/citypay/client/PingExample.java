package com.citypay.client;

import com.citypay.client.api.OperationalFunctionsApi;
import com.citypay.client.auth.ApiKeyAuth;
import com.citypay.client.model.Acknowledgement;
import com.citypay.client.model.ApiKey;
import com.citypay.client.model.Ping;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class PingExample {
    public static void main(String[] args) {
        String clientId = "";
        String licenceKey = "";

        ApiClient defaultClient;
        String key;
        try {
            key = ApiKey.create(clientId, licenceKey);
            defaultClient = Configuration.getDefaultApiClient();
            defaultClient.setBasePath("https://sandbox.citypay.com"); //default: https://api.citypay.com

            // Configure API key authorization: cp-api-key
            ApiKeyAuth cpApiKey = (ApiKeyAuth) defaultClient.getAuthentication("cp-api-key");
            cpApiKey.setApiKey(key);
            OperationalFunctionsApi apiInstance = new OperationalFunctionsApi(defaultClient);
            Ping ping = new Ping().identifier("ping_test");
            Acknowledgement result = null;
            try {
                result = apiInstance.pingRequest(ping);
                System.out.println(result);
            } catch (ApiException e) {
                e.printStackTrace();
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
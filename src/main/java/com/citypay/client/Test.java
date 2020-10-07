package com.citypay.client;

import com.citypay.client.api.OperationalApi;
import com.citypay.client.model.Acknowledgement;
import com.citypay.client.model.ApiKey;
import com.citypay.client.model.Ping;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Test {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, IOException, ApiException {

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.citypay.com/v6");
        defaultClient.setDebugging(true);
        defaultClient.setApiKey(ApiKey.create("PC874200", "MT8NIRSTN9BHGJI8"));

        OperationalApi op = new OperationalApi(defaultClient);
        Ping ping = new Ping();
        ping.setIdentifier("Ident1");
        Acknowledgement ack = op.pingRequest(ping);

        System.out.println(ack);

    }

}

package com.citypay.client.utils;

import com.citypay.client.model.AuthResponse;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Digest {
    public static boolean ValidateDigest(AuthResponse authResponse, String licenceKey) {
        String stringToConvert = authResponse.getAuthcode()
                + authResponse.getAmount()
                + authResponse.getResultCode()
                + authResponse.getMerchantid()
                + authResponse.getTransno()
                + authResponse.getIdentifier()
                + licenceKey;

        try {
            String stringConverted = new String(Base64.getEncoder().encode(MessageDigest.getInstance("SHA-256").digest(stringToConvert.getBytes(StandardCharsets.UTF_8))));
            return stringConverted.equals(authResponse.getSha256());
        } catch(NoSuchAlgorithmException x) {
            x.printStackTrace();
        }

        return false;
    }
}

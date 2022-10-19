package com.citypay.client.model;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import static java.nio.charset.StandardCharsets.UTF_8;

public class DirectPostMac {

    private static final String alg = "HmacSHA256";

    public static String Create(String licenceKey, byte[] nonce, int amount, String identifier) throws NoSuchAlgorithmException, InvalidKeyException {
        return Create(licenceKey, ApiKey.bytesToHex(nonce), amount, identifier);
    }

    public static String Create(String licenceKey, String nonceHex, int amount, String identifier) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] bytes = String.format("%s%d%s", nonceHex, amount, identifier).getBytes(UTF_8);
        Mac mac = Mac.getInstance(alg);
        mac.init(new SecretKeySpec(licenceKey.getBytes(), alg));
        return ApiKey.bytesToHex(mac.doFinal(bytes));
    }

    public static boolean Verify(String licenceKey, String nonceHex, int amount, String identifier, String mac) throws NoSuchAlgorithmException, InvalidKeyException {
       return mac != null && mac.equals(Create(licenceKey, nonceHex, amount, identifier));
    }

    public static boolean Verify(String licenceKey, byte[] nonce, int amount, String identifier, String mac) throws NoSuchAlgorithmException, InvalidKeyException {
        return mac != null && mac.equals(Create(licenceKey, nonce, amount, identifier));
    }
}

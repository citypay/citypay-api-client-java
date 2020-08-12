package com.citypay.client.model;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.time.ZoneOffset.UTC;

public class ApiKey {

    private static final SecureRandom random = new SecureRandom();

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static String create(String clientId, String licenceKey) throws InvalidKeyException, NoSuchAlgorithmException, IOException {
        byte[] nonce = new byte[16];
        random.nextBytes(nonce);
        return create(clientId, licenceKey, nonce, ZonedDateTime.now().withZoneSameInstant(UTC).toLocalDateTime());
    }

    public static String create(String clientId, String licenceKey, byte[] nonce, LocalDateTime dt) throws InvalidKeyException, NoSuchAlgorithmException, IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] ds = digest(clientId, licenceKey, nonce, dt);
        baos.write(clientId.getBytes(UTF_8));
        baos.write(0x3A);
        baos.write(bytesToHex(nonce).getBytes(UTF_8));
        baos.write(0x3A);
        baos.write(ds);
        return Base64.getEncoder().encodeToString(baos.toByteArray());
    }

    private static byte[] digest(String clientId, String lk, byte[] nonce, LocalDateTime dt) throws NoSuchAlgorithmException, InvalidKeyException {
        String ds = dt.format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"));
        Mac hmac = Mac.getInstance("HmacSHA256");
        hmac.init(new SecretKeySpec(lk.getBytes(UTF_8), "HmacSHA256"));
        hmac.update(clientId.getBytes(UTF_8));
        hmac.update(nonce);
        hmac.update(new BigInteger(ds, 16).toByteArray());
        return hmac.doFinal();
    }

}

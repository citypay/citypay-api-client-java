package com.citypay.client.model;

import org.junit.jupiter.api.Test;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import static com.citypay.client.model.ApiKeyTest.hexStringToByteArray;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;

public class DirectPostMacTest {

    @Test
    public void testCreateAndValidate() throws NoSuchAlgorithmException, InvalidKeyException {
        String mac = DirectPostMac.Create("LK123456789", "0123456789ABCDEF", 27595, "OD-12345678");
        assertTrue(DirectPostMac.Verify("LK123456789", "0123456789ABCDEF", 27595, "OD-12345678", "163DBAB194D743866A9BCC7FC9C8A88FCD99C6BBBF08D619291212D1B91EE12E"));

        String mac2 = DirectPostMac.Create("LK123456789", hexStringToByteArray("0123456789ABCDEF"), 27595, "OD-12345678");
        assertEquals(mac, mac2);
        assertTrue(DirectPostMac.Verify("LK123456789", hexStringToByteArray("0123456789ABCDEF"), 27595, "OD-12345678", "163DBAB194D743866A9BCC7FC9C8A88FCD99C6BBBF08D619291212D1B91EE12E"));


    }



}

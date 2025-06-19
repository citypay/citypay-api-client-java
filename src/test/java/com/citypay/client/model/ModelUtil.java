package com.citypay.client.model;

import com.citypay.client.JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

import static org.junit.Assert.fail;

public class ModelUtil {

    public static <T> T parseJsonExample(String resource, Type returnType) throws IOException {
        // Get the InputStream for the resource
        try (InputStream io = ModelUtil.class.getResourceAsStream(resource)) {
            if (io == null) {
                fail("Resource " + resource + " not found.");
            }

            // Wrap the InputStream in a BufferedReader to read text
            BufferedReader reader = new BufferedReader(new InputStreamReader(io));
            StringBuilder content = new StringBuilder();
            String line;

            // Read the content line by line
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            return JSON.deserialize(content.toString(), returnType);
        }
    }

}

package Java_Basics;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import java.net.URLEncoder;
import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class DecodeExample {
    public static void main(String[] args) throws Exception {
        // Step 1: Date string
        String dateString = "09/02/1976";
        // Step 2: URL encode the date string using UTF-8
        String urlEncodedString = URLEncoder.encode(dateString, StandardCharsets.UTF_8);
        System.out.println("URL Encoded: " + urlEncodedString);
        // Step 3: Base64 encode the URL encoded string
        String base64EncodedString = Base64.getEncoder().encodeToString(urlEncodedString.getBytes(StandardCharsets.UTF_8));
        System.out.println("Base64 Encoded: " + base64EncodedString);
    }
}
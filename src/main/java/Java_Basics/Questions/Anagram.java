package Java_Basics.Questions;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class Anagram {

    public static void main(String[] args) {

        //stack, queue, primary number, collections
        //stacks linked list implementation, queues implementation
        //diff btw equals and ==
        //arrays.aslist JSON Validation*
        //https://www.linkedin.com/pulse/unlocking-efficiency-exploring-java-8-stream-api-employee-kadam-xf2af/
        //Above add emp details in list and fetch it using lambda & stream API

        String s1 = "Armyss";
        String s2 = "Marysj";

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Its an anagram");

        }
        else {
            System.out.println("Not an anagram");

        }

        // Step 1: The date you want to encode
        String dateOfBirth = "1990-08-20";

        // Step 2: Base64 encode the date string
        String base64Encoded = Base64.getEncoder().encodeToString(dateOfBirth.getBytes(StandardCharsets.UTF_8));

        // Step 3: URL encode the Base64 encoded string (to replace special characters like '/' and '=')
        String urlEncodedBase64 = URLEncoder.encode(base64Encoded, StandardCharsets.UTF_8);

        // Print the result
        System.out.println("Base64 Encoded and URL Encoded Date: " + urlEncodedBase64);

    }
    
}
//GSiFJHWJpt3%2FO8s9s2dA8Q%3D%3D
//GSiFJHWJpt3%2FO8s9s2dA8Q%3D%3D

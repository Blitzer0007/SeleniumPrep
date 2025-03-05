package Java_Basics.Questions;

import java.util.Arrays;

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
    }
    
}

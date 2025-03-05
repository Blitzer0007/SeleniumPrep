package Java_Basics.Questions;

import java.util.Arrays;

public class ReverseStringsinSentence {

    public static void main(String[] args) {
        String str = "ROOT KHOLI SMITH KANE";

        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        String reversed ="";

        for (int i = arr.length-1; i>=0 ; i--) {

            reversed = reversed+arr[i]+" ";

        }
        System.out.println(reversed);
    }
}

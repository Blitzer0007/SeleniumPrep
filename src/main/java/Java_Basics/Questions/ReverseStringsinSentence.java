package Java_Basics.Questions;

public class ReverseStringsinSentence {

    public static void main(String[] args) {
        String str = "ROOT KHOLI SMITH KANE";

        String[] arr = str.split(" ");

        String reversed ="";

        for (int i = arr.length-1; i>=0 ; i--) {

            reversed = reversed+arr[i]+" ";

        }
        System.out.println(reversed);
    }
}

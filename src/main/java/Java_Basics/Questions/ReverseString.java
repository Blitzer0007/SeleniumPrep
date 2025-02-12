package Java_Basics.Questions;

public class ReverseString {

    public static void main(String[] args) {

        String str = "ROOT";

//  String Buffer
        StringBuffer br = new StringBuffer(str);
        String reverse = br.reverse().toString();
        System.out.println(reverse);

   //Iterating from last char and appending to string

   String reversed ="";

        for (int i = str.length()-1; i>=0 ; i--) {

             reversed = reversed+str.charAt(i);

        }
        System.out.println(reverse);
    }

}

package Java_Basics.Questions;

public class Palindrome {

    public static void main(String[] args) {

            String str = "malayalam";
            boolean result = isPalindrome(str);
            System.out.println(str + " IsPalindrome = " + result);

    }

    public static boolean isPalindrome(String str) {

        if (str == null) {
            return false;
        }

        if (str.length() <= 1) {
            return true;
        }

        String first = str.substring(0, 1);
  //    System.out.println(first);
        String last = str.substring(str.length() - 1, str.length());

        if (!first.equals(last)) {
            return false;
        } else {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }

}

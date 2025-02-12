package Java_Basics.Questions;

public class Fibonacci {

    public static void main(String[] args) {

        int first=0;
        int second =1;

        int n = 12;

        for (int i = 0; i < n; i++) {

            System.out.print(first + " ");
            int third = first+second;
            first=second;
            second=third;

        }
        //Factorial
        int fact = 1;
        for (int j = 1; j < n; j++) {
            fact=fact*j;
        }
        System.out.println("Factorial of "+n+" is "+fact);

        //pyramid

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

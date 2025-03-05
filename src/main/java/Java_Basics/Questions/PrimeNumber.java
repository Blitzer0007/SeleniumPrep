package Java_Basics.Questions;

public class PrimeNumber {

    public static void main(String[] args) {
        // Input number
        int n = 11;

        String prime = isPrime(9);
        System.out.println(prime);


//        // Holds the count of values
//        int count = 0;
//
//        // There is no prime number less than 2.
//        if (n <= 1) {
//            System.out.println("The number is not prime");
//            return;
//        }
//
//        // Do a for loop
//        for (int j = 1; j <= n / 2; j++) {
//            if (n % j == 0) {
//                count++;
//            }
//        }
//
//        // If the number of factors is greater than 1,
//        // the number is not prime.
//        if (count > 1) {
//            System.out.println("The number is not prime");
//        } else {
//            System.out.println("The number is prime");
//        }
    }

    public static String isPrime(int n)
    {
        for(int i=2;i<n;i++)
            if(n%i==0)
                return "NON PRIME";
        return "PRIME";
    }

}

package Java_Basics.Questions;

public class FindSecondSmallestLargest {

    public static void main(String[] args) {
        int arr[] = {23, 3, 43, 43, 2323, 4, 0, -908};

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}

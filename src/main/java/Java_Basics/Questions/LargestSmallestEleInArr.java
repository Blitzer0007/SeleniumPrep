package Java_Basics.Questions;

import java.util.Arrays;

public class LargestSmallestEleInArr {

    public static void main(String[] args) {
        int arr[] = {23,3,43,43,2323,4,0,-908};
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<smallest){
                smallest=arr[i];
            }else if(arr[i]>largest){
                largest=arr[i];
            }


        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Smallest "+ smallest);
        System.out.println("largest "+largest);
    }
}

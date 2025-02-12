package Java_Basics.Questions;

public class FindDupNuminArr {

    public static void main(String[] args) {

        int[] arr = {3,4,2,7,3,3,2,5,1,9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate elements in Arr "+ arr[i]);
                }
            }
        }

    }

}

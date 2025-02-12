package Java_Basics.Questions;

import java.util.Arrays;

public class FinfMissingNumInArr {

    public static void main(String[] args) {
        int[] num = {1,3,4,5,6,7,8,9,10};


        int sum=0;
        int expectedsum =0;

        for (int i = 0; i < num.length; i++) {
            sum=sum+num[i];
        }


        for (int i = 1; i <= 10; i++) {
            expectedsum=expectedsum+i;
        }
        System.out.println(Arrays.toString(num));

        System.out.println("Missing num"+ (expectedsum-sum));
    }

}

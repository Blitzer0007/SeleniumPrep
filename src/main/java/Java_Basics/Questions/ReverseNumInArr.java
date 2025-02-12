package Java_Basics.Questions;

public class ReverseNumInArr {

    public static void main(String[] args) {

        int num = 342307;

        int result = 0;

        while (num>0){
            result = result*10+num%10;
            num=num/10;
        }

        System.out.println(result);
    }

}

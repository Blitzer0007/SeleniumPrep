package Java_Basics.Conditions;

public class Ternary {

    public static void main(String[] args) {
        //        int n=4;
        //        int result=0;
        //        if(n%2==0)
        //            result=10;
        //
        //        else
        //            result =20;
        //        System.out.println(result);

        int n=6;
        String result= null;
        result = n%2==0 ? "Even Number" : "Odd Number"; //Condition ? True : False
        System.out.println(result);
    }
}
package Java_Basics.Operators;

public class AssignmentOperations {

public static void main(String[] args) {
/**        int num1=7;
 int num2=5;
 int result=num1+num2;
 System.out.println(result);
 **/

/**
 int num1=7;
 int num2=5;
 int result=num1-num2;
 System.out.println(result);
 **/

/**
 int num1=7;
 int num2=5;
 int result=num1*num2;
 System.out.println(result);
 **/

/**
 int num1=7;
 int num2=5;
 int result=num1/num2;
 System.out.println(result);
 **/

/*
 int num1=7;
 int num2=5;
 int result=num1%num2;
 System.out.println(result);
 */

        int num=7;
        // num=num+2;
        num+=2;
        System.out.println(num);

//        num*=2;

        //num++;    //post increment
        //++num;    //pre increment
        //num--;    //post decrement
        --num;      //pre decrement
        System.out.println(num); //8

        int result=--num; //fetch the value and increment/decrement first then assign to variable for
        // pre increment/decrement
        System.out.println(result);

    }
}

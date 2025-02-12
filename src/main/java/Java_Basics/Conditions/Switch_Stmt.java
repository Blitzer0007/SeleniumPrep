package Java_Basics.Conditions;

import java.util.Scanner;

public class Switch_Stmt {

    public static void main(String[] args) {
        //        int n=1;
        //        if(n==1)
        //            System.out.println("Monday");
        //        else if(n==2)
        //            System.out.println("Tuesday");
        //        else if(n==3)
        //        System.out.println("Wednesday");
        //        else if(n==4)
        //        System.out.println("Thursday");
        //        else if(n==5)
        //        System.out.println("Friday");
        //        else if(n==6)
        //        System.out.println("Saturday");
        //        else
        //        System.out.println("Sunday");

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Day: ");
        String n= sc.nextLine();              //reads string
        System.out.println("You have entered: "+n);

        switch (n.toLowerCase()) {
        }

        switch(n) {
            case "Monday":
                System.out.println("Monday-WFH");
                break;
            case "Tuesday":
                System.out.println("Tuesday-WFO");
                break;
            case "Wednesday":
                System.out.println("Wednesday-WFO");
                break;
            case "Thursday":
                System.out.println("Thursday-WFO");
                break;
            case "Friday":
                System.out.println("Friday-WFH");
                break;
            case "Saturday":
                System.out.println("Saturday-L");
                break;
            case "Sunday":
                System.out.println("Sunday-L");
                break;
            default:
                System.out.println("Enter a valid Day");
        }

    }
}

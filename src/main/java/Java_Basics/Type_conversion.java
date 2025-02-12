package Java_Basics;

public class Type_conversion {

    public static void main(String[] args) {

        String name = "John";

        System.out.println(name.getClass().getName()); // Output: java.lang.String

        byte b=127;
        int a=b;
        System.out.println(b);
        System.out.println(a);

        byte b1=125;
        int a0=b1;
        System.out.println(b1);
        System.out.println(a0);

        int aa=257;
        byte k=(byte)aa;        //Explictly casting byte

        float f=5.6f;
        int intconversion=(int)f;           //Explictly casting int
        System.out.println(intconversion);

        int a2=2567;
        byte b2=(byte)a;
        System.out.println(k);

        byte a3=10;
        byte b4=20;
        //int t=a*b;
        //System.out.println(t);
    }
    }

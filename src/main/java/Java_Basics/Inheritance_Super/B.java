package Java_Basics.Inheritance_Super;

public class B extends A {


    public B() {
//        super();
        super(5);
        System.out.println("in B");
    }

    public B(int n) {
//        super();   //call default constructor of super class
        super(n);
        System.out.println("in B int");
    }
}

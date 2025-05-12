package Java_Basics.Inheritance_Super;

public class B extends A {


    public B() {
//        super();
        super(5);
        super.funs();
        String a1 = super.a;
        System.out.println("a1");
        System.out.println("in B");
    }

    public B(int n) {
//        super();   //call default constructor of super class
        super(n);
        System.out.println("in B int");
    }
}

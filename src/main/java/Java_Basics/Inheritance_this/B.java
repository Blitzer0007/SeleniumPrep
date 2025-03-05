package Java_Basics.Inheritance_this;

public class B {

    public B() {
        super();                                        //Super will work when we inherit
        System.out.println("in B");
    }

    public B(int n) {
        this();                                         //call constructor of same class
        System.out.println("in B int");
    }
}

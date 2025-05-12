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

   // this.methodName() is used to call another method within the same object.
    public int add(int a, int b) {
        return a + b;
    }

//    In this example, addAndMultiply() calls the add() method of the same Calculator object
//    using this.add(a, b) to reuse the addition logic
    public int addAndMultiply(int a, int b, int c) {
        int sum = this.add(a, b); // Call the add() method of the current object
        return sum * c;
    }
}

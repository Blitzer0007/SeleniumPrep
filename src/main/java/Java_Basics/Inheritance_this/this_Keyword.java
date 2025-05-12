package Java_Basics.Inheritance_this;

public class this_Keyword {

    public static void main(String[] args) {

//        B obj=new B();
        B obj = new B(5);
        int result = obj.addAndMultiply(2, 3, 4);
        System.out.println(result); // Output: 20
    }

}

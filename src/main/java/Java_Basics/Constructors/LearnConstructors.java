package Java_Basics.Constructors;

public class LearnConstructors {

    int x;                                            //Default value 0
    static String name ="Haris";                    //Default value null

    String hello(){
        return "hii";
    }


    public LearnConstructors() {                     //Default constructor
        //this.x = 1000;                            //this keyword refers the current class varaiable or method
        //    System.out.println(this.hello());
        System.out.println(x);
        System.out.println(name);
    }


    protected LearnConstructors(int x) {                //Parameterized constructor
        this.x = x;
//    0=x
    }

    public LearnConstructors(int x, String s) {        //Constructor overloading
        this.x = x;
        LearnConstructors.name = s;
    }



    void display() {
        System.out.println(x + "--> " + name);
    }

    public String display_String() {
        return name;
    }

    public static void main(String[] args) {
        LearnConstructors ls =    new LearnConstructors(1000);
        //class     obj/ref var       //constructor
 //       LearnConstructors ls2 =    new LearnConstructors();
        ls.display();
        LearnConstructors ls1 = new LearnConstructors(100, "LetCode");
        ls1.display();

        ls1.display_String();
    }
}
package Java_Basics.Super_Vs_This;

public class B extends A {

    int num = 2;

    public int getValue() {
        int num = 3;
        return this.num;
  //      return super.num;
    }
}

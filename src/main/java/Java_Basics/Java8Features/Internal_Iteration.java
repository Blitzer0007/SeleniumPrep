package Java_Basics.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Internal_Iteration {

        public static void main(String[] args) {

            List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

            Consumer<Integer> c = new Consumer<Integer>() {
                public void accept(Integer i) {
                    System.out.println(i);
                }
            };

            //Lambda to initialize class object and methods
            Consumer<Integer> c1 = (Integer i) -> System.out.println(i);


            values.forEach(c1);

            System.out.println("+++++++++++++++++++++++++++++++++");

          //values.forEach(i -> System.out.println(i));


            values.forEach(System.out::println);        //Call by method

            values.forEach(Internal_Iteration::doubleIt);        //Call by method

        }


    public static void doubleIt(int i) {
        System.out.println(i*2);
    }
}

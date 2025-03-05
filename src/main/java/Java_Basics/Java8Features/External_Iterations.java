package Java_Basics.Java8Features;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class External_Iterations {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }

        Iterator<Integer> i = values.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (int j : values) {
            System.out.println(j);
        }
    }

}

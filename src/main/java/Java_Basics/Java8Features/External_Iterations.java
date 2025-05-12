package Java_Basics.Java8Features;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

        ListIterator<Integer> integerListIterator = values.listIterator();
        boolean b1 = integerListIterator.hasNext();
        System.out.println(b1);

        boolean b = integerListIterator.hasPrevious();
        System.out.println(b);
        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next());
            if (integerListIterator.hasPrevious()){
              //  System.out.println(integerListIterator.previous());
            }
        }

        for (int j : values) {
            System.out.println(j);
        }
    }

}

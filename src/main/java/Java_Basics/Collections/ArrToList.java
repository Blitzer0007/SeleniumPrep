package Java_Basics.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrToList {

    public static void main(String[] args) {

        //Arrays.asList(T... a) - Original Arr to list
        String[] array = {"a", "b", "c"};
        List<String> asList = Arrays.asList(array);

        System.out.println(asList);

        // List.of(T... elements) (Java 9+) - Returns immutable list
        List<String> listof = List.of("a", "b", "c");
        System.out.println(listof);

        //Using Streams (Java 8+)
        String[] array1 = {"a", "b", "c"};
        List<String> streamList = Arrays.stream(array1).collect(Collectors.toList());
        System.out.println(streamList);

        //Adds all elements from an array to an existing collection.
        String[] array2 = {"a", "b", "c"};
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, array2);

        System.out.println(list1);



    }

}

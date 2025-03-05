package Java_Basics.Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDupNuminArr_Collections {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 5, 5, 7, 8};

        // List to store duplicates
        List<Integer> duplicates = new ArrayList<>();

        // HashSet to track the elements we've already seen
        Set<Integer> seen = new HashSet<>();

//        seen.add(num): This adds the element to the set and returns false if it was already in the set (meaning it’s a duplicate).
//        !seen.add(num): The negation means that when add() returns false (i.e., the element was already present), the code adds it to the duplicates list.

        // Loop through the array
        for (int num : arr) {
            // If the element is already in the 'seen' set, it's a duplicate
            if (!seen.add(num)) {       //add - Returns false if already present
                duplicates.add(num);    //We need to add duplicates in list condition should pass so we r making true by using !operator
            }
        }

        // Output duplicates
        System.out.println("Duplicates: " + duplicates);

        //Unique
        System.out.println("After removing dups: " + seen);

    }


}

package Java_Basics.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator_WithInterfaceCompareTo {

    public static void main(String[] args) {


        List<EmpClass_ComparableInterFace> list = new ArrayList<>(); //Allow duplicates n follows order sortings

//        list.add("1");
//        list.add("3");
//        list.add("899");
//        list.add("67");
//        list.add("23");
//        list.add("978");
//
//        Collections.sort(list);
//        System.out.println(list);
//
//        Collections.reverse(list);
//        System.out.println("After Reverse "+list);


        list.add(new EmpClass_ComparableInterFace(1,"Jaffer",78));
        list.add(new EmpClass_ComparableInterFace(3,"KP",7));
        list.add(new EmpClass_ComparableInterFace(5,"VK",14));
        list.add(new EmpClass_ComparableInterFace(2,"WARNER",50));


        //Comparable Interface - CompareTo method
        Collections.sort(list);

        for (EmpClass_ComparableInterFace e: list){
            System.out.println(e);
        }
    }

}

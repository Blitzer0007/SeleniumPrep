package Java_Basics.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {

    public static void main(String[] args) {


        List<EmpClass> list = new ArrayList<>(); //Allow duplicates n follows order sortings

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


        list.add(new EmpClass(1,"Jaffer",78));
        list.add(new EmpClass(3,"KP",87));
        list.add(new EmpClass(5,"VK",14));
        list.add(new EmpClass(2,"WARNER",50));



        list.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));



        for (EmpClass e: list){
            System.out.println(e);
        }
    }

}

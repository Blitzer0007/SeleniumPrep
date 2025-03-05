package Java_Basics.Collections;

import java.util.*;

public class LearnSets {
public static void main(String[] args){

//        Set<Integer> nums=new HashSet<Integer>();
//        Set<Integer> nums=new TreeSet<Integer>();
    Collection<Integer> nums=new TreeSet<Integer>();
    nums.add(62);
    nums.add(54);
    nums.add(82);
    nums.add(21);

    //nums.add("5");

    Iterator<Integer> values = nums.iterator();

    while(values.hasNext())
        System.out.println(values.next());

//        for(int n:nums)
//        {
//            System.out.println(n);
//       }

    Set<String> set = new HashSet<String>();  //Hashset no duplicates n random order or sorting
    set.add("apple");
    set.add("oneplus");
    set.add("nokia");
    set.add("oppo");
    set.add("poco");
    set.add("apple");

    for (String fringe : set) {
        System.out.println(fringe);
    }

    System.out.println("_________________________");

    Set<String> set1 = new TreeSet<String>();  //Treeset no duplicates n order or sorting by alphabets
    set1.add("apple");
    set1.add("oneplus");
    set1.add("nokia");
    set1.add("oppo");
    set1.add("poco");
    set1.add("apple");

    for (String fringe1 : set1) {
        System.out.println(fringe1);
    }

    System.out.println("_________________________");

    Set<String> set2 = new LinkedHashSet<String>();  //LinkedHashSet no duplicates n order or sorting by insertion order
    set2.add("apple");
    set2.add("oneplus");
    set2.add("nokia");
    set2.add("oppo");
    set2.add("poco");
    set2.add("apple");

    for (String fringe2 : set2) {
        System.out.println(fringe2);
    }

    System.out.println("_________________________");

    Set<String> set_List = new LinkedHashSet<String>();  //set to list useful for window handling
    set_List.add("apple");
    set_List.add("oneplus");
    set_List.add("nokia");
    set_List.add("oppo");
    set_List.add("poco");
    set_List.add("apple");

    List<String> myWindowList = new ArrayList<String>(set_List); //passing set ref variable

    for (String fringe3 : set_List) {
        System.out.println(fringe3);
    }

    String name =myWindowList.get(1);                 //not avail in set get()
    System.out.println(name);

}
}
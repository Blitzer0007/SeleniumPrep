package Java_Basics.Collections;

import java.util.*;

public class LearnList {

    public static void main(String[] args) {

//        Collection<Integer> nums= new ArrayList<Integer>();  //Gnerics to explicitly mention datatype
        Collection nums1 = new ArrayList();                        //Collection supports all datatype
        nums1.add("s");
        nums1.add(5.4);
        nums1.add(3);

//    Two ways to print all values Iterator and Enhanced For loop

        Iterator i = nums1.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }

        for (Object iteraObject : nums1) {        //Here we dont know datatype so declare it as Object
            System.out.println(iteraObject);
        }

        List<Integer> nums = new ArrayList<Integer>();        //Need onlt int so calling <> generics as Int
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(1, 90);                    //List supports indexing collection doesnt

        Iterator<Integer> v = nums.iterator();
        while (v.hasNext()) {
            System.out.println(v.next());
        }

        System.out.println(nums.get(2));

        System.out.println(nums.indexOf(2));
        System.out.println(nums);

//        for(int n:nums)
//        {
//            System.out.println(nums);
//        }
        for (Object n : nums) {
            System.out.println(n);
        }

        Integer[] arr = nums.toArray(new Integer[0]);

        // Printing elements of array
        // using for-each loop
        for (Integer x : arr)
            System.out.print(x + " ");

        List<String> list = new ArrayList<String>(); //Allow duplicates n follows order sortings

        list.add("apple");
        list.add("oneplus");
        list.add("nokia");
        list.add("oppo");
        list.add("poco");
        list.add("apple");
        System.out.println(list);

        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
            System.out.println(stringListIterator.hasPrevious());
        }

        for(int j=0;j<list.size();j++) {
            System.out.println(list.get(j));
        }
        //before removing
        for (String eachFruit : list) {
            System.out.println(eachFruit);
        }

        System.out.println("+++++++++++");
        boolean remove = list.remove("apple");  //remove
        System.out.println("is removed:"+remove);
        System.out.println("+++++++++++");
        System.out.println(list);               //after removing

        int size = list.size();                    //Find size
        System.out.println("size is "+ size);

        boolean isPresent =list.contains("nokia");   //Present or not
        System.out.println("is there "+ isPresent);

        String findValue = list.get(2);                //To get the value by index
        System.out.println(findValue);

        boolean isEmpty = list.isEmpty();
        System.out.println("is empty "+ isEmpty);

//        list.clear(); to clear the list
//        list1.addAll(list2);                      //To merge two lists use Addall
    }
}

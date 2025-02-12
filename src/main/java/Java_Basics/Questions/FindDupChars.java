package Java_Basics.Questions;

import java.util.HashMap;
import java.util.Map;

public class FindDupChars {

    public static void main(String[] args) {

        String str = "laptop";

        char[] arr = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        Integer count = 1;

        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        for(Character x:map.keySet()){
            if (map.get(x)>1)
                System.out.println("Repeated char "+x+ " === "+map.get(x));
        }
    }

}

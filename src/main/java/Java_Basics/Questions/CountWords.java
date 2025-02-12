package Java_Basics.Questions;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {
        String words = "Practice makes makes man perfect perfect";

        Map<String, Integer> map = new HashMap<>();
        Integer count=1;
        String[] arr = words.split(" ");

        for (int i = 0; i < arr.length; i++) {

            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }

        }
            for(String x: map.keySet()){
                System.out.println("Count of word "+x+ "="+map.get(x));
            }
    }

}

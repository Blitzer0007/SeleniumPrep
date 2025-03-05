package Java_Basics.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Map<String,String> map = new HashMap<String,String>();
        map.put("key1","v1");
        map.put("key2","v2");
        map.put("key3","v3");
        map.put("key4","v4");


        Set<String> keys = map.keySet();

        for(String key:keys) {
            System.out.println(key + " "+ map.get(key));

        }
    }

}

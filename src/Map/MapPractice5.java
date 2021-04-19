package Map;

import java.util.*;

public class MapPractice5 {
    public static void main(String[] args) {
        //store departments and their phone extensions

        TreeMap<String, Integer> extensions = new TreeMap<>();

        extensions.put("Help Desk", 112);
        extensions.put("HR", 113);
        extensions.put("Admin", 114);
        extensions.put("Supervisor", 115);

        //key.Set --->all keys in a Set(returns set)
        //entry.Set();--->will return everything as a Collection of  map.EntrySet

        Set<String> keys = extensions.keySet();
        //Set<String> keys = extensions.keySet();
        //get.Key(); -->will return all key
        //get.Value ()--will return all Value;
        Set<Map.Entry<String, Integer>> data = extensions.entrySet();
        for (Map.Entry<String, Integer> keys1 : data ){
            System.out.println(keys1.getKey());
            System.out.println(keys1);
            System.out.println(keys1.getValue());
        }


    }
}


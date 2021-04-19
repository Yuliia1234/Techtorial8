package Map;

import java.util.*;

public class HashTablePractise {
    public static void main(String[] args) {
        Hashtable<String, Integer> rooms = new Hashtable<>();

        rooms.put("Technical class ", 208);
        rooms.put("History class", 209);
        rooms.put("Math class", 210);
        rooms.put("Science class", 211);
        System.out.println(rooms);

        rooms.put("Math class", 310);//it will update the value of Math class

        System.out.println(rooms);

        //use entrySet(); method to retrieve keys only

        Set<Map.Entry<String, Integer>> data = rooms.entrySet();
        for (Map.Entry<String, Integer> keys1 : data) {

            String str = keys1.getKey();
            int i = keys1.getValue();
            System.out.println(keys1.getValue());
            System.out.println(keys1.getKey());
            System.out.println("Room number for " + str + "is " + i);

        }
    }

}



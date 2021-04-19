package Map;

import ArrayList.ArraytoArrayList;

import java.util.*;

public class MapPractice4 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(111, "Chicago");
        map.put(222, "New York");
        map.put(333, "Houston");
        map.put(444, "L.A");

        Set<Integer> keys = map.keySet();

        for (Integer i : keys) {
            System.out.println(i);
            GetKey(map);
            GetValue(map);

        }
//create a method that will take a map as a parameter and it will print all keys from that map


    }

    public static void GetKey(HashMap<Integer, String> map1) {

        Set<Integer> keys = map1.keySet();//another method we can out it inside of foe each loop (map1.keySet());

        for (Integer i : keys) {
            System.out.println(i + " All key");
        }

    }

    public static void GetValue(HashMap<Integer, String> map1) {
        //   Collection<String> value = map1.values();//two different way to approach
        Collection<String> value = new ArrayList<>();
        value = map1.values();//We casted to ArrayList
        for (String i : value) {
            System.out.println(i);
        }
    }
}


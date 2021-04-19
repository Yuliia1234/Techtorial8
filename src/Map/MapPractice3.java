package Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {
        String[] string = {"IL", "TX", "FL","FL" ,"MA", "NE", "CA", "CA", "NC", "IL", "CA"};
        //store these state names inside of a map with their count
        //IL -->2,TX--1,
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < string.length; i++) {
            if (!result.containsKey(string[i])) {
                result.put(string[i], 1);
            } else {
                int count = result.get(string[i]);
                result.put(string[i], count + 1);
            }
        }
        System.out.println(result);
    }
}

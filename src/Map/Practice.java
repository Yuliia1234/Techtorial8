package Map;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        String str = "Techtorial Academy";

        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char bl = str.toLowerCase().charAt(i);
            if (map1.containsKey(bl)) {
                int a = map1.get(bl);
                map1.put(bl, a + 1);
            } else {
                map1.put(bl, 1);
            }
        }
        System.out.println(map1);


    }
}

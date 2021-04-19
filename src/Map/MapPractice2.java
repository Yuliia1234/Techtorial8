package Map;

import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap();
        Map <String,String> map2 = new LinkedHashMap<>();
        Map <String,String> map3 = new TreeMap<>();
        map1.put("White","111");  map2.put("White","111");  map3.put("White","111");
        map1.put("Brown","222");  map2.put("Brown","222");  map3.put("Brown","222");
        map1.put("Black","333");  map2.put("Black","333");  map3.put("Black","333");
        map1.put("Red","444");    map2.put("Red","444");     map3.put("Red","444");

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
        //****Adding nul values to each map
        map1.put("Blue",null);
        map2.put("Blue" , null);
        map3.put("Blue" , null);
        //  map3.put(null,"555");Null Pointer Exception(Compail time error )
        //Adding null keys to each map
        map1.put(null,"666");
        map2.put(null,"777");
        System.out.println((" Map1--->: " + map1) + ("Map2 -->: " + map2) + ("Map3-->: " + map3 ));
        System.out.println(map2.get("Brown"));
        System.out.println(map1.size());
        // keySet();
        System.out.println("Only key from map2: " +map2.keySet());
        List<String > valueOfMap2 = new ArrayList<>();
        Set <String> keys = map2.keySet();
        for (String str : keys ){
            System.out.println("Value of keys: "+ str + "----->" + map2.get(str));
            String temp = map2.get(str);
            valueOfMap2.add(str);
        }
        System.out.println("***"+valueOfMap2);
        System.out.println(map2.values());
        System.out.println(map2.containsKey("Blue"));
        System.out.println(map1.containsValue("112"));
        System.out.println(map2.isEmpty());
    }
}

package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedAndTreeSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        TreeSet<String> set3 = new TreeSet();
        // no order, insertion order, ascending order
        //[orange, banana, apple, kiwi] --> no order
        //[apple, orange, banana, kiwi] --> insertion order
        //[apple, banana, kiwi, orange] --> ascending order
        //"apple", "orange", "banana", "kiwi", "apple", "orange", "mango", "pomegranate"
        set1.add("apple");   set2.add("apple");     set3.add("apple");
        set1.add("orange");  set2.add("orange");    set3.add("orange");
        set1.add("banana");  set2.add("banana");    set3.add("banana");
        set1.add("kiwi");    set2.add("kiwi");      set3.add("kiwi");
        System.out.println(set1);
        System.out.println(set2);   System.out.println(set3);//sorting by alphabet automatic
        set1.add(null); set2.add(null);// set3.add(null); --> null pointer exception
        System.out.println(set1); System.out.println(set2); System.out.println(set3);
        for (String item :set3){
            System.out.println(item + " Set 3");
        }
        System.out.println(set3.descendingSet());//Work as  a reverse only
    }
}

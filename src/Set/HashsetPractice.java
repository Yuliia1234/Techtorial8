package Set;

import java.util.HashSet;
import java.util.Set;

public class HashsetPractice {
    public static void main(String[] args) {

        HashSet set1 = new HashSet<Object>();

        HashSet<String> set2 = new HashSet<>();

        Set<String> set3 = new HashSet<>();

        set1.add("Alex");
        set1.add("David");
        set1.add("Mary");
        set1.add("Jeff");
        set1.add("Mike");
        System.out.println("Before adding second Jeff :--->" + set1);

        set1.add("Jeff");
        set1.add(null);
        System.out.println("After adding Jeff to set :" + set1);
        System.out.println(set1.contains("Jeff"));

        set1.add(123);
        set1.add(true);
        System.out.println("After adding different type of data :" + set1);


        System.out.println(set1.size());
        set1.remove(null);
        System.out.println(set1.size() + " :Size after removing null");

        set2.addAll(set1);

       // set1.clear();
        System.out.println("This is after clear method :" +set1);

        set2.add("Julia");
        set2.removeAll(set1);
        System.out.println(set2);

        for (Object temp : set1){

            System.out.println("Another way to implement get method :" +temp);
        }

    }
}

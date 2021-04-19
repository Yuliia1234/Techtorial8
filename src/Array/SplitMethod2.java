package Array;

import java.util.Arrays;

public class SplitMethod2 {
    public static void main(String[] args) {
        //Create a String that has city names which are separated by comma,
        //I want to create an email adress for each city as Chicago -->info@chicago

        String  cities =("Chicago Denver St_Louis Columbus Austin Dallas Philadelphia");

        String[] a=cities.split("  ");
        System.out.println(Arrays.toString(a));
        String[] emails = new String[a.length];

        for (int i = 0; i < a.length; i++) {
           emails[i] = "info@" + a[i] + ".com";

        }
        System.out.println(Arrays.toString(emails));


    }
}

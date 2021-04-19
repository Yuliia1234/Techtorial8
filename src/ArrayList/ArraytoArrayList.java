package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {

    public static void main(String[] args) {
        //From Array to ArrayList
        String[] array = {"blue", "red", "yellow"};

        List<String> list = Arrays.asList(array);

        System.out.println(list);
        ArrayList<String[]> list2 = new ArrayList<>();
        list2.add(array);
 ///From Array list to Array
        List meal = new ArrayList<>(19);

        System.out.println(meal.size());
        meal.add("Beef Booll");
        meal.add(1,"Chicken");
        System.out.println(meal.get(0));

        Object[] restaurant =meal.toArray();
        System.out.println(Arrays.toString(restaurant));
        System.out.println(meal);
    }
}

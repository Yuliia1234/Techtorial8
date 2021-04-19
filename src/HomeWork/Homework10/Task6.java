package HomeWork.Homework10;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        //Create the following array size of 13 and store the following number
        // { 4, 4, 5, 12, 6, 7,12 7,1, 1, 2, 2, 3 } Print all unique values from UNSORTED array.
        int[] numbers = { 4, 4, 5, 12, 6, 7,12, 7,1, 1, 2, 2, 3 };
        String result = Arrays.toString(numbers).replace("[", "").replace("]", "");


        for (int i = 0; i < result.length(); i++) {
            char a = result.charAt(i);
            if (result.indexOf(a) == result.lastIndexOf(a)) {


                System.out.println("" +a);
            }

        }

    }
}

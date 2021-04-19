package HomeWork.Homework10;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {4, 4, 5, 12, 6, 7, 12, 7, 1, 1, 2, 2, 3};
        Arrays.sort(numbers);
        String result = Arrays.toString(numbers).replace("[", "").replace("]", "");


        for (int i = 0; i < result.length(); i++) {
            char a = result.charAt(i);
            if (result.indexOf(a) == result.lastIndexOf(a)) {

                System.out.println("" + a);
            }

        }

    }

}



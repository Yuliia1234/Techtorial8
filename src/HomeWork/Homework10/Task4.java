package HomeWork.Homework10;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        //Create the following array size of 7 and store
        // the following number {1, 1, 2, 2, 3, 4, 4 }. Print only the first unique value from this array. Output:
        int[] numbers = {1, 1, 2, 2, 3, 4, 4};
        String result = Arrays.toString(numbers).replace("[", "").replace("]", "");;

        for (int i = 0; i < result.length(); i++) {
            char a = result.charAt(i);
            if (result.indexOf(a)==result.lastIndexOf(a)){

                System.out.println("" + a);
            }

                }

            }

        }


package Array;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers ={4,6,56,7,3,89,200,11};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[numbers.length-1]);

        System.out.println("first index " + numbers[0]);
    }
}

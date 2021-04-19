package HomeWork.Homework9;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        //Write the application to find the second largest value from given array.
        //Example:
        //Given array value: 3,2,8,9,1,5,4,3,7,8,5,9,9
        //Output: 8

        int[] number = {10, 34, 67, 45, 87, 34, 87, 44, 100, 456, 75};
        Arrays.sort(number);
//number[number.lenght-1] -->number at the last index ,because of sorting it will be max value
        int b = 0;
        for (int i = number.length - 2; i >= 0; i--) {
            if (number[i] < number[number.length - 1]) {
                b = number[i];
                break;

            }
        }
        System.out.println(b);
    }
}

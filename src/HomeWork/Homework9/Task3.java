package HomeWork.Homework9;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Create one int array with size of 10 without any value. Using scanner ask user to provide the
        // int value until you filled out the array with given numbers.
        // Then print the array with all numbers.

        int[] numbers = new int[10];
        int count = 10;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the int number. You have " + count + " space in array");
            int a = input.nextInt();
            count = count - 1;
            if (count == 0) {
                break;
            }
        } while (count != 0);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers));

        }
    }
}



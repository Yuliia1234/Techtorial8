package HomeWork.Homework7;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = input.nextInt();
        System.out.println("Enter second number ");
        int num2 = input.nextInt();
        int count = 0;

        for (int i = num1; i <= num2; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println(i);
                count++;
            }
        }

        System.out.println("Total number that divisible by 3 and 5 is : " + count);
    }

}










package HomeWork.Homework8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");

        int sum = 0, i;
        int a = input.nextInt();
        int b = 1;

        for (i = 1; i <= a; i++) {
            sum += b;
            b = (b * 10) + 1;

        }
        System.out.println("The sum of number :" + sum);
    }
}

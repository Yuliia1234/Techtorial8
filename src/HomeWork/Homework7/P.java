package HomeWork.Homework7;

import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b=input.nextInt();
        int number = 0;
        for (number = a; number <= b; number++) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }
            if (sum == number) {
                System.out.println(number + " is a Perfect Number");
            }
        }
    }
}
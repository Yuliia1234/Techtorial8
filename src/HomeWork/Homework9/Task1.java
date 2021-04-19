package HomeWork.Homework9;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 3, 55, 32, 145, 443, 234, 98, 32};

        Scanner input = new Scanner(System.in);
        System.out.println("provide any number from given array");
        int user_input = input.nextInt();

        for (int a : numbers) {
            if (user_input == a) {
                continue;
            }
            System.out.println(a);
        }
    }
}

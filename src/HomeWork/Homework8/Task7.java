package HomeWork.Homework8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {

            for (int b = 0; b < a; b++) {
                System.out.print("");
            }

            for (int l = 0; l < i; l++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

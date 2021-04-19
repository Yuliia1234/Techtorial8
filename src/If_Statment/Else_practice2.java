package If_Statment;

import java.util.Scanner;

public class Else_practice2 {
    public static void main(String[] args) {
        //Ask user to enter three numbers find the biggest number and print it out by using
        // else if

        Scanner input = new Scanner(System.in);
        System.out.println("Enter one number");
        int first_num = input.nextInt();

        System.out.println("Enter second number");
        int second_number = input.nextInt();

        System.out.println("Enter third number");
        int third_number = input.nextInt();

        if (first_num > second_number) {
            System.out.println(first_num);

        } else if (second_number > third_number) {
            System.out.println(second_number);

        } else if (third_number > first_num) {
            System.out.println(third_number);
        }

    }
}

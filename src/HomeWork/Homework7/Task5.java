package HomeWork.Homework7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter current speed");
        double current = input.nextDouble();
        System.out.println("Enter target speed");
        double target = input.nextDouble();

        double count = 0;
        double result_in_second = 1;

        while (current < target) {
            current++;
            count++;
            if (count == 10) {
                result_in_second++;
                count = 0;
            }
        }
        System.out.println("You need " + result_in_second + " second to reach the target speed");
    }
}


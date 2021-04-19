package HomeWork.Homework7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int start;
        int end;
        int result;
        do {
            System.out.println("Enter how many eggs in the box");
            start = input.nextInt();
            System.out.println("how many eggs are eaten at the end of the day");
            end = input.nextInt();
            result = start - end;
            System.out.println("There are " + result + " eggs left");

            start--;

        } while (start >= end);

        System.out.println("You have finished all the eggs");
    }
}

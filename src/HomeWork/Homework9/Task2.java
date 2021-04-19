package HomeWork.Homework9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("provide any string value");
        String user_input = input.next();
        System.out.println("provide any index number");
        int index = input.nextInt();
        String[] names = {"Liam", "Emma", "Noah", "Olivia", "William "};

        if (names.length >= index) {
            for (int i = 0; i < names.length; i++) {
                    names[index]=user_input;
                System.out.println(names[i]);
            }

        } else {
            System.out.println("You enter incorrect index");
        }
    }
}










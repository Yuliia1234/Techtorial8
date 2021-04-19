package HomeWork.Homework5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter one string value");
        String a = input.nextLine();


        if (a.contains("r") && a.contains("e") && a.contains("d")) {
            System.out.println("String has a color red ");

        }
        if (a.contains("b") && a.contains("l") && a.contains("u") && a.contains("e")) {
            System.out.println("String has a color blue");


        }
    }
}


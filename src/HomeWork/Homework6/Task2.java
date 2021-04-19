package HomeWork.Homework6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a single character from the alphabet");
        String ch = input.next().toLowerCase();
        if (ch.length() > 1) {
            System.out.println("Error massage");
        } else {

            switch (ch) {
                case "a":
                    System.out.println("letter is Vowels");
                    break;
                case "e":
                    System.out.println("Letter is Vowels");
                    break;
                case "i":
                    System.out.println("Letter is Vowels");
                    break;
                case "o":
                    System.out.println("Letter is Vowels");
                    break;
                case "u":
                    System.out.println("Letter is Vowels");
                    break;
                case "y":
                    System.out.println("Letter is Vowels");
                    break;
                default:
                    System.out.println("Letter is Consonant");
                    break;

            }
        }

    }
}

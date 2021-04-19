package HomeWork;

import java.util.Scanner;

public class Homework4Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter one of the song names");
        String a = input.nextLine();

        System.out.println(a.charAt(0));

        System.out.println(a.charAt(a.length()-1));

        System.out.println(a.length());

        System.out.println(a.charAt(2));

        System.out.println(a.toUpperCase());

        System.out.println(a.toLowerCase());
    }
}

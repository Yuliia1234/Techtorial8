package HomeWork.Homework7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string value");
        String word = input.nextLine();
        int l = word.length();

        for (int i = 0; i < l - 2; i++) {

            if (word.charAt(i) == 'd' && word.charAt(i + 2) == 'd') ;
            System.out.println("dad");
        }
    }
}

package HomeWork.Homework5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Given a string, if a length 2 substring appears at both its beginning and end, print a string
        // without the substring at the beginning, so "HelloHe" yields "lloHe".
        // The substring may overlap with itself, so "Hi" yields "". Otherwise, print the original string unchanged.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter one string");
        String word = input.nextLine();


        String a = word.substring(0, 2);
        String b = word.substring(word.length() - 2);

        if (word.length() <=2) {
            System.out.println(" ");
        } else {

            if (a.equalsIgnoreCase(b)) {
                System.out.println(word.substring(2, word.length()));
            } else {
                System.out.println(word);
            }
        }
    }
}

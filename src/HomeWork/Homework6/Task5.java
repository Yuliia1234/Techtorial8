package HomeWork.Homework6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE ENTER A CHARACTER");

        char character = input.next().toLowerCase().charAt(0);


        if ((character >= 'a' && character <= 'z')) {
            System.out.println("Character is is Alphabet");

        } else if (character >= '0' && character <= '9') {
            System.out.println("Character is digits ");
        } else
            System.out.println("Character is special ");

    }
}

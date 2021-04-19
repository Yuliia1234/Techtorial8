package HomeWork;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please, enter a random word");
        String random_word = input.nextLine();


        System.out.println("Please,enter the number of letters that word consist ");
        int num_of_let=input.nextInt();


        boolean a = random_word.length() == num_of_let;
        System.out.println(a);

        System.out.println("Please, enter a letter you want index of");
        input = new Scanner(System.in);
        String index = input.nextLine();
        int result = random_word.indexOf(index);
        System.out.println(result);

    }
}

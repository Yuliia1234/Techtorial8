package HomeWork.Homework4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one string value with three word");
         String words = scanner.nextLine();

         int total_lenth = words.length();

        String first_word = words.substring(0,words.indexOf(" "));
        String first_half = words.substring(first_word.length()+1, total_lenth);

        String second_word = first_half.substring(0, first_half.indexOf(" "));
        String third_half = words.substring(first_word.length() + second_word.length() +2, total_lenth);
        String third_word = third_half.substring(0, third_half.length());


        System.out.println(first_word.charAt(0) + " " + second_word.charAt(0) + " " + third_word.charAt(0));
        System.out.println(first_word.charAt(first_word.length()-1)+ " " + (second_word.charAt(second_word.length()-1)
                + " " + (third_word.charAt(third_word.length()-1))));
        System.out.println(first_word.length());
        System.out.println(second_word.length());
        System.out.println(third_word.length());



    }
}


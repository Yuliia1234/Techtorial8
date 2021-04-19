package HomeWork;

import java.util.Scanner;


public class Project3 {
    public static void main(String[] args) {

        String userInput, word1, word2;
        int index1;

        Scanner input = new Scanner(System.in);
        System.out.println("Please,enter two words");
        userInput=input.nextLine();

        int total_letn = userInput.length();

        index1 = userInput.indexOf(" ");

        word1 = userInput.substring(0,(userInput.indexOf(" ")));
        word2 = userInput.substring(index1 +1 , total_letn);

        String first_letter = word2.substring(0,1).toUpperCase();
        String rest = word2.substring(1,word2.length()).toLowerCase();
        String k = first_letter + rest;
        System.out.println(word1 + " " + k);

    }
}

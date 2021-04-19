package StringMeth;

import java.util.Scanner;

public class CharAtAndLowercase {
    public static void main(String[] args) {
        // find a word from User
        //Concat the word word with TECH
        //find the length of the new word
        //find the first and last char
        Scanner input =new Scanner (System.in);
        System.out.println("Please enter a word");
        String word = input.next();
        word = word.concat("TECH");
        int lengthofword =word.length();
        System.out.println(lengthofword);

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(lengthofword-1));
        System.out.println("?????????????????//");
//==================================================================================================
        String string ="flower";
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(string.length()-1));
//===========================================================
        String state = "IllinoisIsweird";
        System.out.println(state.toLowerCase());
        System.out.println(state.toUpperCase());
    }
}

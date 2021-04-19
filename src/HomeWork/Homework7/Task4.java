package HomeWork.Homework7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string value ");
        String word =input.nextLine();
        for (int i = 0; i < word.length(); i++){ // a a ddd

//            System.out.println(word=word.replaceFirst(""+word.charAt(i),"a"));

            word = word.substring(0,i) + "a" + word.substring(i+1);

            System.out.println(word);

        }
    }
}

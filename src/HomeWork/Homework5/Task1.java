package HomeWork.Homework5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Please,enter one String");
         String word=input.nextLine();

        int total_l = word.length();

        if(total_l >= 3){
                System.out.println( word.substring(1,word.length()-1));
                }else {
                System.out.println(word);

        }
    }
}

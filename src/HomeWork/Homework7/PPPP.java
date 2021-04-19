package HomeWork.Homework7;

import java.util.Scanner;

public class PPPP {
    public static void main(String[] args) {
        //Using a scanner enter a sentence that is not separated by space and each word starts with upper case. Print given String as separated words with spaces.
        //Example:
        //Given Value: "IWantToLearnJava" Output: I Want To Learn Java Example-2:
        //Given Value: "ItIsSunnyOutside" Output: It Is Sunny Outside
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine();
        String result = "";


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                result += " " + str.charAt(i);
            } else {
                result += str.charAt(i);
            }

        }

        System.out.println(result.trim());
    }
}












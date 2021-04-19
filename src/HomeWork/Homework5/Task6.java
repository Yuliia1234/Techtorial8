package HomeWork.Homework5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Given a string, if one or both of the first 2 chars is 'x',
        // print the string without those 'x' chars, and otherwise print the string unchanged.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter one string");
        String word = input.nextLine();
        // String word = input.nextLine();

        int length = word.length();
        if(word.toLowerCase().startsWith("xx")) {
            word = word.substring(2);

        }else if (word.toLowerCase().startsWith("x")){
            word=word.substring(1);

        }else if(length>=2&& word.charAt(1)=='x'){

        }

            }
        }



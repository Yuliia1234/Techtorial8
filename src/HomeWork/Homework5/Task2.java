package HomeWork.Homework5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please,enter one String value");

        String a = input.nextLine();

        int stringLength = a.length()/2;


        if (a.length() ==1) {
            System.out.println( " ");

        } else if(a.length()>=3){
            System.out.println(a.substring(stringLength-1,stringLength+2));
        }
    }
}

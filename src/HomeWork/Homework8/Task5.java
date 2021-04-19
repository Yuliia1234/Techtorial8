package HomeWork.Homework8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Write a program in Java to display any number in reverse order.
        //Test Data :
        //Input a number: 12345 (it can be any number like 5 digits or 6 digits etc)
        //Expected Output :
        //The number in reverse order is: 54321
        Scanner input =new Scanner(System.in);
        System.out.println("Enter any number like 5-6 digits");
        int reserve=input.nextInt();
        int number = 0;

        for(;reserve != 0; reserve /= 10) {
            int digit = reserve % 10;
           number= number * 10 + digit;

        }
        System.out.println(number);
    }
}

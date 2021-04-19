package HomeWork.Homework8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Write a Java program to check whether a given number is an armstrong number or not.
        //Test Data :Input a number: 153
        //Expected Output :153 is an Armstrong number.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number ");
        int number=input.nextInt();
        int sum =0;
        int numberItSelf=number;
             //370
        for ( ; number > 0; number/=10) {
           // number%10 last digit of number
            //37
            int lastD=number%10;//7
            int powerofLastD = lastD*lastD*lastD;
            sum+=powerofLastD;


        }
        if (sum == numberItSelf) {
            System.out.println("This is Armstrong number");
        }
    }
}

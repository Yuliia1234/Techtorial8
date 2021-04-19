package If_Statment;

import java.util.Scanner;

public class IfElsePractice1 {
    public static void main(String[] args) {
//Ask user to enter a number if the number is even
        //Print out saying your number is even otherwise print out your number is odd
         double number;
        System.out.println("Enter an number");

        Scanner input = new Scanner(System.in);
        number = input.nextDouble();

        if ( number % 2 == 0 ) {
            System.out.println("number is even");
        }else{ // If you need to use couple else you can put else if
            System.out.println("number is odd");
        }

    }
}

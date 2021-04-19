package HomeWork.Homework6;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println("This is a leap year ");

        }else if  (year%100==0){
            System.out.println("This is a leap year");

        }else if(year%400 ==0){
            System.out.println("This is a leap year");

        }else
            System.out.println("this is not a leap year");

    }


}


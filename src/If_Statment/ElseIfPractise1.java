package If_Statment;

import java.util.Scanner;

public class ElseIfPractise1 {
    public static void main(String[] args) {
        //if you have more then 1500$,you will buy iphone12 promax
        //if you have more then 500 less then 1000 ,you will buy LG
        //otherwise you will buy fitbit

        Scanner input = new Scanner(System.in);
        System.out.println("How much money do you have");

        int money = input.nextInt();

        if (money >= 1500) {
            System.out.println("You will buy iphone12 promax");

        } else if (money > 500 && money < 1000) {
            System.out.println("You will buy LG ");

        } else
            System.out.println("You will buy fitbit");
        }
    }




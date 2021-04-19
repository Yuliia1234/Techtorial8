package If_Statment;

import java.util.Scanner;

public class IfelsePractice {
    public static void main(String[] args) {

        //If purchase amount  100$ or more i will get discount 20%
        //If purchase less then 100$ -5% discount
        //Ask user for total payment by using Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your total payment");

        int total_spend = input.nextInt();
        double amount = 100;
        double _5_discount = total_spend - (total_spend * 0.05);
        double _20_discount = total_spend - (total_spend * 0.20);

        if (total_spend >= amount) {
            System.out.println("You will get 20 percent discount = " + _20_discount + "$");

        } else {
            System.out.println("You will get 5 percent discount =" + _5_discount + "$");
        }
    }
}


package DoWhileLoop;

import java.util.Scanner;

public class Task5WhileLoop {
    public static void main(String[] args) {
        //while loop,aqsk user to enter two numbers
        //find the sum of the numbers in between those given numbers
        //input 5,7 -->sum 18(5+6+7)

        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers");
        int num = input.nextInt();
        int num2 = input.nextInt();

        int total = 0;//total =firstnumber
        while (num <= num2) {
            total += num;
            num++;
            System.out.println("Now the total is " + total);
        }

        System.out.println("This is a final total " + total);

        do {
            total = total + num;
            System.out.println("This is coming from do while Loop" + total);
            num++;
        } while (num <= num2);
        total += num;
        num++;
        System.out.println("Now the total is " + total);
    }
}


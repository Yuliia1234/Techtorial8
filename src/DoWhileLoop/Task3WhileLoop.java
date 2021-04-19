package DoWhileLoop;

import java.util.Scanner;

public class Task3WhileLoop {
    public static void main(String[] args) {
        //ask user to provide a number
        //for that given number
        //creat a multiplication table from 1 to 10s
        //ex:input 5-->5*1=5
        Scanner input = new Scanner(System.in);
        System.out.println("Please,provide a number");
        int num = input.nextInt();
        int a = 1;
        int result =a*num;
        while (a <= 10) {

            System.out.println(num+ " * "+ a + "=" +(num*a));

            a++;

        }
    }
}


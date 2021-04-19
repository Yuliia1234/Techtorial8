package HomeWork.Homework5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int num =input.nextInt();

        if(num>=0){
            System.out.println("Number is positive");

        }else if (num<0 ){
            System.out.println("Number is negative");
        }
    }
}

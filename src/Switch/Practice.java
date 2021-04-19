package Switch;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        ////Ask user to enter two numbers and name of the math operation (/,+,*)
        //        //Apply mathicnh operators to those two numbers
        // output 5*6=30
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");
        double firstN=input.nextDouble();

        System.out.println("Please enter your second number");
        double secondN=input.nextDouble();

        System.out.println("Please enter name of math operation");
        String opreration = input.next().toLowerCase();


        switch (opreration){
            case "add":
                System.out.println(firstN + " + "+secondN + " = " +(firstN+secondN));
                break;
            case "division":
                System.out.println((firstN + " / "+secondN + " = " +(firstN/secondN)));
                break;
            case "multiple":
                System.out.println((firstN + " * "+secondN + " = " +(firstN*secondN)));
                break;
            case "modulus":
                System.out.println(firstN+ "% "+ secondN + "=" +(firstN%secondN));
                break;
            default:
                System.out.println("Operation is not matching");

        }

    }
}

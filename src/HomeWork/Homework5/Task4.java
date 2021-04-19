package HomeWork.Homework5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the grade letter");
        String points =input.nextLine();

        if (points.equals("A")){
            System.out.println("4.0");

        }if (points.equals("-A")){
            System.out.println("3.7");

        }if (points.equals("+B")){
            System.out.println("3.3");

        }if (points.equals("B")){
            System.out.println("3.0");

        }if (points.equals("-B")){
            System.out.println("2.7");


        }if (points.equals("C+")){
            System.out.println("2.3");


        }if (points.equals("C")){
            System.out.println("2.0");


        }if (points.equals("C-")){
            System.out.println("1.7");


        }if (points.equals("D+")){
            System.out.println("1.3");


        }if (points.equals("D")){
            System.out.println("1.0");


        }if (points.equals("F")){
            System.out.println("0");
        }
    }
}

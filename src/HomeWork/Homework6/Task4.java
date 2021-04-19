package HomeWork.Homework6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter triangle value");
        int check =input.nextInt();

        int check1 =input.nextInt();

        int check2=input.nextInt();

        if (check==check1 && check1==check2 && check==check2){
            System.out.println("It's Equilateral");

        }else if (check!=check1 && check1!=check2 && check!=check2){
            System.out.println("It's Scalene");


        }else if  (check==check1 || check1==check2 || check2==check){
            System.out.println("It's Isosceles");

        }
    }
}

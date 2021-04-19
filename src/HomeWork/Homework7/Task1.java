package HomeWork.Homework7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

        for(int i=0;    i<=10;   i++){
            System.out.println(num + " * " + i + "=" +(i*num));

        }
    }
}

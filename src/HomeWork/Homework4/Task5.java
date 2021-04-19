package HomeWork.Homework4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please,enter one of the three string values.");
        String a = input.nextLine();

        System.out.println("Enter next string value");
        String b=input.nextLine();

        System.out.println("Enter next string value");
        String c= input.nextLine();

        System.out.println(""+a.charAt(0) + "" + b.charAt(0) + "" +c.charAt(0));
       System.out.println(""+a.charAt(a.length()-1)+""+b.charAt(b.length()-1)+""+c.charAt(c.length()-1));
       int lenght1 =a.length();
       int lenght2 =b.length();
       int lenght3 =c.length();
        System.out.println(lenght1 == lenght2 && lenght3 ==lenght2 && lenght1 ==lenght3);
    }
}

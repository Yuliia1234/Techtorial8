package HomeWork.Homework4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First String value");
        String first_value = input.nextLine();
        System.out.println("enter the Second String value");

        String second_value=input.nextLine();
        String b= first_value.substring(first_value.length()-2);
        String c = second_value.substring(0,2);
        System.out.println(b.equalsIgnoreCase(c));
    }
}

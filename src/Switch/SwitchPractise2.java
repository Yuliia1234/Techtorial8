package Switch;

import java.util.Scanner;

public class SwitchPractise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of the week days");
        String day = input.nextLine().toUpperCase();

        switch (day) {

            case "MONDAY":
                System.out.println("1");
                break;
            case "TUESDAY":
                System.out.println("2");
                break;
            case "WENSDAY":
                System.out.println("3");
                break;
            case "THURSDAY":
                System.out.println("4");
                break;
            case "FRIDAY":
                System.out.println("5");
                break;
            default:
                System.out.println("There is no such a day");
                break;


        }
    }
}

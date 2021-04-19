package Switch;

import java.util.Scanner;

public class SwithPractice1 {
    public static void main(String[] args) {
        //Ask user to provide a whole number from 1-5
        //for mathich number print name of the day as 1-"Today is Monday "
        //2-Today is Tuesday
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from1-5");
        int day = input.nextInt();
        switch (day) {

            default:
                System.out.println("There is no such a day");
                break;

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday ");
                break;
            case 5:
                System.out.println("Friday ");
                break;


        }
    }
}

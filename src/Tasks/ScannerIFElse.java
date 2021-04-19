package Tasks;

import java.util.Scanner;

public class ScannerIFElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);////Option+enter-->import

        System.out.println("Please enter your name");
        String user_input = scanner.nextLine();

        System.out.println("What is your zodiac sign");
        String user_zodiac = scanner.nextLine();

        System.out.println("How old is the user");
        int user_age = scanner.nextInt();

        System.out.println("How height is the user");
        int user_height = scanner.nextInt();

        System.out.println("How much is your weight");
        int user_weight = scanner.nextInt();


        if (user_zodiac.equals("Scorpio")){
            System.out.println("You are great");
        }else{
            System.out.println("You are still great");
        }

        if (user_age == 50) {// != --->not equal
            System.out.println("That's correct ");
        } else {
            System.out.println("You are to young ");
        }

        if (user_input.equals("Ivanna")) {
            System.out.println("This is Ivanna");
        } else {
            System.out.println("This is not Ivanna ");
        }

        if (user_height != 180) {
            System.out.println("You are midget");
        } else {
            System.out.println("Perfect");
        }

        if (user_weight < 50) {
            System.out.println("You are too skinny");
        }else if (user_weight > 50 && user_weight < 70){
            System.out.println("You need to put some weight");

        }else if (user_weight > 70 && user_weight < 100){
            System.out.println("You are athletic");

        }else if(user_weight > 100 && user_weight< 130){
            System.out.println("You are fat ass!");

        }else if(user_weight > 130){
            System.out.println("You are dead");

         }
    }
}

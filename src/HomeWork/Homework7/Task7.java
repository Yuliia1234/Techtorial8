package HomeWork.Homework7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        String username;
        int password;
        String username1 = "tech";
        int password1 = 1234567;
        int count = 3;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter username ");
            username = input.nextLine();

            System.out.println("Enter password");
            password = input.nextInt();

            if (!username.equalsIgnoreCase(username1) || password != password1) {
                count = count - 1;
                System.out.println("THE INPUT IS NOT CORRECT, YOU HAVE TRIES " + count);

            }if (count == 0) {
                break;
            }

        } while (!username.equalsIgnoreCase(username1) || password != password1); //true
        if (count == 0) {
            System.out.println("YOUR ACCOUNT IS LOCKED TRY AGAIN LATER ");
        } else {
            System.out.println("CORRECT ");
        }
    }
}
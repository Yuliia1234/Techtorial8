package Method;

import java.util.Scanner;

public class MethodRecursion1 {
    static Scanner scanner = new Scanner(System.in);

    public static boolean login(int tries) {
        if (tries == 0) {
            System.out.println("You are out of tries");
            return false;
        }
        System.out.println("Please provide username");
        String username = scanner.next();

        System.out.println("Please provide password");
        String password = scanner.next();

        if (username.equals("techtorial") && password.equals("tech2200")) {
            System.out.println("Access granted");
            return true;
        } else {
            System.out.println("Wrong username or password, try again , number of tries " + (tries - 1));
            return login(tries - 1);
        }
    }

    public static void main(String[] args) {
        boolean logedIn = login(3);
        System.out.println(logedIn);
    }
}

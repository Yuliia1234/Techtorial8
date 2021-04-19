package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        if (age >= 17) {

            switch (age) {
                default:
                    System.out.println("Do you have DL?yes or no");

                    String dl = input.next();
                    switch (dl) {
                        case "yes":
                            System.out.println("You can drive in IL");
                            break;
                        default:
                            System.out.println("You should have dl");
                            break;
                    }
            }
        } else {
            System.out.println("You should be at least at the age of 17 ");
        }
    }
}

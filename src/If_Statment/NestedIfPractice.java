package If_Statment;

import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {
        //ask candidate if he knows java
        //if answer is yes then ask if he knows secenium
        //if the answer yes to Secenium -->ask API testing
        //if the answer yes -->ask if he knows SQL
        //System.out.println(Congrats,you are hired );

        Scanner input = new Scanner(System.in);
        System.out.println("Do you know java ");
        String java = input.nextLine();


        if (java.equalsIgnoreCase("yes")) {
            System.out.println("Do you know Secenium");
            String selen = input.nextLine();

            if (selen.equalsIgnoreCase("yes")) {
                System.out.println("Do you know API testing?");
                String api = input.nextLine();

                if (api.equalsIgnoreCase("yes")) {
                    System.out.println("Do you know SQL");
                    String sql = input.nextLine();

                    if (sql.equalsIgnoreCase("yes")) {
                        System.out.println("Congrats we will hire you ");

                    } else {
                        System.out.println("we need SQL knowladge ");
                    }
                } else {
                    System.out.println("We need Api knowlwdge");
                }
            } else {
                System.out.println("We need selenium skills");
            }
        } else {
            System.out.println("Please learn Java and try again");

        }
    }
}


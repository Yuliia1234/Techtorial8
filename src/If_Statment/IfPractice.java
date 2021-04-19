package If_Statment;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter a first letter o the day ");

        String m = input.nextLine();


        if (m.equals("M")) {
            System.out.println("Your day is Monday");
        }if (m.equals("T")) {
            System.out.println("Your day is Tuesday");
        }if (m.equals("W")){
            System.out.println("Your day is Wednesday ");

        }if (m.equals("F")){
            System.out.println("Your day is Friday");

        }if (m.equals("S")){
            System.out.println("Your day is Saturday ");




             }if (!m.equals("M") && !m.equals("T") && !m.equals("W") && !m.equals("F")) {
            System.out.println("There is no day starting ");

        }

             }

         }

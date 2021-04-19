package HomeWork;

import java.util.Scanner;

public class Homework4Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please,enter your age");
        int age =input.nextInt();

        boolean vote_age = age >= 18;


        System.out.println("Please,enter your full name");
        input = new Scanner(System.in);
        String name =input.nextLine();

        System.out.println("Please, enter your state code");
        String state_code = input.nextLine();

        System.out.println("Please,enter your city");
        String city = input.nextLine();

        System.out.println("Please,enter your gender.Use short cut F or M");
        String gender = input.nextLine();

        //String vote_age = "18";
        String city_lenght ="10";


        boolean able_to_vote = vote_age && name.startsWith("A") && name.endsWith("V") && state_code.startsWith("I")
                && state_code.endsWith("L") && gender.equals("M") && city.length()>=city_lenght.length();

        System.out.println(able_to_vote);
    }
}

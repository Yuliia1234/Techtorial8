package If_Statment;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {
        //if your score is 90-100-->A
        //If you score is 70 to 89 -->B
        // if you score is 60 to 69 --C
        // if your score is less then 60 -->failing
        //Ask user to give his/her score
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your score");
        double user_input = input.nextDouble();
        user_input=(int)user_input;//this is make your double entry as int

        if (user_input <= 100 && user_input >= 90) {
            System.out.println("A");
        } else if (user_input <= 89 && user_input >= 70) {
            System.out.println("B");

        } else if (user_input >= 60 && user_input <= 69) {
            System.out.println("C");

        } else if (user_input < 60) {
            System.out.println("failing");

        }
    }
}
//===============================================
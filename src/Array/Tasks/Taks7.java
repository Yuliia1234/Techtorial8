package Array.Tasks;

import java.util.Arrays;

public class Taks7 {
    public static void main(String[] args) {
        //Creat a char array print out only number from this array
        //Print out only words

        char[] number = new char[]{'a', 'l', '1', '7', 'V', '%'};

        for (int i = 0; i < number.length; i++) {
            if (number[i] >= '0' && number[i] <= '9') {

                System.out.println(number[i]);
            }

        }
        for (int i = 0; i < number.length; i++) {
            if (Character.isDigit(number[i])) {
                System.out.println("Digits " + number[i]);


            } else if (Character.isAlphabetic(number[i])) {
                System.out.println("Alphabetic " + number[i]);
            } else {
                System.out.println("Everything else " + number[i]);
            }


        }
    }
}

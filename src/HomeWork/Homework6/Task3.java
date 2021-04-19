package HomeWork.Homework6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in centigrade ");
        int tem = input.nextInt();


        if (tem == 0 && tem < 10) {
            System.out.println("Very Cold weather");
        }
        if (tem < 0) {
            System.out.println("Freezing weather");
        }
        if (tem >= 10 && tem < 20) {
            System.out.println("Cold weather");
        }
        if (tem > 20 && tem < 30) {
            System.out.println("Normal weather");
        }
        if (tem > 30 && tem < 40) {
            System.out.println("It's Hot");
        }
        if (tem >= 40) {
            System.out.println("It's very Hot");

        }
    }
}

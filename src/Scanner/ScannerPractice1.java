package Scanner;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name");
        char firstInitial =  input.next().charAt(0) ;//indexing in java it's starts from 0
        System.out.println(firstInitial);

        System.out.println("Please enter your age");
        int age =input.nextInt();
        System.out.println("Mr/s " + firstInitial + " your age is " + age);

        System.out.println("please provide your height ");
        double height = input.nextDouble();
        System.out.println ("Please provide your weight");
        float weight= input.nextFloat();

        System.out.println("Mr/s " + firstInitial + "your height is "+ height + "your weight is "+ weight);

        weight= 10; //In result it will show you the weight you assing in this case 10
        System.out.println("Mr/s" + firstInitial + "your height is " + height + " your weight is " + weight);
        double BMI = weight/(height*height);
        System.out.println("Mr/s" + firstInitial + " your BMI is " + BMI);

    }
}

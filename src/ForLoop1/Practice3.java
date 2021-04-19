package ForLoop1;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        //Find the factors (diviser ) of given number
        //Ask user to give a number

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        int result =1;

        for (int i=1; i<=a;i++){

            if (a % i ==0){

                System.out.println("This is numbers can be divided :"+ i);

                System.out.println("This is multiplacation of divisable numbers "+ a*i);

                result=result*i;
            }

            System.out.println(result);
        }


    }
}

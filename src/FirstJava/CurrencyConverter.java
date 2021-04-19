package FirstJava;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Input euro to dollar");
        int  euro_in_dollar  = input.nextInt();


        System.out.println("hi, Welcome to the Currency Converter!");

        System.out.println("which currency You want to Convert ? ");
        System.out.println(" Amount euro to dollar " + euro_in_dollar * 0.71 );
        System.out.println(" Thank you ");
        input.close();
        System.out.println("Scanner Closed.");





    }

}

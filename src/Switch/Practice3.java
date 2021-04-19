package Switch;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Providee a whole number");
        int num = input.nextInt();
        int a =1;
        while (a<=num){
            if (num%a==0){
                System.out.println("This is number can divide your number " + a);

            }
            a++;
        }


            }

        }


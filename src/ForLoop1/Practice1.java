package ForLoop1;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number less then 10 ");
        int i = input.nextInt();
        for (   ;i<10  ;i++)  {
            System.out.println("User input practice for loop " +i);

        }
    }
}

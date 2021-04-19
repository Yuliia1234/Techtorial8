package Array.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Ask user to how many names she or he wants to store in an array
        //Store those names in a String array
        Scanner input = new Scanner(System.in);
        System.out.println("How many names do you want to store in array");
        int names = input.nextInt();

        String[] a = new String[names];
        for (int i = 0; i < names; i++) {
            System.out.println("What's the name of them");
            a[i] = input.next();


        }
        System.out.println(Arrays.toString(a));
    }
}

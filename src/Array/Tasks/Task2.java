package Array.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //if the name is longer then 5 letters -->store it in in longNames array
        //if the name is shorter then 5 letters-->store them itr in a shortNames array

        Scanner input = new Scanner(System.in);
        System.out.println("How many name do you want to store");
        int number = input.nextInt();

        String[] longNames = new String[number];
        String[] shortNames = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Please enter a name");
            String name = input.next();
            if (name.length() < 5) {
                shortNames[i] = name;

            } else {
                longNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(shortNames));
        System.out.println(Arrays.toString(longNames));
    }
}

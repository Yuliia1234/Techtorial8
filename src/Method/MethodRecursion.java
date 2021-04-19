package Method;

import java.util.Scanner;

public class MethodRecursion {
    //​
    // Method Recursion - means when method calls ITSELF inside the body  ​

    public static String reverseString(String word) { // Java / Jav / Ja / J
        int length = word.length();
        if (length == 1) {
            return word;
        }

        char last = word.charAt(length - 1); // a / v / a
        word = word.substring(0, length - 1); // Jav / Ja / J
        return last + reverseString(word);
    }


    public static void main(String[] args) {
        String original = "Hello";
        String reserve = reverseString(original);
        System.out.println(reserve);
    }
}

package HomeWork.Homework10;

public class Task3 {
    public static void main(String[] args) {
        //Create an int array with 6 elements and print a multiplication table for each element from an array.

        int[] number = {5, 6, 3, 8, 6, 4};


        for (int i = 0; i < number.length; i++) {
            for (int k = 1; k <= 10; k++) {


                System.out.println(number[i] + " * " + k + " = " + number[i] * k);
            }
        }
    }
}



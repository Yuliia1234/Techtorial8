package HomeWork.Homework10;

public class Task2 {
    public static void main(String[] args) {
        //You have an array of 6 int numbers and get the square of each number from the array.

        int []numbers = {5,10,2,21,24,15};
        int count=0;

        for (int i = 0; i <numbers.length; i++) {

            numbers[i]*=numbers[i];
            count++;

            System.out.println("Square of the number " +  count+ " is " +numbers[i]);

        }
    }
}

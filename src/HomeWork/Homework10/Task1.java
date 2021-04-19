package HomeWork.Homework10;

public class Task1 {
    public static void main(String[] args) {
        //You have an array of weather conditions with Fahrenheit numbers.
        // The size of the array will be 6. Print the Celcius value of each array element.


        int[] tem = {49, 67, 45, 38, 12, 4};

        for (int i = 0; i < tem.length; i++) {
            tem[i] = (tem[i] - 32);
            tem[i] *= 0.5556;
            System.out.println("Tem in Celsius " + tem[i]);

        }

    }

}





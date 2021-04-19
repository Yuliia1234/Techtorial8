package Method;

public class Math {
    public int sum(int number1, int number2) {
        int total = number1 + number2;

        return total;
    }

    public double multiply(double number1, double number2) {
        double a = number1 / number2;
        return a;
    }

    public void sumOfArray(int[] number) {//no return type because void
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 5 && number[i] < 15) {

                sum += number[i];
            }
        }
        System.out.println("YYY " + sum);
    }

}


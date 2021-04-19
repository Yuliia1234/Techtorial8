package Method;

public class MethodOverloading {

    public void sum(int num1, int num2) {

        int sum = num1 + num2;
    }

    public void sum(double number1, double number2) {

        double sum = number1 + number2;
        System.out.println("This is sum of two double numbers " + sum);
    }

    public int sum(String operator, int num1, int num2) {
        int result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                return result;
            case "-":
                if (num1 > num2) {
                    return num1 - num2;
                } else {
                    return num2 - num1;
                }
            case "*":
                result = num1 * num2;
                return result;
            case "/":
                result = num1 / num2;
                return result;
            case "%":
                result = num1 % num2;
                return result;
            default:
                System.out.println("invalid operator is entered");

        }
        return -1;
    }
}

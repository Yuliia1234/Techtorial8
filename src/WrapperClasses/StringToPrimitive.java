package WrapperClasses;

public class StringToPrimitive {
    public static void main(String[] args) {

        String number1 = "10";
        String number2 = "20";
        System.out.println(number1+number2);//concat=1020

        int num1 = Integer.parseInt(number1);//UnBoxing  Integer Wrapper Object to primitive data type
        int num2 = Integer.parseInt(number2);
        System.out.println(num1+num2);//it will add num1 and num2 =30;

        String number3="11.5";
        double num3 = Double.parseDouble(number3);
        System.out.println(num3);

        String test = "True";
        boolean bl = Boolean.parseBoolean(test);
        System.out.println(bl);
        System.out.println(bl==true);
    }
}

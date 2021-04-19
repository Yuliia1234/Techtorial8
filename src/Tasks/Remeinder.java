package Tasks;

public class Remeinder {
    public static void main(String[]args) {
        int num = 255; //255=2+5+5=12
        int firstNumber = num % 10;//5
        num = num / 10;//25
        int secondNumber = num % 10;
        num = num / 10;//2
        int thirdNumber = num;
        System.out.println(firstNumber + secondNumber + thirdNumber);

        int remainder =  214;/// 2+1+4 = 7
        int firstD = remainder%10; //4
        remainder =remainder/10;//21
        int secondD = remainder%10; //1
        remainder = remainder/10;
        int thirdD = remainder;
        System.out.println(firstD+secondD+thirdD);




    }

}


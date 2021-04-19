package PrimitiveDataTypes;

public class ReinderPractise {
    public static void main (String[]args){
        // finding remainder of a division
        //9 students in the class and want to pair them up
        //9/2 = 4 --->remainder is 1
        //modules (%) operator will gave the remainder
        int studentNumber = 9 ;
        int divider =2 ;
        int resultofDivision = studentNumber/ divider;
        System.out.println( "Result of division is " + resultofDivision);
        int remainder = studentNumber%divider;
        System.out.println("The remainder is "+ remainder);
        int num1 = 14;
        int num2 = num1-9 ; //num 5
        int remainder1 = num1/num2;
        int division =num1%num2;
        System.out.println(division);///remainder
    }
}

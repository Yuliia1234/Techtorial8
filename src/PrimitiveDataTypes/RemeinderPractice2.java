package PrimitiveDataTypes;

public class RemeinderPractice2 {
    public static void main(String[] args) {
        ///How can i find some of digits from a given number?
        //123==> 1+2+3 =6
//        int a=19;
////        int r1 = a%10; (left over 9)
////
        int number =123;
        int firstDidgits= number%10; //3
        number = number / 10; //12
        int secondDidgits =number%10;//2
        number = number /10; //1
        int thirdNumber = number;
        int sum = firstDidgits + secondDidgits +thirdNumber;
        System.out.println(sum);////Homework make it 255
    }

}
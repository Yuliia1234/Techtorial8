package InnerLoop;

public class Task4 {
    public static void main(String[] args) {
        //Check if given number is Armstrong number or not
        //153
        int a = 153;
        int first= a%10; //3
        a = a/10; //34
        int second =a%10; //5
        a = a/10; // 1
        int third = a;
        int mult = (first*first*first) + (second*second*second) + (third*third*third);
        System.out.println(mult);


    }

}

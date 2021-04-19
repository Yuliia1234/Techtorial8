package HomeWork;

public class Meaningful {
    public static void main (String[]args){
        //declaration part of in k = 7
        int k=7;
        //declaration part of n =3
        int n=3;
        int result=k++ * ++n / ++n % k + n - k++;
        //We have to assign value of k and n to result
        //result is 7++ * ++3 / ++3 / ++3 %3 + 3 -7++;
        //  7 * 4  /  5  % 8 + 5 - 8
        //first step is multiply
        // We have post increment and pre-increment here.
        //post increment will change the value of 3 to 4
        //pre-increment will not change the value so k = 7
        //result 28 / 5 % 8 + 5 - 8++;
        //next step is divide .Result 5 % 8 + 5 -8 ++;
        //next step we have to find remainder 5 to 8 .Result is 5
        // 5 + 5 - 8 ++;
        //Result 2
        System.out.println(result);
        int $result= k + k++ * k - n++ % n + ++n;
        //9 + 9 * 10 - 5 % 6 + 7;
        // 9 +90 -5 %6 +7;
        //9 +90 -5 +7;
        //99 -5 +7;
       //Result is 101

        System.out.println($result);
        int d =2%3;
        System.out.println(d);












        // Result
        // In first step we have to assign value of k and value of n to result
        // 7++ * ++3 / ++3 / ++3 %3 + 3 -7++;
        // We have different operators result's operators with higher precedence are executed before operators with lower precedence.
        // In this case we will execute operators from left to the right
        // We will do multiplication first.We need to multiply 7++ *3++.Also we have post increment and pre-increment
        // That's means that the variable is incremented before it's evaluated in the expression.
        // Post-increment means that the variable is incremented after it has been evaluated for use in the expression
        //result =

        //


              //Result1
              //12-3/3+4-2*2%4+12%3/3
              // first step we need to divide 3 to 3 which is equal to -1
              //12-1+4-2*2%4+12%3/3  once again we are counting from left to the right and next higher precedence is multiply.
              //We are multiplying -2 to 2 which is equal  to -4
              //12-1+4-4%4+12%3/3 next step is find remainder of division of -4 to 4 the answer will be 0
              //12-1+4+0+12%3/3 one more time we need to find remainder of division of 12 to 3 the answer will be 0
              //12-1+4+0+0/3 the last higher precedence is dividing. We need to divide 0 to 3 which is equal to 0
              //12-1+4 When all higher precedence is done in order to execute result we will need to count from left to the right
              //Result1 is 15
              //Let's run it and check

    }
}

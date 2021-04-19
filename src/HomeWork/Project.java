package HomeWork;

public class Project {
    public static void main(String[]args){
        ///////////Write a program that will accept only 6 digit numbers like 578432 and find multiplication

      int a = 578432;
      int first = a%10;//2
        a = a/10; //57843
        int second =a%10; //3
        a= a/10;//5784
        int third = a % 10;//4
        a= a/10; //578
        int f_4=a %10;//8
        a = a/10; //57
        int f_5=a%10;
        a = a/10;//5
        int s_6= a;
        int mult = first*second*third*f_4*f_5*s_6;
        System.out.println(mult);
        int sum = first+second+third+f_4+f_5+s_6;
        System.out.println(sum);




    }
}

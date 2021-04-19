package PrimitiveDataTypes;

public class ComparisonOperators {
    public static void main(String[]args) {
        ////////
        int a = 5;
        int b = 6;
        System.out.println(a == b);

        boolean hasMoney = true;
        boolean hasCar = false;
        System.out.println(hasMoney == hasCar);
        System.out.println(hasMoney == false);//comparing true to false
        System.out.println(a!=b);//true
        boolean bl1= a!=b;
        System.out.println(bl1);

        boolean bl2= a>b;///no,that means false
        System.out.println("a is not greater than b.that is why result is " + bl2);

        boolean d = a<b;
        System.out.println("a is smaller theb b .That's why result is "+ d);

        boolean bh = a>=b;
        System.out.println(bh);

        int c = a +1;//c is 6
        boolean bl5 = c>b;//True
        System.out.println(bl5);/// false
        System.out.println(!bl5 ==!bl5);

        boolean bl6 = c<=a;
        System.out.println(bl6);

        char ch4 = 'A';
        char ch5 = 65;
       boolean r3= ch4 ==ch5;
        System.out.println("" + r3);//We can compare different type of data types






    }
}

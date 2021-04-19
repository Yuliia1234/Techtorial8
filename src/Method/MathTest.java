package Method;

public class MathTest {
    public static void main(String[] args) {
        Math test = new Math();
        int a = test.sum(3, 4);//
        System.out.println(a);

        int[] numberoF = {1, 56, 3, 4, 8, 9, 11, 85, 20};
        test.sumOfArray(numberoF);

        MethodOverloading object2 = new MethodOverloading();

        int product = object2.sum("*", 5, 5);
        System.out.println(product + " Result of Method Over Loading ");

        int product1 = object2.sum("+", 20, 20);
        System.out.println(product1);


        AgeCalculator year = new  AgeCalculator();
       int result = year.Age(1996);
        System.out.println(result +" Your age ");
    }

    Math test1 = new Math();

    double b = test1.multiply(100, 50);


}

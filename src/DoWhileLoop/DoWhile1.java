package DoWhileLoop;


public class DoWhile1 {
    public static void main(String[] args) {
        int num =5;
        do{
            System.out.println("print the number " +num);
           num--;
        }while(num>0);
        int num1=5;
        do{
            System.out.println(num1);
            num1--;//doesn't matter in this case

        }while (num1<0);//if condition is false it will print one time


    }
}

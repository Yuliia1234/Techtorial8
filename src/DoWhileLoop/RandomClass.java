package DoWhileLoop;



import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//long range = 1234567L;
//Random r = new Random()
      //  long number = (long)(r.nextDouble()*range);

      //  long range = 1234567891011123L;
        Random rand = new Random();
        long number = (long)(rand.nextDouble()*1234567891011123L);//less then 1000;
        // When you provide bound it will generate numbers from 0 to bound-1
        System.out.println(number);//usually using for passwords (random number )
        //============================================

    }
}

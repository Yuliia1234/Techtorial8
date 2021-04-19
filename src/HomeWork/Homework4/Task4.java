package HomeWork.Homework4;

public class Task4 {
    public static void main(String[] args) {
        int a  = 8;
        int b = 6;

        int total =a++ + b++ + b % --a + ++b + --b / a++ + ++a +b++;

         System.out.println(a);

         System.out.println(b);

         System.out.println(total);


    }
}

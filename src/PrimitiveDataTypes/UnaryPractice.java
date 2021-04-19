package PrimitiveDataTypes;

public class UnaryPractice {
    public static void main (String[]args){
        //buy 12 donuts get the 1$ discount on your next visit ,1$ per donut
        // buy 12 donuts get 1$ discount right away ,1$ per donut
        int $donut =12;
        System.out.println("first visit " + $donut--);//this is my first visit to the store
        System.out.println("Second visit " +$donut);
        int $$donut =12;
        System.out.println("First visit instant discont" +  --$$donut);


    }
}

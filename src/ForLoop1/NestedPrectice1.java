package ForLoop1;

public class NestedPrectice1 {
    public static void main(String[] args) {
        //create a digital clock that counts hours up to 12 minutes up to 68

        for (int hours =0; hours<=12; hours++ ){


            for (int min =0; min<=59 ;min++){

                System.out.print( hours + " : ");

                System.out.println(min);
            }
        }
    }
}

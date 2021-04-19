package StringMeth;

public class StartsWithAnd_Contains {
    public static void main(String[] args) {

        String name = "John";

        boolean bl1= name.startsWith("J");//—>true
        boolean bl2= name.startsWith("j");  //—>false

        System.out.println(bl1);
        System.out.println(bl2);

        System.out.println(name.startsWith("Joh"));//true since first three letters are matching
        //==================================================================
        String car = "Lexus";
        System.out.println(car.contains("xu"));
        System.out.println(car.contains("Lxs"));
        System.out.println(car.contains("lexus"));
//=========================================================================

    }

}

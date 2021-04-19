package PrimitiveDataTypes;

public class Casting {
    public static void main (String[]args){
        byte b1 = (byte)130;
        System.out.println(b1);
        byte b2= (byte)256;
        System.out.println(b2);

        int i1= 27;
        short s1 =35;
        s1 = (short)i1;//Auto narrowing
        System.out.println(s1);
        short s2=  (short)i1;///Auto narrowing
        System.out.println(s2);



        double d1 = 521.23;
        int i2 = (int)d1;//Auto narrowing (explicit casting)
        System.out.println(i2);

        int i3=345;
        double d2=i3;//Auto narrowing
        System.out.println(d2);

        byte num1 = 67;
        short number2  = num1;
        System.out.println(number2);

        short num3 =568;
        byte num = (byte) num3; // Byte only from - 128 to 127 -->it's going back and force(always starts from (0)
        System.out.println(num);

    }

}


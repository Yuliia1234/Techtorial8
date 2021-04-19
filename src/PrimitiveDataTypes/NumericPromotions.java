package PrimitiveDataTypes;

public class NumericPromotions { // When you use different data types with any operation,
    // result's data type will be promoted to the larger data types
    public static void main (String[]args){
        long l = 1000000L;
        float f = 34.5f;
        float f2 = l*f;
        System.out.println(f2);

        byte by= 12;
        int in = 19;
        int result = by +in;
        System.out.println(result);

        int int2=34;
        float fl = 4.5f;
        float result2 = int2*fl;
        System.out.println(result2);





    }
}

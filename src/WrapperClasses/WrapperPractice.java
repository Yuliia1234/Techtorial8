package WrapperClasses;

public class WrapperPractice {
    public static void main(String[] args) {

        byte bh1 = 5;
        Byte Bh = new Byte((byte) 5);
        Byte B1 = new Byte(bh1);

        Integer i1 = new Integer(5);

        Float f1 = new Float(2.3);

        Double d1 = new Double(25.5);

        Long l1 = new Long(45);
        Integer i2 = 5;//Autoboxing primitives are turned into Wrapper class Object

        int i3 = i2;//Unboxing Wrapper class object turned into primitive data types

        char c = 'A';
        Character ch1 = 'A';
        Character ch2 = new Character('A');
        Character ch3 = new Character('A');
        System.out.println(c == ch2);
        System.out.println(ch2 == ch3);
        System.out.println(ch1.equals(ch2));
    }
}
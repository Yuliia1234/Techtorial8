package StringMeth;

public class EqualsMethod {
    public static void main(String[] args) {
        String name1 = "John";

        String name2 = "John";

        String name3 = new String("John");

        String name4 = new String("John");

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);

        String name5=name1;

        String name6 = name3;

        String test ="John";
        System.out.println(name1.equals(test));

        System.out.println(name5==name3);
        System.out.println(name5.equals(name3));

    }
}

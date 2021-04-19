package Tasks;

public class StringManupulition {
    public static void main(String[] args) {

        String java = "I love java";
        java.startsWith("I");
        System.out.println(java.startsWith("I"));
        //.startWith("I")-->returns boolean
        //.length ()-->11-->returns int
        // .to UpperCase()-->return String
        // .toLowerCase()--returns String
        // .java.endsWith() ---return boolean
        // .equalsIgnoreCase("i love java
        System.out.println(java.endsWith("a"));

        System.out.println(java.equals("I love Java"));//checking if it's equal to first statment

        System.out.println(java.equalsIgnoreCase("i love java"));

        System.out.println(java.substring(7,11));//I love java"

        System.out.println(java.substring(2,6));//start and end of Index ;

        System.out.println(java.substring(0,1));

        //.subString(2,6)--> 2 is beginIndex (Included),6 is lastIndex(excluded ) -->2,3,4,5


    }
}

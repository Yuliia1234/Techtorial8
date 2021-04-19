package WrapperClasses;

public class StringToWrapper {
    public static void main(String[] args) {
        String str1= "8";
       Integer number =  Integer.valueOf(str1);
        // this is converting String value to a Wrapper Class Object
        System.out.println(number);

        String str2 = "6.5";
        Double number1 = Double.valueOf(str2);
        System.out.println(number + number1);
    }
}

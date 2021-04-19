package StringMeth;

public class Substring {
    public static void main(String[] args) {
        //Substring
        String string = "California";

        String result =string.substring(0);
        System.out.println(result);

        String result2 = string.substring(1);
        System.out.println(result2);

        String result3 =string.substring(1,4);//number 4 --> will show you letters to the number 3 .it taking "ali"
        System.out.println(result3);

        string = string.concat(" is a great state.");
        System.out.println("Original string is now "+string);

        String result4 = string.substring(5,10);

        System.out.println(result4);
        System.out.println(string.substring(11,string.indexOf(".")));
        System.out.println(string.substring(11,27));

        System.out.println(result4.substring(0,5));//getting substring from substring
    }
}

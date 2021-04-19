package Array;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "Java is easy ";
       String [] word = str.split(" "); //[Java,is,easy]

        System.out.println(Arrays.toString(word));

      String[] words2=  str.split("a");
        System.out.println(Arrays.toString(words2));
        System.out.println(words2.length);

        String text ="I want to learn Java.And,I really want to code every question by myself.";
        String[] text1=text.split("\\.");//to split a String from '.' you need to use -->\\.
        System.out.println(Arrays.toString(text1));

        String a ="I want to learn Java.And,I really want to code every question by myself.";
        String[] b=text.split("a.");
        System.out.println(Arrays.toString(b));

        String date = "03.20.2021";
        String [] date1=date.split("\\.");
        if( date1[1].equalsIgnoreCase("20")){
            System.out.println("Yes this is correct Day ,Happy Birthday ");
        }
    }
}

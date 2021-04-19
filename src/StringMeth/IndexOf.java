package StringMeth;

public class IndexOf {
    public static void main(String[] args) {
        String school ="techtorial";
        System.out.println(school.indexOf("t"));//it will return first matching char index
        System.out.println(school.indexOf("tec"));//it will return first matching char index from "TE"
        System.out.println(school.indexOf("to"));
        System.out.println(school.indexOf("t",1));
        int x =school.indexOf("a");
        System.out.println(x);
    }
}

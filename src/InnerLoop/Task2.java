package InnerLoop;

public class Task2 {
    public static void main(String[] args) {
        //reverse the given string
        String reverse = "";
        String a = "Techtorial";
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse += a.charAt(i);

        }
        System.out.println(reverse);
    }
}

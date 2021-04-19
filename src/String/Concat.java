package String;

public class Concat {
    public static void main(String[] args) {
        String studentname = "Alex "+"Brown";
        System.out.println(studentname);
        String teacher_name ="David ";
        teacher_name += "White ";
        System.out.println(teacher_name);

        int number = 11;
        short shrt = 22;
        // If you will do any math operation before concat.(String )
        // Result og the operation will be shown first and then string added to it

        System.out.println(shrt/number+studentname);
        System.out.println(teacher_name+shrt+number);
        System.out.println(teacher_name + (shrt-number));//in order to do math in sout"System.out" you have to put ()
        System.out.println(teacher_name + " & " +(shrt-number));

        String equals = " Q U E S T I O N " + "*" + "?";
        System.out.println(equals);
    }
}

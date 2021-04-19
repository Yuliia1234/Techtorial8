package If_Statment;

public class IfCondition {
    public static void main(String[] args) {

        int a=5;
        int b = 5;
        int c = 10;
        int d = 20;

        if(a==b) {
            System.out.println("I can drink coffee");
            System.out.println(a==b);
            System.out.println("I got my coffe myself");
        }
        if(a<c){
            System.out.println("Say something");

        }
        if(c !=d ){
            System.out.println("This is true");
        }
        if (d>a && a==b){
      System.out.println("This block is also true");

        }
        if(d<a || a!=b) { //false
            System.out.println("Please execute this block of code");

        }
        if(c>d)//If you have curly braces and if is false expreshion will not execute
            //if you don't put curly braces if condition is true it will show you two lanes if false it will skip first line
        System.out.println("this is first line");
        System.out.println("this is second line");
        System.out.println("This is third line");

    }

}

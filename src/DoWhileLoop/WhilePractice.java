package DoWhileLoop;

public class WhilePractice {
    public static void main(String[] args) {

        int age = 23;
        while (age<26){
            System.out.println("My age is "+ age);
            age ++;
        }
        String str= "Techtorial Tech";
        while (str.contains("Tech")){
            System.out.println("This string contains Tech ");
            str=str.replace("Tech","");//update condition


        }
    }
}

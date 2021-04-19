package Tasks;

public class StrMethods2 {
    public static void main(String[] args) {
        String learn = "I am learning Java";

        System.out.println(learn.substring(4,12));
        String word1 = learn.substring(0,1);
        String word2 = learn.substring(2,4);
        String word3 = learn.substring(5,13);
       String word4 = learn.substring(13);

       String reversed = word4 + " " +  word3 + " " +word2 + " " +word1+ " ";
        System.out.println(reversed);
         ////Java Programming Lan -->Programming -->PROGRAMMING
        String javaProgramm ="Java Programming Language";
        System.out.println(javaProgramm.substring(5,16).toUpperCase());
          //Java Programming Lan -->JAVA PROGRAMMING LANGUAGE -->PROGRAMMING
        System.out.println(javaProgramm.toUpperCase().substring(5,16));

        System.out.println(javaProgramm.replace("Java","Python"));

        //.replace() -->will change the old value ,and returns String
    }
}



package DoWhileLoop;


import java.util.Scanner;

public class Task4WhileLoop {
    public static void main(String[] args) {
        //ask user to provide a string value
        //print out every letter from that string
        //use while loop
        //Spring --.s,p,r,i,n,g
        Scanner input =new Scanner(System.in);
        System.out.println("Please provide a string ");
        String word =input.nextLine();
      int i =0;
      while (i<word.length()){
            System.out.println(word.charAt(i)+ ",");//if you will take ln from sout -->all letters will be together
            i++;

        }

        }
}



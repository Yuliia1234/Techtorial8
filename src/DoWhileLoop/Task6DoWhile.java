package DoWhileLoop;

import java.util.Scanner;

public class Task6DoWhile {
    public static void main(String[] args) {
        //Ask number from user
        //make star tree for that many lines
        //*
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        int tree=input.nextInt();
        int i = 0;
        String star = "";
        do{
            star+='*';
            System.out.println(star);
          i++;
        }while (i<tree);//always assing value first


    }
}

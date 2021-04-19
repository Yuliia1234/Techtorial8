package HomeWork.Homework8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Description
        //Write a program in Java to find the prime numbers within a range of numbers.
        //Test Data :Input starting number of range: 1 Input ending number of range : 50
        //Expected Output :
        //The prime number between 1 and 50 are :
        //2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
        Scanner input=new Scanner(System.in);
        System.out.println("starting number of range");
        int start = input.nextInt();
        System.out.println("Ending number of range");
        int end =input.nextInt();
        for(int i =start; start<=end;start++){

            for(int posibledividers =2;posibledividers<=start/2;posibledividers++){
                if(start%1==0){
                    System.out.println(start + " This is prime number ") ;
                    break;
                }else {
                    System.out.println(" THIS IS NOT A PRIME NUMBER ");
                }
            }
        }
    }
}

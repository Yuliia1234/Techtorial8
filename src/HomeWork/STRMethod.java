package HomeWork;

import java.util.Scanner;

public class STRMethod {
    public static void main(String[] args) {
        //**Write a programm that will ask from user to enter any word
        // ans application will output like below;
       // Please enter any word;Techtorial
        // *Techtorial word numbers are 10; which is even ;true
        Scanner input =new Scanner (System.in);//option+enter
        System.out.println("Please,enter any word");
        String word =input.next();
        //Calculate the number of letter
        int length = word.length();
        //Hello 5!
       boolean result = length%2 ==0;//3%2-->1, 10%2 -->0
        System.out.println(word + "letter numbers are " + length + " which is even " +result);
    }
}

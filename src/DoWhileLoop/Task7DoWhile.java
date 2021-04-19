package DoWhileLoop;

public class Task7DoWhile {
    public static void main(String[] args) {
        //for a given string "12345uherfh!@#!
        //WRITE A CODE TO COUNT NUMBER OF DIGITS,NUMBER OF LETTERS AND OTHER CHARS
        //  USE DO WHILE LOOP
        String character = "12234sdfidhe???***$$";
        int index = 0;
        int NumberCounter = 0;
        int letterCount = 0;
        int otherCounter = 0;

        do {
            boolean ThisIsnumber = character.charAt(index) >= '0' && character.charAt(index) <= '9';
            if (ThisIsnumber) {
                NumberCounter++;
            }
            boolean ThisISLetter = character.charAt(index) >= 'a' && character.charAt(index) <= 'z'
                   || character.charAt(index) >= 'A' && character.charAt(index) <= 'Z';
            if (ThisISLetter) {
                letterCount++;
            }
            boolean others = !ThisISLetter && !ThisIsnumber;
            if (others) {
                otherCounter++;
            }
            index++;
        } while (index < character.length());

        System.out.println("There are " + NumberCounter + " number in your string");
        System.out.println("There are " + letterCount + " letter in your string");
        System.out.println("There are " + otherCounter + " characters in your string");

    }
}

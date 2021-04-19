package DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class TaskRandom {
    public static void main(String[] args) {
        //I want to create a head/tail game (flipping coin) with java codes;
        //        -At the beginning print "Game is started, MAKE a GUESS! HEAD/TAIL " So, let user know that the game started.
        //            - get user's guess as HEAD/TAIL
        //            - compare user's guess with your random number 0/1 --> random.nextInt(2) <--
        //                - if guess is correct, print       ---> "You are lucky, it is your day today."
        //                - if the guess isn't correct, print  -> "Sorry, that was not the correct choice!"
        //            - at the end, ask user "Do you want to play again? Y/N "
        //                - if the answer is Y --> keep playing (this is your while condition!!!)


        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int guess = rand.nextInt(2);
        String answer;
        do {
            System.out.println("Game is started, MAKE a GUESS! HEAD/TAIL ");
            String ht = input.nextLine();
            String flip = guess == 0 ? "HEAD" : "TAIL";
            System.out.println("-----> " +flip);

            if (ht.equalsIgnoreCase(flip)) {
                System.out.println("You are lucky, it is your day today");
            } else {
                System.out.println("Sorry,that was not the correct choice ");
            }
            System.out.println("Do you want to play again");
               answer=input.nextLine();

        } while (answer.equalsIgnoreCase("Y"));


        System.out.println("It's okay see you next time");

    }
}

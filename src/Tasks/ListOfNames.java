package Tasks;

import java.util.Scanner;

public class ListOfNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select your name ,please / n1.Mike / n2.Lori / n3.Nate /n4. Klara n5. Julia / n5. Micheal / n6. Loren n7. George");
        String name = input.next();
        if (name.equalsIgnoreCase("Mike")) {
            System.out.println("Mike age 32\n" + "height 178\n" + "Weight 200\n" + "Address : Chicago\n" +
                    "cell : 312-774-8090\n" + "Title : Software Engineer");
        }

        if (name.equalsIgnoreCase("Lori")) {
            System.out.println("Lori age 56\n" + "height 164\n" + "Weight 125\n" + "Address :Florida\n " + "cell :657-987-7895\n " + "Title : Dispatch ");
        }

        else {
            System.out.println("Sorry we couldn't retrieve any mathing data");
        }
    }
}


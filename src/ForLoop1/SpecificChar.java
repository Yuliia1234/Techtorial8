package ForLoop1;

public class SpecificChar {
    public static void main(String[] args) {
        //print the letter '0' from given string
        //Today is for loop day
        //Count how many time we printed' o '

        String a ="Today is for loop day";
        int count =0;

        for (int i = 0; i<a.length();i++){

            if (a.charAt(i)=='o'){

                System.out.println("This is " + a.charAt(i) + " at the index of " +i );
                count ++;
            }
        }
        System.out.println("There are total "+count + " matching letters");

    }
}

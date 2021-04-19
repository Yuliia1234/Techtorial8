package Scanner;

import java.util.Scanner;

      public class ScannerPractice {
          public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String myName = "Julia ";

        System.out.println("Please enter your last name ");//

              String lastname=scanner.nextLine();//Scanner will ask you for this.it will print in next line
              System.out.println(myName +lastname);


              //String firstLastname = myName+lastname;
             // System.out.println(firstLastname);

              System.out.println("please enter your middle name");
              String middleName = scanner.nextLine();
              System.out.println(middleName);


              System.out.println("Please enter your city and state");
              String city_state = scanner.nextLine();// Always keep (nextLine) to (nextLine) together and (next) to (next )
              System.out.println(city_state);






    }
}

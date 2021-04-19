package If_Statment;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        //Check the city of the user
        //If city is Chicago -Which school are going to
        //If city is Chicago - When school name mathes with 'Techtorial"
        //print you are lucky to be in Bathc8
        //Otherwise -print visit "techtorial"

        Scanner input = new Scanner(System.in);
        System.out.println("where do you live");
        String city = input.nextLine();

        if(city.equalsIgnoreCase("chicago")){
            System.out.println("What's the your school name?");
            String school = input.nextLine();

            if(school.equalsIgnoreCase("Techtorial")){

            }else {
                System.out.println("Please visit Tectorial ");
            }

            }else{
            System.out.println("Come to Chicago and visit Techtorial");
            }
        }
        }

